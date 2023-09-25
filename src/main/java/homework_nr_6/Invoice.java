package homework_nr_6;

public class Invoice {



    private String model;
    private String productDescription;
    private int quantityPurchasedProducts;
    private double productPrice;

    public Invoice (String model, String productDescription, int quantityPurchasedProducts, double productPrice) {
        this.model = model;
        this.productDescription = productDescription;
        this.quantityPurchasedProducts = quantityPurchasedProducts;
        this.productPrice = productPrice;

    }

    int index;
    public double getAmount ()
    {
        double sum = 0;
        return  quantityPurchasedProducts * productPrice ;
    }


    public String getModel()
    {
        return model;
    }

    public String getProductDescription()
    {
        return productDescription;
    }

    public int getQuantityPurchasedProducts()
    {
        if ( this.quantityPurchasedProducts < 0) {
            return this.quantityPurchasedProducts = 0;
        }
       return this.quantityPurchasedProducts;
    }

    public double getProductPrice()
    {
        if ( this.productPrice < 0) {
            return this.productPrice = 0;
    }

         return this.productPrice;

     }
    public void setModel(String model) {
        this.model = model;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setQuantityPurchasedProducts(int quantityPurchasedProducts) {
        if (this.quantityPurchasedProducts < 0)
        {
            this.quantityPurchasedProducts = 0;
        }
        this.quantityPurchasedProducts=quantityPurchasedProducts;
    }

    public void setProductPrice(double productPrice)
    {
        if (this.productPrice < 0)
        {
            this.productPrice = 0;
        }
        this.productPrice = productPrice;
    }

    public static void main(String[] args) {

        Invoice i1 = new Invoice (
                "",
                "washMachine",
                -20,
                -30.87);


        i1.setQuantityPurchasedProducts(-50);
        System.out.println(i1.getProductPrice());
        System.out.println(i1.getQuantityPurchasedProducts());
        System.out.println(i1.getAmount());

    }
}





