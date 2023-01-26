package functional.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindVowel {

    public int calculate(String x){

        if (x.length() == 0){
            return 0;
        }else {
            if (x.contains(" ")) {
                String[] list1 = x.split(" ");
                // you can't use .add and .remove if do this
                //List<String> l = Arrays.asList(list1);
                //Solution
                List<String> l = new LinkedList<String>(Arrays.asList(list1));
                System.out.println("The longest word in the string: " +
                        this.longestStri(l));
            }
            x = x.replace(" ", "");
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

    public String longestStri (List<String> y){

        if (y.size()==1) return y.get(0);
        else {
            String present= y.get(0);
            y.remove(0);
            String longest = longestStri(y);
            if (present.length()<longest.length()) return longest;
            else return present;
        }
    }
}
