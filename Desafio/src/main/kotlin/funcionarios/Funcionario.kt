package funcionarios

import calculadoras.Calculadora

open class Funcionario (val nome: String, val cargo: Int, val sBruto: Double, val calculadora: Calculadora) {

    fun calcularSalarioLiquido() : Double {

        return calculadora.calcularSalario(sBruto)

    }
}


//open class Funcionario {
//
//    var nome: String = ""
//    var cargo: String = ""
//    var salario: Double = 0.0
//
//    fun calculoPagamento() {
//        val selectCargos = Cargos(nome, cargo, salario)
//        selectCargos.folhaPagamento
//    }
//}

