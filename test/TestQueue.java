import edu.itcr.startec.datastructs.serializing.Queue;

public class TestQueue {

    public static void main(String[] args) {
    	
        Queue<Integer> mylist = new Queue<Integer>();

        mylist.Enqueue(1);
        mylist.Enqueue(2);
        mylist.Enqueue(3);
        mylist.Enqueue(4);        
        System.out.println(mylist.describe());

        Queue<String> mylist2 = new Queue<String>();

        mylist2.Enqueue("Foo");
        mylist2.Enqueue("Bar");
        mylist2.Enqueue("Jam");
        mylist2.Enqueue("Eggs");
        mylist2.Enqueue("Hell");
        mylist2.Enqueue("Gatito");

        System.out.println(mylist2.describe());

        mylist2.Dequeue();

        System.out.println(mylist2.describe());
        
        System.out.println("------------------------------------------------------------");
    	

    }
}
