class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 0;
        long last = num;
        long mid = 0;
        if(num == 1)
        {
            return true;
        }
        while(start <= last)
        {
            mid = start + (last-start)/2;
            if(mid * mid == num)
            {
                return true;
            }
            else if(mid * mid < num)
            {
                start = mid + 1;
            }
            else
            {
                last = mid - 1;
            }
        }
        return false;
    }
}