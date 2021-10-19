import java.io.*;
public class Copy {

	public static void copy(String x,String y) throws IOException {
		FileInputStream f=new FileInputStream(x);
		FileWriter f1=new FileWriter(y,false);
		BufferedReader br=new BufferedReader(new InputStreamReader(f));
		String str;
		while((str=br.readLine())!=null) //Reading from input file
		{
			f1.write(str);//Writing in output file
			f1.write("\n");
		}
		f.close();//Closing Input File
		f1.close();//Closing Output File
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if(args.length!=2)
				throw new InvalidArgumentException();
			else
				copy(args[0],args[1]);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(InvalidArgumentException e)
		{
			System.out.println(e);
		}	
	}

}
class InvalidArgumentException extends Exception{
	
	public String toString()
	{
		return ("Invalid Number of arguments");
	}
}