package classes;

public abstract class Main {

    public static void main(String []args){
        System.out.println(interviewRecursionTest("hello\nhealo\nabc\noab"));
    }
    /** Объявляем строку с гласными буквами */
    private final static String vowels = "AEIOUYaeiouy";

    public static String interviewRecursionTest(String line) {
        if (line.length() == 1) {
            return "" + line.charAt(0);
        }
            int x = line.length() / 2;
            String left = line.substring(0, x);
            String right = line.substring(x);
            boolean separation = vowels.indexOf(left.charAt(x - 1)) != -1 || vowels.indexOf(right.charAt(0)) != -1;

            return interviewRecursionTest(left) + (separation ? "*" : "") + interviewRecursionTest(right);
        }
}
