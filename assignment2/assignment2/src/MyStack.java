import java.util.ArrayList;

public class MyStack {
	int [] arrayStack = null;
	ArrayList<Integer> localMyStack;

	public MyStack(ArrayList<Integer> localMyStack) {
		this.localMyStack = localMyStack;
	}

	// Add to the end of the stack o(1)
	public void push(Integer k) {
		this.localMyStack.add(k);
	}

	// Take "first" (last element in list) element out and return it

	public int pop() {

		// get last item
		int last = this.localMyStack.get(this.localMyStack.size() - 1);

		// remove it
		this.localMyStack.remove(this.localMyStack.size() - 1);

		// return it
		return last;
	}
}