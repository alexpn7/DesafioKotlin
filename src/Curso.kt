class Curso (var nome: String, val cod: Int, var qtdMaxAlunos: Int) {

    var profTitular: ProfessorTitular? = null
    var profAdjunto: ProfessorAdjunto? = null
    val listaAlunos: MutableSet<Aluno> = mutableSetOf()

    //Auto generated method.
    //Two Cursos are equals if they have same cod
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso

        if (cod != other.cod) return false

        return true
    }

    //Auto generated method.
    //hashCode must be implemented with same attribute(s) used for equals method. This method is used to ensure
    //that objects with same cod but with the remaining attributes different, therefore equals according to the
    //exercise definition, aren't added duplicated to collections
    override fun hashCode(): Int {
        return cod
    }

    override fun toString(): String {
        return "Curso(nome='$nome', cod=$cod)"
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {

        //listaAlunos = mutableSetOf()
        if (listaAlunos != null && listaAlunos.size < qtdMaxAlunos) {
            if (listaAlunos.add(umAluno)) {
                qtdMaxAlunos++
                return true
            }
        }
        return false
    }

    fun excluirAluno(umAluno: Aluno) {
        if (listaAlunos != null) {
            if (listaAlunos.remove(umAluno)) {
                qtdMaxAlunos++
            }
        }
    }

}