//Created by Zain Qayyum 10/9/2014
package com.zain.proj2;

//import static com.zain.proj2.Main.EventManager.getEvents;

public class Main {

// enumerate genders
    public enum Sex {
        MALE, FEMALE
    }

    public class Olympian {
        public String Name;
        public Sex sex;
        public int age;
        public Olympian(String Name, Sex sex, int age){
            this.Name= Name;
            this.sex= sex;
            this.age= age;
        }

    }
    //welcome to the Matrix
    public class OlympianManager {
        public Olympian[] Olympians = new Olympian[]{new Olympian("bob", Sex.MALE, 41),new Olympian("Mike", Sex.MALE, 13),
                new Olympian("Derk", Sex.MALE, 23),new Olympian("Derky", Sex.FEMALE, 21), new Olympian("Derp", Sex.MALE, 53),
                new Olympian("Derpina", Sex.FEMALE, 13),new Olympian("Merk", Sex.MALE, 13),new Olympian("Derker", Sex.MALE, 3),
                new Olympian("Berkmatic", Sex.MALE, 26),new Olympian("Sudsy", Sex.FEMALE, 29),new Olympian("Dork", Sex.MALE, 13),
                new Olympian("Vern", Sex.MALE, 33),new Olympian("Surpy", Sex.FEMALE, 58),new Olympian("Brianna", Sex.FEMALE, 32),
                new Olympian("Brian", Sex.MALE, 32)};

        /* String[][] Olympians = new Olympian(Olympian.Name, Olympian.sex, Olympian.age){
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
        };*/
    }

    //we obviously need to loop through all the values in the olympian matrix to print them, using the standard
    //System.out.println(olympian); is just going to print out the memory location of the matrix lol
    public void getOlympians() {

       OlympianManager x = new OlympianManager();
        //x.Olympians[0]
        for (int i = 0; i < x.Olympians.length; i++) {

                System.out.println(x.Olympians[i].Name +", " + x.Olympians[i].sex +", "+ x.Olympians[i].age );


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
    //public name "HorseShoes";
    //Trying to figure out how to name these events
    //HorseShoesEvent.name
    //figured it out:

    int numHorseShoes;
    private String name ="HorseShoes";

    public String getName() {
        return name;}
    public String getExtraInfo() {
        return numHorseShoes + "";

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
    private String name ="CornHole";

    public String getName() {
        return name;}
    public String getExtraInfo() {
        return numBeanBags + "";

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
    private String name ="CanJam";

    public String getName() {
        return name;}
    public String getExtraInfo() {
        return numRings + "";

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
        private String name ="LadderBall";

        public String getName() {
            return name;}
    public String getExtraInfo() {
        return numRungs + "";

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
        private String name ="StickGame";

        public String getName() {
            return name;}
        public String getExtraInfo() {
            return frisbeeSize + "";

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
        private String name ="Washoos";

        public String getName() {
            return name;
        }
        public String getExtraInfo() {
            return numWashoos + "";

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

        public void Events() {
        }
    }




    public Event[] getEvents() {
        //EventManager evnt = new EventManager();
// another loop, but this time to print out the events
        EventManager xxy = new EventManager();
        xxy.Events();
            for (int i = 0; i < xxy.Events.length; i++) {

// still need to fix up extra info print, wasnt sure what info you wanted that stuff to be set by default
                System.out.println(xxy.Events[i].getExtraInfo());

            }
        System.out.println(xxy.Event1.getName());
        System.out.println(xxy.Event2.getName());
            System.out.println(xxy.Event3.getName());
        System.out.println(xxy.Event4.getName());
        System.out.println(xxy.Event5.getName());
        System.out.println(xxy.Event6.getName());
            return new Event[0];
        }






    public static void main(String[] args) {
Main xyz = new Main();


        //app welcome message
        System.out.println("Welcome To the Smith Family Olympics App. Enter a command or press h for help.");
//lets start with args.length so we can complain about blank entries right off the bat
        if (args.length == 0)
            System.out.println("You need to select an option.... are you feeling ok?");
        else if (args[0].equals("o") || args[0].equals("olympians")) {

            xyz.getOlympians();
        } else if (args[0].equals("e") || args[0].equals("events")) {
            xyz.getEvents();
        }else if(args[0].equals("h")||args[0].equals("help")) {
            System.out.println("Type e for list of events, or type o for a list of olympians");
        }
//there are only 3 options, this isn/'t that hard...
        else System.out.println("What the hell is wrong with you, that is not an option!");


    }
}
// ok im done, back to saving the world