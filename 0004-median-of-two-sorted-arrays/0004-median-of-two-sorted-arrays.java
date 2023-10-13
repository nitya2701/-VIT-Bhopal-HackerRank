class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n1 = nums1.length;
        int n2 = nums2.length;

        int merge[] = new int[n1+n2];

        int pos = 0;  
        for (int element : nums1)
        {  
            merge[pos] = element;  
            pos++;                
        }

        for (int element : nums2)
        {  
            merge[pos] = element;  
            pos++;                
        }

        Arrays.sort(merge);
        double c=0.0;
        int l = merge.length;

        if(l%2==1)
        {
            c= (double)merge[(l+1)/2-1];
        }
        else 
        {
            c = (double)(merge[l/2-1]+merge[l/2])/2;
        }

        return c;

    }
}