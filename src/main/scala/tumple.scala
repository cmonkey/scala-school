val (one, two) = (1, 2)

println(s"one:$one")
println(s"two:$two")

def sellerAndItemId(orderId: Int) : (Int, Int) =
  orderId match {
    case 0 => (1, 2)
  }

val (sellerId, itemId) = sellerAndItemId(0)

println(s"sellerId:$sellerId")
println(s"itemId:$itemId")

val sellerItem = sellerAndItemId(0)

println(s"sellerItem._1:$sellerItem._1")
println(s"sellerItem._2:$sellerItem._2")
