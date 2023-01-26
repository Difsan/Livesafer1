package functional.other.primenumber;

import java.util.function.Function;
import java.util.function.Predicate;

public class PrimeNumber implements Function<Integer,Integer>, Predicate<Integer> {
    @Override
    public Integer apply(Integer integer) {
        if (this.test(integer)) return integer;
        else return 0;
    }

    @Override
    public boolean test(Integer integer) {
        for (int i=2; i<integer; i++){
            if (integer % i == 0){
                return false;
            }
        }
        return true;
    }
}
