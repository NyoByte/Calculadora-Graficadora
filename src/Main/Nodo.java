package Main;

public class Nodo {
    private Object item;
    private Nodo next;
    
    public Nodo(){
    }
    
    public Nodo(Object item){
        this.item = item;
    }
    
    public Nodo(Object item, Nodo next){
        this.item = item;
        this.next = next;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return item.toString();
    }
    
}
