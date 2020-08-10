package task17;

import java.util.*;

public class Collection{

    private static List<Number> num = new ArrayList<>();

    public Collection(List<Number> num) {
        super();
        this.num = num;
    }

    class firstClass implements Iterator {

        int i;

        @Override
        public boolean hasNext() {

            if(i < num.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if((int)num.get(i)%2 == 1 || (int)num.get(i)%2 == -1) {
                i++;
                return 0;
            } else {
                return num.get(i++);
            }

        }

    }
    class secondClass implements Iterator{

        int i = num.size()-1;

        @Override
        public boolean hasNext() {

            return i >= 0;
        }

        @Override
        public Object next() {
            int backwardInt = i;

            i-=2;

            return num.get(backwardInt);

        }
    }
    class checkThird implements Iterator {
        int i = num.size()-1;

        @Override
        public boolean hasNext() {
            return i >= 0;
        }

        @Override
        public Object next() {
            int checkInt = i;

            i-=2;

            if((int)num.get(checkInt)%3 == 1 || (int)num.get(checkInt)%3 == -1) {
                return num.get(checkInt);
            } else {
                return "-";
            }
        }


    }
    class checkFifth implements Iterator {
        int i;

        @Override
        public boolean hasNext() {
            return i < num.size();
        }

        @Override
        public Object next() {
            int checkInt = i;

            i += 5;

            if((int)num.get(checkInt)%2 == 0) {

                return (int)num.get(checkInt) - 100;
            } else {
                return num.get(checkInt);
            }

        }


    }
    public static class checkEven implements Iterator{

        int i;

        @Override
        public boolean hasNext() {
            return i < num.size();
        }

        @Override
        public Object next() {
            int checkInt = i;

            i++;

            if(checkInt%3!=0) {
                if((int)num.get(checkInt)%2 == 0){

                    checkInt = (int)num.get(checkInt) + 1;

                    return checkInt;
                }else {
                    return num.get(checkInt);
                }
            } else {
                return num.get(checkInt);
            }

        }

    }
}