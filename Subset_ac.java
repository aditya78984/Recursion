import java.util.ArrayList;

public class Subset_ac {
    public static ArrayList<String> subsets(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);
        ans.addAll(subsets( p + ch, up.substring(1)));
        ans.addAll(subsets( p, up.substring(1)));
        return ans;
    } 
    public static void main(String[] args) {
        System.out.println(subsets("","abc"));
    }
}
