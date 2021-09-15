package DS.array;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        int currSum=0;
        int maxSum=0;
        for (int i = 0; i < arr.length; i++) {
            currSum=currSum+arr[i];
            if(currSum>maxSum)
            {
                maxSum=currSum;
            }
            if(currSum<0)
            {
                currSum=0;
            }
        }
        System.out.println(maxSum);
    }
}
