import java.util.*

fun main(args: Array<String>) {


    var studentArraylist = arrayListOf<Student>()

    var studentArraylist2 = arrayListOf<Student>()


    val scanner = Scanner(System.`in`)

    for (i in 1..4) {
        print("Enter name: ")
        val name = scanner.next()

        print("Enter id: ")
        val id = scanner.nextInt()

        print("Enter note_1: ")
        val note_1 = scanner.nextDouble()

        print("Enter note_2: ")
        val note_2 = scanner.nextDouble()

        print("Enter note_3: ")
        val note_3 = scanner.nextDouble()

        print("\n")

        studentArraylist.add(Student(name, id, note_1, note_2, note_3))
    }


    println("--------- \nstudentArraylist: \n")

    for ((index, item) in studentArraylist.withIndex()) {

        println(item)
    }

    var avgstudent = 0.0
    var avgstudent2 = 0.0

    println("--------- \nstudentArraylist2: \n")

    for ((index, item) in studentArraylist.withIndex()) {

        avgstudent = (item.note_1 + item.note_2 + item.note_3) / 3

        if (avgstudent > 60) {
            studentArraylist2.add(item)
        }

    }


    for ((index, item) in studentArraylist2.withIndex()) {

        println(item)
    }

    for ((index, item) in studentArraylist2.withIndex()) {

        avgstudent2 = (item.note_1 + item.note_2 + item.note_3) / 3
    }

    println(avgstudent2)

}