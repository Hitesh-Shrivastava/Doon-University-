public class NumberConversion {
    public static void main(String[] args) {
        int num = 25;
        String binaryString = Integer.toBinaryString(num);
        System.out.println("Binary of " + num + ": " + binaryString);

        int decimalNum = Integer.parseInt(binaryString, 2);
        System.out.println("Decimal of " + binaryString + ": " + decimalNum);
    }
}