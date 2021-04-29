package lyh7712.springbasic.order;

public interface OrderService {

    Order createOrder(Long id, String itemName, int itemPrice);
}
