package herencia2;

public class Main {
    public static void main(String[] args) {
        Perro bulldog = new Perro("Juan",12,"Hombre","Bulldog");
        Gato pepa = new Gato("Pepa",2,"Mujer","Gato Europeo");
        Pajaro tucan = new Pajaro("Sebastian",3,"Hombre","R.sulfuratus");

        bulldog.hacer_sonido();
        bulldog.informacion();
        System.out.println("------------------------");
        pepa.hacer_sonido();
        pepa.informacion();
        System.out.println("------------------------");
        tucan.hacer_sonido();
        tucan.informacion();
        
    }
}
