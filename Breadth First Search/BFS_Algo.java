
import java.util.*;

/*
 * @author Gaurav
 */
public class BFS_Algo {
private HashMap<Character, List<Character>> map = new HashMap();
private Queue<Character> q = new LinkedList<>();
private ArrayList<Character> output = new ArrayList<>();


// ----------- Adding Edge ----------------
public void addEdge(char a,char[] ch){
 List<Character> node = new ArrayList<>();  
 
 for(int i=0;i<ch.length;i++)
     node.add(ch[i]);
 map.put(a, node);
}

// ------------- Overriding toString()-------------------------
@Override
public String toString(){
 String output="";
 for(Map.Entry m:map.entrySet())
     output+= m.getKey()+" -> "+m.getValue()+"\n";
 return output;
}

// ------------------ Breath First Search ------------------------
public void BFS(char ch){
   if(!map.containsKey(ch))
       return;
   q.add(ch);
   output.add(ch);
  
   while(!q.isEmpty()){
    ArrayList<Character> list = (ArrayList<Character>) map.get(ch);
    q.remove();
    for(int i=0;i<list.size();i++){
        char k = list.get(i);
    if(!q.contains(k) && !output.contains(k))
        q.add(k);
      
   }// endof for loop
    if(!q.isEmpty()){
    char a  = q.peek();
    output.add(a);
    ch = a;
    }
   }// endof while loop
   
   // System.out.println("From BFS: "+list);
   
}

public void print(){
 System.out.println(output);
}

// ------------------------------- main() -----------------------------------------
    public static void main(String[] args) {
     BFS_Algo graph = new BFS_Algo();
     char[] a = {'b','g','d'};
     char[] b = {'a','e','f'};
     char[] e = {'b','g'};
     char[] g = {'e','a'};
     char[] d = {'a','f'};
     char[] f = {'b','d','c'};
     char[] c = {'h'};
     char[] h = {};
     graph.addEdge('a',a);
     graph.addEdge('b', b);
     graph.addEdge('e', e);
     graph.addEdge('g', g);
     graph.addEdge('f', f);
     graph.addEdge('c', c);
     graph.addEdge('h', h);
     graph.addEdge('d', d);
     
     System.out.println(graph);
     graph.BFS('a');
     graph.print();
     
    }
    
}
 
