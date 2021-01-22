import java.util.ArrayList;

public class MyQueue {
	int [] arrayStack = null;
	ArrayList<Integer> myStack;

	public MyQueue(ArrayList<Integer> myStack) {
		this.myStack = myStack;
	}

	public void queue(Integer k) {
		this.myStack.add(k);
	}

	public int dequeue() {

		int last = this.myStack.get(0);

		// remove it
		this.myStack.remove(0);

		// return it
		return last;
	}
}