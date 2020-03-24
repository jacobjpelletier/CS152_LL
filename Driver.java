
/**
 * Class Driver uses class LL.
 *
 * @author (Irena)
 * @version (Mar 11, 2019)
 */
public class Driver
{
    public static void main(String[] args)
    {
        LL obj = new LL();
        obj.addFront(1);
        obj.addFront(3);
        obj.addFront(5);
        System.out.println("Printing linked list of integers.");
        obj.printList();
    
        System.out.println("Sum of data in all nodes = " +
                            obj.sumData());
                            
        LL obj1 = new LL();
        obj1.addRear(1);
        obj1.addRear(3);
        obj1.addRear(5);
        System.out.println("Printing second linked list of integers.");
        obj1.printList();
        System.out.println("Sum of data in all nodes = " +
                            obj1.sumData());
                         
    }   
}
