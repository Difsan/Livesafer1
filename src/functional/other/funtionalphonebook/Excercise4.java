package functional.other.funtionalphonebook;

public class Excercise4 {
    public static void main(String[] args){
        FunPhoneBook funPhoneBook = new FunPhoneBook();

        System.out.println(funPhoneBook.apply("pedro"));
        System.out.println(funPhoneBook.apply("Andres"));
        System.out.println(funPhoneBook.getOne("pedro"));
        System.out.println(funPhoneBook.getOne("Andres"));
        System.out.println(funPhoneBook.getOne("Camilo"));
        System.out.println(funPhoneBook.get());
        System.out.println(funPhoneBook.delete("Andres"));
        System.out.println(funPhoneBook.get());
    }
}
