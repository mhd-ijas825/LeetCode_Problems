class Solution {
    public int[][] generateMatrix(int n) {
        int [][] arr=new int[n][n];
        int result=0, a=n-1;
        int clas=0, b=n-1;
        int x=1;

      while(clas<=b && result<=a){
            for(int i=clas;i<=b;i++,x++){
                arr[result][i]=x;
            }
            result++;

            for(int i=result;i<=a;i++,x++){
            arr[i][b]=x;
            }
            b--;

            if(result<=a){
                for(int i=b;i>=clas;i--,x++){
                    arr[a][i]=x;
                }
                a--;

                if(clas<=b){
                    for(int i=a;i>=result;i--,x++){
                        arr[i][clas]=x;
                    }
                    clas++;
                }
            }
        }
        return arr;
    }
}