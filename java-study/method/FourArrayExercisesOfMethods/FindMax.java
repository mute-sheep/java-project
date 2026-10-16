public class FindMax {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println("max:" + Find_max(arr)); 
    }
    public static int Find_max(int arr[]) {
        int max = arr[0];
        for(int i = 0 ;i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
