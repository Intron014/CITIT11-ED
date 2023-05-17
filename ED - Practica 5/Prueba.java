
public class Prueba {
    public static void main (String [] args) {
        int numeroContactos = 10;  // TODO Poner el número de contactos de la red
        Persona[] contactos = new Persona[numeroContactos];

        contactos[0] = new Persona("Juan", "111111", "C/ Uno");
        contactos[1] = new Persona("José", "222222", "C/ Dos");
        contactos[2] = new Persona("Eva", "333333", "C/ Tres");
        contactos[3] = new Persona("Alicia", "777777", "C/ Cuatro");
        contactos[4] = new Persona("Alan", "999999", "C/ Cinco");
        contactos[5] = new Persona("Guillermo", "159267", "C/ Seis");
        contactos[6] = new Persona("Julio", "123456", "C/ Siete");
        contactos[7] = new Persona("Lucas", "231465", "C/ Ocho");
        contactos[8] = new Persona("Paula", "654321", "C/ Nueve");
        contactos[9] = new Persona("Clara", "123654", "C/ Dos");
        // TODO Añadir resto de contactos

        AmigosETSISI g = new AmigosETSISI(numeroContactos, contactos);
        g.insertaRelacion(6, 8);

        g.insertaRelacion(2, 9);
        g.insertaRelacion(9, 7);
        g.insertaRelacion(7, 2);

        g.insertaRelacion(0, 1);
        g.insertaRelacion(0, 3);
        g.insertaRelacion(0, 4);
        g.insertaRelacion(0, 5);
        g.insertaRelacion(5, 4);
        g.insertaRelacion(1, 4);

        // TODO Añadir resto de relaciones

        g.mostrarRed();
        System.out.println("APARTADO 2.2.1. PRUEBAS DE mostrarGrupos");
        // TODO Realizar prueba de método mostrarGrupos
        System.out.println("----------------------------------------------------");
        g.mostrarGrupos();

        System.out.println("\nAPARTADO 2.2.2. PRUEBAS DE amigosIndirectos.");
        // TODO Realizar al menos un par de pruebas del método amigosIndirectos
        System.out.println("----------------------------------------------------");
        g.mostrarAmigosIndirectos("Alicia");
        System.out.println(" ");
        g.mostrarAmigosIndirectos("Francisco");
        System.out.println(" ");
        g.mostrarAmigosIndirectos("Paula");
        System.out.println("\nAPARTADO 2.2.3. PRUEBAS DE noSonAmigos.");
        // TODO Realizar al menos un par de pruebas del método noSonAmigos
        System.out.println("----------------------------------------------------");
        g.noSonAmigos(contactos[0], contactos[1]);
        g.noSonAmigos(contactos[1], contactos[3]);
        g.noSonAmigos(contactos[6], contactos[5]);

        System.out.println("\nAPARTADO 2.2.4. PRUEBAS DE mostrarMiembrosSiAmigos.");
        // TODO Realizar al menos un par de pruebas del método mostrarMiembrosSiAmigos
        System.out.println("----------------------------------------------------");
        g.mostrarMiembrosSiAmigos(contactos[0], contactos[1]);
        System.out.println(" ");
        g.mostrarMiembrosSiAmigos(contactos[6], contactos[0]);
        System.out.println(" ");
        g.mostrarMiembrosSiAmigos(contactos[8], contactos[9]);

    }

}
