public class Assignment01Q04 {

public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if ((direction != 'L' && direction != 'R') || array.length == 0) {
            return array;
        }

        int n = array.length;
        move = move % n;

       
        if (move < 0) {
            move = -move;
            direction = (direction == 'R') ? 'L' : 'R';
        }

       
        int leftShift = (direction == 'R') ? (n - move) % n : move;

        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = array[(i + leftShift) % n];
        }

        for (int i = 0; i < n; i++) {
            array[i] = temp[i];
        }

        return array;
    }
}