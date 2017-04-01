public class Picnic
{
	public static void main(String[] args)
	{
		long previousTime = System.currentTimeMillis();
		int success = 0;
		int trials = 100000000;
		for (int i = 0; i < trials; i++)
		{
			int time1 = (int) (Math.random() * 60);
			int time2 = (int) (Math.random() * 60);
			if (Math.abs(time2 - time1) <= 15)
				success++;
		}
		System.out.println((success * 1.0)/trials);
	}
}