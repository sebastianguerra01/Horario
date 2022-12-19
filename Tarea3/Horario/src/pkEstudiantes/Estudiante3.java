package pkEstudiantes;
import java.util.Scanner;

    public class Estudiante3 {
                                private String nombre;
                                private String colegio;
                                private char sexo; 
                                private int edad;
                                private int codigo_unico;

            public Estudiante3 (String nombre,
                String colegio,
                char             sexo, 
                int edad,
                int codigo_unico){

                    this.nombre = nombre;
                    this.colegio = colegio;
                    this.sexo = sexo;
                    this.edad = edad;
                    this.codigo_unico = codigo_unico;
                    }

        public void Show_Information3()
        {
            String materia;
            int pos_hora, pos_dia;

            Scanner sc = new Scanner(System.in);

                System.out.println("A continuacion se muestra la informacion de estudiante elegido: \n");

                System.out.println("Nombre del estudiante: "+ nombre);
                System.out.println("Colegio del estudiante: "+ colegio);
                System.out.println("Sexo del estudiante: "+ sexo);
                System.out.println("Edad del estudiante: "+ edad);
                System.out.println("Codigo Unico del estudiante: "+ codigo_unico);

                System.out.println("\n\nHorario del estudiante: \n");


                String matriz [][]  ={  {"0) ----------","1) LUNES     " ,"2)  MARTES    " ,"3) MIERCOLES    ", "4) JUEVES    ", "5) VIERNES    ", "6) SABADO     "},
                {"1) 7 - 9 AM ", " ----------  ", " ----------   ", "----------   ", "----------  ", "----------", "  ----------",},
                {"2) 9 - 11 AM ", " ----------   ", "----------   ", "----------   ", "----------  ", "----------", "  ----------",},
                {"3) 11 - 13 PM ", "----------   ", "(ALMUERZO)   ", "(ALMUERZO)  ", " ----------  ", "----------", "  (ALMUERZO)",},
                {"4) 14 - 16 PM ", "(ALMUERZO)   ", "----------   ", "----------   ", "(ALMUERZO)  ", "(ALMUERZO)", "  ----------",},
                {"5) 16 - 18 PM ", "----------   ", "----------   ", "----------   ", "----------  ", "----------", "  ----------",}};


                    for (int x=0; x < matriz.length; x++) {
                    for (int y=0; y < matriz[x].length; y++) {
                        System.out.print (matriz[x][y]+"  ");
                        }
                        System.out.println("");}
                        System.out.println("");                 
                        {                   
                            System.out. print("Ingrese la materia que desea agregar: ");
                            materia = sc.nextLine();

                            System.out.print("Ingrese el numero de horario en el que desea ingresar la materia: ");
                            pos_hora = sc.nextInt();

                            System.out.print("Ingrese el dia en el que desea ingresar la materia: ");
                            pos_dia = sc.nextInt();
                            }

                                 matriz [pos_hora][pos_dia] = materia;

                                System.out.println("A continuacion se encuentra su horario actualizado: \n");

                                    for (int x=0; x < matriz.length; x++) {
                                        for (int y=0; y < matriz[x].length; y++) {
                                            System.out.print (matriz[x][y]+"  ");
                                                 }
                                                System.out.println("");}
                                                System.out.println("");

                                                sc.close(); 
    }                                     
}