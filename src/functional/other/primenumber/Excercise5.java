package functional.other.primenumber;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Excercise5 {
    public static void main (String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(1234);
        list.add(19);
        list.add(1223);
        PrimeNumber pri = new PrimeNumber();
        List<Integer> primeList = new ArrayList<>();
        for (int i: list
             ) {
            int t = pri.apply(i);
            if (t==0){
                continue;
            }
            else primeList.add(i);
        }
        System.out.println(list);
        System.out.println(primeList);

    }

}
