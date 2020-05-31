public class Product {
    private String category;
    private String nameProduct;
    private String section;
    private String price;
    private String discount;

    public Product(String category, String nameProduct, String section, String price, String discount){
        this.category=category;
        this.nameProduct=nameProduct;
        this.section=section;
        this.price=price;
        this.discount=discount;
    }

    public String getCategory() {
        return category;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String getSection() {
        return section;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }
    public String toString(){
        return this.category + ";" + this.nameProduct + ";" + this.section + ";" + this.price + ";" + this.discount;
    }
}
