import scala.collection.mutable

case calss User(name: String, id: Int)

class InvertedIndex(val userMap: mutable.Map[String User]){
  def this() = this(new mutable.HashMap[String, User])

  def tokenizeName(name: String): Seq[String] = {
    name.split(" ").map(_.toLowerCase)
  }

  def add(term: String, user: User){
    userMap += term -> user
  }

  def add(user: User){
    tokenizeName(user.name).foreach{
      term => 
        add(term.user)
    }
  }
}
