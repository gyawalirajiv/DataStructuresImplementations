package com.BST;

public class TreeNodeRecursive extends TreeNode {

    public TreeNodeRecursive(int data) {
        super(data);
    }

    @Override
    public void insert(int data) {
        if(this == null) return;
        if(data == this.data) return;

        if(data < this.data){
            if (this.left == null) {
                this.left = new TreeNodeRecursive(data);
                return;
            }
            this.left.insert(data);
        } else {
            if(this.right == null){
                this.right = new TreeNodeRecursive(data);
                return;
            }
            this.right.insert(data);
        }
    }

    @Override
    public TreeNode get(int data) {
        if(this == null) return null;
        if(this.data == data) return this;

        if(this.data > data && this.left != null){
            return this.left.get(data);
        } else if(this.data < data && this.right != null){
            return this.right.get(data);
        }
        return null;
    }

    @Override
    public int min() {
        if(this.left == null) return this.data;
        return this.left.min();
    }

    @Override
    public int max() {
        if(this.right == null) return this.data;
        return this.right.max();
    }
}
