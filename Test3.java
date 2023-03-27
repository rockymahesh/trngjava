import java.util.Scanner;
class Test3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();//1
switch(num)
{
case 7:{System.out.print("MONDAY");break;}
case 1:{System.out.print("TUESDAY");break;}
case 2:{System.out.print("WEDNESDAY");break;}
case 3:{System.out.print("THURSDAY");break;}
case 4:{System.out.print("FRIDAY");break;}
case 5:{System.out.print("SATURDAY");break;}
case 6:{System.out.print("SUNDAY");break;}
default : {System.out.print("INVALID");break;}
}//switch
}//main()
}//Test3