public class MyLinkedList {

	public Node headNode;

	public MyLinkedList(Node n) {
		this.headNode = n;

	}

	public void printList() {
		System.out.println("The linked list is now:");
		Node currentNode = this.headNode;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}

	public void add(int k) {
		Node newNode = new Node(k);
		newNode.next = this.headNode;
		this.headNode = newNode;
	}

	public void removeItem(int index) {
		Node currentNode = this.headNode;
		for (int i = 0; i < index - 1; i++) {
			currentNode = currentNode.next;
		}
		currentNode.next = currentNode.next.next;
	}

	public void insert(int k, int index) {
		Node currentNode = this.headNode;
		Node newNode = new Node(k);
		if (index == 0) {
			add(k);
		} else {
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
	}

	public int getValue(int index){
		Node currentNode = this.headNode;
		for (int i = 0; i < index - 1; i++) {
			currentNode = currentNode.next;
		}
		return currentNode.data;
	}

	public void switchItems(int index1, int index2){
		int index1value = getValue(index1);
		int index2value = getValue(index2);
		removeItem(index1);
		removeItem(index2);
		insert(index2value, index1);
		insert(index1value, index2);
} //the swithch items doesnt work and idk how to get reverse working

}
