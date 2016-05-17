package SerializeAndDeserializeBinaryTree;

import java.util.Stack;

public class Codec {	
	// Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	if(root == null)
    		return "[]";
    	
    	Stack<TreeNode> s = new Stack<TreeNode>();
    	String code = "[";
    	
    	//DFS
    	s.push(root);
    	while(!s.empty()){
    		TreeNode node = s.peek();
    		code += String.valueOf(node.val) + ",";
    		s.pop();
    		if(root.right != null)
    			s.push(root.right);
    		else
    			code += "null,";
    		
    		if(root.left != null)
    			s.push(root.left);
    		else
    			code += "null,";
    	}
    	code +="]";
    	
        return code;
    }
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]"))
        	return null;
        
        String[] sub = data.split("\\[|,|\\]");
        Stack<TreeNode> s = new Stack<TreeNode>();
        
        int index = 1;
        s.push(new TreeNode(Integer.parseInt(sub[index])));
        while(!s.empty()){
        	TreeNode node = s.peek();
        	if(node.left != null && node.right!= null){
        		if(sub[index+1].equals("null")){
        			node.left = null;
        		}
        		else{
        			node.left = new TreeNode(Integer.parseInt(sub[index+1]));
        			s.push(node.left);
        		}
        	}
        	
        	if(node.left == null && node.right != null){
        		if(sub[index+1].equals("null")){
        			node.right = null;
        			s.pop();
        		}
        		else{
        			node.right = new TreeNode(Integer.parseInt(sub[index+1]));
        			s.push(node.right);
        		}
        	}
        	
        	
        	
        	
        	index++;
        }
        
        
    	return null;
    }
    
    // Your Codec object will be instantiated and called as such:
    // Codec codec = new Codec();
    // codec.deserialize(codec.serialize(root));
    
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(0);
    	Codec codec = new Codec();
    	/*
    	String[] output = "[1,2,3]".split("\\[|,|\\]");
    	for(int i=0; i< output.length; i++)
    		System.out.println(output[i]);
    	*/
    	codec.deserialize(codec.serialize(root));
    	
    }
}
