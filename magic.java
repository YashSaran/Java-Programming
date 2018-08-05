import java.util.Scanner;
public class magic{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
int d,s;
s=n;
while(s>9)
{
n=s;
s=0;
while(n>0)
{
d=n%10;
s=s+d;
n=n/10;
}
}
if(s==1)
System.out.println("magic");
else
System.out.println("not magic");
}
}