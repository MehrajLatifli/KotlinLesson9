import kotlin.random.Random

fun main(args: Array<String>) {

    var randomNumberArraylist = arrayListOf<Int>()

    for (i in 1..10) {
        randomNumberArraylist.add(Random.nextInt(1, 100))
    }

    println(randomNumberArraylist)


}

