package BinaryTree;


import BinaryTree.BinaryTree;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class BinaryTreeApp {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode node;
        node = new TreeNode('D');
        tree.insert(node);
        
        node = new TreeNode('B');
        tree.insert(node);
        
        node = new TreeNode('A');
        tree.insert(node);
        
        node = new TreeNode('C');
        tree.insert(node);
        
        node = new TreeNode('F');
        tree.insert(node);
        
        node = new TreeNode('E');
        tree.insert(node);
        
        node = new TreeNode('G');
        tree.insert(node);
        
        System.out.print("Traversal dengan preorder : ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postorder : ");
        tree.postOrder();
        System.out.print("\nTraversal dengan inorder : ");
        tree.inOrder();
        System.out.println();
    }
    
}
