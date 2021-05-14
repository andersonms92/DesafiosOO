import paciente.PacienteFeminino
import paciente.PacienteMasculino

class Testes {

    fun testes() =
        listOf(
            PacienteMasculino("Roberto", 90, true, "Masculino"),
            PacienteMasculino("Anderson", 28, false, "Masculino"),
            PacienteFeminino("Roberta", 55, true, "Feminino", false),
            PacienteFeminino("Laura", 55, false, "Feminino", true)
        )

}