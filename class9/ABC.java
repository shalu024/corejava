import java.io.*;

class ABC{
public static void main(String[] args)throws IOException 
{
File f=new File("d:\\JavaCode\\ABC.txt");
FileInputStream fis=new FileInputStream (f);
FileOutputStream fos= new FileOutputStream(f);


String text="I Started Learning Java";
byte[] b=text.getBytes();
for(byte b2:b)
{
fos.write(b2);
}
fos.flush();
fos.close();

int c;
while((c=fis.read())!= -1){
System.out.print((char)c);
	 
}
}
}




