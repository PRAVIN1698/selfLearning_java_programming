import java.util.ArrayList;

public class Generics_topic {





void kakak()
{
    ArrayList<Integer> item=new ArrayList<Integer>();
    item.add(1);
    item.add(2);
    item.add(3);
    item.add(4);
    item.add(5);
    item.add(6);

    Printdoubled(item);

}

    private static void Printdoubled(ArrayList<Integer> item) {


    for(Object i: item){
        System.out.println((Integer)i*2);


    }













    }


}
