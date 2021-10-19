import java.util.Scanner;

public class ExceptionDemo {

	static void test(int a)throws UnderAge
	{
		if(a<18)
			throw new UnderAge(a);
		System.out.println("No Exceptions");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the age");
		int a=in.nextInt();
		try{
			test(a);
			System.out.println("Age="+a);
		}
		catch(UnderAge e)
		{
			System.out.println("Exception Found \n"+e.toString());
		}
	}

}
