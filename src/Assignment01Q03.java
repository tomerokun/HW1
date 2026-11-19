public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int a0 = 1;
        int a1 = 1;
        int numOdd = 2; // a0 and a1 are odd numbers
        String fibSequence = a0 + " " + a1;
        for (int i = 0; i < x - 2; i++) {
            int a2 = a0 + a1;
            if (a2 % 2 != 0) {
                numOdd++;
            }
            a0 = a1;
            a1 = a2;
            fibSequence += " " + a2;
        }


        System.out.println("The first " + x + " Fibonacci numbers are:");
        System.out.println(fibSequence);

    


        
        
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
