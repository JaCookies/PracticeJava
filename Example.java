/*
    This is a simple Java program.
    I am Example.java.
    9/3/21
*/ 

class Example {
    // a java program begins with a call to main().

    public static void main(String args[]) {
        // main method ^
        System.out.println("Java drives the web. And drives my stress out of its caves.");

        // Demonstration of a variable. 
        int myVar1; //this declares variable integer.
        int myVar2;
        
        myVar1 = 1024;
        System.out.println("myVar1 contains " + myVar1);

        myVar2 = myVar1 / 2;
        System.out.println("myVar2 contains myVar1 / 2: ");
        System.out.println(myVar2);

        //what the hell is a logger? 'Replace this use of System.out or System.err by a logger.'

        int v; // this declares an int variable
        double x; //this declares a floating-point variable

        v = 10;
        x = 10.0;

        System.out.println("Original value of v: " + v );
        System.out.println("Original value of x: " + x );
        System.out.println(); //print a blank line

        v = v / 4;
        x = x / 4;

        System.out.println("v after division: " + v );
        System.out.println("x after division: " + x ); // double keeps the decimal point
    }



}