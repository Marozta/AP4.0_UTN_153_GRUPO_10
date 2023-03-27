package tp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultado;

    //generador
    public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado) throws FileNotFoundException {
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
    }

    // setters and getters
    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
    }
}
/*
    // agregar metodo de pronosticos

    // lectura de archivo de pronosticos
    String rutapron = "D:\\JAVA\\JAVA_UTN\\TPI\\prnosticos.csv";


    // METODO PARA LEER PRONOSTICOS

    // crea objetos de la clase File con la ruta de los pronosticos



    String rutapron = "D:\\JAVA\\JAVA_UTN\\TPI\\pronosticos.csv";

    File filepron = new File(rutapron);

    List<List<String>> lineapron = new ArrayList<>();
    Scanner inputStream;

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

    int lineaNo = 1;
        for (List<String> line : lineapron) {
        int columNo = 1;
        for (String value : line) {
            System.out.println("Line " + lineaNo + " Column " + columNo + ": " + value);
            columNo++;
        }
        lineaNo++;
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

        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("\t\t\tPRONOSTICO 1");
        System.out.println("LOCAL: " + lineapron.get(0).get(1));
        System.out.println("EMPATE: " + lineapron.get(0).get(2));
        System.out.println("VISITANTE " + lineapron.get(0).get(3));
        System.out.println("\t\t\tPRONOSTICO 2");
        System.out.println("LOCAL: " + lineapron.get(1).get(1));
        System.out.println("EMPATE: " + lineapron.get(1).get(2));
        System.out.println("VISITANTE " + lineapron.get(1).get(3));

        System.out.println("- - - - - - - - - - - - - - - - - - - -");

        if (p12 != null) {
        System.out.println("Pronostico 1: GANADOR: " + p11);
    }

        else if (p13 != null) {
        System.out.println("Pronostico 1: EMPATE: ");
    }

        else if (p14 != null){
        System.out.println("Pronostico 1: GANADOR: " + p15);
    }

        else{
        System.out.println("No hay pronosticos ");
    }


        if (p22 != null) {
        System.out.println("LUGAR LLENO: ");
    }

        else if (p23 != null) {
        System.out.println("Pronostico 2: EMPATE: ");
    }

        else if (p24 != null){
        System.out.println("Pronostico 2: GANADOR: " + p25);
    }
        else{
        System.out.println("No hay pronosticos ");
    }

}
*/