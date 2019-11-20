import java.util.*;
public class TExercise3_A
{
	public static void main (String[]args)
	{
		boolean valid = false; int HeroLevel = 0; int Skill = 0; String SkillName = ""; int attkTime = 0; int sdamage = 0;
		Scanner scanner = new Scanner(System.in);
		while(!valid)
		{
			System.out.println("\nWhat's your Hero's level? Please choose from 1 to 5");
			String tstr = scanner.nextLine();
			try
			{
				HeroLevel = Integer.parseInt(tstr);
				if (HeroLevel > 0 && HeroLevel < 5)
					valid = true;
				else
					System.out.println("\nPlease try again... \n");
			}catch (NumberFormatException e)
			{
				System.out.println("\nPlease try again... \n");
			}
		}
		valid = false;
		while(!valid)
		{
			System.out.println("\nWhich skill did your hero used? \n1) Normal Attack \n2) Punch \n3) Kick \n4) Ultimate");
			String tstr = scanner.nextLine();
			try
			{
				Skill = Integer.parseInt(tstr);
				if (Skill > 0 && Skill < 6)
					valid = true;
				else
					System.out.println("\nInvalid Skill! Please try again... \n");
			}catch (NumberFormatException e)
			{
				System.out.println("\nInvalid Skill! Please try again... \n");
			}
			switch(Skill)
			{
				case 1:
				SkillName = "Normal Attack";
				break;
				
				case 2:
				SkillName = "Punch";
				break;
				
				case 3:
				SkillName = "Kick";
				break;
				
				case 4:
				SkillName = "Ultimate";
				break;
			}
		}
		valid = false;
		while(!valid)
		{
			System.out.println("\nHow many time did your hero use the skill "+ SkillName+"?");
			String tstr = scanner.nextLine();
			try
			{
				attkTime = Integer.parseInt(tstr);
					valid = true;
			}catch (NumberFormatException e)
			{
				System.out.println("\nUnknown Respond! Please try again... \n");
			}
		}
		valid = false;
		
		switch(HeroLevel)
		{
			case 1:
			if (Skill == 1)
				sdamage = 4000;
			else if (Skill == 2)
				sdamage = 5000;
			else if (Skill == 3)
				sdamage = 5500;
			else if (Skill == 4)
				sdamage = 8000;
			break;
			
			case 2:
			if (Skill == 1)
				sdamage = 6000;
			else if (Skill == 2)
				sdamage = 7000;
			else if (Skill == 3)
				sdamage = 7500;
			else if (Skill == 4)
				sdamage = 14000;
			break;
			
			case 3:
			if (Skill == 1)
				sdamage = 8000;
			else if (Skill == 2)
				sdamage = 9000;
			else if (Skill == 3)
				sdamage = 9500;
			else if (Skill == 4)
				sdamage = 22000;
			break;
			
			case 4:
			if (Skill == 1)
				sdamage = 10000;
			else if (Skill == 2)
				sdamage = 11000;
			else if (Skill == 3)
				sdamage = 11500;
			else if (Skill == 4)
				sdamage = 26000;
			break;
			
			case 5:
			if (Skill == 1)
				sdamage = 120000;
			else if (Skill == 2)
				sdamage = 13000;
			else if (Skill == 3)
				sdamage = 13500;
			else if (Skill == 4)
				sdamage = 30000;
			break;
			
			default:
			// How did you get here anyway???
			break;
			
		}
		int finalDamage = sdamage * attkTime;
		System.out.println("\nLevel "+ HeroLevel+ " hero used "+ SkillName +" "+ attkTime +" times and give total damage of "+finalDamage);
	}
}