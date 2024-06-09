import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int s, int e){
        if(s >= e){
            return ;
        }
        int mid = s+(e-s)/2 ;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        merge(arr, s, mid, e);
    }
    public static void merge(int[] arr, int s, int mid, int e){
        int[] temp = new int[e-s+1] ;
        int i = s ;
        int j = mid+1;
        int k = 0 ;

        while(i<=mid && j<=e){
            if(arr[i] < arr[j]){
                temp[k] = arr[i] ;
                i++ ;
                k++ ;
            }
            else{
                temp[k] = arr[j] ;
                k++ ;
                j++ ;
            }
        }
        while(i<=mid){
            temp[k] = arr[i] ;
            i++ ;
            k++ ;
        }
        while(j<=e){
            temp[k] = arr[j] ;
            j++ ;
            k++ ;
        }
        for(k=0,i=s;k<temp.length ; k++,i++){
            arr[i] = temp[k] ;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8} ;
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
