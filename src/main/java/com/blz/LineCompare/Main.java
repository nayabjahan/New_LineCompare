package com.blz.LineCompare;

public class Main {
    public static void main(String[] args) {

        //creating object
        LineComparision lineComparision = new LineComparision();
        double lengthOne = lineComparision.calculateLength(2, 4, 2, 4);
        double lengthTwo = lineComparision.calculateLength(2, 4, 2, 4);
        System.out.println("Length of Line 1 is: " + lengthOne);
        System.out.println("Length of Line 2 is: " + lengthTwo);

        //calling functions
        lineComparision.checkLineComparison(lengthOne, lengthTwo);
        lineComparision.checkEqualityOfLine(lengthOne, lengthTwo);
    }
}
