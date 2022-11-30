import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;


public class ConvertToUpper{

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("src/a.txt");
            int character;
            String data="";
            while((character=reader.read())!= -1) {
                character=Character.toUpperCase(character);
                data+=(char)character;
            }
            reader.close();
            FileWriter writer = new FileWriter("src/a.txt");
            writer.write(data);
            writer.close();
            System.out.println("File Updated!!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}