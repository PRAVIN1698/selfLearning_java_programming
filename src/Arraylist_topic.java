import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist_topic {



        private ArrayList<String> g_arraylist=new ArrayList<String>();

           void laa(){
                g_arraylist.add("2");
               g_arraylist.add("3");
               g_arraylist.add("4");
               g_arraylist.add("5");




               //getiing element
               g_arraylist.get(0);

               g_arraylist.set(2,"ee");

               g_arraylist.remove(3);
               g_arraylist.stream();

               for (String s : g_arraylist) {
                   System.out.println(s);
               }
               ListIterator<String> i = g_arraylist.listIterator();
               while (i.hasNext()) {
                   System.out.println("Now visiting " + i.previous());
               }




               Collections.sort(g_arraylist);

           }



}
