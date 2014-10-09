package com.zain.proj2;

public class Main {


    public enum Sex {
        MALE, FEMALE
    }
    public class Olympian {
        public String Name;
        public Sex sex;
        public int age;
    }
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


    public static void getOlympians() {
        int i;
        for (i = 0; i < OlympianManager.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(OlympianManager[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
   public abstract class Event{
      public String name;
       public int playTo;
       public boolean isPlayToExact;
       public int playDistance;
       public abstract String getExtraInfo();
   }
    public static class events{
      public static String[] events = new String[] {"WashoosEvent", "CanJamEvent", "HorseshoesEvent", "CornholeEvent", "LadderballEvent","StickgameEvent" };


    }
    public class SubEvent extends events{
        public SubEvent(
                           int frisbeeSize,
                            int numHorseShoes,
                            int numBeanBags,
                            int numRungs
                          ) {
            super(frisbeeSize, );
    }


    public static void main(String[] args) {
        //app welcome message
        System.out.println("Welcome To the Smith Family Olympics App. Enter a command or press h for help.");

        if(args.length ==0)
            System.out.println("You need to select an option.... are you feeling ok?");
        else if (args[0].equals("o")||args[0].equals("olympians")) {
           getOlympians();
        }

    }
}
