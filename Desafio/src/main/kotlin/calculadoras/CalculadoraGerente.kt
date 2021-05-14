package calculadoras

class CalculadoraGerente : Calculadora {

    override fun calcularSalario(sBruto: Double): Double {

        val desconto: Double = if (sBruto > 7000.0) 0.23 else 0.18

        return sBruto - (sBruto * desconto)
    }
}
