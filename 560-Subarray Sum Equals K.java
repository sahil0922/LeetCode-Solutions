public int subarraySum(int[] nums, int k) {
        int count = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        int sum = 0;
        
        for(int val : nums){
            sum += val;
            
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            
            map.put(sum, map.getOrDefault(sum,0) + 1);
        }
        
        return count;
    }
