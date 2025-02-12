import java.util.*;

public class He001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> present = new HashSet<>();
        int mex = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            present.add(arr[i]);
            while (present.contains(mex)) {
                mex++;
            }
            result.add(mex);
        }
        for (int mexValue : result) {
            System.out.print(mexValue + " ");
            }
  }
}