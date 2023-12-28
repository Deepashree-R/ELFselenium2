package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingFile {
	public static void main(String[] args) throws IOException{
		File file=new File("C://ELF(file handling)//Sample.txt");
		if(!file.exists())
		{
			System.out.println("file is created");
			file.createNewFile();
		}
		else 
		{
			System.out.println("file is already created");
		}
		FileOutputStream fos=new FileOutputStream(file);
		String s1="I live in Bangalore \n";
		fos.write(s1.getBytes());
		String s2="I work for Test Yantra \n";
		fos.write(s2.getBytes());
		String s3="Im learning java \n";
		fos.write(s3.getBytes());
		FileInputStream fis=new FileInputStream (file);
		int i=fis.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fis.read();
		}
		
	}
}
