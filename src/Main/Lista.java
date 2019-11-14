package Main;

import java.util.HashSet;

public class Lista {
    private Nodo head;

    public Lista() {
        this.head = new Nodo();
    }

    public Lista(Object item, Nodo next) {
        this.head.setItem(item);
        this.head.setNext(next);
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }
    
    public boolean esVacio(){
        if(head.getItem()==null && head.getNext()==null){
            return true;
        }else{
            return false;
        }
    }
    
    public Nodo Recorrido(int pos){
        Nodo x = head;
        try{
            int cant=1;
            while(cant!=pos){
                x = x.getNext();
                cant++;
            }
        }catch(Exception e){
            System.out.println("Error Recorrido"+e);
        }
        return x;
    }
    
    public int Longitud(){
        if(esVacio()){
            return 0;
        }else{
            Nodo x = head;
            int cant=1;
            while(x.getNext()!=null){
                x = x.getNext();
                cant++;
            }
            return cant;
        }
    }
    
    public Object Item(int pos){
        Nodo aux = Recorrido(pos);
        return aux.getItem();
    }
    
    public int Posicion(Object item){
        if(esVacio()){
            return 0;
        }else{
            Nodo aux = head;
            int cant=1;
            try{
                while(aux.getItem().toString()!=item && cant<=Longitud()){
                    cant++;
                    if(aux.getNext()==null){
                        return 0;
                    }else{
                        aux = aux.getNext();
                    }
                }
                
            }catch(Exception e){
                System.out.println("Error en Posición"+e);
            }
            return cant;
        }
    }
    
    public boolean ExisteItem(Object item){
        Nodo x = head;
        try{
            while(x!=null){
                if(x.getItem()==item){
                    return true;
                }else{
                    x = x.getNext();
                }
            }
        }catch(Exception e){
            System.out.println("Error Recorrido"+e);
        }
        return false;  
    }
    
    public void Agregar(Object item){
        if(esVacio()==true){
            head.setItem(item);
        }else{
            Nodo aux = Recorrido(Longitud());
            Nodo x = new Nodo(item, null);
            aux.setNext(x);
        }
    }
    
    public void Insertar(Object item, int pos){
        try{
            if(pos==1){
                if(esVacio()==true){
                    head.setItem(item);
                }else{
                    Nodo x = new Nodo(head.getItem(),head.getNext());
                    head.setItem(item);
                    head.setNext(x); 
                }
            }else{
                Nodo aux = Recorrido(pos-1);
                Nodo x = new Nodo(item,aux.getNext());
                aux.setNext(x);
            }       
        }catch(Exception e){
            System.out.println("Error en Insertar"+e);
        }
    }
    
    public void EliminarPorPos(int pos){
        try{
            Nodo aux = Recorrido(pos-1);
            aux.setNext(aux.getNext().getNext());
            aux.getNext().setNext(null);            
        }catch(Exception e){
            System.out.println("Error en EliminarPorPos"+e);
        }
    }
    
    public void MostrarNodo(Lista x, String name){
        System.out.println("======Lista "+name+"======");
        for(int i=1;i<x.Longitud()+1;i++){
            System.out.println("Item["+i+"]: "+x.Item(i));
        }
        System.out.println();
    }
    
    public void DividirLista(Lista x, Object y){
        Lista L1 = new Lista();
        Lista L2 = new Lista();
        int pos = x.Posicion(y);
        for(int i=0;i<pos;i++){
            L1.Insertar(x.Item(i), i);
        }
        int j=1;
        for(int i=pos;i<x.Longitud()+1;i++){
            L2.Insertar(x.Item(i), j);
            j++;
        }
    }
    
}
