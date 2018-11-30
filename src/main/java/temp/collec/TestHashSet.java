package temp.collec;

import java.util.HashSet;
import java.util.Random;

/**
 * @author Administrator
 */
public class TestHashSet {


    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet();
        Random random = new Random();
        for (int i=0;i<10;i++){
           while(!hashSet.add(random.nextInt(10)));
        }
        System.out.println(hashSet);
    }
}
