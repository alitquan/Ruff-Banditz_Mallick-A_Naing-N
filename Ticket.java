public class Ticket {

    private int vipLevel;
    private String description;
    private String name;
    private boolean resolved;
    private String solnDescription;
    private int ID;

    /*---------------------------CONSTRUCTOR------------------------*/
    public Ticket (int vip, String desc, String nombre,String soln, int iden) {
	vipLevel = vip;
	description = desc;
	name = nombre;
	resolved = false;
	solnDescription = soln;
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
  
    public int compareTo(Ticket other) {
	if (this.getVip() > other.getVip()) 
	    return 1;
	else if (this.getVip() == other.getVip() )
	    return 0;
	else
	    return -1;
    }

    public String toString() {
	String retVal = "";
	retVal+= "\n VIP: "+ getVip() + "\n desc: " + getDescription();
	retVal+= "\n name: " + getName() + "\n sol: " + getSoln();
	retVal+= "\n ID: " + getID();
	return retVal;
    }

    public static void main (String [] args) {
	Ticket a = new Ticket (23,"computer won't turn on","a","replace battery",1234);
	Ticket b = new Ticket (12,"computer screen is broken","b","get a new one",5678);
	System.out.println (a.compareTo(b));
    }
}
