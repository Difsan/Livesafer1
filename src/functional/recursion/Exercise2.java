package functional.recursion;

public class Exercise2 {
    public static void main(String[] args){
        GreatestCommonDivisor gre = new GreatestCommonDivisor();
        System.out.println(gre.greatestDivision(4,3));
        System.out.println(gre.greatestDivision(0,15));
        System.out.println(gre.greatestDivision(45,15));
        System.out.println(gre.greatestDivision(9,32));

    }
}
