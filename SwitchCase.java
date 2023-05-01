public class SwitchCase {
    public static void main(String[] args) {
        var nama = "Putri";

        switch (nama) {
            case "Putri":
                System.out.println("Wow, Jodoh");
                break;
            case "Intan":
                System.out.println("Tidak Cocok");
                break;
            case "Rani":
            case "Gusti":
                System.out.println("Bukan");
                break;
            default:
                System.out.println("Sangan Tidak Recommended");
                break;
        }

        switch (nama) {
            case "Putri" -> System.out.println("Wow Jodoh");
            case "Intan" -> System.out.println("Tidak Cocok");
            case "Rani", "Gusti" -> System.out.println("Bukan");
            default -> {
                System.out.println("Sangat Tidak Cocok");
            }
        }

        String ucapan;
        switch (nama) {
            case "Putri" -> ucapan = "Wow, Jodoh";
            case "Intan" -> ucapan = "Tidak Cocok";
            case "Rani", "Gusti" -> ucapan = "Bukan";
            default -> ucapan = "Sangat Tidak Cocok";
        }

        System.out.println(ucapan);

        ucapan = switch (nama) {
            case "Putri":
                yield "Wow, Jodoh";
            case "Intan":
                yield "Wow, Bukan";
            case "Rani":
            case "Gusti":
                yield "Bukan";
            default:
                yield "Sangat Tidaj Cocok";
        };

        System.out.println(ucapan);
    }
}
