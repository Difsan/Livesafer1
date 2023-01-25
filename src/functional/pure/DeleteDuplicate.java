package functional.pure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteDuplicate {
    public List<String> erraseDuplicate (final List<String> list){
        List<String> updaList = new ArrayList<>();
        for (String i: list
             ) {
            if (updaList.contains(i)){
                continue;
            }
            updaList.add(i);
        }
        return updaList;
    }
}
