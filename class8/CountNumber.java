class CountNumber{
public static void main(String[] args){
String ptr="Computer Science Engineering";
int count=1;
for(int i=0; i<ptr.length()-1;i++){
if(ptr.charAt(i)==' ' && (ptr.charAt(i+1)!=' ')){
count++;
}
	}

	System.out.print(" Total numbers of word is:="+count);
}
	
}