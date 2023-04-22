public class isStatement {
    public static void main(String[] args) {
        var nilai = 75;
        var absen = 80;

        if(nilai >= 75 && absen >= 80){
            System.out.println("Lulus");
        }else{
            System.out.println("Tidak Lulus");
        }

        if(nilai >= 80 && absen >= 80) {
            System.out.println("A");
        }else if (nilai >= 75 && absen >= 75){
            System.out.println("B");
        }else if (nilai >= 60 && absen >= 60){
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }
}
