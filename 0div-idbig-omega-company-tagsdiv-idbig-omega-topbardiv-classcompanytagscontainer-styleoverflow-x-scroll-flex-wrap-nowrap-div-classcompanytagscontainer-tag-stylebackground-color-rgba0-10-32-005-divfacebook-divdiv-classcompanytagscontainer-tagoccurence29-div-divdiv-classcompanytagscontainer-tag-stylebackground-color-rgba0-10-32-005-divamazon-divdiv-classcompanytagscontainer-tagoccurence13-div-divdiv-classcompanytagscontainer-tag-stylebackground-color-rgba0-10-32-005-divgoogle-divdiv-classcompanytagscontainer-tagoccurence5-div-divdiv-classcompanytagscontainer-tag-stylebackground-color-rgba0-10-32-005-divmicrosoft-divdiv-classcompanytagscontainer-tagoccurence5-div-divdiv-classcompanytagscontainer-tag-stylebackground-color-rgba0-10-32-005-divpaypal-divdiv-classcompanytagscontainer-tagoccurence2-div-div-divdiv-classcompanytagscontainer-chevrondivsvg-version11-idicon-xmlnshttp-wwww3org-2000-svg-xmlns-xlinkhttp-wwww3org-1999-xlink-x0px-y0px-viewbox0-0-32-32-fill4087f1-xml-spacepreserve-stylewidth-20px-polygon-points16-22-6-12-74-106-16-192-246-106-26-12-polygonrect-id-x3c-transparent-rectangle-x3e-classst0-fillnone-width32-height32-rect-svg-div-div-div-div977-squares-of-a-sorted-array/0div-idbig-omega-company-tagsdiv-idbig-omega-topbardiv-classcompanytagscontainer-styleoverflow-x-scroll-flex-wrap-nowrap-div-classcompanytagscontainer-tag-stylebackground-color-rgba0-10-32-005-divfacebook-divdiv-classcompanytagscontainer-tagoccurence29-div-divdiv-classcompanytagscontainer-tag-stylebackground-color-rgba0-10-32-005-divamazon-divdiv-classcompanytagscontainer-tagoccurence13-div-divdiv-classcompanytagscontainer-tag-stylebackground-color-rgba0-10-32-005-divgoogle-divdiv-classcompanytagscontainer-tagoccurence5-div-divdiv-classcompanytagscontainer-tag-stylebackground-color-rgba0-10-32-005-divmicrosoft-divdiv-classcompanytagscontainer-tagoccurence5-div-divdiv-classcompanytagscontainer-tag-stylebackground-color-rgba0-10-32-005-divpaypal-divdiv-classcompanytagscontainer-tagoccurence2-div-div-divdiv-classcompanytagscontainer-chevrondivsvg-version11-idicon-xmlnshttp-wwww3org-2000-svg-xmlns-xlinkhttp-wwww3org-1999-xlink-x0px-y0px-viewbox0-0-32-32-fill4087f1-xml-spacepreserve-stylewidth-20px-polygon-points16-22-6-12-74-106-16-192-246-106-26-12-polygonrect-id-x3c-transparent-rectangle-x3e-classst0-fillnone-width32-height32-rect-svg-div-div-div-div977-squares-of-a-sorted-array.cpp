class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int>res(nums.size());
        int i=nums.size()-1;
        int j=0;
        int ptr=nums.size()-1;
        while(ptr>=0)
        {
            if(i==j)
            {
                res[ptr]=nums[i]*nums[i];
                break;
            }
            if((nums[i]*nums[i]) >= (nums[j]*nums[j]))
            {
                res[ptr]=nums[i]*nums[i];
                i--;
            }
            else
            {
                res[ptr]=nums[j]*nums[j];
                j++;
            }
            ptr--;
        }
        return res;
    }
};