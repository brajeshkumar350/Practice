package DS.Tree;


import java.util.Map;
import java.util.TreeMap;

public class Tree {
    Node root;
    Tree(int key)
    {
        root=new Node(key);
    }
   Tree()
    {
        root=null;
    }
    public  static void traver(Node node)
    {
        if(node==null)return;
        System.out.print(node.key+" , ");
        traver(node.left);
        traver(node.right);
    }
    public  static void lefttraver(Node node)
    {
        if(node==null)return;

        traver(node.left);
        System.out.print(node.key+" , ");
        traver(node.right);
    }
    public  static void righttraver(Node node)
    {
        if(node==null)return;


        traver(node.right);
        System.out.print(node.key+" , ");
        traver(node.left);
    }
    public  static void reversetraver(Node node)
    {
        if(node==null)return;
        reversetraver(node.left);
        reversetraver(node.right);
        System.out.print(node.key+" , ");
    }

    public  static Map<Integer, Node> topView(Node node, Map<Integer,Node> map, int step)
    {
        if(node==null)return null;
        map.putIfAbsent(step,node);
        topView(node.left,map,step-1);
        topView(node.right,map,step+1);
        return map;
    }
    public  static Map<Integer, Node> bottomView(Node node, Map<Integer,Node> map, int step)
    {
        if(node==null)return null;
        map.put(step,node);
        bottomView(node.left,map,step-1);
        bottomView(node.right,map,step+1);
        return map;
    }

    static boolean isBSTUtil(Node node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.key < min || node.key > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.key-1) &&
                isBSTUtil(node.right, node.key+1, max));
    }
    static int max_level = 0;
    public static void  leftView(Node node, int level)
    {
        // Base Case
        if (node == null)
            return;

        // If this is the first node of its level
        if (max_level < level) {
            System.out.print(" " + node.key);
            max_level = level;
        }

        // Recur for left and right subtrees

        leftView(node.left, level + 1);
        leftView(node.right, level + 1);

    }

    public static void  rightView(Node node, int level)
    {
        // Base Case
        if (node == null)
            return;

        // If this is the first node of its level
        if (max_level < level) {
            System.out.print(" " + node.key);
            max_level = level;
        }

        // Recur for left and right subtrees
        rightView(node.right, level + 1);
        rightView(node.left, level + 1);


    }

    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);
        //reversetraver(tree.root);
        Map<Integer,Node> map=new TreeMap<>();
       /* bottomView(tree.root, map,0);
        map.entrySet().forEach(entry->{

            System.out.println(entry.getKey()+"---"+entry.getValue().key);
        });*/
        rightView(tree.root, 1);



    }
}
