package edu.gcccd.csis;

public class SomeClass {

    public SomeClass() throws Exception {
        String x = "working sample";
    }

    public SomeClass(int myNumber) throws Exception {
        int x = myNumber/0;
    }

    public static void main(String[] args) {
        try {
            SomeClass roger = new SomeClass(4);
            System.out.println("I created something");
        }
        catch (Exception e) {
            System.out.println("I created an Exception");
            System.out.println("It was " + e.toString());

        }

        System.out.println();

        try {
            SomeClass roger = new SomeClass();
            System.out.println("I created something");
        }
        catch (Exception e) {
            System.out.println("I created an Exception");
            System.out.println("It was " + e.toString());

        }

    }
}

