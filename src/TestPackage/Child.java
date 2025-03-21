package TestPackage;

public class Child extends Test {

	int i = 20;
	public static void main(String[] args)
	{
		Test t = new Child();
		System.out.println(t.i);
		t.testing();
	}
	public void testing()
	{
		System.out.println("Child");
		System.out.println("Test comment from Project X");
	}
}
