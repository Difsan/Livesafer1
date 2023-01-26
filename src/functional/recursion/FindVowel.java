package functional.recursion;

public class FindVowel {

    public int calculate(String x){
        if (x.length() == 0){
            return 0;
        }else {
            System.out.println(x.substring(1));
            int count = calculate(x.substring(1));
            if (this.isVowel(x.charAt(0))){
                return 1+count;
            }
            else return count;
        }
    }

    public boolean isVowel (char c){
        String vowels = "aeiouAEIOU";
        boolean vp = vowels.indexOf(c)!=-1;
        return vp;
    }
}
