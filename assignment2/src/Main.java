public class Main {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40};
        MyList myArraylist = new MyList(myArray);
        myArraylist.printList();
        myArraylist.append(50);
        myArraylist.printList();
        myArraylist.pop();
        myArraylist.printList();
        myArraylist.insert(35, 3);
        myArraylist.printList();
        myArraylist.insert(13, 1);
        myArraylist.printList();
        myArraylist.remove(1);
        myArraylist.printList();
        myArraylist.append(0);
        myArraylist.printList();
        myArraylist.insert(35, 3);
        myArraylist.printList();
        myArraylist.pop();
        myArraylist.printList();
        myArraylist.remove(4);
        myArraylist.printList();
        //part 

    }
}