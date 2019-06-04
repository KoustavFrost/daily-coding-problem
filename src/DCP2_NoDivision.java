class DCP2_NoDivision
{
    public static  void main(String args[])
    {
        DCP2_NoDivision obj = new DCP2_NoDivision();
        obj.makeArray();
    }

    public void makeArray()
    {
        int ar[] = {1, 2, 3, 4, 5};
        int i, l = ar.length, product = 1, mul;

        int arr[] = new int[l];

        for (i = 0; i < l; i++)
        {
            mul = getProduct(ar, i);
            mul *= product;
            arr[i] = mul;

            product *= ar[i];
        }

        for (i = 0; i < l; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public int getProduct(int ar[], int val)
    {
        int returnValue = 1;
        for (int i = (val + 1); i < ar.length; i++)
        {
            returnValue *= ar[i];
        }

        return returnValue;
    }
}
