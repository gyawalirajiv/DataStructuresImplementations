package com.BST;

public abstract class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data){
        this.data = data;
    }

    public void traverseInOrder(){
        if(left != null){
            left.traverseInOrder();
        }
        System.out.println(data);
        if(right != null){
            right.traverseInOrder();
        }
    }

    public void traversePreOrder(){
        System.out.println(this.data);
        if(this.left != null){
            this.left.traversePreOrder();
        }
        if(this.right != null){
            this.right.traversePreOrder();
        }
    }

    public void traversePostOrder(){
        if(this.left != null){
            this.left.traversePostOrder();
        }
        if(this.right != null){
            this.right.traversePostOrder();
        }
        System.out.println(this.data);
    }

    public TreeNode delete(TreeNode node, int data) {
        if(node == null) return node;

        if(data < node.data){
            node.left = this.delete(node.left, data);
        } else if(data > node.data){
            node.right = this.delete(node.right, data);
        } else {
            if(node.right == null){
                return node.left;
            } else if(node.left == null){
                return node.right;
            }
            node.data = node.right.min();
            node.right = delete(node.right, node.data);
        }
        return node;
    }

    public String toString(){
        return "Data: " + this.data;
    }

    public abstract void insert(int data);

    public abstract TreeNode get(int data);

    public abstract int min();

    public abstract int max();

}
