import java.util.Scanner;

public class third
{
public static void main(String args[])
{
System.out.print("enter the value x :");
Scanner sc=new Scanner(System.in);
int x = sc.nextInt();
System.out.print("enter the value y :");
Scanner sr=new Scanner(System.in);
int y = sr.nextInt();
int z = x%y;

System.out.print("the value z is :"+z);
}
}