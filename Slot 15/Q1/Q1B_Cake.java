public class Cake {
    private String maker;
    private int price;
    
    public Cake() {}
    
    public Cake(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    public String getMaker() {
        if (maker != null && maker.length() > 0) {
            int length = maker.length();
            return maker.substring(0, length - 1).toLowerCase() + maker.substring(length - 1).toUpperCase();
        }
        return maker;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    } 
}
