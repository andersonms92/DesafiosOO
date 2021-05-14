package vacinacao

interface Vacinacao {

    fun dataVacina(idade: Int, contaminado: Boolean, gravida: Boolean) : Int
}
