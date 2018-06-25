import java.io.*;
import java.util.*;
class DatesFormat{
	public  static void main(String[] args){
HashMap<Integer,String> dts=new HashMap<Integer,String>();
dts.put(1,"One");
dts.put(2,"Two");
dts.put(3,"Three");
dts.put(4,"Four");
dts.put(5,"Five");
dts.put(6,"Six");
dts.put(7,"Seven");
dts.put(8,"Eight");
dts.put(9,"Nine");
dts.put(10,"Ten");
dts.put(11,"Eleven");
dts.put(12,"Twelve");
dts.put(13,"Thirteen");
dts.put(14,"Fourteen");
dts.put(15,"Fifteen");
dts.put(16,"Sixteen");
dts.put(17,"Seventeen");
dts.put(18,"Eighteen");
dts.put(19,"Nineteen");
dts.put(20,"Twenty");
dts.put(21,"Twentyone");
dts.put(22,"Twentytwo");
dts.put(23,"Twentythree");
dts.put(24,"Twentyfour");
dts.put(25,"Twentyfive");
dts.put(26,"Twentysix");
dts.put(27,"Twentyseven");
dts.put(28,"Twentyeight");
dts.put(29,"Twentynine");
dts.put(30,"Thirty");
dts.put(31,"Thirtyone");


HashMap<Integer,String> mns=new HashMap<Integer,String>();
mns.put(1,"January");
mns.put(2,"february");
mns.put(3,"March");
mns.put(4,"April");
mns.put(5,"May");
mns.put(6,"June");
mns.put(7,"July");
mns.put(8,"August");
mns.put(9,"September");
mns.put(10,"October");
mns.put(11,"November");
mns.put(12,"December");

HashMap<Integer,String> yrs= new HashMap<Integer,String>();
yrs.put(2011,"Two Thousand Eleven");
yrs.put(2012,"Two Thousand Twelve");
yrs.put(2013,"Two Thousand Thirteen");
yrs.put(2014,"Two Thousand Fourteen");
yrs.put(2015,"Two Thousand Fifteen");
yrs.put(2016,"Two Thousand Sixteen");
yrs.put(2017,"Two Thousand Seventeen");
yrs.put(2018,"Two Thousand Eighteen");

String date="12/06/2018";
Scanner sc=new Scanner(System.in);
String n=sc.next();
int str=Integer.parseInt(n.substring(0,2));
int str1=Integer.parseInt(n.substring(3,5));
int str2=Integer.parseInt(n.substring(6));
System.out.println(dts.get(str)+" " +mns.get(str1)+" " +yrs.get(str2) );

//System.out.println(sub);





}
}