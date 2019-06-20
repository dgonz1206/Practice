import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.util.ArrayList;

import static java.util.Objects.hash;

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

    private static String change(double total, double payment){
        int[] bills = new int[]{1,5,10,20,50,100};
        double[] coins = new double[]{.01,.05,.10,.25};
        BigDecimal remaining_value = BigDecimal.valueOf(payment - total);
        BigDecimal cash_remaining_BD = remaining_value.setScale(0, RoundingMode.FLOOR);
        BigDecimal coin_remaining_BD = remaining_value.subtract(cash_remaining_BD);
        if(remaining_value.compareTo(BigDecimal.ZERO) < 0)
            return "Insufficient funds";
        int cash_remaining = remaining_value.intValue();
        double coin_remaining = coin_remaining_BD.doubleValue();
        int bill_start;

        while(cash_remaining > 0) {
            for (int x = 0; x < bills.length; x++) {
                if (cash_remaining < x) {
                    bill_start = x;
                    System.out.println(bills[x]);
                    cash_remaining -= bills[x];
                    break;
                }
                else{
                    cash_remaining-=1;
                }
            }
        }

        System.out.println("$"+remaining_value + " is your change");
        System.out.println(cash_remaining_BD +" " +coin_remaining_BD);
        System.out.println("hascode: "+"KING".hashCode());
        System.out.println(hash("KING"));
        int index = hash("KING") & (3-1);
        System.out.println(index);
        System.out.println(hash("IlNG") % 16);
        return "done";
    }
    public static void main(String[] args) {
        //create a method that returns a boolean, takes an int array as a parameter. If the array has a duplicate return true, if not return false
        int[] myarray = new int[]{4,56,8,1,2,63,7,63,74,8,1,8,76,7,63,4,3,77,85,4,698,168,468,443,8,84,6};
        ArrayList<Integer> myList = new ArrayList<>();
        for(int x:myarray){
            myList.add(x);
        }
        // create a method that takes parameters for cost, and amount paid for an item, that returns the number of bills and coins
        //you need for the change.
        System.out.println(change(3.36, 20));




    }
}
