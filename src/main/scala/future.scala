val future = new FutureTask[String] (new Callable[String](){
  def call(): String = {
    searcher.search(target);
  }
})

executor.execute(future)

val blockingResult = Await.result(future)
