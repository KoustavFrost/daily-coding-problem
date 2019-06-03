/*
 * Given a list of numbers and a number k, return whether any two numbers from
 * the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is
 * 17.
 */

class DCP1 {
    public static void main(String args[]) {
        // int ar[] = { 10, 15, 3, 7 };
        // int k = 17;

        int ar[] = { 7, 4, 8, 5 };
        int k = 12;

        int i, j;
        for (i = 0; i < ar.length; i++) {
            for (j = i + 1; j < ar.length; j++) {
                if (ar[i] + ar[j] == k) {
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }
}
