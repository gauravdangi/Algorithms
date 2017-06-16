
package linked.list.operations;
import java.util.LinkedList;
/*
 * @author Gaurav
 */
public class ListOperations {
   LinkedList<Integer> l = new LinkedList<>();
   
   void insert(int a){
    l.add(a);
   }
   void delete(int a){
   int p = l.indexOf(a);
   l.remove(p);
   }
   void search(int a){
    if(l.contains(a)){
        int k = l.indexOf(a)+1;
     System.out.println(a+" is in link list at position "+k);
    }
    else{
     System.out.println(a+" is not present in link list");
    }
   }
   int count(){
    return l.size();
   }
   void dump(){
    System.out.println(l);
   }
}
