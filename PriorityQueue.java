public interface PriorityQueue {

    //returns number of tickets in queue
    public int getSize();

    //removes elemetnt with the highest priority (lowest number)
    //returns the removed element
    public Ticket removeMin();

    //finds and returns element with the highest priority (lowest number)
    public Ticket findMin();

    // returns true if container is empty; false otherwise
    public boolean isEmpty();

    // adds an object to the container
    public Ticket insert(Ticket object);

}
    
