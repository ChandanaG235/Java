package week11;
import java.io.FileWriter;
import java.io.*;
public class MyFileWriter
{
	public static void main(String[]args) throws IOException
	{
		try
		{
			FileWriter fw=new FileWriter("TestFile.txt");
			String s=("\n All The Best for your Exams dear students.\n");
			char ch[]=s.toCharArray();
			for (int i=0;i<ch.length;i++)
				fw.write(ch[i]);
			s="Good Luck and Prepare Well.";
			fw.write(s);
				fw.close();
			int i=0;
			FileReader fr=new FileReader("TestFile1.txt");
			while((i=fr.read())!=-1)
				System.out.println((char)i);
			fr.close();
		}
		catch(FileNotFoundException nfe)
		{
			System.out.println("Invalid Filename\n File doesnot exists");
		}
	}
}
