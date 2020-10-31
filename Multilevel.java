class A1
{
	int geta() {
		return 10;
	}
	
	int getb() {
		return 20;
	}
}
class B1 extends A1
{
	int sum() {
		return (geta()+getb());
	}
}
public class Multilevel extends B1 {
	void avg()
	{
		System.out.println(sum()/2);
	}
	public static void main(String[] args) {
		Multilevel ml=new Multilevel();
		ml.avg();

	}

}
