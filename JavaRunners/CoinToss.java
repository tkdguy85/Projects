package JavaRunners;
// This is coin toss.

import java.util.Random;

public class CoinToss {

    public String tossACoin() {                         // In this example the String tossACoin flips head if 0, tails if 1. (Int would make this a number).
        Random rand = new Random();                     // Random generator. ***Note abs makes the random number positive, whether or not it was to begin with.
        int toss = Math.abs(rand.nextInt()) % 2;        // Math library has abs(olutevalue) and nextInt gets a random #, /2, and the % 2 gives us that 0 or 1.
        if (toss == 0) {
            return "HEADS";
        } else {                                        //This can be only heads or tails, thus no need to specify TAIL's parameters. Cleaner code.
            return "TAILS";
        }
    }

    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin()); // Random coin toss display.
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
    }
    
}
