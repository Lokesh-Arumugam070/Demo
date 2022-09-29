package classs;
class Bank
{
	public float rateofintrest()
	{
		return 10.0f;
	}
}
class SBIBank extends Bank
{
	public float rateofintrest()
	{
		return 10.8f;
	}
}
class HDFCBank extends SBIBank
{
	public float rateofintrest()
	{
		return 11.2f;
	}
}
public class Overriding {
	public static void main(String[] args) {
		Bank b=new HDFCBank();
		System.out.println(b.rateofintrest());
		HDFCBank h=new HDFCBank();
		System.out.println(h.rateofintrest());
	}

}
