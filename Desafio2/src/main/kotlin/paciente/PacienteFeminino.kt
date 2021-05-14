package paciente

import vacinacao.VacinacaoFeminina

class PacienteFeminino(
    nome: String,
    idade: Int,
    contaminado: Boolean,
    sexo: String,
    gravida: Boolean

) : Paciente(nome, idade, contaminado, sexo, gravida, VacinacaoFeminina()) {
}