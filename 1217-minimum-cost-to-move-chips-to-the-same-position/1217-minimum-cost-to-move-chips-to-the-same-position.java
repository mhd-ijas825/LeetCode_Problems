class Solution {
    public int minCostToMoveChips(int[] position) {
        int even=0;
        int odd=0;
        // int[] posi=new int[position.length];
        for(int i=0 ; i<position.length; i++){
            int posi=position[i];
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}