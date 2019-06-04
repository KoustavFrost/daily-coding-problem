// This problem was asked by Uber
//Given an array of integers, return a new array such that
// each element at index i of the new array is the product
// of all the numbers in the original array except the one at i.
//
//For example, if our input was [1, 2, 3, 4, 5],
// the expected output would be [120, 60, 40, 30, 24].
// If our input was [3, 2, 1], the expected output would be [2, 3, 6].

class DCP2
{
    public static void main(String args[])
    {
        int ar[] = {3, 2, 1};
        int i, prod = 1;
        int arr[] = new int[ar.length];

        for (i = 0; i < ar.length; i++)
        {
            prod *= ar[i];
        }

        for (i = 0; i < ar.length; i++)
        {
            arr[i] = (prod/ar[i]);
            System.out.println(arr[i]);
        }
    }
}