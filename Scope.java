import java.util.Arrays;

public class Scope {
    public static void main(String[] args) {
        sayHello("Dyaksa Jauharuddin Nour");
        // System.out.println(hello); // error  karena variable hello tidak bisa diakses diluar method sayHello
        // System.out.println(hello); // error
        sayHello("");
    }

    static void sayHello(String name) {
        if(!name.isBlank()) {
            var hello = "Hello " + name;
            System.out.println(hello);
        }

        String hi = "Hi " + "Dyaksa";
        // System.out.println(hello); // error
        System.out.println(hi); // no error

    }
}
