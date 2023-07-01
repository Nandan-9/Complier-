import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferedWriter writer = new BufferedWriter(new FileWriter("/home/dev/applications/nand2tetris/projects/07/MemoryAccess/BasicTest/BasicOut.asm"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("BasicOut.asm"));
        NoWhiteSpace remover = new NoWhiteSpace();
        String filePath = "/home/dev/applications/nand2tetris/projects/07/MemoryAccess/BasicTest/BasicTest.vm";
        ArrayList<String> vmCode = NoWhiteSpace.reader("/home/dev/applications/nand2tetris/projects/07/MemoryAccess/BasicTest/BasicTest.vm");
        //System.out.println(vmCode.size());
        for(int i = 0 ; i < vmCode.size() ; i++){
            //System.out.println(Arrays.toString(vmCode.get(i).split(" ")));
           ArrayList<String> result = Validator.validate(vmCode.get(i).split(" "),filePath);
           for (String s : result){
               writer.write(s + "\n");
               System.out.println(s + "\n");
           }

//            for (String s : parser){
//                System.out.println(s);
//            }
        }
//        for ( String str : vmCode){
//            System.out.println(str);
//        }
        writer.close();
    }
}