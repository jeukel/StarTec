import edu.itcr.startec.datastructs.simplelist.SimpleList;


public class TestList {

    public static void main(String[] args) {

        SimpleList<Integer> mylist = new SimpleList<Integer>();

        mylist.append(1);
        mylist.append(2);
        mylist.append(3);
        mylist.append(4);
        mylist.append(5);
        mylist.append(6);

        System.out.println(mylist.describe());

        SimpleList<String> mylist2 = new SimpleList<String>();

        mylist2.append("Foo");
        mylist2.append("Bar");
        mylist2.append("Jam");
        mylist2.append("Eggs");
        mylist2.append("Hell");
        mylist2.append("Gatito");

        System.out.println(mylist2.describe());

        mylist2.delete("Gatito");
        mylist2.delete("Foo");
        mylist2.delete("Jam");

        System.out.println(mylist2.describe());

        mylist2.insert(0, "Gatito");
        mylist2.insert(0, "Bichito");
        mylist2.insert(5, "Baboom");
        mylist2.insert(3, "Bonejo");

        System.out.println(mylist2.describe());
    }
}
