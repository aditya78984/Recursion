public class PairSum2 {
    public static boolean pairSum(int[] arr , int target){
        int pivot = 0 ;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                pivot = i;
            }
        }
        int lp = pivot +1;
        int rp = pivot;
        while(lp!=rp){
            if(arr[lp] + arr[rp]  == target){
                return true ;
            }
            if(arr[rp] + arr[lp] > target){
                rp--;
                if(rp==-1){
                    rp = arr.length-1;
                }
            }
            else{
                lp++;
                if(lp==arr.length){
                    lp=0;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {11,15,16,1,9,10};
        System.out.println(pairSum(arr, 19));

    }
}
