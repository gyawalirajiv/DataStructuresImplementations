package com.BST;

public class Tree {
    private TreeNode root;

    public void insert(int data){
        if(root == null){
//            root = new TreeNodeIteration(data);
            root = new TreeNodeRecursive(data);
            return;
        }
        root.insert(data);
    }

    public TreeNode get(int data){
        return root.get(data);
    }

    public int min(){
        if(root == null) return Integer.MIN_VALUE;
        return this.root.min();
    }

    public int max(){
        if(root == null) return Integer.MAX_VALUE;
        return this.root.max();
    }

    public void traverseInOrder(){
        if(root == null) return;
        root.traverseInOrder();
        System.out.println("================");
    }

    public void traversePreOrder(){
        System.out.println("================");
        if(root == null) return;
        root.traversePreOrder();
        System.out.println("================");
    }

    public void traversePostOrder(){
        System.out.println("================");
        if(root == null) return;
        root.traversePostOrder();
        System.out.println("================");
    }

    public TreeNode delete(int data){
        if(this.root == null) return null;
        return this.root.delete(root, data);
    }
}
