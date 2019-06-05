import java.util.ArrayList;

public class Main {
/*

first coding question was like,
create a method that returns a boolean, takes an int array as a parameter. If the array has a duplicate return true, if not return false
second question was like....if you have an unsorted array of ints, create a method that returns  the kth highest value.
So if array is [2, 5, 6, 1, 10], and k  = 2, then return 6
third question was like, create a method that takes parameters for cost, and amount paid for an item, that returns the number of bills and coins
you need for the change.
So if the cost of something is like 12.75, and paid is 20, change  would be 7.25. So then you have to print out something like: one $5, two $1, one quarter
 */
    private static Boolean isDuplicate(int[] myArray){
        for(int x=0;x<myArray.length;x++){
            for(int y=0;y<myArray.length;y++){
                if(x!=y)
                    if(myArray[y]==myArray[x])
                        return true;
            }
        }
        return false;
    }
    private static Boolean printRepeating(int arr[], int size)
    {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < size; i++)
        {
            if (arr[Math.abs(arr[i])] >= 0) {
                System.out.println("wtf: "+arr[Math.abs(arr[i])] +", " + -arr[Math.abs(arr[i])]);
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
            else
                System.out.println("else: "+Math.abs(arr[i]) + " ");
        }
        for(int x: arr)
            System.out.print(x+",");
        return false;
    }
    public static void main(String[] args) {
        //create a method that returns a boolean, takes an int array as a parameter. If the array has a duplicate return true, if not return false
        int[] myarray = new int[]{4,56,8,1,2,63,7,63,74,8,1,8,76,7,63,4,3,77,85,4,698,168,468,443,8,84,6};
        ArrayList<Integer> myList = new ArrayList<>();
        for(int x:myarray){
            myList.add(x);
        }
        int[] order = new int[]{1,2,3,4,5};
        //System.out.println(isDuplicate(order));
        int arr[] = {1, 2, 3, 1, 3, 6, 6};
        int arr_size = arr.length;

        System.out.println(printRepeating(arr, arr_size));

    }
}
