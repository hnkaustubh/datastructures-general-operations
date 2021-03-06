package org.launchcode;
import java.util.List;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BinarySearchTree {
    Node root;

    public Node getNode(int data){
        Node node = new Node();
        node.data = data;
        return node;
    }

    public Node insert(Node root, int data){
        if(root == null)
            root = getNode(data);
        else if(data <= root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);
        return root;
    }

    public Node delete(Node root, int data){
        if(root == null)
            return null;
        else if(data < root.data)
            delete(root.left, data);
        else if(data > root.data)
            delete(root.right, data);
        else{
            if(root.left == null && root.right == null)
                root = null;
            else if(root.left == null)
                root = root.right;
            else if(root.right == null)
                root = root.left;
            else{
                Node temp = minimumNode(root.right);
                root.data = temp.data;
                delete(root.right, temp.data);
            }
        }
        return root;
    }

    public Node minimumNode(Node root){
        Node current = root;
        if(current == null)
             return null;
        else if(current.left == null && current.right == null)
            return current;
        else if(current.left == null)
            return current;

        while(current != null)
            current = current.left;
        return current;
    }

    public void inOrderRecursive(Node root){
        if(root == null)
            return;
        inOrderRecursive(root.left);
        System.out.print(root.data + " ");
        inOrderRecursive(root.right);
    }

    public void inOrderIterative(Node root){
        Stack<Node> stack = new Stack<Node>();

        if(root == null)
            return;
        while(true){
            if(root != null){
                stack.push(root);
                root = root.left;
            }else{
                if(stack.isEmpty())
                    break;
                root = stack.pop();
                System.out.print(root.data + " ");
                root = root.right;
            }
        }
    }

    public void preOrderRecursive(Node root){
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

   public void preOrderIterative(Node root){
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);

        while(!stack.isEmpty()){
            root = stack.pop();
            System.out.print(root.data + " ");

            if(root.right != null)
                stack.push(root.right);

            if(root.left != null)
                stack.push(root.left);
        }
   }

    public void postOrderRecursive(Node root){
        if(root == null)
            return;
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.data + " ");
    }

    public void postOrderIterative(Node root){
        Stack<Node> stack1 = new Stack<Node>();
        Stack<Node> stack2 = new Stack<Node>();
        stack1.push(root);

        while(!stack1.isEmpty()){
            root = stack1.pop();
            stack2.push(root);

            if(root.left != null)
                stack1.push(root.left);

            if(root.right != null)
                stack1.push(root.right);
        }
        while(!stack2.isEmpty()){
            root = stack2.pop();
            System.out.print(root.data + " ");
        }
    }

    public void levelOrderPrint(Node root){
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while(!q.isEmpty()){
            root = q.poll();
            System.out.print(root.data + " ");

            if(root.left != null)
                q.add(root.left);

            if(root.right != null)
                q.add(root.right);
        }
    }

    public void levelByLevelPrint(Node root){
        Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        q1.add(root);

        while(!q1.isEmpty() || !q2.isEmpty()){
            while(!q1.isEmpty()){
                root = q1.poll();
                System.out.print(root.data + " ");

                if(root.left != null)
                    q2.add(root.left);

                if(root.right != null)
                    q2.add(root.right);
            }
            System.out.println();
            while(!q2.isEmpty()){
                root = q2.poll();
                System.out.print(root.data + " ");

                if(root.left != null)
                    q1.add(root.left);

                if(root.right != null)
                    q1.add(root.right);
            }
            System.out.println();
        }
    }

    public Node findNode(Node root, int data){
        if(root == null)
            return null;
        else if(root.data == data)
            return root;

        Node current = root;
        while(current != null && current.data != data) {
            if (data <= current.data)
                current = current.left;
            else
                current = current.right;
        }
        return current;
    }

    public Node inOrderSuccessor(Node root, int data){
        if(root == null)
            return null;

        Node current = findNode(root, data);

        if(current.right != null)
            return minimumNode(current.right);
        Node successor = null;
        Node ancestor = root;

        while(current != ancestor){
            if(current.data < ancestor.data){
                successor = ancestor;
                ancestor = ancestor.left;
            }else
                ancestor = ancestor.right;
        }
        return successor;
    }

    public Node lowestCommonAncestor(Node root, int data1, int data2){
        if(root == null)
            return null;
        if(root.data > data1 && root.data > data2)
            return lowestCommonAncestor(root.left, data1, data2);
        else if(root.data < data1 && root.data < data2)
            return lowestCommonAncestor(root.right, data1, data2);
        return root;
    }

    public boolean isBST(Node root, int min, int max){
        if(root == null)
            return true;
        else if(root.data < min || root.data > max)
            return false;
        return isBST(root.left, min, root.data) || isBST(root.right, root.data, max);
    }

    public int maximum(int data1, int data2){
        if(data1 > data2)
            return data1;
         else
             return data2;
    }

    public int heightOfTree(Node root){
        if(root == null)
            return 0;
        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);
        return maximum(left,right) + 1;
    }

    public boolean isBalanced(Node root){
        if(root == null)
            return true;
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        if(Math.abs(leftHeight - rightHeight) <= 1)
            return true;
        return false;
    }

    Stack<Node> stack = new Stack<Node>();

    public void find_root_to_leaf_paths(Node root){
        if(root == null)
            return;

        stack.push(root);
        find_root_to_leaf_paths(root.left);
        if(root.left == null && root.right == null)
            print_stack();
        find_root_to_leaf_paths(root.right);
        stack.pop();
    }

    public void print_stack(){

    }

    public boolean root_to_leaf_path_sum(Node root, int sum, List<Integer> result){
        if(root == null)
            return false;
        if(root.left == null && root.right == null){
            if(root.data == sum){
                result.add(root.data);
                return true;
            }else
                return false;
        }
        if(root_to_leaf_path_sum(root.left, sum-root.data, result)){
            result.add(root.data);
            return true;
        }
        if(root_to_leaf_path_sum(root.right, sum-root.data, result)){
            result.add(root.data);
            return true;
        }
        return false;
    }

    public Node concatenate(Node a, Node b){
        if(a == null)
            return b;
        if(b == null)
            return a;

        Node aEnd = a.left;
        Node bEnd = b.right;

        a.left = bEnd;
        bEnd.right = a;
        aEnd.right = b;
        b.left = aEnd;
        return a;
    }

    public Node treeToList(Node n){
        if(n == null)
            return n;
        Node leftList = treeToList(n.left);
        Node rightList = treeToList(n.right);

        n.left = n;
        n.right = n;

        n = concatenate(leftList, n);
        n = concatenate(n, rightList);

        return n;
    }

    public boolean isIdentical(Node root1, Node root2){
        if(root1 == null && root2 == null)
            return true;
        else if(root1 == null && root2 != null)
            return false;
        else if(root1 != null && root2 == null)
            return false;
        if(root1.data == root2.data)
            return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
        return false;
    }

    public boolean isSubtree(Node root1, Node root2){
        if(root2 == null)
            return true;
        if(root1 == null)
            return false;
        if(isIdentical(root1, root2))
            return true;
        return isSubtree(root1.left, root2) || isSubtree(root1.right, root2);
    }

    public Node mirror(Node root){
        if(root == null)
            return null;

        Node left = mirror(root.left);
        Node right = mirror(root.right);

        left.right = right;
        right.left = left;

        return root;
    }

    Node head;
    static Node prev = null;

    public Node TreeToDoublyList(Node root){
        if(root == null)
            return null;

        TreeToDoublyList(root.left);

        if(prev == null)
            head = root;
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;

        TreeToDoublyList(root.right);

        return root;
    }

    public int lengthUtil(Node root, int min, int max, int current) {
        if(root == null)
            return 0;

        lengthUtil(root.left, min, max, current-1);

        if(min > current)
            min = current;

        if(max < current)
            max = current;

        lengthUtil(root.right, min, max, current+1);

        return Math.abs(min) + max;
    }

    public int getVerticalWidth(Node root) {
        int min=0, max=0;

        int length = lengthUtil(root, min, max, 0);
        return length + 1;
    }
}
