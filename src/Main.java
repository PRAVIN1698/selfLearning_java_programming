import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.*;

public class Main {
  float price;



    public static void main(String[] args) throws IOException {


        Constructor c = new Constructor("timn", 928.66);


        System.out.print(c.getSong());
        System.out.print(c.getCreditlimit());


        ArrayList al = new ArrayList();

        al.add("Reflection");
        al.add("Collection");
        al.add("Stream");

        ArrayList al2 = new ArrayList();
        al2.add(3);
        al2.add(2);

        al2.add(4);


        List<String> names =
                Arrays.asList("Reflection", "Collection", "Stream");


        //System.out.print(one);


        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());


        System.out.print(al.stream().equals(al2));
        System.out.println(result);
        System.out.println(al);
        System.out.println(names);

        //String fname = args[0];

        // pass the filename or directory name to File
        // object

        childinheritance cwq = new childinheritance(88);

        cwq.moo();

        textstring t = new textstring();

        t.JND();


        composition_encapsulatioon_polymorphisim fff = new composition_encapsulatioon_polymorphisim();

        fff.setName("hh");
        System.out.println(fff.getName());


        //Array_topic a=new Array_topic();
        //a.aa();


        //Arraylist_topic d=new Arraylist_topic();
        //d.laa();


        //LinkedList_topic l=new LinkedList_topic();
        //l.sk();


        ittelephone_interfacetopic pravinphone;
        pravinphone = new Interface_topic(1234);
        pravinphone.callphone(1234);
        pravinphone.answer();

        Generics_topic g = new Generics_topic();
        g.kakak();


        Map_topic maaaap = new Map_topic();
        maaaap.maaaap();


        set_topic ani = new set_topic();
        ani.gas();


        //Exception_topic asd=new Exception_topic();
        //System.out.println(asd.divivdeByl(5,0));
        //System.out.println(asd.divifdeEafp(5,0));


        //files_topic hjew=new files_topic();
        //hjew.kaaboi();
        //hjew.he();

        //laamda_topic ffddss=new laamda_topic();
        //ffddss.sdg();


        //Straeam_topic dds=new Straeam_topic();
        //dds.gg();

        //High_levelapis hfd=new High_levelapis();
        //hfd.ma();



    }









}