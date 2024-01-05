public class EjemploAutomovil {

    public static void main (String[] args){
        Automovil automovil = new Automovil();


        // Asignacion de valores
        automovil.fabricante = "Ford";
        automovil.marca = "Fiesta";
        automovil.modelo = "Sedan";
        automovil.cilindrada = 1.6;

        Automovil automovilMazda = new Automovil();
        automovilMazda.fabricante = "Mazda";
        automovilMazda.marca = "Mazda 3";
        automovilMazda.modelo = "Sedan";
        automovilMazda.cilindrada = 2.0;

        System.out.println("Instancia Automovil generic"  );
        System.out.println("automovil.fabricante = " + automovil.fabricante);
        System.out.println("automovil.marca = " + automovil.marca);
        System.out.println("automovil.modelo = " + automovil.modelo);
        System.out.println("automovil.cilindrada = " + automovil.cilindrada);


        System.out.println("Instancia Mazda"  );
        System.out.println("automovilMazda.fabricante = " + automovilMazda.fabricante);
        System.out.println("automovilMazda.marca = " + automovilMazda.marca);
        System.out.println("automovilMazda.modelo = " + automovilMazda.modelo);
        System.out.println("automovilMazda.cilindrada = " + automovilMazda.cilindrada);
    }


}
