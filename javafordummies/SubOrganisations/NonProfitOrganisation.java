public class NonProfitOrganisation extends Organisation_2 {
    //Function to return 2% of revenue (tax)
    public double getTax() {
	return (getRevenue() * 0.02);
    }
}
