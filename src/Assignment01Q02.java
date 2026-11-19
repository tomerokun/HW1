public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int i = Integer.parseInt(args[0]);
        for (int j = 0; j < i; j++) {
            approxPi += Math.pow(-1, j) / (2 * j + 1);
        }

        approxPi *= 4;


        
        
        System.out.println(approxPi + " " + actualPi);
    }
}
