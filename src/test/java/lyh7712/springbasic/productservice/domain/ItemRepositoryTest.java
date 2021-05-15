package lyh7712.springbasic.productservice.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;


class ItemRepositoryTest {


    ItemRepository repository = new ItemRepository();

    @AfterEach
    public void afterEach() {
        repository.deleteAll();
    }

    @Test
    void save() {
        Item item = new Item( "itemA", 10000, 10);
        Item saveItem = repository.save(item);

        Assertions.assertThat(saveItem.getId()).isEqualTo(item.getId());
    }

    @Test
    void findAll() {
        Item item = new Item( "itemA", 10000, 10);
        Item item2 = new Item( "itemB", 20000, 20);
        repository.save(item);
        repository.save(item2);

        List<Item> result =repository.findAll();

        Assertions.assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void update() {
        Item item = new Item( "itemA", 10000, 10);
        repository.save(item);

        repository.update(item.getId(), new Item("itemB", 20000, 20));

        Item findItem = repository.findById(item.getId());

        Assertions.assertThat(findItem.getName()).isEqualTo("itemB");
        Assertions.assertThat(findItem.getPrice()).isEqualTo(20000);
        Assertions.assertThat(findItem.getQuantity()).isEqualTo(20);
    }
}