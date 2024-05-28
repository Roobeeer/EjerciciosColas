package ApuntesClase;


public class ColaIntEnLa {
    public NodoInt primero,ultimo;
    private int talla;
    private static final int MAX = 5;

    public ColaIntEnLa() {
        primero = null;
        ultimo = null;
        talla = 0;
    }

    public int primero() {
        if (this.talla == 0) {
            throw new RuntimeException();
        }
        return primero.dato;
    }

    public void encolar(int dato) {
        NodoInt n = new NodoInt(dato);
        if(ultimo!=null) {

        }
        ultimo.next = n;
        ultimo = n;

    }

    public int desencolr(){
        if(talla == 0){
            throw new RuntimeException();
        }
        int x = primero.dato;
        primero = primero.next;
        if(primero == null){
            ultimo = null;
        }
        talla--;
        return x;

    }

    public class NodoInt {
        public NodoInt next;
        private int dato;

        public NodoInt(int dato) {
            this.dato = dato;
            this.next = null;
        }
    }

}
