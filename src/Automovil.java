public class Automovil {
    private   String fabricante ;
    private String marca= "Prueba";
    private String modelo;
    private  double cilindrada;
    private int capacidadEstanque= 40;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }









    public String verDetalle(){
        StringBuilder sb = new StringBuilder();

        return  "auto.fabricante = " + this.fabricante + "\n" +
                "auto.marca = " + this.marca + "\n" +
                "auto.modelo = " + this.modelo + "\n" +
                "auto.cilindrada = " + this.cilindrada + "\n" +
                "auto.capacidadEstanque = " + this.capacidadEstanque ;
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
