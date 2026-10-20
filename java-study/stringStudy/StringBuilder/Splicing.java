package stringStudy.StringBuilder;

public class Splicing {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(fun(arr));
    }   
    
    public static String fun(int arr[]){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0;i < arr.length;i++){
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i] + ",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
