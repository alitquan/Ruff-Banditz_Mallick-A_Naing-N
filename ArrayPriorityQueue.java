// Alitquan Mallick
// APCS02-PD04
// HW #32: Getting Past the Velvet Rope
// 04-20-17

/* 
   custom-made priority queue that utilizes methods 
   in the fiu interface called priorityQueue.
   Implementation line excluded for user 
   to be able to run
   Uses int for now rather than generic typing 
*/

import java.util.ArrayList;
public class ArrayPriorityQueue {
    private ArrayList<Ticket> container = new ArrayList<Ticket>();
    private int size;
    
    public ArrayPriorityQueue() {
	size = 0;
    }

    // removes element with the highest priority (lowest number)
    // returns the removed element
    public Ticket removeMin() {
        if (container.isEmpty())
	    return null;
	Ticket tempMin = container.get(0);
	int pos = 0;
	for (int i = 0; i < container.size(); i++) {
	    if (tempMin.compareTo(container.get(i))== 1 || tempMin.compareTo(container.get(i))== 0) {
		tempMin = container.get(i);
		pos = i;
	    }
	}
	Ticket removed = tempMin;
	container.remove(pos);
	return removed;
    }

    // removes element with the highest priority (lowest number)
    // returns the element
    public Ticket findMin() {
	if (container.isEmpty())
	    return null;
	Ticket tempMin = container.get(0);
	for (int i = 0; i < container.size(); i++) {
	    if (tempMin.compareTo(container.get(i))== 1 || tempMin.compareTo(container.get(i))== 0) {
		tempMin = container.get(i);
	    }
	}
	return tempMin;
    }

    // return true if container is empty; false otherwise
    public boolean isEmpty() {
	if (size == 0) 
	    return true;
	return false;
    }

    // adds an object to the container
    public Ticket insert(Ticket object) {
	container.add(object);
	size++;
	return object;
    }

    // overriden toString() method 
    public String toString() {
	String retStr = "[ ";
	for (Ticket i: container) 
	    retStr += i.getName() + " ";
	retStr += "]";
	return retStr;
    }

    public static void main (String [] args) {
	ArrayPriorityQueue buckShot = new ArrayPriorityQueue();
	Ticket Felipe = new Ticket (12,"abc","Felipe","def",1234);
	Ticket Jack = new Ticket (7,"abc","Jack","def",234);
	Ticket Jill = new Ticket (13,"abc","Jill","def",134);
	Ticket Henry = new Ticket (1,"abc","Henry","def",124);
	Ticket Benzy = new Ticket (6,"abc","Benzy","def",12324);
	buckShot.insert(Felipe);
	buckShot.insert(Jack);
	buckShot.insert(Jill);
	buckShot.insert(Henry);
	buckShot.insert(Benzy);
	System.out.println(buckShot.findMin());
	System.out.println (buckShot);
	System.out.println (buckShot.removeMin());
	System.out.println (buckShot);
	System.out.println (buckShot.removeMin());
	System.out.println (buckShot);
	
	/*buckShot.insert(4);
	buckShot.insert(11);
	buckShot.insert(1);
	buckShot.insert(7);
	buckShot.insert(3);
	buckShot.insert(2);
	System.out.println (buckShot);
	System.out.println ("Removing number " + buckShot.findMin());
	System.out.println ("Removed index: " + buckShot.deleteMin());
	System.out.println (buckShot);
	System.out.println ("Removing number " + buckShot.findMin());
	System.out.println ("Removed index: " + buckShot.deleteMin());
	System.out.println (buckShot);
	System.out.println ("Removing number " + buckShot.findMin());
	System.out.println ("Removed index: " + buckShot.deleteMin());
	System.out.println (buckShot);
	System.out.println ("Removing number " + buckShot.findMin());
	System.out.println ("Removed index: " + buckShot.deleteMin());
	System.out.println (buckShot);
	System.out.println ("Removing number " + buckShot.findMin());
	System.out.println ("Removed index: " + buckShot.deleteMin());
	System.out.println (buckShot); */
	
    }
	
}
