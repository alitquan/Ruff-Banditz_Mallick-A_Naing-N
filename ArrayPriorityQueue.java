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
    private ArrayList container = new ArrayList <Integer>();
    private int size;
    
    public ArrayPriorityQueue() {
	size = 0;
    }

    // removes element with the highest priority (lowest number)
    // returns the position of this element
    public int deleteMin() {
        if (container.isEmpty())
	    return -1;
	int tempMin = (int) container.get(0);
	int pos = 0;
	for (int i = 0; i < container.size(); i++) {
	    if ((int) container.get(i) < tempMin) { 
		tempMin = (int) container.get(i);
		pos = i;
	    }
	}
	container.remove(pos);
	return pos;
    }

    // removes element with the highest priority (lowest number)
    // returns the position this element
    public int findMin() {
	if (container.isEmpty())
	    return -1;
	int tempMin =  (int) container.get(0);
	for (int i = 0; i < container.size(); i++) {
	    if ((int) container.get(i) < tempMin) 
		tempMin = (int)container.get(i);
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
    public int insert(int object) {
	container.add(object);
	size++;
	return object;
    }

    // overriden toString() method 
    public String toString() {
	String retStr = "[ ";
	for (Object i: container) 
	    retStr += String.valueOf ( (int) i) + " ";
	retStr += "]";
	return retStr;
    }

    public static void main (String [] args) {
	ArrayPriorityQueue buckShot = new ArrayPriorityQueue();
	buckShot.insert(4);
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
	System.out.println (buckShot);
	
    }
	
}
