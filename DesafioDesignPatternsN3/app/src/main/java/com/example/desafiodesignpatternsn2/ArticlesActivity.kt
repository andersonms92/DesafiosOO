package com.example.desafiodesignpatternsn2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.data.remote.ArticlesModel
import com.example.data.remote.NewsRetrofit

    const val ARTICLE_URL = "extra_article_url"

class ArticlesActivity : AppCompatActivity() {

    private lateinit var newsRecyclerView: RecyclerView
    private lateinit var articlesAdapter: ArticlesAdapter
    private lateinit var newsLayoutManager: LinearLayoutManager
    private var articleNewsPage = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_articles_items)

        val button: Button = findViewById(R.id.btn_voltar)

        val extras = intent.extras
        if (extras != null) {
            newsRecyclerView = findViewById(R.id.rv_news)
            newsLayoutManager = LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
            )
            newsRecyclerView.layoutManager = newsLayoutManager
            articlesAdapter = ArticlesAdapter(mutableListOf())
            newsRecyclerView.adapter = articlesAdapter

            extras.getString(ARTICLE_URL)?.let { getNews(it) }
        } else {
            finish()
        }

       button.setOnClickListener {
           finish()
       }
    }

    fun getNews(url: String) {
        NewsRetrofit.url = url
        NewsRetrofit.getNews(
            articleNewsPage,
            ::onNewsFetched,
            ::onError
        )
    }

    private fun attachNewsOnScrollListener() {
        newsRecyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                val totalItemCount = newsLayoutManager.itemCount
                val visibleItemCount = newsLayoutManager.childCount
                val firstVisibleItem = newsLayoutManager.findFirstVisibleItemPosition()

                if (firstVisibleItem + visibleItemCount >= totalItemCount / 2) {
                    newsRecyclerView.removeOnScrollListener(this)
                    articleNewsPage++
                    getNews(ARTICLE_URL)
                }
            }
        })
    }

    private fun onNewsFetched(news: List<ArticlesModel>) {
        articlesAdapter.updateNews(news)
        attachNewsOnScrollListener()
    }

    private fun onError() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
    }

}