public class Execution {
    public static void main(String[] args) {
        ElectricGuitar guitar = new ElectricGuitar();
        ElectricBassGuitar bassGuitar = new ElectricBassGuitar();
        guitar.play();
        bassGuitar.play();


        System.out.println("New Class Creations");

        guitar = new ElectricGuitar(7);//calling constructor while passing a param
        bassGuitar = new ElectricBassGuitar(5);
        guitar.play();
        bassGuitar.play();
    }
}
