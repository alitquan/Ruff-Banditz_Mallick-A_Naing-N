import helper.Keyboard;
import java.util.ArrayList;
public class HelpDesk {
    private boolean keepGoing = true;
    private ArrayPriorityQueue listofTickets;
    private ArrayPriorityQueue unsolvedTickets;
    private ArrayList<String> pastDesc;
    private ArrayList<String> pastSol;
    private int solvedProblems;

    public HelpDesk() {
	listofTickets= new ArrayPriorityQueue();
	unsolvedTickets = listofTickets;
	pastDesc = new ArrayList();
	pastSol = new ArrayList();
	solvedProblems = 0;
    }

    public int getSolved() {
	return solvedProblems;
    }

    public boolean check() {
	if (listofTickets.findMin() != null) 
	    return true;
	return false;
    }

    public Ticket autoSelect() {
	return listofTickets.findMin();
    }

    public void seeTickets() {
	System.out.println("Displaying tickets: \n" + listofTickets);
    }

    public void interacTicket () {
	if (check() ){
	    Ticket target = listofTickets.findMin();
	    System.out.println (target);
	    if (solvedProblems > 0) {
		System.out.print("Would you like to solve this problem? Select y for yes| n for no | s for library | c for cross-reference\nChoice: ");
	    }
	    else {
		System.out.print("Would you like to solve this problem? Select y for yes| n for no | s for library\nChoice: ");
	    }
	    char answer = Keyboard.readChar();
	    if (answer == 'y') {
		submitSolution(target);
	    }
	    else if (answer == 'n') {
		unsolvedTickets.insert(target);
		listofTickets.removeMin();
	    }
	    else if (answer == 's') {
		showHistory();
		interacTicket();
	    }
	    else if (answer == 'c'){
		if (solvedProblems > 0)
		    System.out.println(crossReference(crossReferenceH(target.getDescription())));
		interacTicket();
	    }
	    else {}
	}
    }

    public void submitSolution (Ticket target) {
	System.out.println ("Please, submit your solution for this problem: ");
	String solution = Keyboard.readString();
	if (!target.getResolved() ) {
	    System.out.println("Solution added: " + target.addSolution(solution));
	    pastDesc.add(target.getDescription());
	    pastSol.add(target.getSoln());
	    target.setTrue();
	    listofTickets.removeMin();
	    solvedProblems++;
	}
	else {
	    System.out.println ("Here is the current solution: "+ target.getSoln() + "\nAre you sure you want to change it? \nAnswer (y = yes, n = no): ");
	    char answer2 = Keyboard.readChar();
	    if (answer2 == 'y'){
		target.addSolution(solution);
		solvedProblems++;
	    }
	}
    }
	
    public void addTicket(Ticket t) {
	listofTickets.insert(t);
    }
    
    public Ticket removeMinTicket() {
	Ticket result = listofTickets.findMin();
	listofTickets.removeMin();
	return result;
    }
    public String showHistory(){
	String retVal = "";
	for (int i = 0; i < pastDesc.size(); i++) {
	    retVal += "\nProblem: " + pastDesc.get(i) + "\t|     Solution: " + pastSol.get(i);
	}
	return retVal;
    }

    public boolean checkGoing(){
	if (keepGoing)
	    return true;
	return false;
    }
    public void end() {
	keepGoing = false;
    }
    public boolean emptyEnd() {
	if (listofTickets.isEmpty()) 
	    return true;
	return false;
    }

    public String crossReferenceH(String target) {
	String [] newTarget = target.split(" "); //splits designated word
	int mostMatches = 0;
	int mostMatched = 0;
	for (int i = 0; i <  pastDesc.size(); i++) { //for every description
	    String [] sub = pastDesc.get(i).split(" "); // splits pastDesc description into words
	    int matches = 0;
	    for (String x: sub) { // checks each word
		for (int y = 0; y < newTarget.length; y++) {
		    if (x.equals(newTarget[y])) {
			matches++;
		    }
		}
	    }
	    if (matches > mostMatches) {
		mostMatches = matches;
		mostMatched = i;
	    }
	}
	String retVal = mostMatches + " " + mostMatched;
	return retVal;
    }

    public String crossReference(String target){
	String [] divisions = target.split(" ");
	int matches = Integer.parseInt(divisions [0]);
	int match = Integer.parseInt(divisions [1]);
	String retVal = "";
	retVal += "Most Matched Words: " + matches + "\nDescription: " + pastDesc.get(match) + "\nSolution: " + pastSol.get(match);
	return retVal;
    }

    public void modifyTickets() {
	boolean notDone = true;
	while (notDone) {
	    seeTickets();
	    System.out.println("Which tickets would you like to modify (use the first number): ");
	    int select = Keyboard.readInt();
	    if (select > 0 && select < listofTickets.getSize() + 2) {
		Ticket target = listofTickets.getTicket(select - 1);
		System.out.println("Which would you like to modify?\n|1. vipLevel |2. name  |3. ID |4. Problem Description|");
		System.out.print("\nChoice: ");
		int select2 = Keyboard.readInt();
		if (select2 > 0 && select2 < listofTickets.getSize()) {
		    if (select2 == 1) {
			System.out.print("Input new viplevel: ");
			int newvip = Keyboard.readInt();
			target.changeVip(newvip);
		    }
		    else if (select2 == 2) {
			System.out.print("Input new name: ");
			String newName = Keyboard.readString();
			target.changeName(newName);
		    }
		    else if (select2 == 3) {
			System.out.print("Input new ID: ");
			int newId = Keyboard.readInt();
			target.changeId(newId);
		    }
		    else if (select2 == 4) {
			System.out.print("Input new description: ");
			String newDesc= Keyboard.readString();
			target.changeDesc(newDesc);
		    }
		    else {}
		}
		else {
		    System.out.println ("Wrong choice");
		}
	    }
	    else
		System.out.println("Invalid choice");
	    System.out.println ("Are you done? Type yes for yes. Any other input will suffice for no.");
	    String answer = Keyboard.readString();
	    if (answer.equals("yes")) {
		notDone = false;
	    }
	}
    }
		


    public static void main (String [] args) {
	Ticket Jack = new Ticket (7,"Computer won't turn on","Jack",25677);
	Ticket Jill = new Ticket (13,"Stupid i am","Jill",12783);
	Ticket Henry = new Ticket (1,"Computer won't turn on","Henry",34295);
	Ticket Benzy = new Ticket (6,"Stupid i am","Benzy",12324);
	Ticket Phil = new Ticket (7,"Computer won't turn on","Jack",45712);
	Ticket Annie = new Ticket (134,"Broke the cd drive","Jill",13529);
	Ticket Hernandez = new Ticket (12,"Give me foood","Henry",12424);
	Ticket Jay = new Ticket (61,"Stupid i am","Benzy",12327);
	Ticket Beyonce = new Ticket (7,"Cheese hit me in the face","Jack",24734);
	Ticket Freak = new Ticket (9,"Cheese hit me in the face","Jill",13274);
	Ticket Allen = new Ticket (2,"Computer won't turn on","Henry",15125);
	Ticket Rosemary = new Ticket (3,"Broke the cd drive","Benzy",2222);
	HelpDesk a = new HelpDesk();
	a.addTicket(Jack);
	a.addTicket(Jill);
	a.addTicket(Henry);
	a.addTicket(Benzy);
	a.addTicket(Phil);
	a.addTicket(Annie);
	a.addTicket(Hernandez);
	a.addTicket(Jay);
	a.addTicket(Beyonce);
	a.addTicket(Freak);
	a.addTicket(Allen);
	a.addTicket(Rosemary);
	System.out.println ("Welcome to HelpDesk simulator, where we listen to and solve your problems. Here are your options:\n 1. Modify tickets \n 2. Act as HelpDesk");
	System.out.print("Choice: ");
	int choiceA = Keyboard.readInt();
	if (choiceA == 1) {
	    a.modifyTickets();
	}
	System.out.println ("Here is the list of tickets submitted: ");
	a.seeTickets();
	System.out.println ("You will cycle through them and do the ones by highest priority!");
	while(a.checkGoing()){
	    System.out.println("You have solved " + a.getSolved() + " problem(s).");
	    System.out.println ("What would you like to do?");
	    System.out.print (" 1. Solve more problems \n 2. View the library \n 3. Call it a day\n 4. View tickets left\nChoice: ");
	    int choice = Keyboard.readInt();
	    if (choice == 1)
		a.interacTicket();
	    else if (choice == 2)
		System.out.println(a.showHistory());
	    else if (choice == 3)
		a.end();
	    else if (choice == 4)
		a.seeTickets();
	    else {}
	}
    }
}
		
		
		     
        
	     
