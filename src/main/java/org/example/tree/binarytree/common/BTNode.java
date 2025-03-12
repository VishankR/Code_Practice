package org.example.tree.binarytree.common;

public class BTNode {
    private int data;
    private BTNode leftNode;
    private BTNode rightNode;

    BTNode(int data){
        this.data = data;
    }

    public BTNode(){}

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BTNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BTNode leftNode) {
        this.leftNode = leftNode;
    }

    public BTNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BTNode rightNode) {
        this.rightNode = rightNode;
    }
}
