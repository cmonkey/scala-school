import java.net._

def isInnerHost(hostName: String) = true

val hostName = InetAddress.getLocalHost.getHostName

val urlString = if (isInnerHost(hostName)) {

  "http://inner.host"
}else{
  "http://outter.host"
}
