package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        // TODO: Add 1 urgent appointment at the beginning
        appointments.add("Alice - Monday 10AM");
        appointments.add("Charlie - Tuesday 12PM");
        appointments.add("David - Wednesday 2PM");

        appointments.addFirst("URGENT: Frank - Today 9AM");
    }

    public void cancelLast() {
        // TODO: Remove last appointment
        if (appointments.isEmpty()) {
            System.out.println("No appointments to cancel.");
        } else {
            String removed = appointments.removeLast();
            System.out.println("Cancelled appointment: " + removed);
        }
    }

    public void showFirstAndLast() {
        // TODO: Print first and last appointment
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
        } else {
            System.out.println("First appointment: " + appointments.getFirst());
            System.out.println("Last appointment: " + appointments.getLast());
        }
    }

    public void printAppointments() {
        // TODO: Traverse using Iterator
        if (appointments.isEmpty()) {
            System.out.println("Appointment list is empty.");
            return;
        }

        System.out.println("=== Appointments ===");

        Iterator<String> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
