import java.util.*;
public class StringPalindrome {

	boolean isPalin(String str)
    {
        String s1="";
        for(int i=str.length()-1;i>=0;i--)
            s1+=str.charAt(i);
        if(s1.equalsIgnoreCase(str))
            return true;
        else 
            return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		StringPalindrome ob=new StringPalindrome();
		if(ob.isPalin(s))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}

}
