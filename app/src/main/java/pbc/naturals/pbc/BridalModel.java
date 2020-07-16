package pbc.naturals.pbc;

public class BridalModel {
    private String bridaltitle1;
    private int image1;
    private String bridaldescription1;
    private String bridaltitle2;
    private int image2;
    private String bridaldescription2;


    public BridalModel(String bridaltitle1, int image1, String bridaldescription1, String bridaltitle2, int image2, String bridaldescription2) {
        this.bridaltitle1 = bridaltitle1;
        this.image1 = image1;
        this.bridaldescription1 = bridaldescription1;
        this.bridaltitle2 = bridaltitle2;
        this.image2 = image2;
        this.bridaldescription2 = bridaldescription2;
    }

    public String getBridaltitle1() {
        return bridaltitle1;
    }

    public int getImage1() {
        return image1;
    }

    public String getBridaldescription1() {
        return bridaldescription1;
    }

    public String getBridaltitle2() {
        return bridaltitle2;
    }

    public int getImage2() {
        return image2;
    }

    public String getBridaldescription2() {
        return bridaldescription2;
    }

    public void setBridaltitle1(String bridaltitle1) {
        this.bridaltitle1 = bridaltitle1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public void setBridaldescription1(String bridaldescription1) {
        this.bridaldescription1 = bridaldescription1;
    }

    public void setBridaltitle2(String bridaltitle2) {
        this.bridaltitle2 = bridaltitle2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public void setBridaldescription2(String bridaldescription2) {
        this.bridaldescription2 = bridaldescription2;
    }
}
