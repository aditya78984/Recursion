import java.util.* ;
public class KeypadCombinations {
    public static ArrayList<String> find(char[][] dial, String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0' ;
        for(int i=0; i<dial[digit].length; i++){
            char ch = dial[digit][i];
            list.addAll(find(dial,p+ch,up.substring(1)));
        }
        return list ;
    }
    public static void main(String[] args) {
        char[][] dial = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
                        {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
                        {'t','u','v'},{'w','x','y','z'}};
        System.out.println(find(dial, "", "23"));

    }
}
