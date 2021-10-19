import java.io.*;
class Rearrange
{													  
    String txt,cxt;										    
    int len;
    public Rearrange()				
    {					
        txt=" ";			
        cxt="";				
        len=0;				
    }												    

    void readWord()throws IOException	
    {					
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word in upper case");			
        txt=br.readLine();							
    }												    

    void convert()
    {
        char ch;						
        int i, flag=0;						
        len=txt.length();					
        ch=txt.charAt(0);				
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')	
            cxt=txt+"Y";					
        else						
        {						
            for(i=0;i<len;i++)				
            {						
                ch=txt.charAt(i);			
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')	
                {						
                    cxt=txt.substring(i)+txt.substring(0,i)+"C";
                    flag=1;					
                    break;					
                }						
            }							
            if(flag==0)						
                cxt=txt+"N";					
        }							
    }								

    void display()									
    {											
        System.out.println("Original Word "+txt);				
        System.out.println("Changed Word "+cxt);					
    }												    

    public static void main(String args[])throws IOException				
    {											
        Rearrange ob=new Rearrange();							
        ob.readWord();										       
        ob.convert();										      
        ob.display();						
    }
}
