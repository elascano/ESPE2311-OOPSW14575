
package com.mycompany.banco;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class AplicaccionBanco {

   public static void main(String[] args) {
        AplicaccionBanco banco = new AplicaccionBanco();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear cuenta");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del titular de la cuenta: ");
                    String nombreTitular = scanner.next();
                    Cuenta cuenta = new Cuenta(nombreTitular);
                    banco.agregarCuenta(cuenta);
                    System.out.println("Cuenta creada con éxito. Número de cuenta: " + cuenta.getNumeroCuenta());
                    break;
                case 2:
                    System.out.print("Ingrese el número de cuenta: ");
                    int numeroCuentaDeposito = scanner.nextInt();
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    banco.realizarDeposito(numeroCuentaDeposito, cantidadDeposito);
                    break;
                case 3:
                    System.out.print("Ingrese el número de cuenta: ");
                    int numeroCuentaRetiro = scanner.nextInt();
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    banco.realizarRetiro(numeroCuentaRetiro, cantidadRetiro);
                    break;
                case 4:
                    System.out.print("Ingrese el número de cuenta: ");
                    int numeroCuentaConsulta = scanner.nextInt();
                    banco.consultarSaldo(numeroCuentaConsulta);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar la aplicación. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }
    }
}

class Cuenta {
    private static int contadorCuentas = 1000;
    private int numeroCuenta;
    private String titular;
    private double saldo;

    public Cuenta(String titular) {
        this.numeroCuenta = contadorCuentas++;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente. Operación no realizada.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        }
    }
}

class Banco {
    private java.util.List<Cuenta> cuentas;

    public Banco() {
        this.cuentas = new java.util.ArrayList<>();
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void realizarDeposito(int numeroCuenta, double cantidad) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuenta) {
                cuenta.depositar(cantidad);
                return;
            }
        }
        System.out.println("Cuenta no encontrada. Operación no realizada.");
    }

    public void realizarRetiro(int numeroCuenta, double cantidad) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuenta) {
                cuenta.retirar(cantidad);
                return;
            }
        }
        System.out.println("Cuenta no encontrada. Operación no realizada.");
    }

    public void consultarSaldo(int numeroCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuenta) {
                System.out.println("Saldo actual de la cuenta " + numeroCuenta + ": " + cuenta.getSaldo());
                return;
            }
        }
        System.out.println("Cuenta no encontrada. Operación no realizada.");
    }
}