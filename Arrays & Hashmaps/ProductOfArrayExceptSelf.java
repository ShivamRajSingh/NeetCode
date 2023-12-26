import java.util.*;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> leftProd = new ArrayList<>(Collections.nCopies(n,-1));
        ArrayList<Integer> rightProd = new ArrayList<>(Collections.nCopies(n,-1));

        leftProd.set(0,1);
        for(int i =1; i < n; i++){
            leftProd.set(i, leftProd.get(i-1) * nums[i-1]);
        }

        rightProd.set(n-1, 1);
        for(int i =n-2; i >=0 ; i--){
            rightProd.set(i, rightProd.get(i+1) * nums[i+1]);
        }

        int[] result = new int [n];
        for(int i =0; i < n; i++){
            result[i] = leftProd.get(i) * rightProd.get(i);
        }

        return result;
    }
}