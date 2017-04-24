public class HelpDesk {
	private ArrayPriorityQueue<Ticket> listofTickets;
	public void addTicket(Ticket t) {
		listofTickets.add(t);
	}
	public Ticket removeMinTicket() {
		Ticket result = listofTickets.peekMin();
		listofTcikets.removeMin();
		return result;
	}
}
