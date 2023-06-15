public class
Main {
    public static void main(String[] args) {
        MyList<Integer> myList1 = new MyList<>();
        System.out.println("Dizideki eleman sayısı:" + myList1.size());
        System.out.println("Dizinin kapasitesi:" + myList1.getCapasity());

        myList1.add(10);
        myList1.add(20);
        myList1.add(30);
        myList1.add(40);

        System.out.println("Dizideki eleman sayısı:" + myList1.size());
        System.out.println("Dizinin kapasitesi:" + myList1.getCapasity());

        myList1.add(50);
        myList1.add(60);
        myList1.add(70);
        myList1.add(80);
        myList1.add(90);
        myList1.add(100);
        myList1.add(110);

        System.out.println("Dizideki eleman sayısı:" + myList1.size());
        System.out.println("Dizinin kapasitesi:" + myList1.getCapasity());

        System.out.println("**************************");

        MyList<Integer> myList2 = new MyList<>();

        myList2.add(10);
        myList2.add(20);
        myList2.add(30);

        System.out.println("2. indisteki değer:" + myList2.get(2));

        myList2.remove(2);
        myList2.add(40);

        myList2.set(0, 100);

        System.out.println("2. indisteki değer : " + myList2.get(2));
        System.out.println(myList2.toString());
    }
}

