public class Automovil {
    String fabricante ;
    String marca= "Prueba";
    String modelo;
    double cilindrada;
    int capacidadEstanque= 40;

    public String verDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("fabricante = ").append(this.fabricante);
        sb.append("\nmarca = ").append(this.marca);
        sb.append("\nmodelo = ").append(this.modelo);
        sb.append("\ncilindrada = ").append(this.cilindrada);
        return sb.toString();
    }

    public String realizarAceleleracion(int rpm){
        return  "El automovil acelera a" + rpm +"    Fabricante   " + this.fabricante;
    }
     public String realizarFrenado(){
        return "El automovil esta frenando" + this.modelo + "   Santy  ";
    }

    public String acelerarFrenar(int rpm){
       String reazlizarAceleracion = this.realizarAceleleracion(rpm);
       String realizarFrenado = this.realizarFrenado();
       return  reazlizarAceleracion + "\n" + realizarFrenado;
    }


    //Calcular consumo principio de sobrecarga de metodos
    public float calcularConsumo (float km, float porcentajeGasolina){
        return km/(porcentajeGasolina*capacidadEstanque);
    }

    public float calcularConsumo (float km, int porcentajeGasolina){
        return km/((porcentajeGasolina/100f)*capacidadEstanque);
    }


}
