import java.util.Scanner;
import java.util.Arrays;
public class hex{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter binary number");
String s=sc.nextLine();
int a=s.length()%4;
int b=4-a;
for(int i=0;i<b;i++){
s=0+s;
}
int end=s.length()-1;
int beg=end-3;
int p=s.length()/4;
String[] srr=new String[p];
for(int i=0;i<p;i++){srr[i]="";}
for(int i=0;i<p;i++){
for(int j=beg;j<=end;j++){
srr[i]=srr[i]+s.charAt(j);

}beg=beg-4;end=end-4;
}

String t="";
int x=3;
int[] decimel=new int[p];
for(int i=0;i<p;i++){decimel[i]=0;}
for(int i=0;i<p;i++){
for(int j=0;j<x+1;j++)
{
if(srr[i].charAt(j)=='1'){
decimel[i]=(int)(decimel[i]+Math.pow(2,x-j));
}
}}
System.out.println("");
for(int i=p-1;i>=0;i--){
switch(decimel[i]){
case 10:System.out.print("A");break;
case 11:System.out.print("B");break;
case 12:System.out.print("C");break;
case 13:System.out.print("D");break;
case 14:System.out.print("E");break;
case 15:System.out.print("F");break;
case 16:System.out.print("G");break;
default:System.out.print(decimel[i]);
}
}
}
}