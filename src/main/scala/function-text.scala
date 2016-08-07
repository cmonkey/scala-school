var filename = if (!args.isEmpty) args(0) else "default.txt"


var filesList = (new File(".")).listfiles

for(file <- filesList
    if file.isFile;
    if file.getName.endsWith(".scala"))
  println(file)

var firstArg = if (args.length > 0) agrs(0) else ""

firstArg match {
  case "text" => println("text")
  case _ => println("default")

}


var someNumbers = List(1, 2, 3,4)

someNumbers.filter(_ % 2 == 0)

def sum(a: Int, b: Int, c: Int) = a + b + c

val a = sum(1, _: Int , 3)

a(2)

def echo(args: String*) for(arg <- args) println(arg)

echo("one")

echo("one", "two")

class DefaultConstructor (name: String, age: Int){
  def this(name: String){
    this(name, 24);
  }

  def show(){
    println(name = " --> " + age)

  }

}

// carry
def sum(x: Int, y: Int) = x + y

def sum(x: Int)(y: Int) = x + y

def sum(x: Int) = (y: Int) => x + y

trait Person(){
  def detail(){
    println("i'm angry")

  }

}

class Student extends Person with Boy{


}
