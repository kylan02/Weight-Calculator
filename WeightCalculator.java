public class WeightCalculator
{
	public static void main(String[]args)
	{
		int weight = Integer.parseInt(args[0]);
		double mars = weight * 0.38;
		double jupiter = weight * 2.36;
		double venus = weight * 0.91;
		double saturn = weight * 1.06;
		
		System.out.println("Mars: "+mars);
		System.out.println("Jupiter: "+jupiter);
		System.out.println("Venus: "+venus);
		System.out.println("Saturn: "+saturn);
		System.out.println("Earth: "+weight);
	}
}