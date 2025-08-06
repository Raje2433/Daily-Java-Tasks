public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "I love Java";
        String[] words=sentence.split(" ");
        reverse(words);
        for(String var:words){
            System.out.print(var + " ");
        }
    }
    public static void reverse(String[] a){
        int start=0;
        int end=a.length-1;
        while(start<end){
            String temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
