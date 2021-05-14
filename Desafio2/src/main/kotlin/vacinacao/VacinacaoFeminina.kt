package vacinacao

class VacinacaoFeminina : Vacinacao {

    override fun dataVacina(idade: Int, contaminado: Boolean, gravida: Boolean): Int {
        var dias = 0
        val acrescimo: Int = if (contaminado) 30 else 0

            when {
                gravida -> {
                    println("Vacinação imediata")
                }
                idade in 0..20 -> {
                    dias = 150 + acrescimo
                }
                idade in 21..30 -> {
                    dias = 120 + acrescimo
                }
                idade in 31..50 -> {
                    dias = 90 + acrescimo
                }
                idade in 51..60 -> {
                    dias = 60 + acrescimo
                }
                idade in 61..70 -> {
                    dias = 30 + acrescimo
                }
                idade > 70 -> {
                    println ("Vacinação imediata")
                }
                else -> {
                    println ("Idade incorreta")
                }
            }
        return dias
    }
}