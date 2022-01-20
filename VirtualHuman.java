import java.util.*;
public class VirtualHuman
{
    public static void main(String args[])
    {
        int x = 0;
        Scanner s = new Scanner(System.in);
        Humanv [] human = new Humanv[12];
        Humanv.Heart heart1 = null;
        Humanv.Hands hand1 = null;
        Humanv.Feet feet1 = null;
        Humanv.Weapon weapon1 = null;
        int index = 1;
        while (x!=7)
        {
            System.out.println("Menu Virtual Human");
            System.out.println("1. Create a new virtual human");
            System.out.println("2. Create a new heart");
            System.out.println("3. Create hands");
            System.out.println("4. Create feet");
            System.out.println("5. Add weapon");
            System.out.println("6. Human info");
            System.out.println("7. Exit");
            System.out.print("Choose menu : ");
            x = s.nextInt();
            if (x==1)
            {
                System.out.println("Creating a new virtual human");
                String temp = s.nextLine();
                System.out.print("Name = ");
                String name = s.nextLine();
                System.out.print("Height = ");
                int height = s.nextInt();
                temp = s.nextLine();
                System.out.print("Nationality = ");
                String nationality = s.nextLine();
                human[index] = new Humanv(name, height, nationality);
                index++;
                System.out.println("Human created!");
            }
            else if (x==2)
            {
                System.out.println("Creating a new heart");
                System.out.print("Width = ");
                int lebar = s.nextInt();
                System.out.print("Height = ");
                int tinggi = s.nextInt();
                System.out.print("Heart rate = ");
                int detak = s.nextInt();
                System.out.print("Give heart to = ");
                String temp = s.nextLine();
                String name = s.nextLine();
                boolean ketemu = false;
                for (int i=1;i<index;i++)
                {
                    if (name.equals(human[i].getName()))
                    {
                        ketemu = true;
                        if (human[i].getStatus().equals("mati"))
                        {
                            heart1 = human[i].new Heart(lebar, tinggi, detak);
                            System.out.println("Heart successfully created and attached! "+human[i].getName()+" is alive.");
                            human[i].setStatus("hidup");
                            break;
                        }
                        else
                        {
                            System.out.println(human[i].getName()+" already has a heart");
                            break;
                        }
                    }
                }
                if (!ketemu)
                System.out.println(name+" not found");
            }
            else if (x==3)
            {
                System.out.println("Creating new hands");
                System.out.print("Length = ");
                int panjang = s.nextInt();
                System.out.print("Strength = ");
                int pukulan = s.nextInt();
                System.out.print("Give hands to = ");
                String temp = s.nextLine();
                String name = s.nextLine();
                boolean ketemu = false;
                for (int i=1;i<index;i++)
                {
                    if (name.equals(human[i].getName()))
                    {
                        ketemu = true;
                        hand1 = human[i].new Hands(panjang, pukulan);
                        System.out.println("Hands successfully created and attached!");
                        break;
                    }
                }
                if (!ketemu)
                System.out.println(name+" not found");
            }
            else if (x==4)
            {
                System.out.println("Creating new feet");
                System.out.print("Length = ");
                int panjang = s.nextInt();
                System.out.print("Strength = ");
                int tendangan = s.nextInt();
                System.out.print("Give feet to = ");
                String temp = s.nextLine();
                String name = s.nextLine();
                boolean ketemu = false;
                for (int i=1;i<index;i++)
                {
                    if (name.equals(human[i].getName()))
                    {
                        ketemu = true;
                        feet1 = human[i].new Feet(panjang, tendangan);
                        System.out.println("Feet successfully created and attached!");
                        break;
                    }
                }
                if (!ketemu)
                System.out.println(name+" not found");
            }
            else if (x==5)
            {
                System.out.println("Adding a new weapon");
                String temp = s.nextLine();
                System.out.print("Brand = ");
                String brand = s.nextLine();
                System.out.print("Ammo = ");
                int peluru = s.nextInt();
                System.out.print("Width= ");
                int lebar = s.nextInt();
                System.out.print("Height = ");
                int tinggi = s.nextInt();
                System.out.print("Give weapon to = ");
                temp = s.nextLine();
                String name = s.nextLine();
                boolean ketemu = false;
                for (int i=1;i<index;i++)
                {
                    if (name.equals(human[i].getName()))
                    {
                        ketemu = true;
                        if (human[i].gethaveWeapon()==false)
                        {
                            weapon1 = human[i].new Weapon(peluru,lebar,tinggi,brand);
                            System.out.println(human[i].getName()+" successfully armed");
                            human[i].sethaveWeapon(true);
                            break;
                        }
                        else
                        {
                            System.out.println(human[i].getName()+" already has a weapon");
                            break;
                        }
                    }
                }
                if (!ketemu)
                System.out.println(name+" not found");
            }
            else if (x==6)
            {
                if (human[1] == null)
                {
                    System.out.println("Buat human dulu!");
                    continue;
                }
                System.out.println("Human Info");
                System.out.print("Human name = ");
                String temp = s.nextLine();
                String name = s.nextLine();
                boolean ketemu = false;
                for (int i=1;i<index;i++)
                {
                    if (name.equals(human[i].getName()))
                    {
                        ketemu = true;
                        human[i].humanInfo();
                        break;
                    }
                }
                if (!ketemu)
                System.out.println(name+" not found");
            }
            else
            break;
        }
        s.close();
    }
}