package eightPractice;

import java.io.*;
import java.util.Scanner;

public class FileEditor {
    public static void main(String[] args) {
        BufferedReader bf = null;
        try {
            File file = new File("worky.txt");
            if(!file.exists()){
                file.createNewFile();
            }

            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            PrintWriter p = new PrintWriter(file);
            p.println(input);
            p.close();


            bf = new BufferedReader(new FileReader("worky.txt"));
            String line;
            while((line = bf.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException ex){
            System.out.println("Error");
        }
        try{
            bf.close();
        }
        catch(IOException e){
            System.out.println("Error with reading");
        }
    }
}
