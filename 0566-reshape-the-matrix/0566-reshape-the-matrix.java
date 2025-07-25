class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int [][] arr=new int[r][c];
        if((mat.length * mat[0].length)== r*c){
            for(int i=0;i<(mat.length * mat[0].length);i++){
                arr[i/c][i%c]=mat[i/mat[0].length][i%mat[0].length];
            }
        }
        else{
            arr=mat;
        }
        return arr;
    }
}