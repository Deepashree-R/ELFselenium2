package throws_exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkingWithThrowsKeyword {
static String newfile="Sample2.txt";
public static void CreateNewFile() throws IOException
{
	File file =new File(newfile);
	if(!file.exists())
	{
		file.createNewFile();
		System.out.println("File is created");
	}
	else
	{
		System.out.println("file already exists");
	}
}
public static void WritingInTheFile() throws IOException, ArrayIndexOutOfBoundsException
{
	FileOutputStream fos=new FileOutputStream(newfile);
	String s1="I live in Bangalore \n";
	fos.write(s1.getBytes());
	String s2="I work for Testyantra";
	fos.write(s2.getBytes());
}
public static void ReadingFromTheFile() throws IOException, StringIndexOutOfBoundsException
{
	FileInputStream fis=new FileInputStream(newfile);
	int i=fis.read();
	while(i!=-1)
	{
		System.out.print((char)i);
		i=i=fis.read();
	}
}
public static void main(String[] args) throws IOException {
CreateNewFile();
WritingInTheFile();
ReadingFromTheFile();
}
}

