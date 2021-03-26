package assisgnments;

public class Question36 {
    //36.	Write a function to find duplicate elements in an array.


    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 4, 6, 2, 5, 6, 8, 6};

        for (int i = 0; i < array.length; i++)
        {
            for (int dup = i+1; dup<array.length; dup ++){
                if (array[i] == array[dup])
                    System.out.println("Duplicate of provided number are: ");
                    System.out.println(array[dup]);  /// PRINT MANY TIMES AND WRONG WAY
            }
        }
    }
}
