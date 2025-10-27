package PilaColaPractica;

public class Cola {
    private Nodo frente;
    private Nodo fin;
    
    public Cola(){
        this.fin=null;
        this.frente=null;
    }
    
    public boolean estaVacia(){
        return frente==null;
    }
    
    public void encolar(String valor){
        Nodo n= new Nodo(valor);
        if(estaVacia()){
            frente=n;
            fin=n;
        }else{
            fin.setSiguiente(n);
            fin=n;
        }
        System.out.println("Elemento encolado" + valor);
    }
    
    public String desencolar(){
        if(estaVacia()){
            System.out.println("La cola esta vacia");
            return "";
        }
        String valor=frente.getValor();
        frente= frente.getSiguiente();
        if(frente==null){
            fin=null;
        }
        System.out.println("Elemento desencolado" +  valor);
        return valor;
    }
    
    public String frente(){
        if(estaVacia()){
            System.out.println("La cola esta vacia");
            return "";
        }
        return frente.getValor();
    }
    
    public void mostrar(){
        if(estaVacia()){
            System.out.println("La cola esta vacia");
            return;
        }
        System.out.println("Contenido de la cola:");
        
        Nodo aux=frente;
        while(aux!=null){
            System.out.println(aux.getValor());
            aux=aux.getSiguiente();
        }
    }
    public String mostrarWeb(){
        String resultado="";
        if(estaVacia()){
            return "Cola Vacia";
        }
        Nodo aux=frente;
        while(aux!=null){
            resultado+=aux.getValor() +"\n";
            aux=aux.getSiguiente();
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Cola c=new Cola();
        c.encolar("Carlos");
        c.encolar("Juan");
        c.encolar("Luis");
        c.mostrar();
        System.out.println("Frente"+c.frente());   
        c.encolar("Flor");
        c.mostrar();
        c.desencolar();
        c.mostrar();
        
    }
}
