package assisgnments;

public class Question35 {
    //35.	Write a function to find the second largest number in a given array.

    public static int get (int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-2];
    }

    public static void main(String args[]){
        int a[]={1,2,5,6,3,2};
        System.out.println("Second Largest number is : "+get(a,6));
    }


}
