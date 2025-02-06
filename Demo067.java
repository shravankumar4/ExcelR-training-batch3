class Demo067{
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int n = arr.length;
        for(int i : arr) {
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}