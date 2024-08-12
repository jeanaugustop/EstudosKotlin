fun main(){
    //Companion Object = Static no java, como n tem static aqui, a gente usa esse companion object
    ex17()

}

fun exemploArray1(){

    var numeros = arrayOf(1,2,3,4,5)
    var nomes = arrayOf("Jean", "Julio", "Thiago", "Brito")

    //Mostrando dados do array utilizadno for

    println("Valores do array numeros: ")

    for(numeroAtual in numeros){
        print("$numeroAtual, ")
    }

    //Utilizando for each
    println("\nValores do array numeros:")

    numeros.forEach { print("$it, ") }

    println("Valores do array nomes:")

    nomes.forEach { nomeAtual -> print("$nomeAtual, ") }

}

fun calcularMedia (n1: Float, n2: Float, n3: Float) : Float{
    val media = (n1+n2+n3) / 3
    return media
}

fun exemploCalcularMedia(){
    //Exemplo da funcao calcularMedia
    //val media = calcularMedia(5f,7.2f, 3.7f)
    //val notaFormatada = String.format("%.1f", media)
    //println("Média do aluno: $notaFormatada")
}

fun exemploCompanionObject(){

    println("75 + 379 = ${Calculadora.somar(75, 379)}")
    println("87 - 13 = ${Calculadora.subtrair(87, 13)}")

}

fun ex01(){

    var idades = Array(5) {0} // Criando array sem valores

    for (i in idades.indices){
        print("Informe a idade ${i + 1}: ")
        idades[i] = readln().toInt()
    }

    val media = idades.average() // calcula a media dos valores do array

    println("\n Media das Idades: $media")



}

fun ex02(){

    var temperatura = Array(7) {0f}

    var min : Float = 0f
    var max : Float = 0f


    for(i in temperatura.indices){
        println("Informe a temperadura do ${i + 1} dia: ")
        temperatura[i] = readln().toFloat()

        /*
        if (i == 0){
            min = temperatura[0]
            max = temperatura[0]
        }
        else{
            if (temperatura[i] > max)
                max = temperatura[i]
            else if (temperatura[i] < min){
                min = temperatura[i]
            }
        }
        */

        //melhorando a abordagem com - When -
        when{
             i == 0 -> {
                 min = temperatura[0]
                 max = temperatura[0]
             }
            temperatura[i] > max -> max = temperatura[i]
            temperatura[i] < min -> min = temperatura[i]
        }
    }

    //Verificar Valor min e max do array
    min = temperatura.min()
    max = temperatura.max()

    println("A temperatura minima é : $min")
    println("A temperatura maxima é : $max")


}

fun ex05(){

    var nomes = Array(5){""}

    for (i in nomes.indices){
        println("Digite o ${i+1} nome:")
        nomes[i] = readln()
    }
    nomes.sort()

    println("Nomes em ordem alfabetica")

    nomes.forEach { nomeAtual -> println(nomeAtual) }

}

fun ex17(){
    println("Id Atual: ${Exercicio17.gerarID()}")
    println("Id Atual: ${Exercicio17.gerarID()}")
    println("Id Atual: ${Exercicio17.gerarID()}")
    println("Id Atual: ${Exercicio17.gerarID()}")
    println("Id Atual: ${Exercicio17.gerarID()}")
    println("Id Atual: ${Exercicio17.gerarID()}")
    println("Id Atual: ${Exercicio17.gerarID()}")
}
