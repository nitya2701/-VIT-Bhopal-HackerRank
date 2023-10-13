class Solution {
    public int lengthOfLongestSubstring(String s) {

        int res = 0;

        for(int i = 0; i<s.length(); i++)
        {
            boolean[] visited = new boolean[256];
            for(int j =i; j<s.length(); j++)
            {
                if (visited[s.charAt(j)] == true)
                    break;
                else
                {
                    res = Math.max(res, j - i + 1);
                    visited[s.charAt(j)] = true;
                }
            }
            visited[s.charAt(i)] = false;
        }
        return res;
    }
}