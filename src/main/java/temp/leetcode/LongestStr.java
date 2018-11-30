package temp.leetcode;

public class LongestStr {

    public int lengthOfLongestSubstring(String s) {
        //将字符串转换成字符数组
        int max = 0;
        boolean flag = true;

        String temp = "";

        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length()-i;j++){
                int k=j+i+1;
                String sub = s.substring(j,k);
                char[] ssub = sub.toCharArray();

                for(int n=0;n<ssub.length;n++){
                    flag = true;
                    int index = sub.indexOf(ssub[n]);
                    int lastIndex = sub.lastIndexOf(ssub[n]);

                    //存在重复
                    if(index!=lastIndex){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    max = sub.length();
                    flag = true;
                }

            }

        }

        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        LongestStr ls = new LongestStr();
        //ls.lengthOfLongestSubstring("abcabcbb");

//        System.out.println("hello".indexOf('l'));
       System.out.println("hello".lastIndexOf('o',3));
    }
}
