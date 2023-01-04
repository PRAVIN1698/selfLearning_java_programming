import java.util.*;

public class set_topic {


void gas() {
    Set<String> animals = new HashSet<>();
    animals.add("Animals");
    animals.add("pig");
    animals.add("cow");
    animals.add("Buffoalooo");



    Map<String,String> m=new HashMap<>();
    m.put("hello","World");
    m.put("hd","morty");
    m.put("paaa","sandeep");
    m.put("sd","joshiii");
    m.put("gre","moniii");

   System.out.println("=============for eACH CONSUMER================================");

    m.forEach((Key,value)->System.out.println(Key+";"+value));

   System.out.println("============Entry Set===================");

    for(Map.Entry<String,String>entry: m.entrySet()){
        String key=entry.getKey();
        String value=entry.getValue();
        System.out.println(key+"; "+value);
    }

    System.out.println("===============for each key   for looop===============================");


    for (String key:m.keySet()) {
        String value=m.get(key);
        System.out.println(key+" "+value);
    }


    System.out.println("=============for eACH CONSUMER================================");
    animals.forEach(s->System.out.println(s));


    System.out.println("============Iterartor ===================");
    Iterator<String> itr=animals.iterator();
    while(itr.hasNext()){
        String s=itr.next();
        System.out.println(s);
    }


    System.out.println("============foeach looop ===================");

    for(String s:animals){
        System.out.println(s);
    }



}

















}
