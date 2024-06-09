import java.util.ArrayList;


public class Subset {
    public static void subSeq(ArrayList<Integer> p, int[] up, int pointer){
        if(pointer== up.length ){
            pointer=0;
            System.out.println(p);
            return;
        }
        int ch = up[pointer];
        p.add(ch) ;
        subSeq(p, up, ++pointer);
        subSeq(p , up, ++pointer);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3} ;
        subSeq(new ArrayList<Integer>(), arr, 0);
    }
}
