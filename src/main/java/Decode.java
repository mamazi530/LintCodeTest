import java.util.HashMap;

public class Decode {
    private HashMap<Character, Integer> mapping = new HashMap<Character, Integer>() {
        {
            for (int i = 1; i < 27; i++) {
                put((char) ('A' + i-1), i);
            }
        }
    };

    public void decode(int n){
       mapping.forEach((k,v)->{

           System.out.println(k+":"+v);
       });

    }
}
