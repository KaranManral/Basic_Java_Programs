import java.io.*;

public class ReadFile {
	
	static void read() //Function to Read File
	{
		try {
			File f=new File("file1.txt");
			BufferedReader br=new BufferedReader(new FileReader(f));
			String st;
			while((st=br.readLine())!=null)
			{
				if(st.charAt(0)=='/'&&st.charAt(1)=='/')
					System.out.println(st);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File cannot be found");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
	}

}
