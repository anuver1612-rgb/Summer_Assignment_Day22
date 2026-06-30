import java.util.*;
class q86
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        int i,len,w=0;
        len=str.length();
        for(i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch==' ') w++;
        }
        if(str.charAt(len-1)==' ')
            System.out.println("WORDS = "+w);
        else
            System.out.println("WORDS = "+(w+1));
    }
}