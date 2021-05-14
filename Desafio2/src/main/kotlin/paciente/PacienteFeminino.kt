package paciente

import vacinacao.VacinacaoMasculina

class PacienteFeminino(
    nome: String,
    idade: Int,
    contaminado: Boolean,
    sexo: String,
    gravida: Boolean

) : Paciente(nome, idade, contaminado, sexo, gravida, VacinacaoMasculina()) {
}