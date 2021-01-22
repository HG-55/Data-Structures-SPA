import java.util.ArrayList;

public class DumbQueue {
	MyStack mStack = null;
	ArrayList<Integer> myStack;

	public DumbQueue(ArrayList<Integer> myStack) {
		this.myStack = myStack;
	}

	public void queue(Integer k) { // to the best of my knolage the big O is O()
		this.myStack.add(k);
	}

    public int dequeue() { // to the best of my knolage the big O is O(2)
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < myStack.size(); i++) {
            temp.add(this.myStack.get(this.myStack.size() - 1));
        }
        int last = temp.get(temp.size() - 1);
        temp.remove(temp.get(temp.size() - 1));
        for (int i = 0; i < temp.size(); i++) {
            myStack.add(temp.get(this.myStack.size() - 1));
        }
		return last;
	}
}