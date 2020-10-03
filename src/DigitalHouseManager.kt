class DigitalHouseManager() {

    //tentar fazer com varargs
    var listaAlunos: MutableSet<Aluno> = mutableSetOf()
    var listaProfessores: MutableSet<Professor> = mutableSetOf()
    val listaCursos: MutableSet<Curso> = mutableSetOf()
    var listaMatriculas: MutableSet<Matricula> = mutableSetOf()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        val umCurso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
        //Only adds if it does not belong to the set
        if (listaCursos.add(umCurso)!!)
            println("${umCurso} cadastrado com sucesso")
        else
            println("Curso com o código informado ja existe")
    }

    fun excluirCurso(codigoCurso: Int) {
        listaCursos.removeIf { it.cod == codigoCurso }
    }

    fun registrarProfessorAdjunto(nome: String , sobrenome: String ,
                                  codigoProfessor: Int, quantidadeDeHoras: Int) {
        val umProfessorAdj = ProfessorAdjunto(quantidadeDeHoras, nome, sobrenome, 0, codigoProfessor)
        //Only adds if it does not belong to the set
        if (listaProfessores.add(umProfessorAdj))
            println("${umProfessorAdj} adjunto registrado com sucesso")
        else
            println("Professor adjunto com o código informado ja existe")
    }

    fun registrarProfessorTitular(nome: String , sobrenome: String,
                                  codigoProfessor: Int, especialidade: String) {
        val umProfessorTit = ProfessorTitular(especialidade, nome, sobrenome, 0, codigoProfessor)
        //Only adds if it does not belong to the set
        if (listaProfessores.add(umProfessorTit))
            println("${umProfessorTit} titular cadastrado com sucesso")
        else
            println("Professor titular com o código informado ja existe")
    }

    fun excluirProfessor(codigoProfessor: Int) {
        listaProfessores.removeIf { it.cod == codigoProfessor }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno:Int) {
        val umAluno = Aluno(nome, sobrenome, codigoAluno)
        //Only adds if it does not belong to the set
        if (listaAlunos.add(umAluno)!!)
            println("${umAluno} cadastrado com sucesso")
        else
            println("Aluno com o código informado ja existe")
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val umAluno = listaAlunos.find { it.cod == codigoAluno }
        if (umAluno == null) {
            println("Aluno não encontrado")
            return
        }
        val umCurso = listaCursos.find { it.cod == codigoCurso }
        if (umCurso == null) {
            println("Curso não encontrado")
            return
        }
        if (!umCurso.adicionarUmAluno(umAluno))
            println("Turma lotada, não há vagas no momento, matrícula não realizada")
        else {
            val umaMatricula = Matricula(umAluno, umCurso)
            listaMatriculas.add(umaMatricula)
            println("Matrícula realizada com sucesso")
        }
    }

    fun alocarProfessores(codigoCurso: Int,
                          codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        val umCurso = listaCursos.find { it.cod == codigoCurso }
        if (umCurso == null) {
            println("Curso não encontrado")
            return
        }
        val umProfTit = listaProfessores.find { it.cod == codigoProfessorTitular }
        if (umProfTit == null) {
            println("Professor titular não encontrado")
            return
        }
        val umProfAdj = listaProfessores.find { it.cod == codigoProfessorAdjunto }
        if (umProfAdj == null) {
            println("Professor adjunto não encontrado")
            return
        }
        umCurso.profAdjunto = umProfAdj as ProfessorAdjunto
        umCurso.profTitular = umProfTit as ProfessorTitular
        println("Professores alocados com sucesso")
    }
    fun imprimirListaProfessores () {
        listaProfessores.forEach{println(it)}
    }
    fun imprimirlistaAlunos () {
        listaAlunos.forEach{println(it)}
    }
    fun imprimirlistaCursos () {
        listaCursos.forEach{println(it)}
    }
    fun imprimirlistaMatriculas () {
        listaMatriculas.forEach{println(it)}
    }
}