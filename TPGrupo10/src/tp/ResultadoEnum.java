package tp;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ResultadoEnum {

    //metodo de lectura de resultado de partidos
    public static void main(String[] args) {

        // lee los archivos de partidos
        String rutares = "D:\\JAVA\\JAVA_UTN\\TPI\\resultados.csv";


        // crea objetos de la clase File con la ruta de resultados
        File fileres = new File(rutares);


        // convierte el archivo de partidos en una lista
        List<List<String>> lineares = new ArrayList<>();
        Scanner inputStream;

        try {
            inputStream = new Scanner(fileres);

            while (inputStream.hasNext()) {
                String line = inputStream.next();
                String[] values = line.split(";");
                lineares.add(Arrays.asList(values));
            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
// muestra los componentes de la lista
        
        int lineaNo = 1;
        for (List<String> line : lineares) {
            int columNo = 1;
            for (String value : line) {
                System.out.println("Linea " + lineaNo + " Column " + columNo + ": " + value);

                columNo++;
            }
            lineaNo++;
        }
        //toma de la matriz los elementos que corresponden a los equipos y los goles
        //PREGUNTAR COMO CARGAR LOS PARTIDOS CON UN BUCLE

        String eq1 = lineares.get(0).get(0);
        String eq2 = lineares.get(0).get(3);
        String eq3 = lineares.get(1).get(0);
        String eq4 = lineares.get(1).get(3);
        int g1 = Integer.parseInt(lineares.get(0).get(1));
        int g2 = Integer.parseInt(lineares.get(0).get(2));
        int g3 = Integer.parseInt(lineares.get(1).get(1));
        int g4 = Integer.parseInt(lineares.get(1).get(2));

        // descripcion de la clase equipo (Me pide 2 argumentos para equipo)
        String des1 = "AFA";
        String des2 = "SAFF";
        String des3 = "PZPN";
        String des4 = "FMF";

        System.out.println("= = = = = = = = = = = = = = = ");

        // carga de los objetos equipo
        Equipo equipo1 = new Equipo(eq1, des1);
        Equipo equipo2 = new Equipo(eq2, des2);
        Equipo equipo3 = new Equipo(eq3, des3);
        Equipo equipo4 = new Equipo(eq4, des4);

        // carga de los objetos partido
        Partido partido1 = new Partido(eq1, eq2, g1, g2);
        Partido partido2 = new Partido(eq3, eq4, g3, g4);

        System.out.println(partido1.getEquipo1());
        System.out.println(partido1.getGolesEquipo1());
        System.out.println(partido1.getEquipo2());
        System.out.println(partido1.getGolesEquipo2());
        System.out.println(partido2.getEquipo1());
        System.out.println(partido2.getGolesEquipo1());
        System.out.println(partido2.getEquipo2());
        System.out.println(partido2.getGolesEquipo2());

        // calcula quien gana los partidos

        if (g1 > g2) {
            String ganador = eq1;
            String perdedor = eq2;
            System.out.println("Ganador: " + ganador);
            System.out.println("Perdedor: " + perdedor);

        } else if (g1 < g2) {
            String ganador = eq2;
            String perdedor = eq1;
            System.out.println("Ganador: " + ganador);
            System.out.println("Perdedor: " + perdedor);
        } else {

            System.out.println("Empate: " + eq1);
            System.out.println("Empate: " + eq2);
        }

        if (g3 > g4) {
            System.out.println("Empate: " + eq3);
            System.out.println("Empate: " + eq4);

        } else if (g3 < g4) {
            String ganador = eq3;
            String perdedor = eq4;
            System.out.println("Ganador: " + ganador);
            System.out.println("Perdedor: " + perdedor);
        } else {
            String ganador = eq4;
            String perdedor = eq3;
            System.out.println("Ganador: " + ganador);
            System.out.println("Perdedor: " + perdedor);
        }
        System.out.println("= = = = = = = = = = = = = = = ");

        // lee los archivos de pronosticos

        String rutapron = "D:\\JAVA\\JAVA_UTN\\TPI\\pronosticos.csv";

        // crea objetos de la clase File con la ruta de pronosticos
        File filepron = new File(rutapron);

        List<List<String>> lineapron = new ArrayList<>();
        //Scanner inputStream;

        try {
            inputStream = new Scanner(filepron);

            while (inputStream.hasNext()) {
                String line = inputStream.next();
                String[] values = line.split(",");
                lineapron.add(Arrays.asList(values));
            }
            inputStream.close();

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }

        int lineNo = 1;
        for (List<String> line : lineapron) {
            int columnNo = 1;
            for (String value : line) {
                System.out.println("Line " + lineNo + " Column " + columnNo + ": " + value);
                columnNo++;
            }
            lineNo++;
        }

        String p11 = lineapron.get(0).get(0);
        String p12 = lineapron.get(0).get(1);
        String p13 = lineapron.get(0).get(2);
        String p14 = lineapron.get(0).get(3);
        String p15 = lineapron.get(0).get(4);

        // si no fuerzo el valor p22 a nulo, el if no me da
        String p21 = lineapron.get(1).get(0);
        String p22 = null;
        String p23 = lineapron.get(1).get(2);
        String p24 = null;
        String p25 = lineapron.get(1).get(4);


        if (p12 != null) {
            System.out.println("Pronostico 1: GANADOR: " + p11);
        } else if (p13 != null) {
            System.out.println("Pronostico 1: EMPATE: ");
        } else if (p14 != null) {
            System.out.println("Pronostico 1: GANADOR: " + p15);
        } else {
            System.out.println("No hay pronosticos ");
        }

        if (p22 != null) {
            System.out.println("LUGAR LLENO: ");
        } else if (p23 != null) {
            System.out.println("Pronostico 2: EMPATE: ");
        } else if (p24 != null) {
            System.out.println("Pronostico 2: GANADOR: " + p25);
        } else {
            System.out.println("No hay pronosticos ");
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("\t\t\tPRONOSTICO 1");
        System.out.println("GANAOOR: "+ lineapron.get(0).get(0));
        System.out.println("PERDEDOR " + lineapron.get(0).get(4));

        System.out.println("\t\t\tPRONOSTICO 2");

        System.out.println("EMPATE: " + lineapron.get(1).get(0) + " - " + lineapron.get(1).get(4));


        System.out.println("- - - - - - - - - - - - - - - - - - - -");



    }

}









