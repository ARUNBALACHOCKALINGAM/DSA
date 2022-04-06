package LinkedList;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(33);
        list.insertFirst(10);
        list.insertLast(50);
        list.insert(20, 2);
        list.deleteFirst();
        list.printLL();
        list.deleteLast();
        list.delete(3);
        System.out.println(list.find(33));
        list.find(33);
        list.printLL();
    }
   
}
