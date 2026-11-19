public class Assignment01Q05 {
    public static int findShortestPath(int[][] matrix, int i, int j) {
        if (i == j) {
            return 0;
        }

        int n = matrix.length;
        int[] queue = new int[n];
        boolean[] visited = new boolean[n];
        int[] dist = new int[n];

        int head = 0;
        int tail = 0;

    
        queue[tail++] = i;
        visited[i] = true;

        while (head < tail) {
            int curr = queue[head++]; // שליפת הקודקוד הבא מהתור

            for (int next = 0; next < n; next++) {
                if (matrix[curr][next] == 1 && !visited[next]) {
                    dist[next] = dist[curr] + 1;
                    if (next == j) {
                        return dist[next];
                    }
                    visited[next] = true;
                    queue[tail++] = next; // הכנסת השכן לסוף התור
                }
            }
        }

        return -1; 
    }
      
    }
