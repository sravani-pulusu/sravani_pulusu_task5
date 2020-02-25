package EPAM.Hometask5.EPAM.Hometask5;
import java.lang.reflect.Constructor;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Interest  {
	Interest()
    {
		double principle,time,rate;
        Scanner scanner = new Scanner(System.in);
        Logger LOGGER = LogManager.getLogger(Constructor.class)
;	        LOGGER.error("Enter principle : ");
        principle=scanner.nextDouble();
        LOGGER.error("Enter rate : ");
        rate=scanner.nextDouble();
        LOGGER.error("Enter time : ");
        time=scanner.nextDouble();
        LOGGER.error("Simple Interest : "+SI(rate,principle,time));
        LOGGER.error("Compound Interest : "+CI(principle,rate,time));
    }
	double SI(double rate, double principle, double time)
	 {
	  return (principle*rate*time)/100;
	 }
	 double CI(double principle, double rate, double time)
	 {
	  return principle*(Math.pow((1+(rate/100)),(time)))-principle;
	 }
}
