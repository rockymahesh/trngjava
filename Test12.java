import java.util.Scanner;
class Test12
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a two numbers"); 
int num1=sc.nextInt();
int num2=sc.nextInt();
int res=0;
if(num2==0)System.out.println("INVALID");
else 
{res=num1/num2;
System.out.println(num1+"/"+num2+"="+res);
  }//else
}
}