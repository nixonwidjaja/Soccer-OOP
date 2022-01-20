public class Coach extends Human
{
    private int start;
    public Coach()
    {
        super();
    }
    public Coach(String name, int age, String nationality, int start)
    {
        super(name, age, nationality);
        this.start = start;
    }
    public void setStart(int start){ this.start = start; }
    public int getStart() {return start;}
    public void greetings()
    {
        System.out.println("Halo nama saya adalah "+name+" coach sudah dari "+start);
        System.out.println("Saya umur "+age+" dari "+nationality);
    }
}
