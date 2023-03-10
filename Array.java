public class Array {
    public static void main(String[] args) {
        String[] arrayName;

        arrayName = new String[3];
        arrayName[0] = "Dyaksa";
        arrayName[1] = "Jauharuddin";
        arrayName[2] = "Nour";

        System.out.println(arrayName[0]);
        System.out.println(arrayName[1]);
        System.out.println(arrayName[2]);

        String[] arrayName2 = new String[2];
        arrayName2[0] = "Hello";
        arrayName2[1] = "World";

        System.out.println(arrayName2[0]);
        System.out.println(arrayName2[1]);

        int[] intArray = {
                1,2,3,4,5,6
        };

        long[] longArray = {
                10L,20L,30L
        };

        System.out.println(intArray[0]);
        System.out.println(longArray[1]);

        String[][] members = {
                {"Dyaksa", "Jauharuddin", "Nour"},
                {"Ali", "Farhan"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[0][1]);

        System.out.println(members[0].length);
    }
}
