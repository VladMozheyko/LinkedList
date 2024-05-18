import java.util.ArrayList;

/**
 * Класс-узел для списка
 * @version - 1
 * @author - VLad
 * @data - 18.05.2024
 */
public class Item {
    int data;
    Item next;

    public Item(int data) {
        this.data = data;
    }


    public Item(int data, Item next) {
        this.data = data;
        this.next = next;
    }
}
