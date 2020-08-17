package task19;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Methods implements Serializable{

    public void serialize(Object o) throws IOException {

        FileOutputStream fn = new FileOutputStream("src/text.txt");
        ObjectOutputStream out = new ObjectOutputStream(fn);

        out.writeObject(o);


        System.out.println("Serialized Successfully");

        out.close();

        fn.close();
    }
    public void deserialize(Object o) throws IOException, ClassNotFoundException{

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("src/text.txt"));

        o = input.readObject();

        System.out.println(o.toString());

        System.out.println("Deserialized Successfully");
    }
}