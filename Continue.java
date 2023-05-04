public class Continue {
    public static void main(String[] args) {
        var counter = 1;

        for(;counter <= 100;counter++) {
            if(counter % 2 == 1) {
                continue;
            }

            System.out.println("Bilangan Ke - " + counter);
        }
    }
}
