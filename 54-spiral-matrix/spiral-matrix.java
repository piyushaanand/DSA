class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // List<Integer> res = new ArrayList<>();
        // int rowBegin = 0;
        // int colBegin = 0;
        // int rowEnd = matrix.length-1;
        // int colEnd = matrix[0].length-1;
        // while(rowBegin <= rowEnd && colBegin <= colEnd){
        //     for(int i = colBegin ; i <= colEnd ; i++){
        //         res.add(matrix[rowBegin][i]);
        //     }
        //     rowBegin++;
        //     for(int i = rowBegin ; i <= rowEnd ; i++){
        //         res.add(matrix[i][colEnd]);
        //     }
        //     colEnd--;
        //     if(rowBegin <= rowEnd){
        //         for(int i = colEnd ; i >= colBegin ; i--){
        //             res.add(matrix[rowEnd][i]);
        //         }
        //     }
        //     rowEnd--;
        //     if(colBegin <= colEnd){
        //         for(int i = rowEnd ; i >= rowBegin ; i--){
        //             res.add(matrix[i][colBegin]);
        //         }
        //     }
        //     colBegin++;
        // }
        // return res;


        List<Integer> res = new ArrayList<>();
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;
        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int i = colStart ; i <= colEnd ; i++){
                res.add(matrix[rowStart][i]);
            }
            rowStart++;

            for(int i = rowStart ; i <= rowEnd ; i++){
                res.add(matrix[i][colEnd]);
            }
            colEnd--;

            if(rowStart <= rowEnd){
                for(int i = colEnd ; i >= colStart ;  i--){
                    res.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            if(colStart <= colEnd){
                for(int i = rowEnd ; i >= rowStart ; i--){
                    res.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }
        return res;

    }
}