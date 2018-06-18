class Rectangle{
int length;
int breath;
void setData(int l,int b){
length=l;breath=b;
}
int area(){
int n;
n=length*breath;
return n;
}
}
public class AreaofRectangle{
public static void main(String[] args){
Rectangle Rect=new Rectangle();
Rect.setData(6,8);
int calculate=Rect.area();
System.out.println("Area of rectangle is:"+calculate);
}
} 