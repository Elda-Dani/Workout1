import java.util.Scanner;  
public class largeone  
{  
public static void main(String[] args)   
{  
int a, b, c, l;  
Scanner sc = new Scanner(System.in);   
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt();  
l = c > (a > b ? a : b) ? c : ((a > b) ? a : b);  
System.out.println("The largest number is: "+l);  
}  
}  