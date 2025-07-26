class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
         if(isEqual(mat,target)){
            return true;
         }
         mat=rotate90(mat);
        }
        return false;
    }
    public int [][]rotate90(int mat[][]){
     int n=mat.length;
     int rotate[][]=new int[n][n];
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
             rotate[j][n-1-i]=mat[i][j];
        }
     }
     return rotate;
    }
    public Boolean isEqual(int [][]mat1,int [][]mat2){
        int n=mat1.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat1[i][j]!=mat2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}