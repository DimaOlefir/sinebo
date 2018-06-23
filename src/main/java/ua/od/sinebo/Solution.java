package ua.od.sinebo;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.ceil;

public class Solution {
    public static int solution(int A, int B) {

//        if (A < 0 || B < A) throw new IllegalArgumentException
//                ("value of 'A' or 'B' is negative or A > B: A=" + A + ", B=" + B);
//        According to the rules of mathematics

        int aSqrt = (int) ceil(sqrt(A));
        int bSqrt = (int) ceil(sqrt(B));

//        int aSqrt = (int) ceil(StrictMath.sqrt(A));
//        int bSqrt = (int) ceil(StrictMath.sqrt(B));
//        StrictMath.sqrt should be much faster than Math.sqrt

        return bSqrt - aSqrt;
    }

    public static int solution(int[] T) {
        int temp = T[0], index = 0;
        for (int i = 1; i < T.length; i++) {

            if (temp == T[i]) index = i;

            if (temp < T[i]) {
                for (int j = i + 1; j < T.length; j++) {
                    if (temp < T[j]) {
                        index = i;
                    }
                    temp = T[i];
                    index = i;
                }
            }
        }
        return index;
    }
}
