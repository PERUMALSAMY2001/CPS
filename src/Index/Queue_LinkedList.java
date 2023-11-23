package Index;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList {


	    public static void main(String[] args) {
	        Queue<Integer> queue = new LinkedList<>();

	        int value1 = 10;
	        int value2 = 20;
	        int value3;

	        queue.add(value1);
	        queue.add(value2);
	        //queue.add(value3);
	        value3=value1+value2;
	        System.out.println("Values added to the queue: " + value1 + ", " + value2);
	        System.out.println("Queue after adding values: " + queue);
			System.out.println("The Addition Is: "+value3);
			
	    }
	}



