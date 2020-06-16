package task10;

public class RepeatedWords {

    public void repWord(String s) {

        String[] rw = s.split(" ");
        System.out.println("У тексті " + rw.length + " слова.");



        int frequentOccure = 1; int countFind = 1;
        String maxkey = rw[0]; String maxval = rw[0];

        for(int i = 0; i < rw.length-1; i++) {
            frequentOccure = 1;

            for(int j = i+1; j < rw.length; j++) {
                if(rw[i].equalsIgnoreCase(rw[j])) {
                    frequentOccure = frequentOccure +1;
                    maxkey = rw[i];
                }
                if (frequentOccure > countFind)
                {
                    countFind=frequentOccure;

                    maxval = maxkey;
                }
            }
        }
        if(countFind <= 1){
            System.out.println("Та у ньому немає повторюваних.");
        }else {
            System.out.println("У ньому найчастіше зустрічається слово '"+maxval+"'! Його аж "+countFind);
        }


    }
}