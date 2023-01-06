import java.util.*;

public class validSquare{
//valid square
 public boolean func(int[] p1, int[] p2, int[] p3, int[] p4) {
    HashSet<Integer> set=new HashSet<>();//set doesnt let duplicates enter
        set.add(distance(p1,p2));
        set.add(distance(p1,p3));
        set.add(distance(p1,p4));
        set.add(distance(p2,p3));
        set.add(distance(p2,p4));
        set.add(distance(p3,p4));
        if(set.size()==2 && (!set.contains(0))){
            return true;//one value for side of square and one value for diagonal of square
        }
        return false;
    }
    public int distance(int[] a,int[] b){
        int x1=a[0];
        int x2=b[0];
        int x3=a[1];
        int x4=b[1];
        int distance= (int) (Math.pow(x2-x1,2)+Math.pow(x3-x4,2));
        return distance;
    }
}