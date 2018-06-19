public class Substring{

 public static void main(String[] args)
         {
            String ptr ="pari";
            SubString(ptr,ptr.length());
         }
 public static void SubString(String ptr,int a){
      for (int i=0; i<a;i++){

         for (int j=i+1; j<=a;j++){
      
            System.out.println(ptr.substring(i, j));
         
            }
        }
    }
}