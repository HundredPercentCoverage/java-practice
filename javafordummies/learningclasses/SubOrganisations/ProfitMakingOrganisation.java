package useorganisations;

public class ProfitMakingOrganisation extends Organisation_2 {
    //Function to return 10% of revenue (tax)
    public double getTax() {
	return (getRevenue() * 0.1);
    }
}
