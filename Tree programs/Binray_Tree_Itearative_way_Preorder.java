import java.util.Stack;
class Binray_Tree_Itearative_way_Preorder
{
	class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data)
		{
			this.data=data;
		}
	}
			TreeNode root;

	public void CreateBinaryTree()
	{

		TreeNode first=new TreeNode(1);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(4);
		TreeNode fifth=new TreeNode(5);
		TreeNode sixth=new TreeNode(6);
		TreeNode seventh=new TreeNode(7);

		root=first;
		first.left=second;
		first.right=third;

		second.left=fourth;
		second.right=fifth;

		third.left=sixth;
		third.right=seventh;



	}
	public void preOrder(TreeNode root)
	{
		if(root==null)
        {
            return;
        }
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode temp=stack.pop();
            System.out.print(temp.data+" ");
            if (temp.right!=null){
                stack.push(temp.right);
            }
            if (temp.left!=null){
                stack.push(temp.left);
            }

        }
		
	}
	public static void main(String[] args) {
		Binray_Tree_Itearative_way_Preorder obj=new Binray_Tree_Itearative_way_Preorder();
		obj.CreateBinaryTree();
		obj.preOrder(obj.root);


	}

}