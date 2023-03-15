import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {22, 11, 55, 22, 112, 88};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(" -------------- ");
        asc(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sorting(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length -i- 1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void asc(int arrays[]){
        for (int j = 0; j < arrays.length-1; j++) {
            if(arrays[j] > arrays[j+1]){
                int temp = arrays[j];
                arrays[j] = arrays[j+1];
                arrays[j+1] = temp;
            }
        }
    }
}
