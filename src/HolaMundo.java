import java.util.Scanner;
public class HolaMundo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a screen match de Alura");

        //declaración de varables
        String nombre = "Interstellar";
        int fechaDeLanzamiento = 2014;
        double mediaEvaluacionUsuarios = 0;
        int encuestados = 1;

        String sinopsis = """
                Es la mejor película ficción jamás creada por un ser humano. Tiene un
                conjunto de efectos especiales con efectos sonoros, la banda musical,
                 el argumento, el final… Todo ello la hace perfecta.""";
        System.out.println("************************************************+++********************");
        System.out.println("Nombre de pelicula: " +nombre);
        System.out.println("Fecha de estreno: " + fechaDeLanzamiento);
        System.out.println("************************************************+++********************");
        System.out.println(sinopsis);
        System.out.println("************************************************+++********************");

        while (encuestados <= 3) {
            System.out.println("Usuario encuestado " + encuestados + " que evaluación le darias a Interstellar:");
            double notaDeInterstellar = teclado.nextDouble();
            mediaEvaluacionUsuarios +=  notaDeInterstellar /3;
            encuestados++;
        }
        System.out.println("************************************************+++********************");
        System.out.println("La media de la película Interstellar, basada en las evaluaciones " +
                "de los usuarios, es de " + mediaEvaluacionUsuarios + " sobre 5.");
        System.out.println("************************************************+++********************");

        System.out.println("FRASES QUE RECUERDAN LOS ENCUESTADOS:");
        System.out.println("“La ley de Murphy no significa que vaya a pasar algo malo, sino que si algo" +
                " puede pasar, pasará.”");
        System.out.println("“El amor es lo único que somos capaces de percibir que trasciende las \n" +
                "dimensiones del tiempo y del espacio.”");
        System.out.println("“Para ascender hay que dejar algo atrás”.\n");
        System.out.println("                                              ... _ ._  _.__");
    }
}