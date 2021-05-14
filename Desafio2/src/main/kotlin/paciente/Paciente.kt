package paciente

import vacinacao.Vacinacao

open class Paciente(
    val nome: String,
    val idade: Int,
    val contaminado: Boolean,
    val sexo: String,
    val gravida: Boolean,
    val dataVanicacao: Vacinacao
    ) {

    fun calcularDataVacinacao() : Int {

        return dataVanicacao.dataVacina(idade, contaminado, gravida)
    }
}