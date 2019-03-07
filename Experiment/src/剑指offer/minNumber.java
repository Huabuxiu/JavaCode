package 剑指offer;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2019-03-07 10:45
 **/

//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
//   寻找一个部分有序的数组的最小值，采用二分查找法
public class minNumber {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0)
        {
            return 0;
        }
        int left = 0;
        int right = array.length-1;
        int midle = -1;
        while (array[left] >= array[right])
        {
            if (right- left ==1)
            {
                midle = right;
                break;
            }
            midle = left + (right-left)/2;      //二分点，左指针加区间长度的一半
            if(array[left] <= array[midle] )
            {
                left = midle;
            }
            if (array[right] >= array[midle])
            {
                right = midle;
            }
        }
        return array[midle];
    }
}
