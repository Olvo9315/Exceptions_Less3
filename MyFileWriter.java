import My_Exceptions.*;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {


    public static void writeToFile(String fileName, String data) throws MyAppException {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName, true);
            writer.write(data + "\n");
            System.out.println("File saved successfully");
        } catch (IOException e) {
            throw new MyFileOperationException();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {

            }
        }
         
    }
}
