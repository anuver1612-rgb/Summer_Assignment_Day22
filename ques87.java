import java.util.*;
class q87
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        int i,j,len,c;
        len=str.length();
        for(i=97;i<=122;i++)
        {
            c=0;
            for(j=0;j<len;j++)
            {
                char ch=str.charAt(j);
                if(ch==(char)i) c++;
            }
            if(c!=0)
                System.out.println("Frequency of "+((char)i)+" = "+c);
        }
    }
}