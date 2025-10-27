package PilaColaPractica;

public class Pila {

    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void apilar(String nombre) {
        Nodo n = new Nodo(nombre);
        n.setSiguiente(cima);
        cima = n;
        System.out.println("Elemento apilado:" + nombre);
    }

    public String despilar() {
        if (cima == null) {
            System.out.println("La pila esta vacia");
            return "";
        }
        String valor = cima.getValor();
        cima = cima.getSiguiente();
        System.out.println("Elemento desapilado" + valor);
        return valor;
    }

    public String cima() {
        if (cima == null) {
            System.out.println("La pila esta vacia");
            return "";
        }
        return cima.getValor();
    }

    public void mostrar() {
        if (cima == null) {
            System.out.println("La pila esta vacia");
            return;
        }
        System.out.println("Contenido de la Pila:");
        Nodo aux = cima;
        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getSiguiente();
        }
    }

     public String pilamostrarWeb(){
        String resultado="";
        if(estaVacia()){
            return "Pila Vacia";
        }
        Nodo aux=cima;
        while(aux!=null){
            resultado+=aux.getValor() +"\n";
            aux=aux.getSiguiente();
        }
        return resultado;
    }
    
    
    public static void main(String[] args) {
        Pila p = new Pila();
        p.apilar("Carlos");
        p.apilar("Juan");
        p.apilar("Luis");
        System.out.println(p.cima());
        p.apilar("Flor");
        p.mostrar();
        p.despilar();
        p.mostrar();
        p.despilar();
        p.despilar();
        p.despilar();
        p.despilar();
    }
}
