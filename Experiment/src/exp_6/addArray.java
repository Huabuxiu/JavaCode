package exp_6;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-12-12 08:47
 **/
public class addArray {
    public int[] merge(int[] a, int[] b){
        int lenth = a.length+b.length-1;
        int[] ans = new int[lenth];
        int i = 0,j = 0,k = 0;
        while (i<a.length-1 && j<b.length-1)
        {
            if (a[i] <= b[j])
            {
                ans[k++] = a[i++];
            }else {
                ans[k++] = b[j++];
            }
        }
        if (i>a.length)
        {
            for (;j<b.length;j++)
                ans[k++] = b[j];
        }else{
            for (;i<a.length;i++)
                ans[k++]=a[i];
        }
        return ans;
    }
}
