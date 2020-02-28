
import clasesyobjetos.Persona;
import clasesyobjetos.Gato;
import clasesyobjetos.Conejo;
import clasesyobjetos.Carro;

public class Main 
{

    public static void main(String[] args) 
    { 

        Persona p1 = new Persona();

        p1.setNombre("Miguel");

        String Nombre1 = p1.getNombre();

        System.out.println(Nombre1);


        Gato g1 = new Gato();

        Conejo c1 = new Conejo();


        Carro au1 = new Carro();

        System.out.println();
        System.out.println();

    }

}