class Yiibai(xc: Int, yc: Int){
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int){
    x = x + dx
    y = y + dy

    println("Yiibai x location : " + x)
    println("Yiibai y location : " + y)
  }
}
