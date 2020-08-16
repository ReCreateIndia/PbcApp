package pbc.naturals.pbc;

public class CartModel {

    private  String Title;
    private String Price;
    private String Redeem;

    public CartModel(String title, String price, String redeem) {
        this.Title = title;
        this.Price = price;
        this.Redeem = redeem;
    }
    public CartModel(){}

    public String getTitle() {
        return Title;
    }

    public String getPrice() {
        return Price;
    }

    public String getRedeem() {
        return Redeem;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public void setPrice(String price) {
        this.Price = price;
    }

    public void setRedeem(String redeem) {
        this.Redeem = redeem;
    }
}
