public class RemoveLeadingZeros {
    public static String removeLeadingZeros(String str) {
        return str.replaceFirst("^0+", "");
    }

    public static void main(String[] args) {
        String input = "00000123569";
        System.out.println("After Removing Leading Zeros: " + removeLeadingZeros(input));
    }
}
