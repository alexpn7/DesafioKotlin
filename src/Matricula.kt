import java.util.Date

data class Matricula(val aluno: Aluno, val curso: Curso) {
    
    val dataDeMatricula: Date

    init {
        dataDeMatricula = Date()
    }
}