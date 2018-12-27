import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinArrayⅡ {
    public int[] join(int[] a, int[] b){
        int[] result = new int[a.length+b.length];
        if(a.length == 0  ){
            return b;
        }else if( b.length == 0)
            return a;


        List<Integer> ls = new ArrayList(Arrays.asList(a.length >= b.length? a:b));
        int tmp = 0;
        for (int i: a.length < b.length? a:b
             ) {
            for(int j = tmp; j < ls.size(); j++){
                if(i >= ls.get(j) && i <= ls.get(j+1))
                    ls.add(j+1,i);

                tmp = j;
            }
        }


        return result;
    }
}
