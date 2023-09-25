package Demoalp;

public class ObjectComparison {

	public static void main(String[] args) {
		String a = "WebApplication";
		String b = "WebApplication";
		if(a.equals(b))
		System.out.println("Equal "+a.hashCode()+" "+b.hashCode());
		
		String c = "MachineLearing";
		String d = "ArtificialInelligence";
		if(!c.equals(d))
		System.out.println("Not Equal"+c.hashCode()+" "+d.hashCode());

	}

}
