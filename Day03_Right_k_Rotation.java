public class Day03_Right_k_Rotation{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rightkRotate(arr,arr.length-k,arr.length-1);
        rightkRotate(arr,0,arr.length-k-1);
        rightkRotate(arr,0,arr.length-1);
        for(int var:arr){
            System.out.print(var + " ");
        }
    }
    public static void rightkRotate(int[] a,int start,int end){
        while (start<end) {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}