class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%k==0){
                set.add(nums[i]/k);        
            }else{
                continue;
            }

        }
        int j=1;
        while(set.contains(j)){
            j++;
        }
        return k*j;
    }
}