package org.example;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false; //for invalid hours
        }
        //Reaction to dog barking between 8pm-8am:
        return isBarking && (clock < 8 || clock >= 20);
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            //if summer, temp must be between 25-45:
            return temp >= 25 && temp <= 45;
        } else {
            //if not summer, temp must be between 25-35:
            return temp >= 25 && temp <= 35;
        }
    }

    public static double area(double width, double height) {
       if(width < 0 || height <0) {
           return -1;
       }
       return width*height;
    }

    public static double area(double radius) {
       if (radius<0) {
           return -1;
       }
       return radius*radius*Math.PI;
    }
}
