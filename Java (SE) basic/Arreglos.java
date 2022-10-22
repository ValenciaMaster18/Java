public class Arreglos {
    public static void main(String[] args) {
        
        // El valor que pongamos es un valor fijo
        String[] androidVersion = new String[17];

        // Como agregar elementos a un array de 1 dimension
        androidVersion[0] = "Aple pie";
        androidVersion[1] = "Banana";
        androidVersion[2] = "Cupcake";
        androidVersion[3] = "Donut";

        // Como ver elementos de un array de una dimension
        for (int i = 0; i < androidVersion.length; i++) {
            System.out.println(androidVersion[i]);
        }
        
        // Un forech
        for (String version : androidVersion) {
            System.out.println(version);
        }
        
        // Arreglo de dos dimensiones 
        String[][] cities = new String[4][2];

        // Como agregar elementos a un array de 2 dimension
        cities[0][0] = "Colombia ";
        cities[0][1] = "Medillin ";
        cities[1][0] = "Colombia ";
        cities[1][1] = "Bogota ";
        cities[2][0] = "Mexico ";
        cities[2][1] = "Guadalajara ";
        cities[3][0] = "Mexico ";
        cities[3][1] = "CDMX ";
        
        // Como ver elementos de un array de 2 dimension
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }
        // Un forech
        for (String[] pais: cities){
            for(String ciudad: pais){
                System.out.println(ciudad);
            }
        }  

        // Arreglos de tres dimensiones
        int[][][] numbers = new int[2][2][2];
        
        // Arreglos de cuatro dimensiones
        int[][][][] numebrss = new int[2][2][2][2];
    }
}
