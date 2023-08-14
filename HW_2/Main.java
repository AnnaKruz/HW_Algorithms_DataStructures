package Seminar3;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();

        list.add(5);
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);


        list.print();
        list.removeAll(5);
        list.print();



    }

    
}
