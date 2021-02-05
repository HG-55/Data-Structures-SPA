public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node = new Node(5);
		
		MyLinkedList mll = new MyLinkedList(node);
		
		
		mll.add(9);
		mll.add(10);
		mll.add(11);
		mll.add(8);
		
		mll.printList();

		mll.removeItem(1);
		mll.printList();
		mll.insert(3, 2);
		mll.printList();
		mll.insert(99, 0);
		mll.printList();
		System.out.println("value is: "+mll.getValue(3));
		// mll.switch();

	}

}
