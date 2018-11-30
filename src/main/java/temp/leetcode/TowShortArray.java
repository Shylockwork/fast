package temp.leetcode;

public class TowShortArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //使用插入排序合并两个有序数组
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len3 = len1+len2;
        int[] nums3 = new int[len3];

        int i = 0;
        int j = 0;
        int p = 0;
       //使用归并排序
                while(i<len1 && j<len2){

                    if(nums1[i]<nums2[j]){
                        nums3[p++] = nums1[i++];
                    }else{
                        nums3[p++] = nums2[j++];
            }
        }
        while(i<len1){
            nums3[p++] = nums1[i++];
        }
        while(j<len2){
            nums3[p++] = nums2[j++];
        }





        for(int k=0;k<len3;k++){
            System.out.println(nums3[k]);
        }

        return 0;
}

    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{0,2,4};
        TowShortArray ts = new TowShortArray();
        ts.findMedianSortedArrays(nums1,nums2);

        System.out.println();
    }


}
