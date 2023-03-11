class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n=(int)nums.size();
        int start=0,end=0,point=0,end_temp=0,start_temp=nums[0];
        
        for(int i=0;i<n;i++){
            end_temp+=nums[i];
            if(start_temp<end_temp){
                start_temp=end_temp;
                start=point;
                end=i;
            }
            if(end_temp<0){
                end_temp=0;
                point=i+1;
            }
        }
        return start_temp;
    }
};