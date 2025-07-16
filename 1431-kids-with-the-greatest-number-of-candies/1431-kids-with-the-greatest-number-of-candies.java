class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list= new ArrayList<Boolean>();
        for(int i=0 ; i<candies.length ; i++){
            int sum = candies[i]+extraCandies;
            Boolean bool=false;
            for(int j=0 ; j<candies.length ; j++){
                if(sum>=candies[j]){
                    bool=true;
                }
                else{
                    bool=false;
                    break;
                }
            }
            list.add(bool);
        }
        return list;
    }
}