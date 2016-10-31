import java.net._

def isInnerHost(hostName: String) = true

var urlString: String = null
var hostName = InetAddress.getLocalHost.getHostName
if(isInnerHost(hostName)){
  urlString = "http://inner.host"
}else{
  urlString = "http://outter.host"
}
