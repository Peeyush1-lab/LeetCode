class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int freq[] = new int[101];
        for(int i : heights)
        {
            freq[i]++;
        }
        int k = 0;
        for(int i = 0; i < freq.length; i++)
        {
            while(freq[i] != 0)
            {
                if (heights[k] != i) {
                    count++;
                }
                k++;
                freq[i]--;
            }
        }
        return count;
    }
}