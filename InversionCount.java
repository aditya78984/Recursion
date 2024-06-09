public class InversionCount {
    public static int mergeSort(int[] arr, int s, int e){
        int count = 0 ;
        if(s >= e){
            return count ;
        }
        
        int mid = s+(e-s)/2 ;
        count+=mergeSort(arr, s, mid);
        count+=mergeSort(arr, mid+1, e);
        count+=merge(arr, s, mid, e);
        return count ; 
    }
    public static int merge(int[] arr, int s, int mid, int e){
        int[] temp = new int[e-s+1] ;
        int i = s ;
        int j = mid+1;
        int k = 0 ;
        int count = 0 ;

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
                count += mid-i+1 ; 
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
        return count ;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1} ;
        System.out.println(mergeSort(arr, 0, arr.length-1));
    }
}
