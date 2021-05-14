package paciente

import Testes

fun main() {

    var pacientes: Paciente

    val testes = Testes().testes()
    testes.forEach{
        pacientes = Paciente(it.nome, it.idade, it.contaminado, it.sexo,it.gravida, it.dataVanicacao)

        val data = pacientes.calcularDataVacinacao()
        println("Nome: ${it.nome}, " + "Idade: ${it.idade}, "+" Contaminado: ${it.contaminado}, "+ " Dias para vacinação: $data, " + " Gravida: ${it.gravida}")
    }


}