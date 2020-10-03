fun main() {
    val dH = DigitalHouseManager()
    //J Parte 2
    println("-------------------------------Registrando Professores--------------------------------------")
    dH.registrarProfessorAdjunto("Joao", "Silva", 300, 50)
    dH.registrarProfessorAdjunto("Bruno", "Souza", 400, 70)
    dH.registrarProfessorTitular("Albert", "Einstein", 100, "Físico")
    dH.registrarProfessorTitular("Isaac", "Newton", 200, "Matemático")
    //dH.registrarProfessorTitular("Galileu", "Galilei", 200, "Matemático")

    //J Parte 3
    println("-------------------------------Registrando Cursos--------------------------------------")
    dH.registrarCurso("Full Stack", 20001, 3)
    dH.registrarCurso("Android", 20002, 2)
    //dH.registrarCurso("Web Development", 20001, 10)

    //J Parte 4
    println("-------------------------------Alocando Professores--------------------------------------")
    dH.alocarProfessores(20001, 100, 400)
    dH.alocarProfessores(20002, 200, 300)
    //dH.alocarProfessores(20001, 200, 400)

    //J Parte 5 e 6
    println("-------------Cadastrando alunos na instituição------------------")
    dH.matricularAluno("Miguel", "Almeida", 105)
    dH.matricularAluno("Anderson", "Silva", 205)
    dH.matricularAluno("Otávio", "Castro", 305)
    dH.matricularAluno("Bernardo", "Bezerra", 405)
    dH.matricularAluno("Victor", "Belfort", 505)
    println("-------------Matriculando alunos nos cursos------------------")
    dH.matricularAluno(105, 20001)
    dH.matricularAluno(305, 20001)
    dH.matricularAluno(405, 20002)
    dH.matricularAluno(205, 20002)
    dH.matricularAluno(505, 20002)

    //println("-------------Imprimindo listas------------------")
    //dH.imprimirListaProfessores()
    //dH.imprimirlistaAlunos()
    //dH.imprimirlistaCursos()
    //dH.imprimirlistaMatriculas()
}