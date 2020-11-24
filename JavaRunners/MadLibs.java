package JavaRunners;

// package MadLibs;

import java.util.Scanner;
import java.util.Random;

public class MadLibs {

    // Instance variables to be used throughout the game.
    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();

    // Getters - Gather our properties. 

    public String getStory() {
        return story;
    }

    public String getName() {
        return name;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }
    
    public String getNoun1() {
        return noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public String getAdverb() {
        return adverb;
    }
    
    public String getRandonNums() {
        return randomNums;
    }

    // Setters - Setting properties with a method (Cleaner)

    public void setStory(String newStory) {
        this.story = newStory;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAdjective1(String newAdj1) {
        this.adjective1 = newAdj1;
    }

    public void setAdjective2(String newAdj2) {
        this.adjective2 = newAdj2;
    }

    public void setNoun1(String newNoun1) {
        this.noun1 = newNoun1;
    }

    public void setNoun2(String newNoun2) {
        this.noun2 = newNoun2;
    }

    public void setNoun3(String newNoun3) {
        this.noun3 = newNoun3;
    }

    public void setAdverb(String newAdverb) {
        this.adverb = newAdverb;
    }

    // Somewhat simple random number generator.
    public void setRandomNums() {
        int num = Math.abs(rand.nextInt()) % 100;           // Pulls random number and below sets the index to 0.
        int index = 0;
        int[] numberHolder = new int[3];                    // This line builds an array of ints(3)
        while(index < numberHolder.length) {
            numberHolder[index] = num + index;              // This iterates a # to an 'empty' index, incrementing by one each time.
            index++;                                        // # goes in, index++, # goes in, etc.
        }
        randomNums = "not "+numberHolder[0]+", not "+numberHolder[1]+ ", but "+ numberHolder[2];    // This just adds an element to the story. Note the array positions.
    }


    // Prints instructions tell the user how to play the game.
    public void printInstructions() {          
        System.out.println("Welcome to the Madlibs game. If you type in " +
                "words, we'll give you a story. Start by typing in a name.");
    }

    /*  Here we grab the data from the user. Scanner pulls user input into the program. 
        NextLine then on to the next line after the user hits enter. */

    public void enterName() {
        setName(scanner.nextLine());
    }

    public void enterNoun1() {
        System.out.println("Give me a noun: ");   // Simply prompting user for input.
        setNoun1(scanner.nextLine());
    }

    public void enterNoun2() {
        System.out.println("Give me another noun: ");
        setNoun2(scanner.nextLine());
    }

    public void enterNoun3() {
        System.out.println("How about a final noun: ");
        setNoun3(scanner.nextLine());
    }

    public void enterAdjective1() {
        System.out.println("Give me an adjective: ");
        setAdjective1(scanner.nextLine());
    }

    public void enterAdjective2() {
        System.out.println("How about a second adjective: ");
        setAdjective2(scanner.nextLine());
    }

    public void enterAdverb() {
        System.out.println("Give me a witty adverb: ");
        setAdverb(scanner.nextLine());
    }

    // Here we put together the actually story to set the base of the game.
    public void putTogetherTheStory() {
        
        // Story altenative
        String story;
        int num = Math.abs(rand.nextInt()) % 2;
        if (num == 0) {
        
        // This is the set for the first story.
            story = "Amy and her bestie " + getName() + " went Downtown last night. " +
                "That night, they saw a(n) " + getNoun1() + " in a store window. " +
                "Feeling hungry, they stopped at a fairly " + getAdjective1() + " bar. " +
                "After requesting a(n) " + getNoun2() + " from the bartender, our lovely duo " + getAdverb() +
                " left the bar, staring at the receipt only to realize that they never paid for their " +
                "odd purchase of " + getRandonNums() + " " + getAdjective2() + " non-alcoholic water shots, intially meant to be a joke. " +
                "After opening the door to their Uber and having a(n) " + getNoun3() + " fall out of the car, they knew " +
                "tonight...was truly magical. ";
        // This sets a second/alternative story.    
        } else { 
            story = "Amy, Kyle, and " + getName() + " had a bonfire party on the beach. " +
                "Amy and Kyle look really cute together, but he's got such a(n) " + getAdjective1() + " personality. " +
                "He once built a model airplane in the shape of a(n) " + getNoun1() + " that looked more like a(n) " + getNoun3() + 
                ". But they do seem to get along. She once told " + getName() + " that he makes her stomache feel like that " + getAdjective2() + 
                " feeling you get when the lawnmower runs over a(n)" + getNoun2() + ". We've sat next to each other " + getRandonNums() +
                " but don't think I'm crazy for counting. Just then, Kyle " + getAdverb() + " ran over and nervously asks Amy if she wants to go to " +
                "his dad's Candy Corn farm. Without hesitation, they both run in the same, " + getAdverb() + " fashion in which Kyle came. " + getName() + 
                " sighs, I guess they work together? ";  
        } 
        setStory(story); // String story makes this a statement and it's closed with this setStory call.
    }

    // This is what calls the game into action.
    public void play() {
        // This is what determines the order in which the user inputs info.
        enterName();
        enterNoun1();
        enterAdjective1();
        enterAdverb();
        enterAdjective2();
        enterNoun2();
        enterNoun3();
        setRandomNums();
        putTogetherTheStory();              // Compiles story. 
        System.out.println(getStory());     // Prints out completed story.
    }

    // This command is what initially starts the game.
    public static void main(String[] args) {
        MadLibs game = new MadLibs();
        game.printInstructions();
        game.play();
    }
}