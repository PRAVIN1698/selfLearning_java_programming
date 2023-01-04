import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.compare;
import static java.util.Arrays.sort;

public class Array_topic {


//compare
     int [] array=new int[5];

     Scanner s=new Scanner(System.in);
void aa() {
    for (int i = 0; i <array.length; i++) {

        array[i]=s.nextInt()*10;

        System.out.println(array[i]);

    }
    int[] array1=new int[5];
    float []dd=new float[6];
    for (int i = 0; i <array1.length; i++) {
        array1[i]=s.nextInt()*10;
        System.out.println(array1[i]);
    }
   Arrays.sort(array1);

    System.out.println(compare(array,array1));




    double []doublearray=new double[]{1.87,23.78,4.65,5.678};
    for (int i = 0; i <doublearray.length; i++) {

        System.out.println(doublearray[i]);
    }
    //System.out.print(Arrays.stream(array1).filter(num -> num % 5 == 0));

     int[][] multiarray1={{1,2,3,4},{5,6,7}};

     for(int i=0;i< multiarray1.length;i++)
     {
         for(int j=0;j< multiarray1[i].length;j++){
             System.out.print(multiarray1[i][j]);
         }
     }


     //sort
     //all match
     //any match
     //none match
     //max
     //min
     //group









}
}
