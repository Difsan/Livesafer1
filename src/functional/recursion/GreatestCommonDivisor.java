package functional.recursion;

public class GreatestCommonDivisor {
    public Integer greatestDivision(int x, int y){
        if (y==0) return x;
        return greatestDivision(y,x%y);
    }
}
