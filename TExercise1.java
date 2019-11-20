import java.util.*;
public class TExercise1
{
	public static void main (String[]args)
	{
		System.out.print("Please choose a number : \n 480 \n 481 \n 482 \n 483 \n");
		Scanner scanner = new Scanner(System.in);
		int choosennumber = scanner.nextInt();
		
		if (choosennumber == 480)
			System.out.print("Multimedia");
		else if (choosennumber == 481)
			System.out.print("Computer System");
		else if (choosennumber == 482)
			System.out.print("Software Engineering");
		else if (choosennumber == 483)
			System.out.print("Computer Network");
	}
}