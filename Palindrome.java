import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:- ");
        String s=sc.nextLine();
        String rs="";
        char c;
        for (int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            rs=c+rs;
        }
        if (s.toLowerCase().equals(rs.toLowerCase()))
        {
            System.out.println("Palindrome String");
        }else {
            System.out.println("Not a Palindrome String");
        }
    }
}
