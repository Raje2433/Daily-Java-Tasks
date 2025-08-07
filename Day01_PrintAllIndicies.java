public class Day01_PrintAllIndicies {
    public static void main(String[] args) {
        int[] arr = {5,7,8,7,7,2};
        if(arr.length==0){
            System.out.println("Array is empty");
        }
        else{
            findIndex(arr, 7);
        }
        
    }
    public static void findIndex(int[] a,int element){
        int in=-1;
        for(int index=0;index<a.length;index++){
            if(a[index]==element){
                in=index;
                System.out.print(in + " ");
            }
        }
        if(in==-1){
            System.out.println("Element not found");
        }
    }
}
