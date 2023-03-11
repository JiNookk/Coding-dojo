class Node{
    int data;
    Node rt, lt;

    public Node(int value) {
        this.data = value;
        rt = null;
        lt = null;
    }
}

public class DigitTree {
    Node root;

    public static void main(String[] args) {
        DigitTree tree = new DigitTree();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.dfs(tree.root);
    }

    private void dfs(Node node) {
        if (node == null) {
            return;
        }

        dfs(node.lt);
        dfs(node.rt);
        System.out.println(node.data);
    }
}
