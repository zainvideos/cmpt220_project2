//Created by Zain Qayyum 10/9/2014
package com.zain.proj2;

import static com.zain.proj2.Main.EventManager.getEvents;

public class Main {

// enumerate genders
    public enum Sex {
        MALE, FEMALE
    }

    public static class Olympian {
        public static String Name;
        public static Sex sex;
        public static int age;
    }
    //welcome to the Matrix
    public static class OlympianManager {
        static String[][] Olympians = new Olympian(Olympian.Name, Olympian.sex, Olympian.age){
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
    }

    //we obviously need to loop through all the values in the olympian matrix to print them, using the standard
    //System.out.println(olympian); is just going to print out the memory location of the matrix lol
    public static void getOlympians() {
        int i;
        for (i = 0; i < OlympianManager.Olympians.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(OlympianManager.Olympians[i][j] + " ");
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
private class HorseShoesEvent extends Event {
    int numHorseShoes;

    public String getExtraInfo() {
        return null;

    }
    public int getnumHorseShoes(){
        return numHorseShoes;
    }
    public int setnumHorseShoes(){
        numHorseShoes = 12;
        return Integer.parseInt(null);
    }
}
private class CornHoleEvent extends Event {
    int numBeanBags;

    public String getExtraInfo() {
        return null;

    }
    public int getnumBeanBags(){
        return numBeanBags;
    }
    public int setnumBeanBags(){
        numBeanBags = 12;
        return Integer.parseInt(null);
    }
}
private class CanJamEvent extends Event {
    int numRings;

    public String getExtraInfo() {
        return null;

    }
    public int getnumRings(){
        return numRings;
    }
    public int setnumRings(){
        numRings = 12;
        return Integer.parseInt(null);
    }
}
    private class LadderBallEvent extends Event {
    int numRungs;

    public String getExtraInfo() {
        return null;

    }
    public int getnumRungs(){
        return numRungs;
    }
    public int setnumRungs(){
        this.numRungs = numRungs;
        return Integer.parseInt(null);
    }
}
    private class StickGameEvent extends Event {
        int frisbeeSize;

        public String getExtraInfo() {
            return null;

        }
        public int getfrisbeeSize(){
            return frisbeeSize;
        }
        public int setfrisbeeSize(){
            frisbeeSize = 12;
            return Integer.parseInt(null);
        }
    }
    private class WashoosEvent extends Event {
        int numWashoos;
        boolean hasAutoWinStick;

        public String getExtraInfo() {
            return null;

        }
        public int getnumWashoos(){
            return numWashoos;
        }
        public int setnumWashoos(){
            numWashoos = 12;
            return Integer.parseInt(null);
        }
        public boolean gethasAutoWinStick(){
            return hasAutoWinStick;
        }
        public boolean sethasAutoWinStick(){
            hasAutoWinStick= true;
            return Boolean.parseBoolean(null);
        }
    }
// garbage from my last attempt at doing this
/*
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
*/
// lets make an array with all the events

    public class EventManager {
    public LadderBallEvent Event1 = new LadderBallEvent();

    public StickGameEvent Event2 = new StickGameEvent();
    public WashoosEvent Event3 = new WashoosEvent();
    public CanJamEvent Event4 = new CanJamEvent();
    public CornHoleEvent Event5 = new CornHoleEvent();
    public HorseShoesEvent Event6 = new HorseShoesEvent();
    public Event[] Events = new Event[]{
            Event3, Event2, Event1, Event4, Event5, Event6};

    }




    public static Event[] getEvents() {
// another loop, but this time to print out the events
            for (int i = 0; i < 6; i++) {

                System.out.println(EventManager.Events[i]);
            }
            return new Event[0];
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