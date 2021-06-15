import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Textiles {
    private String type, stamp, colour;
    private int weight, Long, width;
    private static int idNext=1;
    private boolean thereAreCloth = false;
    private int ID;
    private ArrayList<Textiles> textiles_list = new ArrayList<Textiles>();
    static private Textiles textiles = null;

    //Implementacion patron Singleton
    private Textiles(){}

    static public Textiles getTextiles()
    {
        if (textiles == null)
        {
            textiles = new Textiles();
        }
        return textiles;
    }

    //Quedaría mejor con un método para construir esto?
    public Textiles(String type, String stamp,String colour, int Long, int width, int weight)
    {
        this.type = type;
        this.stamp = stamp;
        this.colour = colour;
        this.Long = Long;
        this.width = width;
        this.weight = weight;
        thereAreCloth = true;
        ID= idNext;
        idNext++;
    }

    private int Get_ID()
    {
        return ID;
    }

    private String Get_Textiles_Type()
    {
        return type;
    }

    private void Set_Textiles_Type(String type)
    {
        this.type = type;
    }

    private String Get_Textiles_Stamp()
    {
        return stamp;
    }

    private void Set_Textiles_Stamp(String stamp)
    {
        this.stamp = stamp;
    }

    private String Get_Textiles_Colour(){return colour;}

    private void Set_Textiles_Colour(String colour){ this.colour = colour;}

    private int Get_Textiles_Long()
    {
        return Long;
    }

    private void Set_Textiles_Long(int Long)
    {
        this.Long = Long;
    }

    private int Get_Textiles_Width()
    {
        return width;
    }

    private void Set_Textiles_Width(int width)
    {
        this.width = width;
    }

    private int Get_Textiles_Weight()
    {
        return weight;
    }

    private void Set_Textiles_Weight(int weight)
    {
        this.weight = weight;
    }

    private boolean Get_Textiles_thereAreCloth()
    {
        return thereAreCloth;
    }

    private void Set_Textiles_thereAreCloth(boolean thereAreCloth)
    {
        this.thereAreCloth = thereAreCloth;
    }

    public ArrayList<Textiles> Add_Textiles_List(Textiles textiles_object)
    {
        textiles_list.add(textiles_object);

        return textiles_list;
    }

    //Ver si el largo y ancho deberia ser double
    public void Set_Textiles_Object()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese a continuación la información básica de su textil:");
        System.out.print("1) Tipo: ");
        String type = sc.nextLine();
        System.out.print("2) Estampa: ");
        String stamp = sc.nextLine();
        System.out.print("3) Color: ");
        String colour = sc.nextLine();
        System.out.print("4) Largo: ");
        int Long = sc.nextInt();
        System.out.print("5) Ancho: ");
        int width = sc.nextInt();
        System.out.print("6) Peso: ");
        int weight = sc.nextInt();
        Textiles test = new Textiles(type,stamp,colour,Long,width,weight);
        Add_Textiles_List(test);
    }

    public void Get_Textiles_List(/*ArrayList<Textiles> textiles_list*/)
    {
        for (Textiles t: this.textiles_list)
        {
            System.out.println("El ID del producto es " + t.Get_ID() + ". El tipo de tela es " + t.Get_Textiles_Type()
                    + " con color " + t.Get_Textiles_Colour() + " . Su estampa es "+ t.Get_Textiles_Stamp()
                    + ". El largo actual de la tela es " + t.Get_Textiles_Long() + " metros y su ancho "
                    + t.Get_Textiles_Width() + " metros. Su peso actual es de " + t.Get_Textiles_Weight() + " kilos.");
        }
    }

    public void Get_Textiles_List(ArrayList<Textiles> lista)
    {
        for (Textiles t: lista)
        {
            System.out.println("El ID del producto es " + t.Get_ID() + ". El tipo de tela es " + t.Get_Textiles_Type()
                    + " con color " + t.Get_Textiles_Colour() + " . Su estampa es "+ t.Get_Textiles_Stamp()
                    + ". El largo actual de la tela es " + t.Get_Textiles_Long() + " metros y su ancho "
                    + t.Get_Textiles_Width() + " metros. Su peso actual es de " + t.Get_Textiles_Weight() + " kilos.");
        }
    }

    public void Show_Searchs()
    {
        System.out.println("En que quiere basar su búsqueda? \n" + "1) Tipo \n" + "2) Estampa \n" +
                "3) Color \n" + "4) Largo \n" + "5) Ancho \n" + "6) Peso" );
    }

    private String[] Select_Option()
    {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        String options[] = {"Tipo","Estampa","Color","Largo","Ancho","Peso"};
        String method_List[] = {"Get_Textiles_Type","Get_Textiles_Stamp","Get_Textiles_Colour","Get_Textiles_Long"
                ,"Get_Textiles_Width","Get_Textiles_Weight"};
        String final_Option[] = {options[option-1],method_List[option-1]};
        return final_Option;
    }

    private void Switch_Choose(String option)
    {
        switch (option)
        {
            case "Tipo":
        }
    }
    //Intentando usar reflection  para evitar uso de switch
    public void Find_By() throws Exception {
        Show_Searchs();
        String search_Choice[] = Select_Option();
        Class clazz = Class.forName("Textiles");
        String method_choice = search_Choice[1];
        Class classes[] = {String.class};
        Object ob;
        ob = clazz.getConstructor().newInstance(null);
        ob.getClass().getMethod(method_choice).invoke(ob);
        ArrayList<Textiles> testear= new ArrayList<Textiles>();
        /*for (Textiles t: this.textiles_list)
        {
            if(search_Choice[0].equals(method.invoke(null)))
            {
                testear.add(t);
            }
        }
        for (Textiles s: testear)
        {
            s.Get_Textiles_List(testear);
        }*/
    }

}


//tengo que borrar este main
class main2
{
    public static void main(String[] args) throws Exception
    {
        Textiles a =  Textiles.getTextiles();
        a.Set_Textiles_Object();
        //a.Set_Textiles_Object();
        /*ArrayList<Textiles> lista;
        lista = a.Add_Textiles_List(a);
        for(int i=0; i<= lista.size(); i++)
        {
            if(lista[i]. )
        }*/
        a.Find_By();
        /*Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        String options[] = {"Tipo","Estampa","Color","Largo","Ancho","Peso"};
        String method_List[] = {"Get_Textiles_Type","Get_Textiles_Stamp","Get_Textiles_Colour","Get_Textiles_Long"
                ,"Get_Textiles_Width","Get_Textiles_Weight"};
        String final_Option[] = {options[option-1],method_List[option-1]};*/

    }
}
