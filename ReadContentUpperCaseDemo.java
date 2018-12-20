import java.io.BufferedReader;
import java.io.FileReader;

public class ReadContentUpperCaseDemo
{
    public static void main(String []args)throws Exception
    {
        FileReader fr=new FileReader("C:\\Users\\DebmalyaPaul\\Desktop\\debmalya.txt");
        BufferedReader br=new BufferedReader(fr);
        int i;
        while((i=br.read())!=-1)
        {
            if(Character.isLowerCase(i))
            {
                i=Character.toUpperCase(i);
            }
            System.out.print((char)i);
        }
        br.close();
        fr.close();
    }
}
