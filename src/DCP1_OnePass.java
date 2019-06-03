import java.util.*;

class DCP1_OnePass {
    public static void main(String args[]) {
        // int ar[] = { 10, 15, 3, 7 };
        int k = 17;

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(3);
        list.add(7);

        Iterator iterator = list.iterator(); // Iterator to iterate through the list
        while (iterator.hasNext()) {
            int num = (int) iterator.next();
            int remainder = k - num; // Getting the subtract
            if (list.contains(remainder)) {
                System.out.println(num + " " + remainder);
                iterator.remove(); // If found the removing the number to avoid repetation
            }
        }
    }
}