import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import java.util.Map;

public class High_levelapis {


    ///scheme,scheme-specific part,authority,user-info,host,port,path,query,framgment
    //scheme:[//[user[:password]@]host[:port]][/path][?query][#fragment]
    //https://en,wikipedia.org/wiki/uniform_resource_identifier
    //uri ->gives a scheme ->absolute uris!if not it is->relative URI


    void ma(){
        System.out.println("sds");
    }

//        try {
//            URI uri=new URI("db://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
//            System.out.println("Schewme="+uri.getSchemeSpecificPart());
//            System.out.println("Authority ="+uri.getAuthority());
//            System.out.println("Useer info = "+uri.getUserInfo());
//            System.out.println("host:"+uri.getHost());
//            System.out.println("port = "+uri.getPort());
//            System.out.println("Query ="+uri.getQuery());
//            System.out.println("fragment ="+uri.getFragment());
//
//        } catch (URISyntaxException e) {
//            throw new RuntimeException(e);
//        }


//        try {
//            URL url=new URL("https://example.org");
//            HttpURLConnection URLCONNECTION = (HttpURLConnection) url.openConnection();
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////            URLCONNECTION.setDoInput(true);
////            URLCONNECTION.connect();
////
//////            Returns a URLConnection instance that represents a connection to the remote object referred to by the URL.
//////            A new instance of URLConnection is created every time when invoking the URLStreamHandler.openConnection(URL) method of the protocol handler for this URL.
//////                    It should be noted that a URLConnection instance does not establish the actual network connection on creation. This will happen only when calling URLConnection.connect().
////
////            BufferedReader r=new BufferedReader(new InputStreamReader(URLCONNECTION.getInputStream()));
////
////
////            Map<String, List<String>> heeaderfeilds=URLCONNECTION.getHeaderFields();
////            for(Map.Entry<String,List<String>>entry:heeaderfeilds.entrySet()){
////                String key= entry.getKey();
////                List<String> value=entry.getValue();
////                System.out.println("----key"+key);
////                for (String each:value){
////                    System.out.println("value ="+value);
////                }
////
////
////
////
////            }
////
////            String Line="";
////            while(Line !=null){
////                Line = r.readLine();
////                System.out.println(Line);
////            }
////            r.close();
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
//
//
//    }
//
//
//
//
//
//














}
