package pbc.naturals.pbc;

public class Priceitem {

        private int image;
        private  String price;
        private  String points;
        private String redeem;
        private String title;


        public Priceitem(int image, String price, String points, String redeem,String title) {
            this.image = image;
            this.price = price;
            this.points = points;
            this.redeem = redeem;
            this.title=title;
        }

        public int getImage() {
            return image;
        }

        public String getPrice() {
            return price;
        }

        public String getPoints() {
            return points;
        }

        public String getRedeem() {
            return redeem;
        }

        public void setImage(int image) {
            this.image = image;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public void setPoints(String points) {
            this.points = points;
        }

        public void setRedeem(String redeem) {
            this.redeem = redeem;
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


