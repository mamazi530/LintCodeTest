public class AplusB {
    public int plus(int a, int b){
        int sum,carry;
        do{
            sum = a ^ b;
            carry = (a&b) <<1;
            a = sum;
            b = carry;
        }while(b!=0);
        return a;


    }
}
