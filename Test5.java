import java.util.Scanner;
class Test5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int num1=sc.nextInt();
int num2=sc.nextInt();
int i=0;
while(i<5)
{
System.out.println("1:addition");
System.out.println("2:subraction");
System.out.println("3:multiplication");
System.out.println("4:division");
System.out.println("5:modulus division");
int choice=sc.nextInt();
if (choice==1)System.out.println(num1+"+"+num2+"="+(num1+num2));
else if (choice==2)System.out.println(num1+"-"+num2+"="+(num1-num2));
else if (choice==3)System.out.println(num1+"*"+num2+"="+(num1*num2));
else if (choice==4)System.out.println(num1+"/"+num2+"="+(num1/num2));
else if (choice==5)System.out.println(num1+"%"+num2+"="+(num1%num2));
i=i+1;
}//while
}//main()
}//Test5
