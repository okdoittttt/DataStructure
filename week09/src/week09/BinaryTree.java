package week09;

public class BinaryTree {
	private TreeNode root = new TreeNode();
	
	public TreeNode insertkey(TreeNode root, char x) {
		TreeNode p = root;
		TreeNode newNode = new TreeNode();
		
		newNode.data = x;
		newNode.left = null;
		newNode.right = null;
		
		if(p == null) {
			return newNode;
		} else if(newNode.data < p.data) {
			p.left = insertkey(p.left, x);
			return p;
		} else if(newNode.data > p.data) {
			p.right = insertkey(p.right, x);
			return p;
		} else
			return p;
	}
	
	public void insertBLT(char x) {
		root = insertkey(root, x);
	}
	
	public TreeNode searchBLT(char x) {
		TreeNode p = root;
		while(p != null) {
			if(x < p.data) p = p.left;
			else if(x > p.data) p = p.right;
			else return p;
		}
		return p;
	}
	
	public void inorder() {
		
	}

}
