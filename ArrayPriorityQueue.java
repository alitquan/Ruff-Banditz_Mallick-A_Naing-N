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
    // returns the position of this element
    public Ticket removeMin() {
        if (container.isEmpty())
	    return null;
	int tempMin = container.get(0).getVip();
	int pos = 0;
	for (int i = 0; i < container.size(); i++) {
	    if ((container.get(i).getVip() < tempMin)) { 
		tempMin = container.get(i).getVip();
		pos = i;
	    }
	}
	Ticket removed = container.get(pos);
	container.remove(pos);
	return removed;
    }

    // removes element with the highest priority (lowest number)
    // returns the position this element
    public Ticket findMin() {
	if (container.isEmpty())
	    return null;
	int tempMin = container.get(0).getVip();
	for (int i = 0; i < container.size(); i++) {
	    if (container.get(i).getVip() < tempMin) 
		tempMin = container.get(i).getVip();
	}
	return container.get(tempMin);
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
	    retStr += i.getName();
	retStr += "]";
	return retStr;
    }

    public static void main (String [] args) {
	ArrayPriorityQueue buckShot = new ArrayPriorityQueue();
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
