package Main;

public class Cola {
    private Nodo first;
    private Nodo last;
    private int e;

    public Cola() {
        this.first = null;
        this.last = null;
    }

    public boolean esVacia(){
        if(first==null){
            return true;
        }
        return false;
    }
    
    public void Encolar(Object item){
        Nodo aux = new Nodo(item);
        if(esVacia()){
            first = aux;
            last = aux;
        }else{
            last.setNext(aux);
            last = aux;          
        }
        e++;
    }
    
    public Object DesEncolar(){
        Object aux = first.getItem();
        if (esVacia()){
            return null;            
        }else{
            first = first.getNext();
            e--;
            return aux;   
        }
    }
    
    public int Longitud(){
        return e;
    }
    
    public void VerCola(){
        System.out.println("====DATOS====");
        Nodo aux = first;
        int cont=1;
        while(aux!=null){
            System.out.println("item["+cont+"] = "+aux.getItem());
            cont++;
            aux = aux.getNext();           
        }
    }
}
