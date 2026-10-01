class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean ans = false;
        HashSet<Integer> set = new HashSet<>();
        for(int e : nums){
            if(set.contains(e)){
                ans = true;
                break;
            }
            set.add(e);
        }
        return ans;
    }
}

