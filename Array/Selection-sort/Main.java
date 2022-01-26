import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){

         //run the steps for n-1
    
         for(int  i=0;i<arr.length;i++){
         
             int last = arr.length-i-1;
             int maxIndex= maxIndex(arr,0,last);
             swap(arr,maxIndex,last);
         }
    
    }

    static int maxIndex(int arr[],int first,int last){
        int max=first; 
        for(int i=first;i<=last;i++){
            if(arr[max]<arr[i]){
                 max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}

