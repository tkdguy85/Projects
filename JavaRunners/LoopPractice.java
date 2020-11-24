package JavaRunners;

public class LoopPractice {
    
    /* This entire section is dedicated to explaining a while loop in Java.
    
    public static void practiceWhileLoop() {                // Making this call "Static" allows it to initiate in the static call below.
        int x = 0;                                          // This initializes x @ 0.
        while(x < 5) {                                      // This will loop in increments of 1 (x++) until it hits 5.
            System.out.println("The value of x is " + x);
            // x = x + 1
            x++;
        }
    }

    public static void main(String[] args) {
        practiceWhileLoop();                                // This is runs the while loop, reiterating until the end via the println above.
    }

    */
//-------------------------------------------------------------------------------------------------------------------------------------------

    /* This section is simply running a DO-WHILE loop.

    public static void practiceDoWhileLoop() {
        int x = 0;                                          // X can be used again because it's scope is limited to it's {}
        do {
            System.out.println("The value of x is " + x);   // This is simply printing out the value of x every loop.
            x++;                                            // x++ adds 1 every time the loop is repeated
        } while (x < 10);                                   // Conditional for our loop.
    }

    public static void main(String[] args) {
        practiceDoWhileLoop();                              // This is runs the DO/WHILE via println above.
    }

    */
//-------------------------------------------------------------------------------------------------------------------------------------------

    // This section is running a FOR loop.
    
    /*
    public static void practiceForLoop() {
        for (int x = 0; x < 20; x++) {                      // Unless specified by <=, this will stop at 19 since 20 = 20
            System.out.println("The value of x is " + x);
            if (x==10) {
                break;                                      // If the break is reached, the loop stops here, ignoring final statement.
            }
        }
        System.out.println("This is the end");              // Prints once after the for loop is finished running. 
    }

    public static void main(String[] args) {
        practiceForLoop();
    }
    */

    /* 
        for (int x = 10; x > 20; x--) {                      // This just demonstrates using x-- will decrement to 1 (not 0)
            System.out.println("The value of x is " + x);
            if (x==10) {
                break;                                      
            }
    */

    // This is an example of a nexted for loop.

    public static void practiceForLoop() {
        for (int x = 0; x > 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.println("("+x+","+y+")");            // Setting the println this way yields values like (0,0) or (0,1).
            }
        }
    }

    public static void main(String[] args) {
        practiceForLoop();
    }
}