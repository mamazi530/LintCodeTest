public  class Addition {
    public  String addition(int k, String a , String b){
        int aLen = a.length();
        int bLen = b.length();
        int len = Math.max(aLen, bLen);
        while (a.length() < len) {
            a = "0" + a;
        }
        while (b.length() < len) {
            b = "0" + b;
        }
        StringBuilder sb = new StringBuilder();
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int addDigit = 0;
        for (int i = len - 1; i >= 0; i--) {
            int cA = charsA[i] - '0';
            int cB = charsB[i] - '0';
            int sum = cA + cB + addDigit;
            if (sum >= k) {
                addDigit = 1;
                sum = sum % k;
            } else {
                addDigit = 0;
            }
            sb.insert(0, sum);
        }
        if (addDigit > 0) {
            sb.insert(0, addDigit);
        }
        while (true) {
            if (sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            } else {
                break;
            }
        }
        return sb.toString();
    }

}
