package funcionarios

import calculadoras.CalculadoraDBA

class DBA(nome: String, sBruto: Double) : Funcionario(nome, 2, sBruto, CalculadoraDBA()) {


}

//fun calculoPagamentoDBA(sBruto: Double, nome: String) {
//
//    val salarioLiquido: Double
//
//    if (sBruto > 2500.00) {
//        salarioLiquido = sBruto-(sBruto*0.25)
//        println("Nome: "+nome+"\n"
//                +"Cargo: DBA"+"\n"
//                +"Salário Líquido: "+salarioLiquido+"\n"
//                +"Salário Bruto: "+sBruto)
//    } else {
//        salarioLiquido = sBruto-(sBruto*0.15)
//        println("Nome: "+nome+"\n"
//                +"Cargo: DBA"+"\n"
//                +"Salário Líquido: "+salarioLiquido+"\n"
//                +"Salário Bruto: "+sBruto)
//    }
//}