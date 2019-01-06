package org.launchcode;

public class Main {

    public static void main(String[] args) {
	    BinarySearchTree bst = new BinarySearchTree();

	    bst.root = bst.insert(bst.root, 10);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 0);
        bst.root = bst.insert(bst.root, -20);
        bst.root = bst.insert(bst.root, -10);
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, -30);
        bst.root = bst.insert(bst.root, 40);
        bst.root = bst.insert(bst.root, -40);
        bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 60);
//        bst.root = bst.insert(bst.root, 70);

        bst.inOrderRecursive(bst.root);
        System.out.println();
        bst.inOrderIterative(bst.root);
        System.out.println();
        bst.levelOrderPrint(bst.root);
        System.out.println();
        bst.levelByLevelPrint(bst.root);

        System.out.println(bst.inOrderSuccessor(bst.root,-40).data);

        System.out.println(bst.heightOfTree(bst.root));

        System.out.println(bst.isBalanced(bst.root));
    }
}
