import java.util.Scanner;
class Test11
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a two numbers"); 
int num1=sc.nextInt();
int num2=sc.nextInt();
int max=0;
if(num1<=num2)max=num2;
if(num1>num2)max=num1;
System.out.println("largest maximum of "+num2+" and"+num1+" is"+max);
  }
}