import java.util.Arrays;
class Demo077{
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4,5};
        int[] arr2 = Arrays.copyOf(arr1,arr1.length);
        System.out.print(Arrays.toString(arr2));
}
}