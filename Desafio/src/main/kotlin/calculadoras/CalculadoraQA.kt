package calculadoras

class CalculadoraQA : Calculadora {

    override fun calcularSalario(sBruto: Double): Double {

        val desconto: Double = if (sBruto > 2500.0) 0.25 else 0.15

        return sBruto - (sBruto * desconto)
    }
}