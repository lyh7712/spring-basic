package lyh7712.springbasic.singleton;

public class StatefulService {

    // Stateful - 공유 변수
    private int price;

    public void order(String name, int price) {
        System.out.println("name = " + name + "price + " + price);
        this.price = price; // 문제 발생
    }

    public int getPrice() {
        return price;
    }
}
