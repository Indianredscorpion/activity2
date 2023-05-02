// Define a class named Test
class Test {

    // Define a method named process that prints "A,"
    public void process() {
        System.out.print("A,");
    }

    // Define a main method
    public static void main(String[] args) {

        // Create a new object of class b and call its process method
        try {
            new b().process();
        }
        // Catch any exception that may occur
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

// Define a class named b that extends the Test class
class b extends Test {

    // Override the process method of the Test class to print "B"
    @Override
    public void process() {
        System.out.print("B");
    }
}
