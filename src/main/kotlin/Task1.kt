import java.util.*

fun main(args: Array<String>) {


    var employeeArraylist = arrayListOf<Employee>()


    val scanner = Scanner(System.`in`)

    for(i in 1..5)
    {
        print("Enter name: ")
        val name = scanner.next()

        print("Enter age: ")
        val age = scanner.nextInt()

        print("Enter salary: ")
        val salary = scanner.nextDouble()

        print("\n")

        employeeArraylist.add(Employee(name, age, salary))
    }



    for ((index, item) in employeeArraylist.withIndex()) {

        println(item)
    }


    println(employeeArraylist[1])

    employeeArraylist[1]= Employee("name", 0, 0.0)

    employeeArraylist.add(1, Employee("nam2", 0, 0.0))

    employeeArraylist.isEmpty()
    employeeArraylist.size
    employeeArraylist.first()
    employeeArraylist.last()

   /* employeeArraylist.sort()*/
    println(employeeArraylist.reverse())
    println(employeeArraylist.clear())

    println(employeeArraylist.sortedWith(compareBy({student -> student.age})))
    println(employeeArraylist.sortedBy {it.age})

    employeeArraylist.removeAt(1)



}