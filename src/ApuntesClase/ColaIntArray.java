package ApuntesClase;
class ColaIntArray {
    private int[] elArray;
    private int primero, ultimo, talla;
    private static final int MAX = 5;

    public ColaIntArray(){
        elArray = new int[MAX];
        primero = 0;
        ultimo = -1;
        talla = 0;
    }
    public int primero(){
        return elArray[primero];
    }
    public void Encolar(int dato){
        if(talla == MAX){
            throw new RuntimeException("Cola llena");
        }
    ultimo = (ultimo+1)%MAX;
    elArray[ultimo] = dato;
    talla++;
    }
    public int desencolar(){
        if(talla == 0){
            throw new RuntimeException("La cola esta vacía");
        }
        int x = elArray[primero];
        elArray[primero] = 0; //ElArray[primero]  = null si fuesen obketos;
        primero = (primero+1)%MAX;
        talla--;
        return x;
    }

    public boolean esVacia(){
        return talla == 0;
    }
}
