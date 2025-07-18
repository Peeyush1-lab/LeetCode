class Solution {
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;
        boolean digit = false;
        String sp;
        int j = 0;
        for (j = 0; j < strs.length; j++) {
            sp = strs[j];
            int k = 0;
            for(k = 0; k < sp.length(); k++)
            {
                if(sp.charAt(k) >= 'a' && sp.charAt(k) <= 'z')
                {
                    break;
                }
                if(sp.charAt(k) >= '0' && sp.charAt(k) <= '9')
                {
                    continue;
                }
            }
            if(k != sp.length())
            {
                if(max < sp.length())
                {
                    max = sp.length();
                }
            }
            else
            {
                int a = Integer.parseInt(sp);
                if(max < a)
                {
                    max = a;
                }
            }
        }
        return max;
    }
}