package org.example.tree.binarytree.creation;

import java.util.Scanner;
import org.example.tree.binarytree.common.BTNode;

public class CreateBTRecursion {

    static CreateBTRecursion CREATE_BT_RECURSION = new CreateBTRecursion();

    public static void main(String[] args) {
        CREATE_BT_RECURSION.CreateTree();
    }

    private BTNode CreateTree(){
        BTNode root = new BTNode();
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Value.");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root.setData(data);
        System.out.print(" Enter Left Child of " + data + "." );
        root.setLeftNode(CreateTree());
        System.out.print(" Enter Right Child of " + data + ".");
        root.setRightNode(CreateTree());
        return root;
    }
}
