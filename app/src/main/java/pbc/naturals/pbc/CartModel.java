package pbc.naturals.pbc;

public class CartModel {

    private  String title;
    private String price;
    private String redeem;

    public CartModel(String title, String price, String redeem) {
        this.title = title;
        this.price = price;
        this.redeem = redeem;
    }
    public CartModel(){}

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public String getRedeem() {
        return redeem;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setRedeem(String redeem) {
        this.redeem = redeem;
    }
}
