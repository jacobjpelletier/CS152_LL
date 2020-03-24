
/**
 * Class LL describes linked list of int type
 *
 * @author (Irena)
 * @version (Mar 5, 2020)
 */
public class LL
{
    private Node list;

    //Constructor  of class LL creates an empty list    
    public LL()
    {
       list = null;
    }

    public void addFront(int num)
    {
        Node node = new Node(num);
        node.next = list;
        list = node;
    }
   
    public void addRear(int num)
    {
        Node node = new Node(num);
        if (list==null)
           list = node;
        else
        {
            Node curr = list;
            while (curr.next!= null)
            {
              curr = curr.next;  
            }
            curr.next = node;
        }
        
    }
    
    public void printList()
    {
        Node curr = list;
        while (curr != null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
        
    }
    
    //Method adds and returns summ of all integers
    // stored in linked list
    public int sumData()
    {
        Node curr = list;
        int sum = 0;
        while (curr != null)
        {
            sum += curr.data;
            curr=curr.next;
        }
        return sum;
    }
    
    
    private class Node
    {
        public int data;
        public Node next;
        
        public Node(int num)
        {
            data = num;
            next = null;
        }
    }// end Node
}// end LL
