
public class fdg {
	public static void main(String[] args) {
		try {
			meth1();
		}
		catch(InterruptedException ie) {
			System.out.print("A");
			throw new RuntimeException();
		}
		catch(RuntimeException ie) {
			System.out.print("B");
			return;
		}
		catch(Exception ie) {
			System.out.print("C");
		}
		finally {
			System.out.print("D");
		}
		System.out.print("E");
	}
	static void meth1()throws InterruptedException
	{
		throw new InterruptedException("Demo");
	}

}
