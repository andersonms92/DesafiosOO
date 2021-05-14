/**
 * Crie um programa orientado a objeto que calcule uma folha de pagamento, este programa
 * deve retornar uma coleção com nome, cargo, salário líquido e salário bruto so funcionário.
 *
 * Regras:
 * Desenvolvedores possuem 20% de desconto caso seu salário seja maior que R$ 3000,00. Caso
 * contrário, 10%.
 * DBA e Testadores possuem descontos de 25% se seus salários forem maiores do que R$ 2500,00. Caso
 * contrário, 15%.
 * Gerentes possuem 23% de desconto caso seu salário seja maior do que R$7000,00. Caso contrário, 18%
 *
 */
package funcionarios

import MaquinaDeSalario

fun main() {

    var funcionario: Funcionario

    val maquinaDeSalario = MaquinaDeSalario().imprimir()
    maquinaDeSalario.forEach {
        funcionario = Funcionario(it.nome, it.cargo, it.sBruto, it.calculadora)
        val cargo = when(it.cargo) {
            0 -> "Desenvolvedor"
            1 -> "QA"
            2 -> "DBA"
            3 -> "Gerente"
            else -> "Cargo inválido"
        }
        val salario = funcionario.calcularSalarioLiquido()
        println("Nome: ${it.nome} \n" + "Cargo: $cargo \n" + "Salário bruto: ${it.sBruto} \n" + "Salário líquido: $salario \n")
    }



}

//val read = Scanner(System.`in`)
//
//val funcionario = Funcionario()
//
//print("Nome: ")
//funcionario.nome = readLine()!!
//print("Cargo: ")
//funcionario.cargo = readLine()!!
//print("Salário: ")
//funcionario.salario = read.nextDouble()
//
//funcionario.calculoPagamento()