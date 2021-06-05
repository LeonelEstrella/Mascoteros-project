import java.util.Scanner;

public class Menu{
    private boolean exit= false;
    public Menu(){}

    public void Menu_Interact()
    {
            Show_First_Menu();
            Choose_Main_Menu(Select_Option());
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
        try
        {
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            return option;
        }
        catch (Exception e)
        {
            System.out.println("Caracter invalido. Vuelve a ingresar un número...");
            Show_First_Menu();
            Choose_Main_Menu(Select_Option());
            return 0;
        }
    }

    private void Choose_Main_Menu(int option)
    {
        while (!exit)
        {
            //En caso de que ingresen un caracter equivocado dentro de alguno de los menú
            // vuelve a entrar a ese menu porque tiene guardada la primera opción que le pasas
            switch (option)
            {
                case 1:
                    Show_Product_Menu();
                    Choose_Product_Menu(Select_Option());
                    break;

                case 2:
                    Show_People_Menu();
                    Choose_People_Menu(Select_Option());
                    break;

                case 3:
                    Show_Telas_Menu();
                    Choose_Telas_Menu(Select_Option());
                    break;

                case 4:
                    Show_Orders_Menu();
                    Choose_Orders_Menu(Select_Option());
                    break;

                case 5:
                    Show_Stock_Menu();
                    Choose_Stock_Menu(Select_Option());
                    break;

                case 6:
                    exit = true;
                    System.exit(0);
                    break;

                default:
                    System.out.println("El número " + option + " no es una opción válida. Volver a intentar..." );
                    Show_First_Menu();
                    Choose_Main_Menu(Select_Option());
                    break;
            }

        }
    }

    private void Show_Product_Menu()
    {
        System.out.println("Ingrese el tipo de producto: ");
        System.out.println("1) Accesorios \n" +
                "2) Prendas \n" +
                "3) Menu principal \n" +
                "4) Salir \n");
    }

    private void Choose_Product_Menu(int option)
    {
        switch (option)
        {
            case 1:
                break;

            case 2:
                break;

            case 3:
                Show_First_Menu();
                Choose_Main_Menu(Select_Option());
                break;

            case 4:
                System.exit(0);
                break;

            default:
                System.out.println("El número " + option + " no es una opción válida. Volver a intentar..." );
                break;
        }
    }

    private void Show_Telas_Menu()
    {
        System.out.println("Ingrese a cual opción desea ingresar: ");
        System.out.println("1) Telas \n" +
                "2) Menu principal \n" +
                "3) Salir \n" );
    }

    private void Choose_Telas_Menu(int option)
    {
        switch (option)
        {
            case 1:
                break;

            case 2:
                Show_First_Menu();
                Choose_Main_Menu(Select_Option());
                break;

            case 3:
                System.exit(0);
                break;

            default:
                System.out.println("El número " + option + " no es una opción válida. Volver a intentar..." );
                break;
        }
    }

    private void Show_People_Menu()
    {
        System.out.println("Ingrese a cual opción desea ingresar: ");
        System.out.println("1) Clientes \n" +
                "2) Proveedores \n" +
                "3) Menu Principal \n" +
                "4) Salir");
    }

    private void Choose_People_Menu(int option)
    {
        switch (option)
        {
            case 1:
                break;

            case 2:

                break;

            case 3:
                Show_First_Menu();
                Choose_Main_Menu(Select_Option());
                break;

            case 4:
                System.exit(0);
                break;

            default:
                System.out.println("El número " + option + " no es una opción válida. Volver a intentar..." );
                break;
        }
    }

    private void Show_Orders_Menu()
    {
        System.out.println("Ingrese a cual opción desea ingresar: ");
        System.out.println("1) Pedidos \n" +
                "2) Menu Principal \n" +
                "3) Salir");
    }

    private void Choose_Orders_Menu(int option)
    {
        switch (option)
        {
            case 1:
                break;

            case 2:
                Show_First_Menu();
                Choose_Main_Menu(Select_Option());
                break;

            case 3:
                System.exit(0);
                break;

            default:
                System.out.println("El número " + option + " no es una opción válida. Volver a intentar..." );
                break;
        }
    }

    private void Show_Stock_Menu()
    {
        System.out.println("Ingrese a cual opción desea ingresar: ");
        System.out.println("1) Stock \n" +
                "2) Menu Principal \n" +
                "3) Salir");
    }

    private void Choose_Stock_Menu(int option)
    {
        switch (option)
        {
            case 1:
                break;

            case 2:
                Show_First_Menu();
                Choose_Main_Menu(Select_Option());
                break;

            case 3:
                System.exit(0);
                break;

            default:
                System.out.println("El número " + option + " no es una opción válida. Volver a intentar..." );
                break;
        }
    }

}
