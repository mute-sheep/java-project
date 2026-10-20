package stringStudy.StringPractice;

public class StringSplicing {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(arrtoString(arr));
    }

    public static String arrtoString(int[] arr){
        String s = "[";
        if(arr == null){
            return null;
        }
        if(arr.length == 0){
            return "[]";
        }
        for(int i = 0;i < arr.length;i++){
            s = i == (arr.length - 1)?s + arr[i] + "]":s + arr[i] + ",";
        }
        return s;
    }
}
