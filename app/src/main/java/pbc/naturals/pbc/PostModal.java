package pbc.naturals.pbc;

public class PostModal {
    private int img;
    private  String tit;
    private  String descrip;

    public PostModal(int image, String title, String description) {
        this.img = image;
        this.tit = title;
        this.descrip = description;
    }

    public int getImg() {
        return img;
    }

    public String getTit() {
        return tit;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}
