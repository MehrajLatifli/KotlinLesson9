import kotlin.random.Random

fun main(args: Array<String>) {

    var randomNumberArraylist = arrayListOf<Int>()

    for (i in 1..10) {
        randomNumberArraylist.add(Random.nextInt(1, 100))
    }

    println("arraylist: "+randomNumberArraylist)

    println("first: "+randomNumberArraylist.first())

    println("last: "+randomNumberArraylist.last())

    println("min: "+randomNumberArraylist.min())

    println("max: "+randomNumberArraylist.max())

    println("remove: "+randomNumberArraylist.removeAt(1))

    println("arraylist: "+randomNumberArraylist)

    println("clear: "+randomNumberArraylist.clear())

    println("arraylist: "+randomNumberArraylist)

}





