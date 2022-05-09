package hwonmay29th;

public class Abstraction_2 extends Abstraction_1
{
	public int jewel_rate(int a)
	{ 
		int b = a;
		switch(b)
		{	
		case 1:
			System.out.println("1g of Gold costs 5,043 Rs");
			break;
		case 2:
			System.out.println("1g of Silver costs 71 Rs");
			break;
		case 3:
			System.out.println("1g of Diamond costs 3,25,000 Rs");
			break;
		case 4 :
			System.out.println("1g of Platinum costs 3,709 Rs");
			break;
		default:
			System.out.println("Enter the correct value");
		}
		return a;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Abstraction_2 obj = new Abstraction_2();
		obj.area_name1();
		obj.area_name2();
		obj.jewel_rate(1);
	}

}
