import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList_topic {


    void sk() {

        LinkedList<String> s = new LinkedList<String>();

        s.add("chennai");
        s.add("kumbakonam");
        s.add("melmaruvathur");
        s.add("lala");
        s.add("hotel");
        printlist(s);
        visit(s);
    }


    private static void printlist(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("======================");


    }


    private static boolean addInorder(LinkedList<String> linkedList, String newcity) {

        ListIterator<String> StringlinkIterator= linkedList.listIterator();

        while(StringlinkIterator.hasNext())
        {
            int comparison=StringlinkIterator.next().compareTo(newcity);

            if(comparison==0)
            {
                // equal do not add
                System.out.println(newcity+"is already includede as adestination");
                return false;
            }else if(comparison >0){
                //new city shouyld appear before this one
                //brisbane _> adelaide

                StringlinkIterator.previous();
                StringlinkIterator.add(newcity);
                return true;
            }else if(comparison <0)
            {

            }

        }
        StringlinkIterator.add(newcity);
        return true;
    }


        private static void visit(LinkedList cities){

        Scanner sc=new Scanner(System.in);
        boolean quit=false;

        ListIterator<String> listIterator=cities.listIterator();

        if(cities.getFirst() == "")
        {
            System.out.println("no citites in iternary");
            return;
        }else{

            System.out.println("Now visiting "+listIterator.next());
             printMenu();
        }


        while(!quit){
            int action =sc.nextInt();
            sc.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday (vacation) over");
                    quit = true;
                    break;
                case 1:
                    if (listIterator.hasNext()) {
                        System.out.println("Now Visiting" + listIterator.next());
                    } else {
                        System.out.println("Reached end of the list");
                    }

                    break;
                case 2:
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now vistim=ng" + listIterator.previous());
                    } else {
                        System.out.println("we are at stsarting of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }



        }

    private static void printMenu() {
        System.out.println("Avaliable action:\npress ");
        System.out.println("0 - toquit\n"
        +       "1 -> go to city\n" +
                "2-> go to previous city\n"+
                "3-> print menu" );
    }


}
