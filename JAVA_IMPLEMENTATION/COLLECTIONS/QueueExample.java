package basics;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    PriorityQueue<Integer> num = new PriorityQueue<>();
	    num.add(1);
	    num.add(5);
	    num.add(2);
	    num.add(4);
	    num.add(3);
	    num.add(6);
	    //queue automatically sort values
	    System.out.println(num);
	    //peeking- getting the head of the value
	    //polling- removing the head of the value
	    System.out.println("head value is:\t"+ num.peek());
	    System.out.println("size is:\t"+ num.size());
	    num.poll();//remove the head value
	    System.out.println("head value is:\t"+ num.peek());
	    System.out.println("size is:\t"+ num.size());
	    
	    
	}

}
