package functional.pure;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main (String [] args){
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Grapes");
        list.add("Grapes");
        list.add("Grapes");
        list.add("Grapes");
        list.add("Grapes");
        DeleteDuplicate del = new DeleteDuplicate();
        System.out.println(list);
        System.out.println(del.erraseDuplicate(list));
    }
}
