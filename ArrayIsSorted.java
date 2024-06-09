class ArrayIsSorted{
    public static boolean isSorted(int[] arr , int n){
        if(n==1){
            return true ;
        }
        if(arr[n-1]<arr[n-2]){
            return false ;
        }
        return isSorted(arr, n-1) ;
    }
    public static void main(String[] args) {
        int[] arr = {11,12,111,1110} ;
        System.out.println(isSorted(arr,arr.length));
    }
}