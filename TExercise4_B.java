import java.util.*;
public class TExercise4_B
{
	public static void main (String[]args)
	{
		boolean tutorial = false; int choice = 0;
		System.out.println("\n\n\n\n\n\n\n*************** Welcome to the world of Pokemon *************** \n Prof. Oak : Hello Ash! , please make yourself at home.\n Oh and You may now choose your very first pokemon!");
		Scanner scanner = new Scanner(System.in);
		while (!tutorial)
		{
			System.out.println(" Please choose your first pokemon : \n 1) Bulbasaur \n 2) Charmander \n 3) Squirtle \n 4) Pikachu \n What's your choice?");
			String tstr = scanner.nextLine();
			try
			{
				choice = Integer.parseInt(tstr);
				if (choice > 0 && choice < 5)
					tutorial = true;
				else
					System.out.println("\n Prof. Oak : I don't know what are You talking about! So which pokemon would you like to choose?");
			}catch (NumberFormatException e)
			{
				System.out.println("\n Prof. Oak : I don't know what are You talking about! So which pokemon would you like to choose?");
			}
		}
		
		if (choice == 1)
		{
			System.out.println("\n Prof. Oak : I see you've choosen Bulbasaur! It's cute aren't it ?");
			System.out.println("\n Bulbasaur headbutted Prof. Oak as soon as Ash release it from pokemon!\n Looks like this little guy doesn't like stranger huh.");
		}	
		else if (choice == 2)
		{
			System.out.println("\n Prof. Oak : I see you've choosen Charmander! It can burn down Your house so do not tease him!");
			System.out.println("\n Charmander doesn't like the look of Prof. Oak and turn around against him.");
		}		
		else if (choice == 3)
		{
			System.out.println("\n Prof. Oak : I see you've choosen Squirtle! Ah this little guy is the nicest toward me!");
			System.out.println("\n Squirtle behave itself and stay behing Ash.");
		}	
		else if (choice == 4)
		{
			System.out.println("\n Prof. Oak : Pikachu? Well then, good luck to You Ash!");
			System.out.println("\n Pikachu use thunderbolt on Ash and refuse to return to the pokeball!");
		}	
	}
}