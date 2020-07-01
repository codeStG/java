package exercise2;

class Arrays {
    //Take the arrays.js file, and refactor the code into Java in this file.
    public static void main(String[] args) {
        int[] nums = {10, 23, 3, 4, 5, 2, 1};
        String[] greetings = {"hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا"};
        boolean[] binaries = {false, true, true, true, false, false, false, true, true, true, true, true, false, true, false, false, true, false};

        Arrays array = new Arrays();

        array.printNums(nums);
        array.printGreetings(greetings);
        array.printBinaries(binaries);
    }

    void printNums(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    };

    void printGreetings(String[] g) {
        for(int i = 0; i < g.length; i++) {
            System.out.println(g[i]);
        }
    };

    void printBinaries(boolean[] b) {
        for(int i = 0; i < b.length; i++) {
            //The !! is unnecessary, but I wanted to follow what was in the file. I converted 1's to
            //true and 0's to false, so it should print true or false without the !!.
            System.out.println(!!b[i]);
        }
    };


}







