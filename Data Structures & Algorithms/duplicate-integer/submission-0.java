class Solution {
    public boolean hasDuplicate(int[] nums) {
       var map = new HashMap<Integer, Integer>();
        for(var num : nums){

            if (map.get(num) == null){
                map.put(num, num);
            }
            else return true;

        }
        return false;
    }
}