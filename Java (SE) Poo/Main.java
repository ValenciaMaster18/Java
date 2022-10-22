import static UI.UIMenu.*;

import java.util.Date;

public class Main{
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor();
        doctor1.validacionCitas(new Date(), "4pm");
        mostrarMenu();
    }
}