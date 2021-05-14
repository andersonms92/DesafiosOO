package funcionarios

import calculadoras.CalculadoraDesenvolvedor

class Desenvolvedor (nome: String, sBruto: Double) : Funcionario(nome, 0 ,sBruto, CalculadoraDesenvolvedor()) {
    
}

//fun calculoPagamentoDesenvolvedor(sBruto: Double, nome: String) {
//
//    val salarioLiquido: Double
//
//    if (sBruto > 3000.00) {
//        salarioLiquido = sBruto-(sBruto*0.2)
//        println("Nome: "+nome+"\n"
//                +"Cargo: Desenvolvedor"+"\n"
//                +"Salário Líquido: "+salarioLiquido+"\n"
//                +"Salário Bruto: "+sBruto)
//    } else {
//        salarioLiquido = sBruto-(sBruto*0.1)
//        println("Nome: "+nome+"\n"
//                +"Cargo: Desenvolvedor"+"\n"
//                +"Salário Líquido: "+salarioLiquido+"\n"
//                +"Salário Bruto: "+sBruto)
//    }
//}
