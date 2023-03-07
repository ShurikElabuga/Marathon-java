package day18;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        Node root = new Node(20);
        for (int number : numbers) {
            addNode(number, root);
        }
        dfs(root);

    }
    public static void addNode(int addValue, Node root) {
        Node newNode = new Node(addValue);
        if (root == null) {
            System.out.println("Значение корневого узла не задано.");
        }else
        {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (addValue < current.getValue()) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }
    private static void dfs(Node node) {
        if (node == null) {
            return;
        }
        dfs(node.getLeft());
        System.out.print(node.getValue() + " ");
        dfs(node.getRight());
    }
}