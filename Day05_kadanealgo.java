public class Day05_kadanealgo{
    public static void main(String[] args) {
        int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The maximum subarray sum is " + kadane(arr));
    }
    public static int kadane(int[] a){
        int maxSum=a[0];
        int currentSum=a[0];
        int startIndex=0;
        int endIndex=0;
        int temp=0;
        for(int index=1;index<a.length;index++){
            if (currentSum + a[index] < a[index]) {
                currentSum = a[index];
                temp = index; 
            } else {
                currentSum += a[index];
            }
            if(maxSum<currentSum){
                maxSum=currentSum;
                startIndex=temp;
                endIndex=index;
            }
        }
        System.out.print("The max subarray is ");
        for(int i=startIndex;i<=endIndex;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        return maxSum;
    }
}