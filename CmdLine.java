
public class CmdLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length!=1)
		{
			System.out.println("Wrong Input");
			System.exit(0);
		}
		try
		{
			double d=Double.parseDouble(args[0]);
			System.out.println("Double of Number="+(d*2));
		}
		catch(NumberFormatException e)
		{
			System.out.println("Wrong Input");
		}
	}

}
