package U2T7_P3;

public class Runner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        boolean bool = methods.longerThan("apple", 4);
        System.out.println(bool);
        bool = methods.longerThan("apple", 5);
        System.out.println(bool);
        bool = methods.longerThan("apple", 2);
        System.out.println(bool);
        bool = methods.longerThan("apple", 7);
        System.out.println(bool);

        String str = methods.funnyString("computer", 3);
        System.out.println(str);
        str = methods.funnyString("computer", 0);
        System.out.println(str);
        str = methods.funnyString("computer", 7);
        System.out.println(str);
        str = methods.funnyString("apples", 1);
        System.out.println(str);

        str = methods.halvesReversed("computer");  //even # of letters
        System.out.println(str);
        str = methods.halvesReversed("computers"); //odd # of letters
        System.out.println(str);
        str = methods.halvesReversed("sky");
        System.out.println(str);
        str = methods.halvesReversed("weekend");
        System.out.println(str);
        str = methods.halvesReversed("an");
        System.out.println(str);
        str = methods.halvesReversed("I");
        System.out.println(str);
        str = methods.halvesReversed("see you soon");
        System.out.println(str);
        str = methods.halvesReversed("see you later!");
        System.out.println(str);

        str = methods.pigLatin("computer");
        System.out.println(str);
        str = methods.pigLatin("sky");
        System.out.println(str);
        str = methods.pigLatin("Brooklyn");
        System.out.println(str);
        str = methods.pigLatin("weekend");
        System.out.println(str);

        str = methods.removeCharacter("Halloween", 5);
        System.out.println(str);
        str = methods.removeCharacter("Halloween", 0);
        System.out.println(str);
        str = methods.removeCharacter("Halloween", 8);
        System.out.println(str);
        str = methods.removeCharacter("Halloween", 9);
        System.out.println(str);
        str = methods.removeCharacter("Halloween", 20);
        System.out.println(str);
        str = methods.removeCharacter("Hi friend", 0);
        System.out.println(str);
        str = methods.removeCharacter("Hi friend", 1);
        System.out.println(str);
        str = methods.removeCharacter("Hi friend", 2);
        System.out.println(str);
        str = methods.removeCharacter(" Hi friend", 0);
        System.out.println(str);
        str = methods.removeCharacter("A", 0);
        System.out.println(str);
        str = methods.removeCharacter("A ", 0);
        System.out.println(str);
        str = methods.removeCharacter("A", 1);
        System.out.println(str);
        str = methods.removeCharacter("A ", 1);
        System.out.println(str);

        str = methods.insertAt("ghost", "BOO!", "o");
        System.out.println(str);
        str = methods.insertAt("ghost", "BOO!", "st");
        System.out.println(str);
        str = methods.insertAt("ghost", "BOO!", "m");
        System.out.println(str);
        str = methods.insertAt("spooooky!", "YIKES", "o");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", "y");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", "birthday");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", " ");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", " 18th", " ");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th ", "bir");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", "!");
        System.out.println(str);
        str = methods.insertAt("happy birthday!", "18th", "z");
        System.out.println(str);
        str = methods.insertAt("a", "m", "a");
        System.out.println(str);
        str = methods.insertAt("a", "m", "p");
        System.out.println(str);

        str = methods.endUp("It's Thursday", 3);
        System.out.println(str);
        str = methods.endUp("hello friend", 3);
        System.out.println(str);
        str = methods.endUp("hello friend!", 3);
        System.out.println(str);
        str = methods.endUp("Shhhh! Be quiet", 3);
        System.out.println(str);
        str = methods.endUp("Yes", 3);
        System.out.println(str);
        str = methods.endUp("Yess", 3);
        System.out.println(str);
        str = methods.endUp("Yesss", 3);
        System.out.println(str);
        str = methods.endUp("no", 3);
        System.out.println(str);
        str = methods.endUp("no!", 3);
        System.out.println(str);
        str = methods.endUp("noo!", 3);
        System.out.println(str);
        str = methods.endUp("noo!!", 3);
        System.out.println(str);
        str = methods.endUp("ALREADY UPPERCASE", 3);
        System.out.println(str);
        str = methods.endUp("hello friend", 1);
        System.out.println(str);
        str = methods.endUp("hello friend", 6);
        System.out.println(str);
        str = methods.endUp("hello friend", 20);
        System.out.println(str);

        str = methods.yellOrWhisper("Hello James!");
        System.out.println(str);
        str = methods.yellOrWhisper("hello James!");
        System.out.println(str);
        str = methods.yellOrWhisper("aBCDEFGHIJK");
        System.out.println(str);
        str = methods.yellOrWhisper("Abcdefghijk");
        System.out.println(str);
        str = methods.yellOrWhisper("B");
        System.out.println(str);
        str = methods.yellOrWhisper("b");
        System.out.println(str);
        str = methods.yellOrWhisper("IT'S SUNNY!");
        System.out.println(str);
        str = methods.yellOrWhisper("it's rainy");
        System.out.println(str);

        str = methods.starBetween("apple");
        System.out.println(str);
        str = methods.starBetween("Hey what's up?");
        System.out.println(str);

        System.out.println(methods.longerThan("a word", 4));
        System.out.println(methods.funnyString("a word", 0));
        System.out.println(methods.halvesReversed("a word"));
        System.out.println(methods.pigLatin("word"));
        System.out.println(methods.removeCharacter("a word", 1));
        System.out.println(methods.insertAt("a word", "ooo", "rd"));
        System.out.println(methods.endUp("a word", 3));
        System.out.println(methods.yellOrWhisper("A word"));
        System.out.println(methods.starBetween("a word"));
    }
}
