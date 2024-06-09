import java.util.ArrayList;

public class findAllindex {
    
    static ArrayList<Integer> list = new ArrayList<>() ;
    public static void linearSearch(int[] arr , int target , int index){
        if (index==arr.length){
            return  ;
        }
        if (arr[index]==target){
            list.add(index) ;
        }
        linearSearch(arr, target, index+1) ;
    }

    public static ArrayList<Integer> linearSearch2(int[] arr , int target , int index , ArrayList<Integer> list2){
        if (index==arr.length){
            return list2 ;
        }
        if (arr[index]==target){
            list2.add(index) ;
        }
        return linearSearch2(arr, target, index+1,list2) ;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,10,8,4,4} ; 
        linearSearch(arr,4 , 0);
        
        System.out.println(list);
        System.out.println(linearSearch2(arr,4,0,new ArrayList<Integer>()));
    }
}
