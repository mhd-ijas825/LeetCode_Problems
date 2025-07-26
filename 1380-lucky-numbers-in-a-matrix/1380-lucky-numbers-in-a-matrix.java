class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> arr=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0 ; i<row ; i++){
            int minval=matrix[i][0];
            int colmax = 0;
        
        for(int j=1 ; j<col ; j++){
            if(matrix[i][j] < minval){
                minval=matrix[i][j];
                colmax=j;
            }
        }
        boolean value=true;
        for(int k=0 ; k<row ; k++){
            if(matrix[k][colmax]>minval){
                value=false;
                break;
            }
        }
        if(value){
            arr.add(minval);
        }
        }
        return arr;
    }
}