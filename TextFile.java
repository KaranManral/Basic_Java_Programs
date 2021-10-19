import java.io.*;
import java.text.Collator;
import java.util.*;

public class TextFile {

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private void displayConsole()throws IOException
	{
		System.out.println("Enter a sentence of five words");
		String s=br.readLine()+" ";
		String[] w=s.split(" ");

		Collections.sort(Arrays.asList(w),Collator.getInstance());
		for(int i=0;i<w.length;i++)
			System.out.println(w[i]);
	}
	
	private void putText(String[] s)throws IOException
	{
		FileWriter f=new FileWriter("file1.txt",true);

		for(int i=0;i<s.length;i++)
			Collections.sort(Arrays.asList(s),Collator.getInstance());
		for(int i=0;i<s.length;i++)
		{
			f.write(s[i]);
			f.write("\n");
		}
		try{
			f.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		TextFile ob=new TextFile();
		try {
			int l=args.length;
			
			if(l==5)
			{
				ob.putText(args);
			}
			else if (l==0)
			{
				ob.displayConsole();
			}
			else 
				throw new ArgumentException();
		}
		catch(ArgumentException e)
		{
			System.out.println(e.toString());
		}
	}

}
class ArgumentException extends Exception{
	public String toString()
	{
		return ("Error: Number of arguments is not valid!");
	}
}