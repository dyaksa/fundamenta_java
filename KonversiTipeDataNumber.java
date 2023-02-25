public class KonversiTipeDataNumber {

    public static void main(String[] args) {
        byte iniByte = 10;
        short initShort = 100;
        int iniInt = 1000;
        long iniLong = 100000;

        byte iniByte2 = (byte) iniInt;
        int iniInt2 = (int) iniByte;

        System.out.println(iniByte2);
        System.out.println(iniInt2);
    }
}
