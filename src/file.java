import java.io.File;
import java.io.IOException;

//public class file {



    //File ocjp
    //write and read-file writer and reader data//
    //FILE READER
    //buffreerd writer and reader
    //print writer


    //1)folder creation
    //2)subfolder cretaion
    //3)file creration
    //4)file deletion
    //5)file rename
    //6)printing file name
    //7)listing all file and folder in directory
    //8)listing only files in direcotory











        //public static void main(String[] args) throws IOException {
            /* 1)---foldercreation
             2)---Subfoldercreation
             File f = new File("D:\\Raja\\rani\\mathiri");
             boolean p=f.exists();
            if(p==false)
            {
                folder creation
                f.mkdir(); for folder
                nested folder
                f.mkdirs(); //will create nested folder subfolder
           }
            boolean p=f.exists();

                 */

            // 3)file creation
           /* File f = new File("D:\\Raja\\rani\\mathiri\\text.txt");
            //File creation
            boolean p=f.exists();
            if(p==false)
            {
                f.createNewFile();
            }*/


            //4)File deletion
            /*File f = new File("D:\\Raja\\rani\\mathiri\\text.txt");

           f.delete();

            boolean p=f.exists();
            System.out.print("File deleted "+p);
            */

            //5)file Rename
            /* File f = new File("D:\\Raja\\rani\\mathiri\\text.txt");
            File f1 = new File("D:\\Raja\\rani\\mathiri\\one.txt");

            boolean p=f.exists();
            if(p==false)
            {
                f.createNewFile();
            }
            f.renameTo(f1);
             */

            //6)printing file name
           /*File f = new File("D:\\Raja\\rani\\mathiri\\text.txt");
            boolean p=f.exists();
            if(p==false)
            {
                f.createNewFile();
            }
            System.out.println(f.getName());
            Syytem.out.println(f.canExecute());
          */


            //7) listintg folders
           /* File f = new File("D:\\alapakkamcopcanut garden");
            File [] fileoffolder=f.listFiles();
            for(File f1: fileoffolder)
            {
                if(f1.isFile())//--for file listing -- for folder id direcoty
                {
                      String fname = f1.getName();
                      int lastDOT=fname.lastIndexOf(".");
                      String extension=fname.substring(lastDOT+1);

                      if(extension.equals("pdf")) {
                          System.out.println(fname);
                      }
                }
            }*/







        //}//
    //}






















