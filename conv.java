import java.util.Scanner;
import java.lang.Math;
public class conv{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter binary number");
String s=sc.nextLine();
int a=s.length()-1;
int decimel=0;
for(int i=0;i<a+1;i++)
{
if(s.charAt(i)=='1')
{
decimel=(int)(decimel+Math.pow(2,a-i));
}
}
System.out.println(decimel);
}
}