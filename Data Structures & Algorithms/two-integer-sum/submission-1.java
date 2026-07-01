class Solution {
    public int[] twoSum(int[] nums, int target) {
      var map = new HashMap<Integer, Integer>();
     for (int i = 0; i<nums.length; i++){
         map.put(nums[i], i);
     }

     for (int i = 0; i<nums.length; i++){
        var otherIndex = map.get(target - nums[i]);
         if (otherIndex != null && otherIndex != i){
            int a = i;
            int b = map.get(target-nums[i]);
           return  a>b?new int[]{b, a}: new int []{a, b};
         }
     }
     return new int[]{};
        
    }
}
