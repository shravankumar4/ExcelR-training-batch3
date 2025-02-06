class Demo068{
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int count = 0;
        for(int i : arr) {
            if(i%2==0){
                count++;
            }
        }
        System.out.println("The count of even digits in an array: "+count);
        
    }
}