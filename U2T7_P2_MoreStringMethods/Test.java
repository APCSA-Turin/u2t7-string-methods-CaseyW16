import java.util.Scanner;

public class Test {
    public static int calculateScoreChange(String last, String input) {
        last = last.toLowerCase();
        input = input.toLowerCase();

        int score = 0;
        int diff = last.compareTo(input);
        if (diff > 0) {
            score -= 5;
            System.out.println("-5 points: current word alphabetically before last word");
        } else if (diff < 0) {
            score += 2;
            System.out.println("+2 points: current word alphabetically after last word");
        }
        if (last.equals(input)) {
            score -= 10;
            System.out.println("-10 points: same as the last word");
        }
        if (last.substring(last.length()-2,last.length()).equals(input.substring(0,2))) { 
            score += 5;
            System.out.println("+5 points: last 2 letters of previous word equal first two letters of current word");
        }
        if (input.contains(last.substring(0, 1))) {
            score += 3;
            System.out.println("+3 points: current word contains first letter of previous word");
        }
        if (input.length() == last.length()) {
            score += 4;
            System.out.println("+4 points: current word is the same length as previous word");
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = 0;
        int rounds = 0;
        String lastInput = new String();
        while (score < 50) {
            rounds++;
            System.out.print("Enter word #" + rounds + ": ");
            String input = scan.nextLine();
            if (rounds > 1) {
                int change = calculateScoreChange(lastInput, input);
                System.out.println("New score: " + score + " + " + change + " = " + (score + change));
                score += change;
            }
            lastInput = input;
        }

        System.out.println("Game completed in " + rounds + " words!");

        scan.close();
    }
}
