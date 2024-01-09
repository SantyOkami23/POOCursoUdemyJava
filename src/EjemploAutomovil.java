public class EjemploAutomovil {

    public static void main (String[] args){

        // Asignacion de valores Subaru
        Automovil automovilFord = new Automovil("Ford","Fiesta");
        automovilFord.setModelo("Sedan");
        automovilFord.setCilindrada(1.6);

        // Asignacion de valores Mazda
        Automovil automovilMazda = new Automovil("Mazda","Mazda 3 ","Sedan",2.0,45,"Rojo");

        Automovil automovilCacharro = new Automovil("Cacharro","Mazda 3 ","Sedan",2.0,45,"Rojo");



        Automovil automovilNissan = new Automovil();


        System.out.println(automovilCacharro.verDetalle());
        System.out.println(automovilMazda.verDetalle());
        System.out.println(automovilFord.verDetalle());

        System.out.println(automovilMazda.acelerarFrenar(3000));

        System.out.println("Kilometros por litro  Ford  " + automovilFord.calcularConsumo(300, 0.6f));
        System.out.println("Kilometros por litro Mazda  " + automovilMazda.calcularConsumo(300, 60));


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
