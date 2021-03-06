import java.net.{Socket, ServerSocket}

import java.util.concurrent.{Executors, ExecutorService}

import java.util.Date

class NetworkService(port: Int, poolSize: Int) extends Runnable{
  val serverSocket = new ServerSocket(port)

  def run(){
    while(true){
      // this will block until a connection comes in
      val socket = serverSocket.accept();

      (new Handler(socket)).run()
    }
  }
}

class Handler(socket: Socket) extends Runnable{
   def message = (Thread.currentThread.getName() + "\n").getBytes

   def run(){
     socket.getOutputStream.write(message)
     socket.getOutputStream.close()
   }
}

(new NetworkService(2020, 2)).run
