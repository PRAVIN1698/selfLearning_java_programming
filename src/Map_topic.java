import java.util.*;

public class Map_topic {



    private static Map<String, language> languages = new HashMap<String, language>();

    Map<String,Integer>ff=new HashMap<String,Integer>();

    Set<String>hd=new HashSet<>();


    void maaaap() {


        languages.put("java",new language("ss","a compiled high level,object oriented platform"));
        languages.put("java",new language("scs","bject oriented platform"));
        languages.put("java",new language("sds","a oriented platform"));
        languages.put("aszbx",new language("sdc","a compiled high level,object oriented platform"));




            System.out.print(languages.get("aszbx").getDhaa());


         ff.put("heloo",3);
        ff.put("maria",2);
        ff.put("kaathal",4);
        ff.put("kanna",5);
        ff.put("lovvss",6);
        ff.put("hwy",7);




             for(Map.Entry<String,Integer>entry: ff.entrySet()){
                 String key=entry.getKey();
                 Integer value=entry.getValue();
                 System.out.println(key+"; "+value);
             }


        for (String key : ff.keySet()) {
            Integer value = ff.get(key);
            System.out.println(key + ": " + value);
        }

        ff.forEach((Key,Value) -> System.out.println(Key+"; "+Value));












    }



}
