package lyh7712.springbasic.productservice.domain;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemRepository {

    private final static Map<Long, Item> store = new HashMap<>();
    private static Long SEQUENCE = 0L;

    public Item save(Item item) {
        item.setId(++SEQUENCE);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id) {
        return store.get(id);
    }

    public List<Item> findAll() {
        return new ArrayList<>(store.values());
    }

    public void update(Long id, Item updateParameter) {
        Item findItem = findById(id);
        findItem.setName(updateParameter.getName());
        findItem.setPrice(updateParameter.getPrice());
        findItem.setQuantity(updateParameter.getQuantity());
    }

    public void deleteAll() {
        store.clear();
    }
}
