package LLD.LRUcache;

import java.util.HashMap;

/*
DLL -----> used to maintain the order
HashMap -----> used to maintain the lookup
LRUCache --->
        - put(key, value)
        - get(key)
 */
class Node{
    int key;
    int value;
    Node next;
    Node prev;

    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class DLL{
    Node head; //dummy node
    Node tail; //dummy node
    public DLL(){
       head = new Node(0,0);
       tail = new Node(0,0);
       head.next = tail;
    }

    void addToHead(Node node){
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;

    }

    void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    void moveToHead(Node node){
        removeNode(node);
        addToHead(node);
    }
}

class LRUCache{
    int capacity; //maximum size of the LRU
    DLL cache;
    HashMap<Integer,Node> lookup_table;
    public LRUCache(int capacity){
        this.capacity = capacity;
        lookup_table = new HashMap<>();
        cache = new DLL();
    }

    public void put(int key,int value){
        if(lookup_table.containsKey(key)){
            Node curr = lookup_table.get(key);
            curr.value = value;
            cache.moveToHead(curr);
        }else{
            Node newNode = new Node(key,value);
            lookup_table.put(key,newNode);
            cache.addToHead(newNode);
            //check if we are exceeding the limit

            // 1 2 3
            // 4 1 2 3
            if(lookup_table.size() > capacity){
                cache.removeNode(cache.tail.prev);
                lookup_table.remove(key);
            }
        }
    }

    public int get(int key){
        if(lookup_table.containsKey(key)){
            Node curr = lookup_table.get(key);
            cache.addToHead(curr);
            return curr.value;
        }else{
            return -1;
        }
    }
}
public class LRU_Cache_Demo {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1,10);
        lruCache.put(2,20);
        lruCache.put(3,30);
        lruCache.put(4,40);
        System.out.println("get calls");
        lruCache.get(2);
    }
}
