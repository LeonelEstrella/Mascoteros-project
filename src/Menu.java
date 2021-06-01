
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Scanner;

public class Menu{
    private boolean exit= false;
    public Menu(){}

    public void Menu_Interact(){

        this.Show_First_Menu();
        this.Choose(this.Select_Option());

    }

    private void Show_First_Menu()
    {
        System.out.println("Ingrese a cual módulo desea ingresar: ");
        System.out.println("1) Productos \n" +
                "2) Clientes/Proveedores \n" +
                "3) Telas \n" +
                "4) Pedidos \n" +
                "5) Stock \n" +
                "6) Salir");
    }
    private int  Select_Option()
    {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        return option;
    }

    private void Choose(int option){
        while (!exit)
        {
            switch (option)
            {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    exit = true;
                    System.exit(0);
                    break;

                default:
                    System.out.println("No ingresaste un número válido");
                    this.Show_First_Menu();
                    this.Choose(Select_Option());
            }

        }
    }


}
