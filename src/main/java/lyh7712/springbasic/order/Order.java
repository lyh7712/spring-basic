package lyh7712.springbasic.order;

public class Order {

    private Long id;
    private String itemName;
    private int itemPrice;
    private int discount;

    public Order(Long id, String itemName, int itemPrice, int discount) {
        this.id = id;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discount = discount;
    }

    int Calculate() {
        return itemPrice - discount;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discount=" + discount +
                '}';
    }
}
