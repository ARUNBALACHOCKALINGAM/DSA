public class Simplesearch{
    public static void main(String args[]){

        int[] arr={2,3,4,15,16,17,18};
        int target=16;
        int ans;

        if(arr[0]<arr[arr.length-1]){
         ans= binarySearch(arr, target);
        }else{
          ans=orderAgnosticsearch(arr,target);
        }
        System.out.print(ans);
           
    }

    static int binarySearch(int[] arr,int target){
         int start=0;
         int end=arr.length-1; 

         while(start<=end){
             int mid=start+(end-start)/2;

             if(target<arr[mid]){
                 end=mid-1;
             }
             else if(target>arr[mid]){
                 start=mid+1;
             }
             else if(target==arr[mid]){
                 return mid;
             }

         }

         return -1;
    }

    static int orderAgnosticsearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1; 

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                start=mid+1;
            }
            else if(target>arr[mid]){
                end=mid-1;
            }
            else if(target==arr[mid]){
                return mid;
            }

        }

        return -1;
   }
}