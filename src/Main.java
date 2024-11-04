
public class Main {
    public static void main(String[] args) {
        ResidentialSite site1 = new ResidentialSite(2.0, 0.3);
        LifelineSite site2 = new LifelineSite(5.0, 0.5);

        System.out.println("Residential Site base: " + site1.getBase());
        System.out.println("Residential Site tax: " + site1.getTax(site1.getBase()));

        System.out.println("Lifeline Site base: " + site2.getBase());
        System.out.println("Lifeline Site tax: " + site2.getTax(site2.getBase()));

        System.out.println("Residential Site billable amount: " + site1.getBillableAmount());
        System.out.println("Lifeline Site billable amount: " + site2.getBillableAmount());

    }
}
