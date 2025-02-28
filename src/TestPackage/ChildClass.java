package TestPackage;

public class ChildClass extends ParentClass {

	public void engine()
	{
		System.out.println("New Gen engine implemented");
	}
	public void colour()
	{
		System.out.println(colour);
	}
	public static void main(String[] args)
	{
		ChildClass c = new ChildClass();
		ParentClass p = new ChildClass();
		c.engine();
		c.colour();
		p.colour();
		c.breaks();
	}
}
