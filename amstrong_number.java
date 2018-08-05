import java.util.Scanner;
public class amstr{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int a=sc.nextInt();
int b,c,sum=0;
b=a;
while(b>0){
c=b%10;
sum=sum+c*c*c;
b=b/10;
}
if(sum==a){System.out.println("amstrong number");}
else{System.out.println("not amstrong number");}
}
}