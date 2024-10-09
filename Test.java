import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String wordA = scan.nextLine();

        System.out.print("Enter second string: ");
        String wordB = scan.nextLine();

        int a = wordA.length();
        int b = wordB.length();
        System.out.println(a == b ? "Both strings have the same length " : (a > b ? wordA : wordB) + " is longer");

        int aSecondHalf = (int)(a / 2.0);
        int bSecondHalf = (int)(b / 2.0);

        System.out.println("First half: " + wordA.substring(0, aSecondHalf));
        System.out.println("Second half: " + wordA.substring(aSecondHalf));

        System.out.println("First half: " + wordB.substring(0, bSecondHalf));
        System.out.println("Second half: " + wordB.substring(bSecondHalf));

        int index = wordA.indexOf(wordB);
        System.out.println(index == -1 ? (wordB + " is not found in " + wordA) : (wordB + " is found in " + wordA + " at index " + index));

        scan.close();
    }
}
