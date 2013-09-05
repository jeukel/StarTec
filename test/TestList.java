import edu.itcr.startec.datastructs.simplelist.SimpleList;


public class TestList {

	/**
	 * @param args
	 */
    public static void main(String[] args) {
        
        SimpleList<Integer> mylist = new SimpleList<Integer>();
        
        mylist.append(1);
        mylist.append(2);
        mylist.append(3);
        mylist.append(4);
        mylist.append(5);
        mylist.append(6);
        
        for(Integer i : mylist) {
            System.out.print(String.format("%d ", i));
        }
        System.out.println();
        
        SimpleList<String> mylist2 = new SimpleList<String>();
        
        mylist2.append("Foo");
        mylist2.append("Bar");
        mylist2.append("Jam");
        mylist2.append("Eggs");
        mylist2.append("Hell");
        mylist2.append("Gatito");
        
        for(String s : mylist2) {
            System.out.print(String.format("%s ", s));
        }
        System.out.println();
    }

}
