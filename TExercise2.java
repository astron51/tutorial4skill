import java.util.*;
public class TExercise2
{
	public static void main (String[]args)
	{
		System.out.print("Please choose a number : \n 480 \n 481 \n 482 \n 483 \n");
		Scanner scanner = new Scanner(System.in);
		int choosennumber = scanner.nextInt();
		
		switch(choosennumber)
		{
			case 480:
			System.out.print("Multimedia");
			break;
			
			case 481:
			System.out.print("Computer System");
			break;
			
			case 482:
			System.out.print("Software Engineering");
			break;
			
			case 483:
			System.out.print("Computer Network");
			break;
			
			default:
			break;			
		}// 1950462
	}
}