import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class files_topic implements Serializable {

String heyhe="heeeloo";



public <String> List he(){
    List shs=new ArrayList<String>();

    shs.add("2");
    shs.add("ds");
    shs.add("dsd");
    shs.add("dsdfg");
    shs.add("dsss");
    shs.add("ds4gf");
    shs.add("dssef");
    shs.add("dssdf");




hs(shs);
return shs;
}
Scanner scanner;
    Scanner sc;
/*void kaaboi() throws IOException {

    try (FileWriter myWriter = new FileWriter("D:\\kooo\\mammia.txt");
    ){
        //myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.write("poda loosu payalae zadgvazfvs");
        myWriter.append("sls",0,1);
        myWriter.append(heyhe);
        System.out.println("Successfully wrote to the file.");
        scanner = new Scanner(new FileReader("D:\\kooo\\mammia.txt"));
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }

}*/



//outputstreams
    void hs(List shs){

        try {

            //FileOutputStream ff=new FileOutputStream("D:\\kooo\\hcc.txt");
            //sc = new Scanner(new FileInputStream("D:\\kooo\\mammia.txt"));
            //InputStream intputstream =new FileInputStream("D:\\kooo\\hsc.txt");
            //DataInputStream intputstreams =new DataInputStream((InputStream) shs);

            //ObjectOutputStream oos = new ObjectOutputStream(ff);

            // Write the ArrayList to the file
            //oos.writeObject(shs);

            // Close the streams
            //oos.close();
            RandomAccessFile raf = new RandomAccessFile("D:\\kooo\\mammia.txt", "r");
           String b = String.valueOf(raf.read());
            while (b.isEmpty()) {
                // process the data here
                b = String.valueOf(raf.read());
                System.out.println(b);
            }
            raf.close();

            RandomAccessFile file123 = new RandomAccessFile("D:\\kooo\\mammia.txt", "rw");
            file123.writeInt(123);
            file123.writeUTF("Hello, world!");
            file123.seek(5);
            file123.writeUTF("Hello, machiii");
            //file123.seek(1);

            // Set the file pointer to the beginning of the file

             // writes the byte with the value 65 (ASCII code for 'A') to the file
            file123.close();


                // Write some data to the file



            //while(sc.hasNextLine()){
                //sc.useDelimiter(",");
                //String data =sc.nextLine();
                //System.out.print(data);
            //}
            //intputstream.close();

            //ff.close();
            //FileInputStream fis = new FileInputStream("D:\\kooo\\hcc.txt");
            //ObjectInputStream oosd = new ObjectInputStream(fis);

            //ArrayList today= (ArrayList) oosd.readObject();

            //System.out.println(today);

            //fis.close();
            //sc.close();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }













}
