import java.util.ArrayList;

public class Textiles {
    private String type, stamp;
    private int weight, Long, width, idNext=1;
    private boolean thereAreCloth = false;
    private static int ID=0;
    private ArrayList<Textiles> textiles_list = new ArrayList<Textiles>();

    //Quedaría mejor con un método para construir esto?
    public Textiles(String type, String stamp, int Long, int width, int weight)
    {
        ID= idNext;
        idNext = idNext + 1;
        this.type = type;
        this.stamp = stamp;
        this.Long = Long;
        this.width = width;
        this.weight = weight;
        thereAreCloth = true;
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

    public void Get_Textiles_List(ArrayList<Textiles> textiles_list)
    {
        for (Textiles t: textiles_list)
        {
            System.out.println("El ID del producto es " + t.Get_ID() + ". El tipo de tela es " + t.Get_Textiles_Type()+ ". Su estampa es "+ t.Get_Textiles_Stamp()
                    + ". El largo actual de la tela es " + t.Get_Textiles_Long() + " metros y su ancho " + t.Get_Textiles_Width() + " metros. Su peso actual es de " + t.Get_Textiles_Weight() + " kilos.");
        }
    }

}


//tengo que borrar este main
class main2
{
    public static void main(String[] args)
    {
        Textiles a= new Textiles("polar","huesitos",120,100,20);
        ArrayList<Textiles> lista = new ArrayList<Textiles>();
        lista = a.Add_Textiles_List(a);
        a.Get_Textiles_List(lista);
    }
}
