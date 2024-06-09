import java.util.ArrayList;

public class GfG{
    static long find(String p, String up, int k){
        if(up.isEmpty()){
            int i=0;
            long count=0;
            ArrayList<Character> list = new ArrayList<>();
            while(i<p.length()){
                if(!list.contains(p.charAt(i))){
                    count++;
                    list.add(p.charAt(i));
                }
                i++;
            }
            return (count == k) ? 1 : 0;
        }
        char ch = up.charAt(0);
        long a = find(p+ch, up.substring(1), k);
        long b = find(p, up.substring(1), k);
        return a + b;
    }

    static long substrCount (String S, int K) {
        return find("", S, K);
    }

    public static void main(String[] args) {
        System.out.println(substrCount("abaaca",1)); // Output: 6
    }
}
