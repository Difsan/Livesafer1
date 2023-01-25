package functional.other.funtionalphonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunPhoneBook
        implements Consumer<String>, Supplier<String>,
        Predicate<String>, Function<String, String>{

    List<String> phoneBook = new ArrayList<>();

    @Override
    public void accept(String s) {
        phoneBook.add(s);
    }

    public String delete(String s){
        if (this.test(s)) phoneBook.remove(s);
        return "Deleted";
    }

    public String getOne(String s){
        if (this.test(s)) return s;
        else return "User no found";
    }

    @Override
    public boolean test(String s) {
        if (phoneBook.contains(s)) return true;
        else return false;
    }

    @Override
    public String get() {
        System.out.println("List: ");
        if (phoneBook.size()==0) return "No contacts to find";
        else {
            for (String i : phoneBook) {
                //System.out.println(phoneBook.size());
                System.out.println(i);
            }
        }
        return "";
    }

    @Override
    public String apply(String s) {
        if(!this.test(s)) this.accept(s);
        return "Added";
    }
}
