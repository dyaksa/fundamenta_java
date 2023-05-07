public class VariableArgument {
    public static void main(String[] args) {
        int[] values = {90,80,50,80,76};

        sayCongrats("Dyaksa", values);
        sayCongrats("Putri", 90,90,78,56,43,30);
    }

    static void sayCongrats(String name, int... values){
        int total = 0;

        for(var value : values) {
            total += value;
        }

        int avg = total / values.length;

        if(avg >= 75) {
            System.out.println("Selamat " + name + " " + "Anda Lulus");
        }else {
            System.out.println("Maaf  " + name + " " + "Anda Tidak Lulus");
        }
    }
}
