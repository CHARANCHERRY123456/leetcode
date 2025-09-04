// its not a correct code just template

class Solution {
    public ArrayList<Integer> union(int[] nums1 , int[] nums2) {
        int n = nums1.length , m = nums2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
          if(nums1[i] < nums2[j] && (ans.isEmpty() || ans.get(ans.size()-1) != nums1[i]) ans.add(nums1[i]);
          if(nums1[i] >= nums2[j] && (ans.isEmpty() || ans.get(ans.size()-1) != nums2[j]) ans.add(nums2[j]);
          i += nums1[i] < nums2[j];
          j += nums1[i] >= nums2[j];
        }
        while(i<n) if(ans.isEmpty() || ans.get(ans.size()-1) != nums1[i]) ans.add(nums1[i]);
        while(j<m) if(ans.isEmpty() || ans.get(ans.size()-1) != nums2[j]) ans.add(nums2[j]);
        return ans;
    }
}
