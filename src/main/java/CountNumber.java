public class CountNumber {
    public int count(int k, int n)   {
        int count = 0;

        if( n == 0 && k == 0)
            count = 1;

        for(int i = k ; i <= n; i++){
            int j = i;
            if(j == 0)
                count = 1;
            while(j > 0){
               // System.out.println(i);
                if(j % 10 == k){
                    count++;
                }

                j = j / 10;

            }
//            count +=count;
        }

        return count;
    }
}
