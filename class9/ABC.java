import java.io.*;

class ABC{
public static void main(String[] args)throws IOException 
{
File f=new File("d:\\JavaCode\\ABC.txt");
FileInputStream fis=new FileInputStream (f);

int c;
while((c=fis.read())!= -1){
System.out.print((char)c);
	 
}
}
}




