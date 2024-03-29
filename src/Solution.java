
/*
Разложение на множители с помощью рекурсии
*/

public class Solution {
    public void recurse(int n) {
        int a = 2;
        while (a <= n) {
            if ((n % a) == 0) {
                if (a != n) {
                    System.out.print(a + " ");
                    recurse(n / a);
                } else {
                    System.out.print(a);
                }
                return;
            }
            a++;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.recurse(132);
        System.out.println();
        solution.recurse(63);

    }
}

