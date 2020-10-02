data class Aluno (val nome:String, var sobrenome: String, val cod: Int) {

    //Auto generated method.
    //Two Alunos are equals if they have same cod
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

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

    //Not needed to override toString() in data classes as the inherited method lists only and all
    //relevant information
}