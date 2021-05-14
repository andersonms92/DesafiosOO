package calculadoras

class CalculadoraDesenvolvedor : Calculadora {

    override fun calcularSalario(sBruto: Double) : Double {

        val desconto: Double = if(sBruto > 3000.0) 0.2 else 0.1

        return sBruto - (sBruto * desconto)
    }
}