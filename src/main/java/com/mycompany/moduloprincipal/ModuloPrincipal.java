/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.moduloprincipal;

import java.util.ArrayList;
import java.util.Scanner;

public class ModuloPrincipal {
    private static ArrayList<Paciente> pacientes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    registrarPaciente();
                    break;
                case 2:
                    eliminarPaciente();
                    break;
                case 3:
                    modificarPaciente();
                    break;
                case 4:
                    buscarPaciente();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menu Principal ---");
        System.out.println("1. Registrar Paciente");
        System.out.println("2. Eliminar Paciente");
        System.out.println("3. Modificar Paciente");
        System.out.println("4. Buscar Paciente");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    private static void registrarPaciente() {
        System.out.println("\n--- Registrar Paciente ---");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        
        System.out.print("DNI: ");
        int dni = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Telefono: ");
        int telefono = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Correo: ");
        String correo = scanner.nextLine();

        System.out.print("Direccion: ");
        String direccion = scanner.nextLine();

        System.out.print("Fecha de Nacimiento (dd/mm/yyyy): ");
        String fechaNacimiento = scanner.nextLine();

        System.out.print("Historial Clinico: ");
        String historialClinico = scanner.nextLine();

        Paciente nuevoPaciente = new Paciente(nombre, apellido, dni, telefono, correo, direccion, fechaNacimiento, historialClinico);
        pacientes.add(nuevoPaciente);

        System.out.println("Paciente registrado con exito.");
    }

    private static void eliminarPaciente() {
        System.out.println("\n--- Eliminar Paciente ---");
        System.out.print("Ingrese el DNI del paciente a eliminar: ");
        int dni = scanner.nextInt();
        scanner.nextLine(); 

        Paciente paciente = buscarPacientePorDNI(dni);
        if (paciente != null) {
            pacientes.remove(paciente);
            System.out.println("Paciente eliminado con exito.");
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }

    private static void modificarPaciente() {
        System.out.println("\n--- Modificar Paciente ---");
        System.out.print("Ingrese el DNI del paciente a modificar: ");
        int dni = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        Paciente paciente = buscarPacientePorDNI(dni);
        if (paciente != null) {
            System.out.print("Nuevo historial clínico: ");
            String nuevoHistorial = scanner.nextLine();
            paciente.setHistorialClinico(nuevoHistorial);
            System.out.println("Historial clínico actualizado con éxito.");
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }

    private static void buscarPaciente() {
        System.out.println("\n--- Buscar Paciente ---");
        System.out.print("Ingrese el DNI del paciente a buscar: ");
        int dni = scanner.nextInt();
        scanner.nextLine(); 

        Paciente paciente = buscarPacientePorDNI(dni);
        if (paciente != null) {
            System.out.println("\nPaciente encontrado:");
            System.out.println("Nombre: " + paciente.getNombre());
            System.out.println("Apellido: " + paciente.getApellido());
            System.out.println("Teléfono: " + paciente.getTelefono());
            System.out.println("Correo: " + paciente.getCorreo());
            System.out.println("Direccion: " + paciente.getDireccion());
            System.out.println("Fecha de Nacimiento: " + paciente.getFechaNacimiento());
            System.out.println("Historial Clinico: " + paciente.getHistorialClinico());
        } else {
            System.out.println("Paciente no encontrado.");
        }
    }

    private static Paciente buscarPacientePorDNI(int dni) {
        for (Paciente p : pacientes) {
            if (p.getDni() == dni) {
                return p;
            }
        }
        return null;
    }
}



