
enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (val nome: String, val matricula: String) 

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel : Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    
    val usuario1 = Usuario("Artur Oliveira", "ID00001")

    val conteudo1 = ConteudoEducacional("Exercicios em Kotlin", BASICO)
    val conteudo2 = ConteudoEducacional("Exercicios em Kotlin Avancado", AVANCADO)

    val listaConteudos: List<ConteudoEducacional> = listOf(conteudo1,conteudo2)

    val formacao1 = Formacao("Formacao Android", listaConteudos)
    val formacao1.matricular(usuario1)    
    
}
