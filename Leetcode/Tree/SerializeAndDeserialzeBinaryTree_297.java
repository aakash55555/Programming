package leetcode.Tree;

public class SerializeAndDeserialzeBinaryTree_297 {
    private StringBuilder preOrder(TreeNode root, StringBuilder str){
        if(root == null){
            return str.append("null,");
        }
        str.append(root.val).append(",");
        preOrder(root.left, str);
        preOrder(root.right, str);
        return str;
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        return preOrder(root, str).toString();
    }
        int current = 0;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] value = data.split(",");
        return convert(value);
    }
    private TreeNode convert(String[] str){
         if(str[current].equals("null")){
             current++;         
             return null; 
          }
        
         TreeNode root = new TreeNode(Integer.parseInt(str[current]));
         current++;
         root.left = convert(str);
         root.right = convert(str);
         return root;                      
    }
}
