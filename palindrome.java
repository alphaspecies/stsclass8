import java.util.*;
 public class palindrome
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int m = n, d=0, rev=0;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;

        }

System.out.println("Reverse of the number ="+rev);
if(m==rev)
System.out.println("The number is palindrome.");
else
System.out.println("The number is not a palindrome.");


    }
}