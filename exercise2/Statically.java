package exercise2;

public class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
    private static String glue = "Epoxy";
    String jello = "Jello";

    static void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }

    static void stubborn() {
        moveAndShake();
        System.out.println("Please don't make me change... I just don't like it...");
    }

    static void explain() {
        stubborn();
        System.out.println(glue);
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
        System.out.println("Static in js makes methods within a class usable only within that class, while in Java "
                + "the static keyword is a non-access modifier.");
        System.out.println("For the Java implementation of this class, I did the same thing I did in the js representation "
        + "but changed the private glue variable to be static so that I could access it from within the explain method." +
                " I also did not have to add any of the call functions that I had to add in the js representation because " +
                "I am able to call the static methods in the stats instance of the Statically class.");
    }


    public static void main(String[] args) {
        Statically stats = new Statically();

        stats.moveAndShake();
        stats.stubborn();
        stats.explain();

        System.out.println(stats.glue);
        System.out.println(stats.jello);
    }
}
