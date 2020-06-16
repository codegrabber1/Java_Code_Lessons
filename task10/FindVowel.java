package task10;
public class FindVowel {
    private String[] vowels = {"а","e","и","ю","і","ї","о","є","у","я"};
    private char[] vowel = {'а','e','и','ю','і','ї','о','є','у','я'};

    public void charReplaceThroughBuffer(String s) {

        String [] vw = s.split("");

        StringBuffer chengedString = new StringBuffer();


        for(int i = 0; i < vw.length;i++) {
            for(String v: vowels  ) {
                if(vw[i].equals(v)) {
                    vw[i] = "-";
                }
            }
            chengedString.append(vw[i]);
        }

        System.out.println(chengedString);


    }

    public void charReplaceThroughCharArray(String s) {
        char [] v = s.toCharArray();

        for (char vwl: vowel){
            for(char ch: v){
                if(ch == vwl){
                    s = s.replace(ch, '-');
                }
            }
        }
        System.out.print(s);
    }
}