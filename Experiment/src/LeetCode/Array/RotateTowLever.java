package LeetCode.Array;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-15 11:45
 **/
public class RotateTowLever {
    //先上下翻转，然后按照对角线翻转
    public void rotate(int[][] matrix) {
        if(matrix.length == 0)
            return;
        UpDownReversal(matrix);
        diagonalReversal(matrix);
    }

    public void UpDownReversal(int[][] matrix){
        /**
        * @Description: 上下对称翻转
        * @Param: [matrix] 二位整形数组
        * @return: void
        * @Author: Huabuxiu
        * @Date: 2018/11/15
        */
       for (int i =0;i<matrix.length/2;i++)
       {
           for (int j=0;j<matrix.length;j++)
           {
               matrix[i][j] += matrix[matrix.length-1-i][j];
               matrix[matrix.length-1-i][j] = matrix[i][j] - matrix[matrix.length-1-i][j];
               matrix[i][j] = matrix[i][j] - matrix[matrix.length-1-i][j];

//               nums[s] +=nums[e];
//               nums[e] = nums[s]-nums[e];
//               nums[s] = nums[s] -nums[e];
           }
       }
    }

    public void diagonalReversal(int[][] matrix){
    /**
    * @Description: 对角线翻转
    * @Param: [matrix]
    * @return: void
    * @Author: Huabuxiu
    * @Date: 2018/11/15
    */
        for (int i= 0;i<matrix.length;i++)
        {
            for (int j=i+1;j<matrix.length;j++)
            {
                matrix[i][j] += matrix[j][i];
                matrix[j][i] = matrix[i][j] - matrix[j][i];
                matrix[i][j] = matrix[i][j] - matrix[j][i];
            }

        }
    }
}
