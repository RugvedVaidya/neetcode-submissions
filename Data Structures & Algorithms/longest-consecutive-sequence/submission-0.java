class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for(int i=0; i<n; i++) {
            
            int curr = nums[i];
            if(map.containsKey(curr)) {
                continue;
            }

            int left = 0;
            int right = 0;

            if(map.containsKey(curr -1)) {
                left = map.get(curr - 1);
            }

            if(map.containsKey(curr + 1)) {
                right = map.get(curr + 1);
            }

            int toPut = left + right + 1;

            map.put(curr, toPut);
            map.put(curr - left, toPut);
            map.put(curr + right, toPut);

            ans = Math.max(ans, map.get(curr));
        }
        return ans;
    }
}
