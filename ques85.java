import java.util.*;
class q85
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        String revstr=new StringBuilder(str).reverse().toString();
        if(str.compareTo(revstr)==0)
            System.out.println("PALINDROME STRING");
        else
            System.out.println("NOT A PALINDROME STRING");
    }
}