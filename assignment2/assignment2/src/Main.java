import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40};//starting array
        MyList myArraylist = new MyList(myArray);
        /* Comments were not added for this section of output as the print statments describe exactly what the comments would say */
        System.out.println("Part 1:");
        System.out.println("Starting numbers");
        myArraylist.printList();
        System.out.println("Append 50");
        myArraylist.append(50);
        myArraylist.printList();
        System.out.println("Pop");
        myArraylist.pop();
        myArraylist.printList();
        System.out.println("Inserting 35 at index 3 and 13 at index 1");
        myArraylist.insert(35, 3);
        myArraylist.printList();
        myArraylist.insert(13, 1);
        myArraylist.printList();
        System.out.println("Remove Integer at index 1");
        myArraylist.remove(1);
        myArraylist.printList();
        System.out.println("Append 0");
        myArraylist.append(0);
        myArraylist.printList();
        System.out.println("Insert 35 at index 3");
        myArraylist.insert(35, 3);
        myArraylist.printList();
        System.out.println("Pop");
        myArraylist.pop();
        myArraylist.printList();
        System.out.println("Remove Integer at index 4");
        myArraylist.remove(4);
        myArraylist.printList();
        
        //---Begin Part 2---
        System.out.println("\n\n=---Begin Part 2---= \n");

        //2A
        ArrayList<Integer> stackNumbers = new ArrayList<Integer>(); //declares a array list to be used for MyStack
        MyStack Stack = new MyStack(stackNumbers); //creates "Stack" as a MyStack  object
        System.out.println("2A:\nPush 1 then 2 then 3");
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        System.out.println(stackNumbers);
        System.out.println("Pop");
        Stack.pop();
        System.out.println(stackNumbers);

        //2B
        ArrayList<Integer> queueNumbers = new ArrayList<Integer>();//declares a array list to be used for MyQueue
        MyQueue Queue = new MyQueue(queueNumbers); //creates "Queue" as a MyQueue object
        System.out.println("\n2B:\nQueue 10 then 12 then 15");
        Queue.queue(10);
        Queue.queue(12);
        Queue.queue(15);
        System.out.println(queueNumbers);
        System.out.println("De-queue 10");
        Queue.dequeue();
        System.out.println(queueNumbers);

        //2C
        ArrayList<Integer> dumbQueueNumbers = new ArrayList<Integer>();//declares a array list to be used for MyQueue
        MyQueue DumbQueue = new MyQueue(dumbQueueNumbers); //creates "Queue" as a MyQueue object
        System.out.println("\n2C:\nQueue 1 then 3 then 7");
        DumbQueue.queue(1);
        DumbQueue.queue(3);
        DumbQueue.queue(7);
        System.out.println(dumbQueueNumbers);
        System.out.println("Dumb De-queue 1");
        DumbQueue.dequeue();
        System.out.println(dumbQueueNumbers);



    }
}