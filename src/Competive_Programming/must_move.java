package Competive_Programming;

public class must_move {
//    At the Oth second, you are standing on cell (11).
//    At fst second, Move to (1,2) as it becomes visible in 1st second.
//
//    At the 2nd second, Move to (2,2) as it becomes visible on
//    the 2nd second.
//
//    At the 3rd second, Move to (2,1) as it is already visible from the
//3rd second.
//
//    At the 4th second, Move to (1,1) as it is already visible.
//
//    At the 5th second, Move to (1,2) as it is already visible from the
//    Ist second.
//
//    At the 6th second, Move to (1,3) as it becomes visible on the
//6th second.
//
//    At the 7th second, Move to (1,4) as it is already visible from the
//3rd second.
//    At the 8th second, Move to (2,4) as it is already visible from the
//4th second.
//
//    Hence, the answer is 8. It can be proved that we cannot reach
//    the point (2, 4) before the 8th second.
    public static void main(String[] args) {
        int x1 = 1, y1 = 1, x2 = 2, y2 = 4;
        int ans = 0;
        while (x1 != x2 || y1 != y2) {
            if (x1 < x2) {
                x1++;
            } else if (x1 > x2) {
                x1--;
            }
            if (y1 < y2) {
                y1++;
            } else if (y1 > y2) {
                y1--;
            }
            ans++;
        }
        System.out.println(ans);
    }

}
