import java.util.*;

public class Main {

    public static int eraseOverlapIntervals(int[][] intervals) {

        // Sort intervals based on ending time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;

        // End of first interval
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            // Overlapping interval
            if (intervals[i][0] < prevEnd) {
                count++;
            }
            else {
                // Update end if no overlap
                prevEnd = intervals[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] intervals = new int[N][M];

        for (int i = 0; i < N; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int result = eraseOverlapIntervals(intervals);

        System.out.println(result);
    }
}