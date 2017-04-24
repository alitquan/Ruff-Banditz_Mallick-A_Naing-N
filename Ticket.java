public class Ticket {

    private int vipLevel;
    private String description;
    private String name;
    private boolean resolved;
    private String solnDescription;
    private int ID;

    /*---------------------------CONSTRUCTOR------------------------*/
    public Ticket (int vip, String desc, String nombre, int iden) {
	vipLevel = vip;
	description = desc;
	name = nombre;
	resolved = false;
	solnDescription ="";
	ID = iden;
    }
    /*------------------------------------------------------------------*/
    public int getVip() {
	return vipLevel;
    }
    public String getDescription() {
	return description;
    }
    public String getName() {
	return name;
    }
    public boolean getResolved() {
	return resolved;
    }
    public String getSoln() {
	return solnDescription;
    }
    public int getID() {
	return ID;
    }
    public String addSolution(String solution){
	solnDescription = solution;
	return solution;
    }
    public void setTrue(){
	resolved = true;
    }
  
    public int compareTo(Ticket other) {
	if (this.getVip() > other.getVip()) 
	    return 1;
	else if (this.getVip() == other.getVip() )
	    return 0;
	else
	    return -1;
    }

    public void changeVip (int tar) {
	vipLevel = tar;
    }

    public void changeName (String name2) {
	name = name2;
    }

    public void changeId (int newID) {
	ID = newID;
    }

    public void changeDesc (String newDesc) {
	description = newDesc;
    }

    public String toString() {
	String retVal = "";
	retVal+= "\n VIP: "+ getVip() + "\n desc: " + getDescription();
	retVal+= "\n name: " + getName() + "\n sol: " + getSoln();
	retVal+= "\n ID: " + getID();
	return retVal;
    }

    public static void main (String [] args) {
	Ticket a = new Ticket (23,"computer won't turn on","a",1234);
	Ticket b = new Ticket (12,"computer screen is broken","b",5671628);
	System.out.println (a.compareTo(b));
    }
}
