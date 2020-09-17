package com.BST;

public class TreeNodeIteration extends TreeNode{

    public TreeNodeIteration(int data){
        super(data);
    }

    public void insert(int data){
        TreeNode node = new TreeNodeIteration(data);
        TreeNode current = this;
        while(true){
            if(data == current.data) return;

            if(current.data > data){
                if(current.left == null){
                    current.left = node;
                    return;
                }
                current = current.left;
                continue;
            } else {
                if(current.right == null){
                    current.right = node;
                    return;
                }
                current = current.right;
            }
        }
    }

    public TreeNode get(int value){
        TreeNode current = this;
        while(true){
            if(current == null) return null;
            if(current.data == value){
                return current;
            }
            if(current.data > value){
                current = current.left;
            } else {
                current = current.right;
            }
        }
    }

    public int min(){
        TreeNode current = this;
        int min = this.data;
        while (current != null){
            min = current.data;
            current = current.left;
        }
        return min;
    }

    public int max(){
        TreeNode current = this;
        int max = this.data;
        while (current != null){
            max = current.data;
            current = current.right;
        }
        return max;
    }

    public String toString(){
        return "Data: " + this.data;
    }

}
