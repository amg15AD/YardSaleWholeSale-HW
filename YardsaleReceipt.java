import java.text.SimpleDateFormat;
import java.util.Date;

public class YardsaleReceipt {
    private String productName;
    private double productPrice;
    private int productQty;

    public void yardSaleWholeSale(String productName, int productQty, double productPrice){
        String pattern = "EEEEE, MMMM dd, yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        String thanks = "Thank you. come again!!!";
        double total = productPrice * productQty;
        System.out.printf("Name\tQty\t\tPrice\tTotal" +
                "\n----\t---\t\t-----\t-------" +
                "\n%s\t%d\t\t$%.2f\t%.2f\n\t%s\nPurchased on: "+ date, productName, productQty, productPrice, total, thanks);
    }


}
