class Solution {
    private int maxLength = 0;

    public int longestZigZag(TreeNode root) {
        dfs(root, 0, 0);
        return maxLength;
    }

    private void dfs(TreeNode node, int left, int right) {
        if (node == null) {
            return;
        }

        maxLength = Math.max(maxLength, Math.max(left, right));

        dfs(node.left, right + 1, 0);
        dfs(node.right, 0, left + 1);
    }
}
