package task16;


import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTester{

    public void showClassName(Object o){
        Class cl = o.getClass();

        System.out.println(cl);
        System.out.println(cl.getName());
    }

    public void showClassFields(Object o){
        Class cl = o.getClass();

        Field[] fields = cl.getDeclaredFields();

        for(Field fl: fields) {
            System.out.println(fl.getName());
        }
    }

    public void showMethods(Object o){
        Class cl = o.getClass();

        Method[] methods = cl.getDeclaredMethods();

        for(Method mt: methods){
            System.out.println(mt.getName());
        }
    }

    public void showFieldsAnnotaions(Object o){
        Class cl = o.getClass();

        Field[] fields = cl.getDeclaredFields();

        for(Field fl: fields){
            Annotation[] annotations = fl.getDeclaredAnnotations();

            if(annotations == null){
                continue;
            }

            for(Annotation an: annotations) {
                System.out.println(fl.getName()+" => "+an.toString());
            }
        }

    }
    public void showMethodsAnnotaions(Object o){
        Class cl = o.getClass();

        Method[] methods = cl.getDeclaredMethods();

        for(Method mt: methods){
            Annotation[] ann = mt.getAnnotations();

            if(ann == null) {
                continue;
            }

            for(Annotation a: ann){
                System.out.println(mt.getName() +" => "+a.toString());
            }
        }

    }

    public void fillPrivateFields(Object o) throws IllegalAccessException {
        Class cl = o.getClass();

        Field [] fields = cl.getDeclaredFields();
        for (Field fl: fields) {
            Annotation annotation = fl.getDeclaredAnnotation(Deprecated.class);

            if(annotation == null){
                continue;
            }

            fl.setAccessible(true);
            fl.set(o, 234);
            fl.setAccessible(false);
        }
    }

    public Object creatNewObject(Object o, String name, int age) {
        Class cl = o.getClass();

        try {
            Constructor constructors = cl.getDeclaredConstructor(String.class, int.class);
            return constructors.newInstance(name, age);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        return o;
    }

    public void getMyIntMethod(Object o, String str, int... args  ) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException  {

        Class<? extends Object> cl = o.getClass();


        Method method = cl.getMethod("myMethod", String.class, int[].class);

        method.invoke(o, str, args);

    }

    public void getMyArgsMethod(Object o, String... strings ) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<? extends Object> cl = o.getClass();


        Method method = cl.getMethod("myMethod", String.class);

        if(strings.length > 0) {
            for(String str: strings) {
                method.invoke(o, str);
            }
        } else {
            System.out.println("There isn't args");
        }
    }
}