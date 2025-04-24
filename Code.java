public class RegistroVisitante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== REGISTRO DE VISITANTE ===");

        // Tipos primitivos con nombres simples
        System.out.print("Edad: ");
        byte edad = input.nextByte();

        System.out.print("Visitas anteriores: ");
        short visitas = input.nextShort();

        System.out.print("ID: ");
        int id = input.nextInt();

        System.out.print("Teléfono: ");
        long telefono = input.nextLong();

        System.out.print("Hora (ej. 14.30): ");
        float hora = input.nextFloat();

        System.out.print("Tiempo (horas): ");
        double tiempo = input.nextDouble();

        System.out.print("Inicial nombre: ");
        char inicial = input.next().charAt(0);

        System.out.print("¿Residente? (true/false): ");
        boolean residente = input.nextBoolean();

        // Mostrar resultados
        System.out.println("\n=== DATOS REGISTRADOS ===");
        System.out.println("Edad: " + edad);
        System.out.println("Visitas: " + visitas);
        System.out.println("ID: " + id);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Hora: " + hora);
        System.out.println("Tiempo: " + tiempo + " horas");
        System.out.println("Inicial: " + inicial);
        System.out.println("Residente: " + residente);

        input.close();
    }
}
