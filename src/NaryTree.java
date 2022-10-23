import java.util.ArrayList;
import java.util.List;

public class NaryTree {
   public static List<Integer> list = new ArrayList();

   public static void main(String[] args) {
      Node a = new Node(1);
      a.children.add(new Node(2));
      a.children.add(new Node(3));
      ((Node)a.children.get(0)).children.add(new Node(4));
      System.out.println(preorder(a));
   }

   public static List<Integer> preorder(Node root) {
      list.add(root.val);

      for(int i = 0; i < root.children.size(); ++i) {
         preorder((Node)root.children.get(i));
      }

      return list;
   }
}
