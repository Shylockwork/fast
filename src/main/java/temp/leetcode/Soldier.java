package temp.leetcode;

public class Soldier {

    public int move(int n,int m) {
        if(n==0 || m==0){
            return 0;
        }
        if(n==1 || m==1){
            return 1;
        }

        return move(n-1,m)+move(n,m-1);
    }


    public static void main(String[] args) {

        Soldier soldier = new Soldier();
        System.out.println(soldier.move(3,3));


    }
}
