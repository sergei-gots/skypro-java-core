package pro.sky.java.util;

import java.util.Random;

import static java.lang.System.out;

public class BasicService {

    public static Random RANDOM = new Random();

    public static void printHeader(String header) {
        out.println();
        printSeparator();
        out.print("===== ");
        out.println(header);
    }

    public static void printFooter() {
        printSeparator();
        out.println();
    }

    protected static void printSeparator() {
        out.println("================================================================================================");
    }

}