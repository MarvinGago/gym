/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_gym;

/**
 *
 * @author CPUw1010
 */
public class Gym {
    private boolean[] horariosDisponibles;

    public Gym() {
        // 6 horas disponibles, de 2 pm a 7 pm
        //Todas las horas están inicialmente disponibles
        horariosDisponibles = new boolean[6]; 
        for (int i = 0; i < horariosDisponibles.length; i++) {
            horariosDisponibles[i] = true; 
        }
    }

    public void mostrarHorariosDisponibles() {
        System.out.println("Horarios disponibles:");
        for (int i = 0; i < horariosDisponibles.length; i++) {
            if (horariosDisponibles[i]) {
                int hora = i + 14;  
                System.out.println(hora + ":00");
            }
        }
    }

    public void hacerReserva(int idEmpleado, String nombreEmpleado, int hora) {
         // Marcar la hora como reservada
        int indiceHora = hora - 14; 
        if (indiceHora >= 0 && indiceHora < horariosDisponibles.length && horariosDisponibles[indiceHora]) {
            horariosDisponibles[indiceHora] = false;
            System.out.println("Reserva exitosa para " + nombreEmpleado + " a las " + hora + ":00");
        } else {
            System.out.println("La hora " + hora + ":00 no esta disponible para hacer usted reservas.");
        }
    }

    public void cancelarReserva(int hora) {
        // Marcar la hora como disponible nuevamente
        int indiceHora = hora - 14; 
        if (indiceHora >= 0 && indiceHora < horariosDisponibles.length && !horariosDisponibles[indiceHora]) {
            horariosDisponibles[indiceHora] = true; 
            System.out.println("Reserva cancelada para la hora " + hora + ":00");
        } else {
            System.out.println("No hay reserva para la hora " + hora + ":00.");
        }
    }


    }
    

