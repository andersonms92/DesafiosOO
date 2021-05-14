package funcionarios

import calculadoras.CalculadoraGerente

class Gerente(nome: String, sBruto: Double) : Funcionario(nome, 3, sBruto, CalculadoraGerente()) {


}

//fun calculoPagamentoGerente(sBruto: Double, nome: String) {
//
//    val salarioLiquido: Double
//
//    if (sBruto > 7000.00) {
//        salarioLiquido = sBruto-(sBruto*0.23)
//        println("Nome: "+nome+"\n"
//                +"Cargo: Gerente"+"\n"
//                +"Salário Líquido: "+salarioLiquido+"\n"
//                +"Salário Bruto: "+sBruto)
//    } else {
//        salarioLiquido = sBruto-(sBruto*0.18)
//        println("Nome: "+nome+"\n"
//                +"Cargo: Gerente"+"\n"
//                +"Salário Líquido: "+salarioLiquido+"\n"
//                +"Salário Bruto: "+sBruto)
//    }
//}