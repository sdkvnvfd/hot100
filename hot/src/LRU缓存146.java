import java.util.HashMap;
import java.util.Map;

public class LRU缓存146 {
}
class LRUCache146 {
    class Dlinked{
        int key;
        int value;
        Dlinked pre;
        Dlinked next;
        public Dlinked(){};
        public Dlinked(int key
        ,int value){
            this.key=key;
            this.value=value;
        };
    }
    int size;
    int capacity;
    Dlinked head;
    Dlinked tail;
    Map<Integer,Dlinked> map=new HashMap<>();
    public LRUCache146(int capacity) {
        this.size=0;
        this.capacity=capacity;
        head=new Dlinked();
        tail=new Dlinked();
        head.next=tail;
        tail.pre=head;
    }

    public int get(int key) {
        Dlinked node=map.get(key);
        if(node==null)
            return -1;
        moveToHead(node);
        return node.value;

    }

    private void moveToHead(Dlinked node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(Dlinked node) {
        node.pre.next=node.next;
        node.next.pre=node.pre;
    }

    public void put(int key, int value) {
        Dlinked node=map.get(key);
        if(node==null){
            Dlinked newNode=new Dlinked(key,value);
            addToHead(newNode);
            map.put(key,newNode);
            size++;
            if(size>capacity){
                Dlinked delNode=removeTail();
                map.remove(delNode.key);
                size--;
            }

        }else{
            node.value=value;
            moveToHead(node);
        }

    }

    private Dlinked removeTail() {
        Dlinked node=tail.pre;
        removeNode(node);
        return node;

    }

    private void addToHead(Dlinked newNode) {
        newNode.pre=head;
        newNode.next=head.next;
        head.next.pre=newNode;
        head.next=newNode;


    }
}
