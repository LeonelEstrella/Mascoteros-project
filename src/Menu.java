import java.util.Scanner;

public class Menu {

    public Menu(){}

    public void Select_Option()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese a cual módulo desea ingresar: ");
        System.out.println("1) Productos \n" +
                "2) Clientes/Proveedores \n" +
                "3) Telas \n" +
                "4) Pedidos \n" +
                "5) Stock \n" +
                "6) Salir");
        int opcion = sc.nextInt();

    }

}
