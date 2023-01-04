import java.util.HashMap;
import java.util.Map;

public class language {

private String hesdjk;

    private static Map<String,String> exists;


private String dhaa;

    public String getHesdjk() {
        return hesdjk;
    }

    public void setHesdjk(String hesdjk) {
        this.hesdjk = hesdjk;
    }

    public String getDhaa() {
        return dhaa;
    }

    public void setDhaa(String dhaa) {
        this.dhaa = dhaa;
    }





    public language(String hesdjk, String dhaa) {
        this.hesdjk = hesdjk;
        this.dhaa = dhaa;
        this.exists = new HashMap<String,String>();
    }

    public void addmaap(String hesdjk, String dhaa) {
        exists.put(hesdjk, dhaa);
    }



    //exist mapping wont be affected
    public Map<String,String> getExists(){
        return new HashMap<String,String>(exists);
    }


}



