class Solution {
    public int[] decode(int[] encoded, int first) {
        int arr1[] = new int [encoded.length+1];
        arr1[0] = first;
        for(int i = 0; i < encoded.length; i++)
        {
            arr1[i+1] = arr1[i]^encoded[i];
        }
        return arr1;
    }
}