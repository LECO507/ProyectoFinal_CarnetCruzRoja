package com.ceste;


import java.io.IOException;
import java.util.*;
import java.util.Iterator;

/**
 * Created by leco2_000 on 28/4/2016.
 */
public class Main{
    public static void main(String[] args) throws IOException{
        int opcion;
        ArrayList<CarnetCruzRoja> carnets = new ArrayList<>();
        CarnetCruzRoja c1 = new CarnetCruzRoja(1);
        c1.setDni("Y956482J");
        c1.setNombre("Luis");
        c1.setApellido("Calderin");
        c1.setProvincia("Zaragoza");
        c1.setLocalidad("Zaragoza");
        c1.setServicio("Voluntario");
        c1.setCaducidad("12-07-2018");

        CarnetCruzRoja c2 = new CarnetCruzRoja(2);
        c2.setDni("Y864527J");
        c2.setNombre("Mayorian");
        c2.setApellido("Caballero");
        c2.setProvincia("Zaragoza");
        c2.setLocalidad("Zaragoza");
        c2.setServicio("Voluntario");
        c2.setCaducidad("23-08-2018");

        CarnetCruzRoja c3 = new CarnetCruzRoja(3);
        c3.setDni("Y963458J");
        c3.setNombre("Jorge");
        c3.setApellido("Garrido");
        c3.setProvincia("Zaragoza");
        c3.setLocalidad("Zaragoza");
        c3.setServicio("Voluntario");
        c3.setCaducidad("01-08-2019");

        CarnetCruzRoja c4 = new CarnetCruzRoja(4);
        c4.setDni("Y856427J");
        c4.setNombre("Fitz");
        c4.setApellido("Gerald");
        c4.setProvincia("Zaragoza");
        c4.setLocalidad("Zaragoza");
        c4.setServicio("Voluntario");
        c4.setCaducidad("20-08-2018");

        CarnetCruzRoja c5 = new CarnetCruzRoja(5);
        c5.setDni("Y246586J");
        c5.setNombre("Sheyra");
        c5.setApellido("Oro");
        c5.setProvincia("Zaragoza");
        c5.setLocalidad("Zaragoza");
        c5.setServicio("Voluntario");
        c5.setCaducidad("10-07-2018");

        carnets.add(c1);
        carnets.add(c2);
        //carnets.add(c2);
        carnets.add(c3);
        carnets.add(c4);
        carnets.add(c5);

        Set<CarnetCruzRoja> hashSet = new HashSet<>();

        hashSet.add(c1);
        //hashSet.add(c1);
        hashSet.add(c2);
        hashSet.add(c3);
        hashSet.add(c4);
        hashSet.add(c5);


        Set<CarnetCruzRoja> setApellido = new TreeSet<>();
        setApellido.add(c1);
        setApellido.add(c2);
        setApellido.add(c3);
        setApellido.add(c4);
        setApellido.add(c5);

        Comparator dniComparator = new CruzRojaDniComparator();
        Set<CarnetCruzRoja> setDni = new TreeSet<CarnetCruzRoja>(dniComparator);
        CruzRojaDniComparator comparatorDni = new CruzRojaDniComparator();
        setDni.add(c1);
        setDni.add(c2);
        setDni.add(c3);
        setDni.add(c4);
        setDni.add(c5);

        Comparator fechaComparator = new CruzRojaFechaComparator();
        Set<CarnetCruzRoja> setFecha = new TreeSet<CarnetCruzRoja>(fechaComparator);
        CruzRojaFechaComparator comparatorFecha = new CruzRojaFechaComparator();
        setFecha.add(c1);
        setFecha.add(c2);
        setFecha.add(c3);
        setFecha.add(c4);
        setFecha.add(c5);

        ExportarCarnets2CVS ficheroCsv = new ExportarCarnets2CVS(carnets);
        CarnetCruzRojaDb ficheroSer = new CarnetCruzRojaDb(carnets);
        ficheroCsv.escribirArrayList();
        ficheroSer.escribirArrayList();

        do {
            CarnetCruzRoja cruzRoja = new CarnetCruzRoja(6);
            System.out.println("1. Agregar Carnet\n2. ArrayList\n3. HashSet\n4. Ordenar Apellidos\n5. Ordenar Dni\n6. Ordenar Fecha\n7. Fichero Csv\n8. Fichero Ser\n9. Salir");
            System.out.print("\n\nOpcion: ");
            Scanner lee = new Scanner(System.in);
            opcion = lee.nextInt();
            switch (opcion){
                case 1:
                    cruzRoja.datos();
                    carnets.add(cruzRoja);
                    ficheroCsv.escribirArrayList();
                    ficheroSer.escribirArrayList();
                    setApellido.add(cruzRoja);
                    hashSet.add(cruzRoja);
                    setDni.add(cruzRoja);
                    setFecha.add(cruzRoja);
                    break;
                case 2:
                    cruzRoja.mostrarArrayList(carnets);
                    System.in.read();
                    break;
                case 3:
                    cruzRoja.mostrarHashSet(hashSet);
                    System.in.read();
                    break;
                case 4:
                    cruzRoja.mostrarApelldio(setApellido);
                    System.in.read();
                    break;
                case 5:
                    comparatorDni.mostrarDni(setDni);
                    System.in.read();
                    break;
                case 6:
                    comparatorFecha.mostrarFecha(setFecha);
                    System.in.read();
                    break;
                case 7:
                    ficheroCsv.mostrarCsv();
                    System.in.read();
                    break;
                case 8:
                    ficheroSer.mostrarSer();
                    System.in.read();
                    break;
                case 9:
                    break;
                default:
                    break;
            }
        }while(opcion != 9);
    }
}
