import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;
class ABC{
	public static void main(String[] args)throws IOException
{
File f1=new File("d:\\JavaCode\\efg.txt");
File f2=new File("d:\\JavaCode\\mnp.txt");


FileReader fis=new FileReader(f1);
FileWriter fos=new FileWriter(f2);

BufferedReader brs = new BufferedReader(fis);
BufferedWriter bos = new BufferedWriter(fos);

String rd;

while((rd = brs.readLine()) != null){
System.out.print(rd);
bos.write(rd);	
bos.flush();

}


}

}