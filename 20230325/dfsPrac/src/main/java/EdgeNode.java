class Node{
    protected final int data;
    protected final Node rt;
    protected final Node lt;

    public Node(int data, Node lt, Node rt) {
        this.data = data;
        this.rt = rt;
        this.lt = lt;
    }
}

public class EdgeNode {
    public static void main(String[] args) {
        EdgeNode tree = new EdgeNode();

        Node node5 = new Node(5, null, null);
        Node node4 = new Node(4, null, null);
        Node node3 = new Node(3, null, null);
        Node node2 = new Node(2, node4, node5);
        Node root = new Node(1, node2, node3);

        int count = 0;
        System.out.println(tree.dfs(root, count));
    }

    public int dfs(Node node, int count) {
        if (node.lt == null) {
            return count;
        }

        return Math.min(dfs(node.lt, count + 1), dfs(node.rt, count + 1));
    }

//    public void dfs(Node node, int count) {
//        if (node.lt == null) {
//            System.out.println(count);
//            return;
//        }
//
//        count += 1;
//        dfs(node.lt, count);
//        dfs(node.rt, count);
//    }
}
