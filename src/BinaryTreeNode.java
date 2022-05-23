// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman
//sourced from prof Suleman's sample code for purposes of assignment 1, it is allowed
public class BinaryTreeNode<dataType>
{
   dataType data;
   BinaryTreeNode<dataType> left;
   BinaryTreeNode<dataType> right;
   
   public BinaryTreeNode ( dataType d, BinaryTreeNode<dataType> l, BinaryTreeNode<dataType> r )
   {
      data = d;
      left = l;
      right = r;
   }
   
   BinaryTreeNode<dataType> getLeft () { return left; }
   BinaryTreeNode<dataType> getRight () { return right; }
}
