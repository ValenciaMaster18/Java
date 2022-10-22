package Hotel;

public class Principal {
    public static void main(String[] args) {
        Hotel piso[] = new Hotel[10];

        piso[0] = new Sencilla("Baño, Cocina, 1-Cuarto, abanico","Sucia","Aparcamiento, Servicio de internet","sencilla",101,12000,"si");
        piso[1] = new Sencilla("Baño, Cocina, 1-Cuarto, abanico","Disponible","Aparcamiento, Servicio de internet","sencilla",102,12000,"no");

        piso[2] = new Sencilla("Baño, Cocina, 1-Cuarto, abanico","Ocupado","Aparcamiento, Servicio de internet","sencilla",202,12000,"si");
        piso[3] = new Sencilla("Baño, Cocina, 1-Cuarto, abanico","Disponible","Aparcamiento, Servicio de internet","sencilla",203,12000,"no");

        piso[4] = new Estandar("Baño doble, Cocina, 2-Cuarto, aire acondicionado","Ocupado","Lavanderia, Aparcamiento, Servicio de internet","dobles",302,15000,"si","si");
        piso[5] = new Estandar("Baño doble, Cocina, 2-Cuarto, aire acondicionado","Ocupado","Lavanderia, Aparcamiento, Servicio de internet","dobles",303,15000,"si","si");
        piso[6] = new Estandar("Baño doble, Cocina, 2-Cuarto, aire acondicionado","Disponible","Lavanderia, Aparcamiento, Servicio de internet","dobles",305,15000,"si","si");

        piso[7] = new Premiun("Baño, Cocina, 2-Cuarto, jacuzzi","Disponible","Lavanderia, Aparcamiento, Servicio de internet, Piscina","suit clase media",402,18000,"Si","Si");
        piso[8] = new Premiun("Baño, Cocina, 2-Cuarto, jacuzzi","Ocupado","Lavanderia, Aparcamiento, Servicio de internet,Piscina","suit clase media",405,1800,"Si","Si");

        piso[9] = new Presidencial("Baño doble, Cocina, 3-Cuarto, piscina privada, balcon vista al mar","Disponible","Lavanderia, Aparcamiento, Servicio de internet, Servicio a la habitacion","suit Presidencial",502,200000,"Si","Si","Si");
        
        for (Hotel elementos : piso) {
            System.out.println(elementos.mensaje());
            System.out.println();
            System.out.println();

        }    
    }

}
