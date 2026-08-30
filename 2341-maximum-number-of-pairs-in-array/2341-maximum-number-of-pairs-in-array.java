class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int pairs=0;
        int leftovers=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int count:map.values()){
            pairs+=count/2;
            leftovers+=count%2;
        }
        return new int[]{pairs,leftovers};
    }
}