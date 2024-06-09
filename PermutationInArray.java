import java.util.ArrayList;

public class PermutationInArray {
     public static void permutations(int[] arr, ArrayList<Integer> ds, boolean[] freq, ArrayList<ArrayList<Integer>> ans){
          if(ds.size() == arr.length){
               ans.add(new ArrayList<>(ds));
               return ;
          }
          for(int i=0; i<=arr.length-1; i++){
               if(!freq[i]){
                    freq[i] = true;
                    ds.add(arr[i]);
                    permutations(arr, ds, freq, ans);
                    ds.remove(ds.size()-1);
                    freq[i] = false;
               }
          }
     }
     public static void main(String[] args) {
          int[] arr = {3,5,4};
          ArrayList<Integer> ds = new ArrayList<>();
          ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
          boolean[] freq = new boolean[arr.length];
          permutations(arr, ds, freq, ans);
          System.out.println(ans);
     }
}
