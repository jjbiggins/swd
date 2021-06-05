public class Tree<T extends Comparable<T>> {

    private TreeNode<T> root;
    private int totalSpaces;
    private String tree;

    public Tree() {
        root = null;
        totalSpaces = 0;
        tree = "";
    }


    public void insertNode(T insertValue) {
        if (root == null) {
            root = new TreeNode<T>(insertValue);
        }
        else
            root.insert(insertValue);
    }

    public void outputTree(){
        outputTreeHelper(root, totalSpaces);
    }

    private void outputTreeHelper(TreeNode<T> node, int totalSpaces){


        if(node == null){
            return;
        }

        outputTreeHelper(node.rightNode, totalSpaces += 10);

        totalSpaces = totalSpaces - 10;
        for(int i = 0; i < totalSpaces; i++){
            System.out.print("  ");
            tree += " ";
        }
        tree = tree + node.data + "\n";
        System.out.println(node.data);

        outputTreeHelper(node.leftNode, totalSpaces += 10);
    }

    public String getTree() {
        return tree;
    }
}
