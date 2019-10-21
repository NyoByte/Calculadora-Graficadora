package Main;

public class Pila {
    private Nodo cima;
    private int n;
    
    public Pila(){
    }
    
    public boolean esVacia(){
        if (cima==null) {
            return true;
        }
        return false;
    }
    
    public void Apilar(Object item){
        Nodo aux = new Nodo(item);
        if (esVacia()) {
            cima = aux;
        }else{
            aux.setNext(cima);
            cima = aux;
        }
        n++;
    }
    
    public Object Desapilar(){
        Object aux = cima.getItem();
        if (esVacia()){
            return null;
        }else{
            cima = cima.getNext();
            n--;
            return aux;
        }
    }
    
    public Object Cima(){
        if (esVacia()){
            return null;
        }else{
            return cima.getItem();
        }
    }
    
    public int Longitud(){
        return n;
    }
    
    public void VerPila(){
        System.out.println("====DATOS====");
        Nodo aux = cima;
        int cont=1;
        while(aux!=null){
            System.out.println("item["+cont+"] = "+aux.getItem());
            cont++;
            aux = aux.getNext();           
        }
    }
}
