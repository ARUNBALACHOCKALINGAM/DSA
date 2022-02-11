import java.util.Arrays;

public class Mergesort {
    
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] leftSort = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightSort = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(leftSort,rightSort);
    }


    static int[] merge(int[] leftSort,int[] rightSort){
        int[] mergedArray = new int[leftSort.length+rightSort.length];

        int i=0;
        int j=0;
        int k=0;

        while(i < leftSort.length && j < rightSort.length){

            if(leftSort[i] < rightSort[j]){
                mergedArray[k] = leftSort[i];
                i++;
                k++;
            }else{
                mergedArray[k] = rightSort[j];
                j++;
                k++;
            }
        }

        //if some left over is present 

        while(i<leftSort.length){
            mergedArray[k] = leftSort[i];
            i++;
            k++;
        }

        while(j<rightSort.length){
            mergedArray[k] = rightSort[j];
            j++;
            k++;
        }

        return mergedArray;


    }
}
