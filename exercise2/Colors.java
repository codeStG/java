package exercise2;

import java.util.Arrays;

public class Colors {

    String[] colorful(String[] strings) {
        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.)
        // return an array of strings that start with a color.  discard all the other strings.  If no strings start with
        // a color in the input array, return an empty array.
        String[] newStrings = new String[strings.length];
        int newIndex = 0;

        for(int i = 0; i < strings.length; i++) {
            String color = strings[i].toLowerCase();
            if(color.toLowerCase().startsWith("red")) {
                newStrings[newIndex] = "red";
                newIndex++;
            } else if(color.toLowerCase().startsWith("blue")) {
                newStrings[newIndex] = "blue";
                newIndex++;
            } else if(color.toLowerCase().startsWith("yellow")) {
                newStrings[newIndex] = "yellow";
                newIndex++;
            } else if(color.toLowerCase().startsWith("black")) {
                newStrings[newIndex] = "black";
                newIndex++;
            } else if(color.toLowerCase().startsWith("green")) {
                newStrings[newIndex] = "green";
                newIndex++;
            } else if(color.toLowerCase().startsWith("pink")) {
                newStrings[newIndex] = "pink";
                newIndex++;
            } else if ((i == strings.length - 1) && (newIndex == 0)) {
                System.out.println("No colors found.");
                return new String[]{};
            }
        }
        return newStrings;
    }

    public static void main(String[] args) {
        Colors code = new Colors();
        System.out.println("This is the Colors class");
        System.out.println(Arrays.toString(code.colorful(new String[]{"bluebird","red herring", "yellow bumblebee","black spider", "green monkey","pink",
                "great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"})));
    }

}