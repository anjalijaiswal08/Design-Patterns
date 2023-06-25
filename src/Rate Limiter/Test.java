import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(){};
	TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class Test {

	public static void main(String[] args) {
		System.out.printf("Height %d", findHeight());

	}

	private static int findHeight() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(1);
		root.right = new TreeNode(1);
		Queue<TreeNode> q = new LinkedList<>();
		int height = 0;
		q.add(root);
		while(!q.isEmpty()) {
			height= height+1;
			int size = q.size();
			while(size > 0) {
				TreeNode node = q.poll();
				if(node.left != null)
					q.add(node.left);
				if(node.right != null)
					q.add(node.right);
				size = size-1;
			}
		}
		return height;
	}

}
/*
1- root, 2 -lC, 3 -RC
Queue - 1|
height = 1.
Queue: 2|3
height = 2
*/



