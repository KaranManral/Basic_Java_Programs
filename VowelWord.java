import java.util.*;
public class VowelWord
{
    String str;
    int freq;
    VowelWord()
    {
        freq=0;
        str="";
    }

    void readstr()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        str=sc.nextLine()+" ";
    }

    void freq_vowel()
    {
        String w;int k=0;
        for(int i=0;i<str.length();i++)
        {
            w="";
            if(str.charAt(i)==' ')
            {
                w=str.substring(k,i);
                k=i+1;
                if(w.charAt(0)=='A'||w.charAt(0)=='E'||w.charAt(0)=='I'||w.charAt(0)=='O'||w.charAt(0)=='U'||w.charAt(0)=='a'||w.charAt(0)=='e'||w.charAt(0)=='i'||w.charAt(0)=='o'||w.charAt(0)=='u')
                    freq++;
            } 
        }
    }

    void display()
    {
        System.out.println("Number of words begining with vowel="+freq);
    }

    public static void main()
    {
        VowelWord ob=new VowelWord();
        ob.readstr();
        ob.freq_vowel();
        ob.display();
    }
}  