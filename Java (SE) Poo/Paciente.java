public class Paciente {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weigth;
    private double heigth;
    private String blood;

    public String getWeigth() {
    return weigth + "Kg.";
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public String getHeigth() {
        return heigth + "Mts.";
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    Paciente(String name, String email){
        this.name = name;
        this.email = email;
    }


}
