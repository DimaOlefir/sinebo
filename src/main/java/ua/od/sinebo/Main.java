package ua.od.sinebo;

public class Main {
    public static void main(String[] args) {

        int A = -2147483648,
                B = 2147483647;
        try {
            System.out.println(Solution.solution(A, B));
        } catch (IllegalArgumentException e) {
            System.out.println("value of 'A' or 'B' is negative or A > B");
        }


//        int[] T = {-5, -5, -5, -42, 6, 12};
        int[] T = {5, -2, 3, 8, 6};
        try {
            System.out.println(Solution.solution(T));
        } catch (IllegalArgumentException e) {
            System.out.println("values of array T are wrong");
        }
    }
}
