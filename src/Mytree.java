import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Mytree {
    Node root;
    public Mytree(){
        root = null;
    }
    public void insert(int value){
        Node n1 = new Node(value);

        if(root == null){
            root = n1;
            return;

        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node current = q.remove();
            if(current.left == null){
                current.left = n1;
                break;
            }
            else if(current.right == null){
                current.right = n1;
                break;
            }
            else{
                q.add(current.left);
                q.add(current.right);
            }
        }
    }
    public void traversal() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        if (root == null) {
            System.out.println("Empty");
        } else {
            while (!q.isEmpty()) {
                Node currentNode = q.remove();
                System.out.println(currentNode.data);
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }

        }
    }
    public void destroy(){
        root = null;
    }
}
