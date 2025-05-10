/*problem to find duplicate in an array */


public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {2,4,44,501,4,55};
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length-1;j++){
                if(arr[i] == arr[j]){
                    count++;

                }
            }
        }
        if(count >0){
            System.out.println("Duplicate found");
        }
        else{
            System.out.println("No duplicate found");
        }

    }
}
