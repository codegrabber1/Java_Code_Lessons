package task21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.time.*;
import java.util.Date;

public class Main{
    public static void main(String [] args) throws Exception {

        Date date = new Date();
        ConvertDate(date);

        /**
         * Annotations
         */
        AnnotationClass anCl = new AnnotationClass("Petro", 123, 12);

        getMethodsAnnotations(anCl);

        readFromFile(anCl);
    }

    private static void ConvertDate(Date date){
        ZoneId defZone = ZoneId.systemDefault();
        date = new Date();
        Instant i = date.toInstant();

        LocalDate localDate = i.atZone(defZone).toLocalDate();
        System.out.println("Local Date: " + localDate);

        LocalDateTime localDateTime = i.atZone(defZone).toLocalDateTime();

        System.out.println("Local Date Time: " + localDateTime);
        LocalTime localTime = i.atZone(defZone).toLocalTime();

        System.out.println("Local Time: " + localTime);

    }

    private static void getMethodsAnnotations(Object o) throws Exception  {
        Class<? extends Object> cl = o.getClass();

        Field[] fields = cl.getDeclaredFields();

        FileWriter fr = new FileWriter("src/text.txt", true);
        for(Field f : fields) {
            Annotation[] ann = f.getAnnotations();

            for (Annotation a: ann) {
                System.out.println(f.getName()+": "+a.toString());
                fr.write(f.getName()+": "+a.toString());
            }

        }
        fr.close();
        System.out.println("Success");

    }

    private static void readFromFile(Object o) throws Exception {

        FileReader fr = new FileReader("src/text.txt");
        @SuppressWarnings("resource")
        BufferedReader bfr = new BufferedReader(fr);

        String line;
        while((line = bfr.readLine()) != null) {
            System.out.println(line);
        }
    }
}