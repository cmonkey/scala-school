class Person(var name: String){
  def set(changedName: String){
    name = changedName
  }
}

// Mutex
class PersonMutex(var name: String){
  def set(changedName: String){
    this.synchronized{
      name = changedName
    }
  }
}

// volatile
class PersonVolatile(@volatile var name: String){
  def set(changedName: String){
    name = changedName
  }
}

// AtomicReference
import java.util.concurrent.atomic.AtomicReference
class PersonAtomicReference(val name: AtomicReference[String]){
  def set(changedName: String){
    name.set(changedName)
  }
}
