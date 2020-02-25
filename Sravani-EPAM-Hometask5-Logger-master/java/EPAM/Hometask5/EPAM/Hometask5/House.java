package EPAM.Hometask5.EPAM.Hometask5;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class House {
	House()
	{
		Scanner sc = new Scanner(System.in);
		  Logger LOGGER = LogManager.getLogger(ConstructionCost.class);
		  LOGGER.error("Enter the length breadth in psf : ");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		LOGGER.error("Enter your choice : ");
		int ch = sc.nextInt();
		LOGGER.error("1.1200INR Standard Materials");
		LOGGER.error("2.1500INR Above Standard Materials");
		LOGGER.error("3.1800INR High Standard Material");
		LOGGER.error("4.2500INR High Standard Material and Fully Automated Home");
		switch(ch)
		{
		case 1:LOGGER.error("Cost : "+(1200*length*breadth) );
				break;
		case 2:	LOGGER.error("Cost : "+(1500*length*breadth) );
				break;
		case 3:LOGGER.error("Cost : "+(1800*length*breadth) );
				break;
		case 4:LOGGER.error("Cost : "+(2500*length*breadth) );
				break;
		default :LOGGER.error("Enter the valid choice");		
		}
	}
}

