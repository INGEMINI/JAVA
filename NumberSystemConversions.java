import java.util.Scanner;

public class NumberSystemConversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer to Binary
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary: " + binary);

        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        String binaryInput = sc.next();
        int decimal = Integer.parseInt(binaryInput, 2);
        System.out.println("Decimal: " + decimal);

        // Decimal to Hexadecimal
        System.out.print("Enter a decimal number: ");
        int decimalNum = sc.nextInt();
        String hex = Integer.toHexString(decimalNum).toUpperCase();
        System.out.println("Hexadecimal: " + hex);

        // Hexadecimal to Binary
        System.out.print("Enter a hexadecimal number: ");
        String hexInput = sc.next();
        int decimalFromHex = Integer.parseInt(hexInput, 16);
        String binaryFromHex = Integer.toBinaryString(decimalFromHex);
        System.out.println("Binary: " + binaryFromHex);

        // Binary to Octal
        System.out.print("Enter a binary number: ");
        String binaryForOctal = sc.next();
        int decimalFromBinary = Integer.parseInt(binaryForOctal, 2);
        String octal = Integer.toOctalString(decimalFromBinary);
        System.out.println("Octal: " + octal);

        sc.close();
    }
}
