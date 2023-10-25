class Solution {
    public int kthGrammar(int n, int k) {
        return depthFirstSearch(n, k, 0);
    }
    private int depthFirstSearch(int n, int k, int rootVal){
        if (n == 1)
            return rootVal;
        int totalNodes =(int)Math.pow(2, n-1);
        if (k > totalNodes /2){
            int nextRootVal=(rootVal == 0)?1:0;
            return depthFirstSearch(n-1, k-(totalNodes /2), nextRootVal);
        }else{
            int nextRootVal = (rootVal ==0)?0:1;
            return depthFirstSearch(n-1, k, nextRootVal);
        }
    }
}