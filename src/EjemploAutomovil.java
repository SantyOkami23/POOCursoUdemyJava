public class EjemploAutomovil {

    public static void main (String[] args){
        Automovil automovilFord = new Automovil();


        // Asignacion de valores Subaru
        automovilFord.fabricante = "Ford";
        automovilFord.marca = "Fiesta";
        automovilFord.modelo = "Sedan";
        automovilFord.cilindrada = 1.6;

        // Asignacion de valores Mazda
        Automovil automovilMazda = new Automovil();
        automovilMazda.fabricante = "Mazda";
        automovilMazda.marca = "Mazda 3";
        automovilMazda.modelo = "Sedan";
        automovilMazda.cilindrada = 2.0;


        System.out.println(automovilMazda.verDetalle());
        System.out.println(automovilFord.verDetalle());

        System.out.println(automovilMazda.acelerarFrenar(3000));


/*
        System.out.println("Instancia Automovil generic"  );
        System.out.println("automovilFord.fabricante = " + automovilFord.fabricante);
        System.out.println("automovilFord.marca = " + automovilFord.marca);
        System.out.println("automovilFord.modelo = " + automovilFord.modelo);
        System.out.println("automovilFord.cilindrada = " + automovilFord.cilindrada);


        System.out.println("Instancia Mazda"  );
        System.out.println("automovilMazda.fabricante = " + automovilMazda.fabricante);
        System.out.println("automovilMazda.marca = " + automovilMazda.marca);
        System.out.println("automovilMazda.modelo = " + automovilMazda.modelo);
        System.out.println("automovilMazda.cilindrada = " + automovilMazda.cilindrada);
  */
    }


}
