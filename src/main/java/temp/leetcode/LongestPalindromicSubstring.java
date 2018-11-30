package temp.leetcode;

/**
 * @author Administrator
 */
public class LongestPalindromicSubstring {
    private int sh=0,sl=0,max=0;
    public String longestPalindrome(String s) {
        boolean flag;
        if(s.equals(""))
            return "";
        int length = s.length();
        for(int i=0;i<length;i++){
            int j = s.lastIndexOf(s.charAt(i));
            while(j!=i){
                flag = true;
                int begin = i;
                int end = j;
                System.out.println("begin:"+begin+" end:"+end);
                while(begin<end){
                    if(s.charAt(begin++)!=s.charAt(end--)){
                        flag = false;
                        break;
                    }
                }
                System.out.println("i:"+i+" j:"+j+" max:"+max+" "+flag);
                if(flag) {
                    if ((j - i) > max) {
                        sh = i;
                        sl = j;
                        max = j - i;
                    }
                    break;
                }else{
                    j = s.lastIndexOf(s.charAt(i),j-1);
                }
            }
        }
        System.out.println("sh:"+sh+" sl:"+sl);
        return s.substring(sh,sl+1);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindrome("aaabaaaa"));
    }
}
