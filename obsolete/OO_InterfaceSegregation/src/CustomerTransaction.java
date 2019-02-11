import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Reporting, Accounting {

    private List<Product> products;
    private Customer customer;

    public CustomerTransaction(List<Product> products, Customer customer) {
        super();
        this.products = products;
        this.customer = customer;
    }

    /*
     * (non-Javadoc)
     * 
     * @see Reporti ng#getName()
     */
    @Override
    public String getName() {
        return customer.name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see Reporting#getDate()
     */
    @Override
    public Date getDate() {
        return new Date();
    }

    /*
     * (non-Javadoc)
     * 
     * @see Reporting#getProductBreakdown()
     */
    @Override
    public String getProductBreakdown() {
        StringBuilder productListing = new StringBuilder();
        for (Product product : products) {
            productListing.append(product);
        }

        return productListing.toString();
    }

    /*
     * (non-Javadoc)
     * 
     * @see Accounting#prepareInvoice()
     */
    @Override
    public void prepareInvoice() {
        System.out.println("Prepared invoice for customer: " + customer.name + "...");
    }

    /*
     * (non-Javadoc)
     * 
     * @see Accounting#chargeCustomer()
     */
    @Override
    public void chargeCustomer() {
        System.out.println("Charged customer...");
    }
}
