public class LinkedList {
    private Item head;
    private Item iterator;


    public LinkedList() {
        head = null;
    }

    public void add(int value){
        if(head == null){
            head = new Item(value);
            iterator = head;
        }
        else {
            Item item = new Item(value);
            iterator.next = item;
            iterator = item;
        }
    }

    public void delete(int index){
        int count = 0;                                   // Счетчик элементов
        Item temp = head;                                // Итератор
        Item prev = head;                                // Предыдущий элемент
        while (temp != null){                            // Обход списка
            if(count == index){                          // Есл нашли индекс, удаляем элемент
                prev.next = temp.next;                   // Предыдущий элемент, теперь ссылается на следующий элемент, таким образом ссылка на текущий элемент теряется и он будет уничтожен
            }
            if(count == 0){                              // Если это первый элемент
                temp = temp.next;                        // Итератор уходит вперед, а предыдущий элемент нет, таким образом у них появляется разрыв в один элемент. prev здесь становится предыдущим элементом
            }
            else {                                       // Когда разрыв есть, увеличиваем каждый элемент на 1
               temp = temp.next;                         // Таким образом проходим по списку и имеем копию предыдущего элемента
               prev = prev.next;
            }
            count++;                                     // Увеличиваем индекс
        }
    }

    public void out(){
        System.out.println("Связный список:");
        Item temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
