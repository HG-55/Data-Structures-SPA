public class MyList {
    int [] currentList = null;

    public MyList(int[] inputList) {
        this.currentList = inputList;
    }

    public void append(int x) { //as far as I understand the big O of this is O(n)
        int size = this.currentList.length;
        int[] intNewArray = new int[size + 1];
        for (int i = 0; i < currentList.length; i++) {
            intNewArray[i] = currentList[i];
        }
        intNewArray[size] = x;
        this.currentList = intNewArray;
    }

    public void pop() {//as far as I understand the big O of this is O(n)
        int size = this.currentList.length;
        int[] intNewArray = new int[size - 1];
        for (int i = 0; i < currentList.length - 1; i++) {
            intNewArray[i] = currentList[i];
        }
        this.currentList = intNewArray;
    }

    public void printList() {//as far as I understand the big O of this is O(n)
        System.out.print("(");
        for (int i : currentList) {
            System.out.print(i + ",");
        }
        System.out.println(")");
    }

    public void insert(int x, int index) {//as far as I understand the big O of this is O(n)

        int size = this.currentList.length;

        int[] intNewArray = new int[size + 1];
        for (int i = 0; i < currentList.length; i++) {
            if (index == i) {
                intNewArray[i] = x;
            }
            if (i < index) {
                intNewArray[i] = currentList[i];
            } else {
                intNewArray[i + 1] = currentList[i];
            }
        }
        this.currentList = intNewArray;
    }

    public void remove(int index) {//as far as I understand the big O of this is O(n)
        int size = this.currentList.length;

        int[] intNewArray = new int[size - 1];
        for (int i = 0; i < currentList.length - 1; i++) {
            if (i < index) {
                intNewArray[i] = currentList[i];
            } else {
                intNewArray[i] = currentList[i + 1];
            }
        }
        this.currentList = intNewArray;
    }

}