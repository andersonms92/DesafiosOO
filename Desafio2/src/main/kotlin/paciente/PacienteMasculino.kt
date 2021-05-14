package paciente

import vacinacao.VacinacaoMasculina

class PacienteMasculino(
    nome: String,
    idade: Int,
    contaminado: Boolean,
    sexo: String

) : Paciente(nome, idade, contaminado, sexo, false, VacinacaoMasculina()) {
}