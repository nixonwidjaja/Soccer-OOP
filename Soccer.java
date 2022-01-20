import java.util.*; 

public class Soccer
{
    public static void main(String args[])
    {
        int x = 0;
        Scanner s = new Scanner(System.in);
        Club club1 = null;
        Coach coach1 = null;
        Player player1 = null;
        while (x!=5)
        {
            System.out.println("Menu Club");
            System.out.println("1. Create club");
            System.out.println("2. Add coach");
            System.out.println("3. Add player");
            System.out.println("4. View club");
            System.out.println("5. Exit");
            System.out.print("Choose menu club: ");
            x = s.nextInt();
            if (x==1)
            {
                System.out.println("Membuat club baru");
                String temp = s.nextLine();
                System.out.print("Nama club = ");
                String name = s.nextLine();
                System.out.print("Nama stadium = ");
                String stadium = s.nextLine();
                System.out.print("Kapasitas stadium = ");
                int capacity = s.nextInt();
                club1 = new Club(name, stadium, capacity);
                System.out.println("Club berhasil dibuat!");
            }
            else if (x==2)
            {
                if (club1 == null)
                {
                    System.out.println("Buat club dulu!");
                    continue;
                }
                System.out.println("Menambah coach");
                String temp = s.nextLine();
                System.out.print("Nama coach = ");
                String name = s.nextLine();
                System.out.print("Usia = ");
                int age = s.nextInt();
                temp = s.nextLine();
                System.out.print("Kebangsaan = ");
                String nationality = s.nextLine();
                System.out.print("Tahun melatih = ");
                int start = s.nextInt();
                coach1 = new Coach(name, age, nationality, start);
                club1.setCoach(coach1);
            }
            else if (x==3)
            {
                if (club1 == null)
                {
                    System.out.println("Buat club dulu!");
                    continue;
                }
                System.out.println("Menambah player");
                String temp = s.nextLine();
                System.out.print("Nama player = ");
                String name = s.nextLine();
                System.out.print("Usia = ");
                int age = s.nextInt();
                temp = s.nextLine();
                System.out.print("Kebangsaan = ");
                String nationality = s.nextLine();
                System.out.print("Position = ");
                String position = s.nextLine();
                System.out.print("Shooting = ");
                int shoot = s.nextInt();
                System.out.print("Dribbling = ");
                int dribble = s.nextInt();
                System.out.print("Heading = ");
                int head = s.nextInt();
                System.out.print("Running = ");
                int run = s.nextInt();
                System.out.print("Passing = ");
                int pass = s.nextInt();
                player1 = new Player(name,age,nationality,shoot,dribble,head,run,pass,position);
                club1.addPlayer(player1);
            }
            else if (x==4)
            {
                if (club1 == null)
                {
                    System.out.println("Buat club dulu!");
                    continue;
                }
                club1.viewClub();
            }
            else
            break;
        }
        s.close();
    }
}