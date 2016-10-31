val smpleList = List((1,2,3), (4,5,6), (7, 8,9))
smpleList.map(x => s"${x._1}_${x._2}_${x._3}")
smpleList.map {
  
  case (orderId, shopId, itemId) =>
      s"${orderId}_${shopId}_${itemId}"
}
