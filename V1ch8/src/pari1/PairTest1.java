package pari1;

import java.nio.file.Paths;

public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Marry","had","a","little","lamb"};
        pair<String> nm = ArrayAlg.minmax(words);
        System.out.println("min= "+nm.getFirst());
        System.out.println("max= "+nm.getSecond());
    }

    static class ArrayAlg
    {

        public static pair<String> minmax(String[] a)
        {
            if (a == null || a.length == 0)
                return null;
            String min = a[0];
            String max = a[0];
            for (int i =1;i < a.length;i++)
            {
                if (min.compareTo(a[i])>0) min = a[i];
                if (max.compareTo(a[i])<0) max = a[i];
            }
            return new pair<>(min,max);
        }
    }

}
