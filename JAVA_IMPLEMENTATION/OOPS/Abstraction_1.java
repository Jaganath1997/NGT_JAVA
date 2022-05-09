package hwonmay29th;
//example program for abstraction based on jewels rate

public abstract class Abstraction_1
{
	
	public String area_name1()
	{
		String area1 = "The area is Chennai";
		System.out.println(area1);
		return area1;
	}
	
	public String area_name2()
	{
		String area2 = "The area is Bengaluru";
		System.out.println(area2);
		return area2;
	}
	
	public abstract int jewel_rate(int a);
	
	
}
