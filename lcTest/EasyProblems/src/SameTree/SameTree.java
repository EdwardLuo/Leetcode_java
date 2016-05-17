package SameTree;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q){
		if(p==null && q==null)
			return true;
		if((p==null && q!=null) || (p!=null && q==null))
			return false;
		if(!compareNode(p,q))
			return false;
		if(!isSameTree(p.left,q.left))
			return false;
		if(!isSameTree(p.right,q.right))
			return false;
		
		return true;
	}
	
	public boolean compareNode(TreeNode pCurrentNode, TreeNode qCurrentNode){
		if(pCurrentNode == null && qCurrentNode == null)
			return true;
		if(pCurrentNode.val == qCurrentNode.val)
			return true;
		return false;
	}
	
	/*
	public TreeNode nextLeftNode(TreeNode n){
		return n.left;
	}
	
	public TreeNode nextRightNode(TreeNode n){
		return n.right;
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SameTree test = new SameTree();
		TreeNode t1 = new TreeNode(0);
		TreeNode t2 = new TreeNode(1);
		
		System.out.println(test.isSameTree(t1,t2));
	}

}
