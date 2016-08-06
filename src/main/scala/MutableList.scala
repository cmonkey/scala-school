import scala.collection.mutable._
val l = MutableList(10)

for(i<-l){
  val p = i/2
  if(!(l contains p)){
    l += p
  }
}

println(l)

