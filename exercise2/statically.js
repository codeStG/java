class Statically {
    //fix this code, so all of the instantiation and console.logs() work.
    //Try not to change the signature of the class, unless absolutely necessary.
    static #glue = "Epoxy";
    jello = "Jello";

    static moveAndShake() {
        console.log("Never stagnate in life.  Be agile, change, and improve...");
    }

    static stubborn() {
        this.moveAndShake();
        console.log("Please don't make me change... I just don't like it...");
    }

    static explain() {
        this.stubborn();
        console.log(this.#glue);
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
        console.log("Static in js makes methods within a class usable only within that class, while in Java "
            + "the static keyword is a non-access modifier.");
        console.log("I added methods to call the static methods and made the moveAndShake method static. " +
            "I learned static methods in js cannot call on non-static methods. After that, I used the call methods" +
            " to actually display the information held in the static methods. I also made a static method and call method " +
            "to view the private glue variable.")
    }

    static viewGlue() {
        console.log(this.#glue);
    }

    callMoveAndShake() {
        Statically.moveAndShake();
    }

    callStubborn() {
        Statically.stubborn();
    }

    callExplain() {
        Statically.explain();
    }

    callViewGlue() {
        Statically.viewGlue();
    }

}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method,
//defined in the class.  Do NOT remove the 'static' keyword from the explain() method.

const stats = new Statically();

stats.callMoveAndShake();
stats.callStubborn();
stats.callExplain();

stats.callViewGlue();
console.log(stats.jello);

//Once you have finished getting statistically.js to run, refactor the code here in Java.
