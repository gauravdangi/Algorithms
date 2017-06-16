
package linked.list.operations;
import java.util.LinkedList;
import java.util.Scanner;
/*
 * @author Gaurav
 */
public class LinkedListOperations {

   
    public static void main(String[] args) {
        ListOperations op = new ListOperations();
        Scanner scan = new Scanner(System.in);
        int ch,flag=1;
        System.out.println("Linked list operations:");
        do{
        System.out.print("Enter operation you want to perform\n1]Insertion\n2]Deletion\n3]Searching\n4]Count\n-> ");
        ch = scan.nextInt();
        switch(ch){
        
            case 1: System.out.println("\nInsertion");
                    System.out.print("Enter integer you want to insert: ");
                    int i = scan.nextInt();
                    op.insert(i);
                    op.dump();
                    break;
            case 2: System.out.println("\nDeletion");
                    System.out.print("Enter integer you want to delete: ");
                    int j = scan.nextInt();
                    op.delete(j);
                    op.dump();
                    break;
            case 3: System.out.println("\nSearching");
                    System.out.print("Enter integer you want to search: ");
                    int p = scan.nextInt();
                    op.search(p);
                    break;
            case 4: System.out.println("\nCount");
                    System.out.print("Size of linked list = "+op.count());
                    break;
            default: System.out.println("\nWrong choice mate!");
                    break;
        }
        System.out.print("\nDo you want to continue? (Press 1 for YES and others for NO)");
        flag = scan.nextInt();
        }while(flag==1);
        }
}

    

