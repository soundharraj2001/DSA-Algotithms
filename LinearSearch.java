public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23,55,77,88,99,12,24};
        int target = 88;
        linear(arr,target);
    }

    static void linear(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i])
                System.out.println("your target on that index is : " + i);
        }
    }
}
