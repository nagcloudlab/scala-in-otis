class Employee(var firstName: String, var lastName: String) {
  println("the constructor begins")
  var age = 0
  private var salary = 0d

  printEmployeeInfo()

  // override def toString = { s"$firstName, $lastName is $age years old" }
  def printEmployeeInfo() = println(this)

  println("the constructor ends")
}

object app {
  def main(args: Array[String]): Unit = {
    val e = new Employee("John", "Doe")
  }
}
