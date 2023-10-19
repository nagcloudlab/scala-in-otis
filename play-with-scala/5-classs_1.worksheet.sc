class Employee(var firstName: String, var lastName: String) {
  println("the constructor begins")
  var age = 0
  private var salary = 0d
  printEmployeeInfo()
  override def toString = { s"$firstName, $lastName is $age years old" }
  def printEmployeeInfo() = println(this)
  println("the constructor ends")
}

val e1 = new Employee("John", "Doe")
e1.firstName = "Nag"
e1.lastName = "N"
