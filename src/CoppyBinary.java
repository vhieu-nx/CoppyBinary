import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CoppyBinary {
    public static void main(String[] args) {
        String strSourceFile="H:/FileIO/source.dat";
        String strDestinationFile="H:/FileIO/dest.dat";

        try
        {
            //create FileInputStream object for source file
            FileInputStream fin = new FileInputStream(strSourceFile);

            //create FileOutputStream object for destination file
            FileOutputStream fout = new FileOutputStream(strDestinationFile);

            byte[] b = new byte[1024];
            int noOfBytes = 0;

            System.out.println("Copying file using streams");

            //read bytes from source file and write to destination file
            while( (noOfBytes = fin.read(b)) != -1 )
            {
                fout.write(b, 0, noOfBytes);
            }

            System.out.println("File copied!");

            //close the streams
            fin.close();
            fout.close();

        }
        catch(FileNotFoundException fnf)
        {
            System.out.println("Specified file not found :" + fnf);
        }
        catch(IOException ioe)
        {
            System.out.println("Error while copying file :" + ioe);
        }
    }
}
