class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*Arrays.sort(nums);

        boolean duplicate=false;

        for ( int i=0;i<nums.length-1;i++){
            if(duplicate==false&&nums[i]==nums[i+1]){
                duplicate=true;
            }
            else if (duplicate!=true)
            duplicate=false;
        }

        return duplicate;
        
    } */

    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    for(int i=0;i<nums.length;i++){
         if (hm.containsKey(nums[i]))
            {
                return true;
            }
            else
            {
                hm.put(nums[i], 1);
            }
    }
return false;
    }
}