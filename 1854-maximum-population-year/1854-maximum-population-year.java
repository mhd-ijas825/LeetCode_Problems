class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] popu=new int[101];
        for(int[] person:logs){
            int birth=person[0]-1950;
            int death=person[1]-1950;
            popu[birth]++;
            popu[death]--;
        }
        int max=0;
        int current=0;
        int early=0;
        for(int i=0;i<101;i++){
            current=current+popu[i];
            if(current>max){
                max=current;
                early=1950+i;
            }
        }
        return early;
    }
}