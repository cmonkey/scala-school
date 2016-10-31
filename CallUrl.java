import java.net.InetAddress;

public class CallUrl{
    
    public static void main(String[] args)throws Exception{
        
        String urlString = null;

        String hostName = InetAddress.getLocalHost().getHostName();

        if(isInnerHost(hostName)){
            urlString = "http://inner.host";
        }else{
            urlString = "http://outter.host";
        }
    }

    private static boolean isInnerHost(String hostName){
        
        return true;
    }
}
