import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FindFilesofaFolderDemo {

    File fl=new File("C:\\Users\\DebmalyaPaul\\Desktop\\MyPractice");
    //Find all files of a folder
    public void FindFiles()
    {
        File file_array[]=fl.listFiles();
        for(File f:file_array)
        {
            System.out.println(f.getName());
        }

    }
    //Select only given extension file name
    public void FileExtension()
    {
        String[] fls=fl.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".jpg"))
                {
                    return true;
                }
                else {
                    return false;
                }
            }
        });
        for(String f:fls)
        {
            System.out.println(f);
        }
    }

    //content of this file
    public void FileContent()
    {

    }

    public static void main(String []args)
    {
        FindFilesofaFolderDemo ref=new FindFilesofaFolderDemo();
        ref.FindFiles();
        ref.FileExtension();
    }
}
