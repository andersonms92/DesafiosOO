import funcionarios.DBA
import funcionarios.Desenvolvedor
import funcionarios.Gerente
import funcionarios.QA

class MaquinaDeSalario {

    fun imprimir() =
            listOf(
            Desenvolvedor("Bruno", 25000.00),
            Desenvolvedor("Anderson", 3000.00),
            Desenvolvedor("Roberto", 3001.00),
            DBA("Renato", 1500.00),
            QA("Lauro", 6000.00),
            QA("Lauroberto", 1000.00),
            Gerente("Roosevelt", 10000.00)
            )


    }
