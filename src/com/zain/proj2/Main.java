//Created by Zain Qayyum 10/9/2014
package com.zain.proj2;

import static com.zain.proj2.Main.EventManager.getEvents;

public class Main {

// enumerate genders
    public enum Sex {
        MALE, FEMALE
    }

    public class Olympian {
        public String Name;
        public Sex sex;
        public int age;
    }
    //welcome to the Matrix
    public static
    String[][] OlympianManager = new String[][]{
            {"Bob", "male", "41"},
            {"Mike", "male", "13"},
            {"Derk", "male", "23"},
            {"Derky", "female", "21"},
            {"Derp", "male", "53"},
            {"Derpina", "female", "55"},
            {"Merk", "male", "44"},
            {"Derker", "male", "3"},
            {"Berkmatic", "male", "26"},
            {"Sudsy", "female", "29"},
            {"Dork", "male", "93"},
            {"Vern", "male", "33"},
            {"Surpy", "female", "58"},
            {"Brianna", "female", "32"},
            {"Brian", "male", "32"},
    };

    //we obviously need to loop through all the values in the olympian matrix to print them, using the standard
    //System.out.println(olympian); is just going to print out the memory location of the matrix lol
    public static void getOlympians() {
        int i;
        for (i = 0; i < OlympianManager.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(OlympianManager[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public abstract class Event {
        public String name;
        public int playTo;
        public boolean isPlayToExact;
        public int playDistance;

        public abstract String getExtraInfo();

    }
//extend the event class with additional info
    public abstract class subEvent extends Event {
        public int frisbeeSize;
        public int numBeanBags;
        public int numHorseShoes;
        public int numRings;
        public boolean hasAutoWinStick;
        public int numWashoos;


        public int frisbeeSize() {
            return frisbeeSize;
        }

        public int numBeanBags() {
            return numBeanBags;
        }

        public int numHorseShoes() {
            return numHorseShoes;
        }

        public int numRings() {
            return numRings;
        }

        public boolean hasAutoWinStick() {
            return hasAutoWinStick;
        }

        public int numWashoos() {
            return numWashoos;
        }
//need to return something for getExtraInfo
        @Override
        public String getExtraInfo() {
            return subEvent.super.name;
        }
    }

// lets make an array with all the events
    public static class EventManager {
        public static String[] EventManager = new String[]{"WashoosEvent", "CanJamEvent", "HorseshoesEvent", "CornholeEvent", "LadderballEvent", "StickgameEvent"};

        public static Event[] getEvents() {
// another loop, but this time to print out the events
            for (int i = 0; i < EventManager.length; i++) {

                System.out.println(EventManager[i]);
            }

            return new Event[0];

        }


    }


    public static void main(String[] args) {
        //app welcome message
        System.out.println("Welcome To the Smith Family Olympics App. Enter a command or press h for help.");
//lets start with args.length so we can complain about blank entries right off the bat
        if (args.length == 0)
            System.out.println("You need to select an option.... are you feeling ok?");
        else if (args[0].equals("o") || args[0].equals("olympians")) {
            getOlympians();
        } else if (args[0].equals("e") || args[0].equals("events")) {
            getEvents();
        }else if(args[0].equals("h")||args[0].equals("help")) {
            System.out.println("Type e for list of events, or type o for a list of olympians");
        }
//there are only 3 options, this isn/'t that hard...
        else System.out.println("What the hell is wrong with you, that is not an option!");


    }
}
// ok im done, back to saving the world