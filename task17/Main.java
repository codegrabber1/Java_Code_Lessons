package task17;

import java.util.*;
import task17.Collection.*;

public class Main{

    public static void main(String[] args){
        List<Number> num = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            num.add(i);
        }

        Collection col = new Collection(num);

        firstClass f = col.new firstClass();

//		while(f.hasNext()) {
//			System.out.println(f.next());
//		}

        System.out.println("");

        secondClass s = col.new secondClass();

//		while(s.hasNext()) {
//			System.out.println(s.next());
//		}

        System.out.println("");

        checkThird chtrd = col.new checkThird();

//		while(chtrd.hasNext()) {
//			System.out.println(chtrd.next());
//		}

        System.out.println("");

        checkFifth checkfifth = col.new checkFifth();

//		while(checkfifth.hasNext()) {
//			System.out.println(checkfifth.next());
//		}

        System.out.println("");

        checkEven checkeven = new checkEven();

        while(checkeven.hasNext()) {
            System.out.println(checkeven.next());
        }
    }
}