class Solution {
    public int removeDuplicates(int[] nums) {

int count=0;
int ans=0;
for(int i=0;i<nums.length-1;i++){
    if(nums[i]==nums[i+1]){
        count++;
        continue;
    }
    else {
        nums[i-count+1]=nums[i+1];
        ans++;
    }

}
return ans+1;
}
}