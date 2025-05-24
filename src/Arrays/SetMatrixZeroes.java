package Arrays;

//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//You must do it in place.
//Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
//Output: [[1,0,1],[0,0,0],[1,0,1]]
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int arr[][] = {
                {1,1,1},
                {1,0,1},
                {1,1,1}};
        int r[] = new int[arr.length];
        int c[] = new int[arr[0].length];

        for(int i = 0;i<r.length;i++){
            for(int j = 0;j<c.length;j++){
                if(arr[i][j]==0){
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }
        for(int i = 0;i<r.length;i++){
            for(int j = 0;j<c.length;j++){
                if(r[i]==1 || c[j]==1){
                    arr[i][j]=0;
                }
            }
        }

        for(int i = 0;i<r.length;i++){
            for(int j = 0;j<c.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
