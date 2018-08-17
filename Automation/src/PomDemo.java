
public class PomDemo {
	private int amount;
	PomDemo(int amount)
	{
		this.amount=amount;
	}
	int getter()
	{
		return amount;
	}

	public static void main(String[] args) {
		PomDemo Him = new PomDemo(55000);
		PomDemo Nik = new PomDemo(60000);
		PomDemo Gol = new PomDemo(65000);
		System.out.println(Him.getter());
		System.out.println(Nik.getter());
		System.out.println(Gol.getter());
	}

}
