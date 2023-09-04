package animales;

public class Principal {
        
    public static void main(String[] args) {
        
        Animales animal = new Animales();
        
        animal.nombre = "Leon";
        animal.Tipo = "viviparo";
        
        animal.Comer();
        animal.Correr();
        animal.tipo();
    }
}
