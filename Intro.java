//import java.util.*; 

public class Intro
{
    public static void main(String args[])
    {
        Human Andi = new Human();
        Andi.greetings();
        System.out.println(Andi.getName());
        System.out.println(Andi.getAge());
        System.out.println(Andi.getNationality());
        Human Budi = new Human("Budi",20,"Tangerang");
        Budi.greetings();
        System.out.println(Budi.getName());
        System.out.println(Budi.getAge());
        System.out.println(Budi.getNationality());
        Coach Dodi = new Coach();
        Dodi.greetings();
        Coach Joko = new Coach("Joko",40,"Depok",1999);
        Joko.greetings();
        Player Messi = new Player("Messi",23,"Bekasi",29,37,48,10,8,"Striker");
        Messi.greetings();
    }
}