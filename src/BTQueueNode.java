// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman
//sourced from prof Suleman for purposes of assignment 1 of BST implementation, it was allowed to use his sample code
public class BTQueueNode<dataType>
{
   BinaryTreeNode<dataType> node;
   BTQueueNode<dataType> next;
   
   public BTQueueNode ( BinaryTreeNode<dataType> n, BTQueueNode<dataType> nxt )
   {
      node = n;
      next = nxt;
   }
}
