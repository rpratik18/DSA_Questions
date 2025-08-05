import java.util.Arrays;

public class Q29 {
    /*Given an array of integers,
    sort it in a wave form.
            [ The order of elements in a wave form:
    arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= ….. ]*/
   /* int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
    Answer : arr[] = {10, 5, 6, 2, 20, 3, 100, 80} OR {20, 5, 10, 2, 80, 6, 100, 3}*/
    public static void main(String[] args) {
        int[] arr ={10, 5, 6, 3, 2, 20, 100, 80};
        if(arr[0]<arr[1]){
            int temp=arr[1];
            arr[1]=arr[0];
            arr[0]=temp;
        }
        for(int i=2;i<arr.length;i++){

            if(i%2!=0){
                if(arr[i]>arr[i-1]){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
