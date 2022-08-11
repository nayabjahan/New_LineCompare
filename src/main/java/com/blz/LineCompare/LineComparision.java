package com.blz.LineCompare;

public class LineComparision {
    public double calculateLength(int x1, int y1, int x2, int y2) {
        // Calculating Length of points
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    // Function for comparing two lines.
    public void checkLineComparison(Double lengthOne, Double lengthTwo) {
        int lineCompare = lengthOne.compareTo(lengthTwo);
        if (lineCompare < 0) {
            System.out.println("Line 1 length is less than line 2");
        } else if (lineCompare > 0) {
            System.out.println("Line 1 length is grater than line 2");
        } else {
            System.out.println("Line 1 length is Equal to line 2");
        }
    }
    // function for checking if two lines are equals.
    public void checkEqualityOfLine(Double lengthOne, Double lengthTwo){
     boolean equals = lengthOne.equals(lengthTwo);
     if (equals){
         System.out.println("lines are equal");
     } else{
         System.out.println("lines are not equal");
      }
    }
}
