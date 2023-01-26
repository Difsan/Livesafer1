package functional.recursion;

public class Excercise3 {
    public static void main(String[] args){
        FindVowel ne = new FindVowel();
        System.out.println(ne.calculate("ae"));
        System.out.println(ne.calculate("p"));
        System.out.println(ne.calculate("banano"));
        System.out.println(ne.calculate("Armando"));
        System.out.println(ne.calculate(""));
        System.out.println(ne.calculate("aeiouAEIOU"));

    }
}
