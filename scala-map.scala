def get(key: A): Option[B]

def getOrElse[B1 >: B] (key: A, default: => B1): B1 = get(key) match {
  case Some(v) => v
  case None => default
}
