public class MethodReturnValue {
    public static void main(String[] args) {
        var result = calculate(10,10,"+");
        System.out.println(result);
    }

    static int calculate(int number1, int number2, String operation){
        switch (operation) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "/":
                return number1 / number2;
            case "*":
                return number1 * number2;
            default:
                return 0;
        }
    }
}
