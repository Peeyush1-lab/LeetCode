int searchInsert(int* nums, int numsSize, int target)
{
    int mid,start = 0,end = numsSize-1;
    while(start<=end)
    {
        mid = (start+end)/2;
        if(nums[mid] == target)
        {
            return mid;
        }
        else if(nums[mid]<target)
        {
            start = mid+1;
        }
        else
        {
            end = mid-1;
        }
    }
    return start;
}