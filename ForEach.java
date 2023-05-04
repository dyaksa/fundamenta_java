public class ForEach {
    public static void main(String[] args) {
        System.out.println("for");

        String[] names = {
                "Dyaksa", "Jauharuddin", "Nour",
                "Putri", "Oktaviani"
        };

        for(var i = 0; i < names.length; i ++) {
            System.out.println(names[i]);
        }

        System.out.println("\nfor each");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
