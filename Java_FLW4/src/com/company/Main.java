package com.company;

    import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        //////////////////////////1//////////////////////////
        String s1=Integer.toString(150);
        String s2=Character.valueOf('5').toString();
        System.out.println(s1+s2);
        //////////////////////////2//////////////////////////
        out.println("\uD83D\uDE48");
        out.println("\uD83D\uDE49");
        out.println("\uD83D\uDE4A");
        //////////////////////////3//////////////////////////
        String sI = "1.9.8.4.";
        //George Orwell
        String sII = "1984    ";
        out.println(sI.equals(sII));
    }
}
