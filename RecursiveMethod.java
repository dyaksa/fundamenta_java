public class RecursiveMethod {
    public static void main(String[] args) {
        factorial(5);
        int factorialNilai = factorialRecursive(5);
        System.out.println(factorialNilai);
        stackOverflowErr(5);
    }

    static void factorial(int value) {
        var result = 1;

        for(var counter = 1; counter <= value; counter++) {
            result *=counter;
        }

        System.out.println(result);
    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        }else {
            return value * factorialRecursive(value - 1);
        }
    }

    // hati hati dalam penggunaan recursive akan muncul error stackoverflow jika pemanggilan function berlebihan
    static void stackOverflowErr(int value) {
        if(value == 0) {
            System.out.println("Done");
        }else {
            System.out.println("value = " + value);
            stackOverflowErr(value - 1);
        }
    }
}
