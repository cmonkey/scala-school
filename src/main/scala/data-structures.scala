val numbers = List(1, 2, 3, 4)

val set = Set(1,1,2)

val hostPort = ("localhost", 80)

hostPort match {
  case ("localhsot", port) => println(port)
  case (host, port) => println(host+port)
}
