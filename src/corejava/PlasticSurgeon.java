package corejava;
//Multilevel Inheritance
public class PlasticSurgeon extends Surgeon
{
	void specialty()
	{
		System.out.println("Platic Surgeons are trained in facial reconstruction.");
	}
	public static void main(String[] args)
	{
		PlasticSurgeon ps = new PlasticSurgeon();
		ps.does();
		ps.perform();
		ps.specialty();
	}

}
