public class WeightCalculator
{
	public static void main(String[]args)
	{
		int weight = Integer.parseInt(args[0]);
		
		printPlanet(weight, 0.38, "Mars");
		printPlanet(weight, 2.36, "Jupiter");
		printPlanet(weight, 0.91, "Venus");
		printPlanet(weight, 1.06, "Saturn");
	}
	
	public static void printPlanet(double earth, double factor, String planet)
	{
		double weight = earth * factor;
		System.out.println(planet + ": " + weight);
	}
}