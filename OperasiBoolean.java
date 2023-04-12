public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 70;
        var nilai = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilai >= 80;

        var lulus = lulusNilai && lulusAbsen;

        System.out.println(lulus);
    }
}
