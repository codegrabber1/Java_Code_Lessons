package task19;


import java.io.*;

public class Methods implements Serializable{

    public void serialize(Object o) throws IOException {

        FileOutputStream fn = new FileOutputStream("text.txt");
        ObjectOutputStream out = new ObjectOutputStream(fn);

        out.writeObject(o);

        out.close();

        System.out.println("Serialized Successfully");

        fn.close();
    }
    public void deserialize(Object o) throws IOException, ClassNotFoundException{

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("text.txt"));

        o = input.readObject();

        System.out.println(o.toString());

        System.out.println("Deserialized Successfully");
    }
}