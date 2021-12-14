package com.tutorials;

public class mooc_3_stars {
    public static void main(String[] args) {
        
//        printSquare(4);
//        printRectangle(3,5);
//        printTriangle(6);
        printRighLeaningTriangle(4);

        
    }

    private static void printRighLeaningTriangle(int i) {
        for (int x = 0 ;x <= i; x++){
            for(int y = 0; y <= i - x; y++ ){
                System.out.print(" ");

            }
            for ( int z = 0 ; z <= x ;z++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    private static void printTriangle(int i) {
        for (int x = 0 ; x<i;x++){
            for ( int y = 0 ; y < x ; y++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    private static void printRectangle(int i, int j) {
        for (int x = 0 ; x<i; x++){
            for ( int y = 0 ; y < j;y++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    private static void printSquare(int i) {
        for (int x = 0 ; x< i ; x++){
            for(int y = 0 ; y<i;y++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
