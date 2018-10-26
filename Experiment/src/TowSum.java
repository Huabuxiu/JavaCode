import java.util.HashMap;

public class TowSum {
    public static void main(String[] args) {
        int[] exm = new int[]{2, 7, 11, 15};
        int[] ans = new int[2];
        int target= 9;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i <exm.length;i++)
        {
            map.put(exm[i],i);
        }
        for (int i=0;i<exm.length; i++)
        {
           int tem = target-exm[i];
           if (map.containsKey(tem) && map.get(tem)!=i)
           {
               ans[0] = i;
               ans[1] = map.get(tem);
               break;
           }
        }
        System.out.println(ans[0]+" "+ans[1]);

    }
}

class foo{}

