public class Day04_leftkRotation{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        leftkRotate(arr,0,k-1);
        leftkRotate(arr,k,arr.length-1);
        leftkRotate(arr,0,arr.length-1);
        for(int var:arr){
            System.out.print(var + " ");
        }
    }
    public static void leftkRotate(int[] a,int start,int end){
        while (start<end) {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}