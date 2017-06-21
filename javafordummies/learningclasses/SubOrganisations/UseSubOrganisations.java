package useorganisations;

import static java.lang.System.out;

//This main class uses the Organisation_2 subclasses
public class UseSubOrganisations {

    public static void main(String[] args) {
	//Create organisations
	ProfitMakingOrganisation businessOne, businessTwo;
	NonProfitOrganisation charityOne, charityTwo;
	
	businessOne = new ProfitMakingOrganisation();
	businessTwo = new ProfitMakingOrganisation();
	
	charityOne = new NonProfitOrganisation();
	charityTwo = new NonProfitOrganisation();
	
	//Set info
	businessOne.setName("Globex Corporation");
	businessOne.setRevenue(1000000.99);
	
	businessTwo.setName("Microshite");
	businessTwo.setRevenue(23560924.56);
	
	charityOne.setName("Help the Children");
	charityOne.setRevenue(600000.38);
	
	charityTwo.setName("AIDS Relief Effort");
	charityTwo.setRevenue(45769.35);
	
	//Display info (non-profits have less tax %)
	out.println("Name: " + businessOne.getName());
	out.printf("Revenue: %.2f\n", businessOne.getRevenue());
	out.printf("Tax: %.2f\n\n", businessOne.getTax());
	
	out.println("Name: " + businessTwo.getName());
	out.printf("Revenue: %.2f\n", businessTwo.getRevenue());
	out.printf("Tax: %.2f\n\n", businessTwo.getTax());
	
	out.println("Name: " + charityOne.getName());
	out.printf("Revenue: %.2f\n", charityOne.getRevenue());
	out.printf("Tax: %.2f\n\n", charityOne.getTax());
	
	out.println("Name: " + charityTwo.getName());
	out.printf("Revenue: %.2f\n", charityTwo.getRevenue());
	out.printf("Tax: %.2f\n\n", charityTwo.getTax());
    }
}
