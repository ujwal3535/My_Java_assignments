package Serialization;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileOutputStream;

public class Filestreamwrite {

	public static void main(String[] args) {
        File my =new File("/home/ujwal/eclipse-workspace/Seed_Java/AdvJava/ab.txt");
		try {
			if(my.createNewFile()) {
				System.out.println("File created: "
                        + my.getName());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//writing the text
		
		try {
			FileWriter fw=new FileWriter(my);
			fw.write("hello welcome to my new file. i am good");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Reading the file
		try {
			Scanner sc =new Scanner(my);
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//        int b=25;
//        try {
//        FileOutputStream fo= new FileOutputStream('../a.docx');
//        }
		
	}
}
