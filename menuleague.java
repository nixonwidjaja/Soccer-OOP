import java.util.*; 

public class menuleague
{
    public static void main(String args[])
    {
        int x = 0;
        Scanner s = new Scanner(System.in);
        Club club1 = null;
        League league1 = null;
        Coach coach1 = null;
        Player player1 = null;
        while (x!=7)
        {
            System.out.println("Menu League");
            System.out.println("1. Create league");
            System.out.println("2. Add club");
            System.out.println("3. View league");
            System.out.println("4. Scheduling");
            System.out.println("5. Match score");
            System.out.println("6. League table");
            System.out.println("7. Exit");
            System.out.print("Choose menu league: ");
            x = s.nextInt();
            if (x==1)
            {
                System.out.println("Membuat league baru");
                String temp = s.nextLine();
                System.out.print("Nama league = ");
                String name = s.nextLine();
                System.out.print("Tahun = ");
                int year = s.nextInt();
                league1 = new League(name, year);
                System.out.println("League berhasil dibuat!");
            }
            else if (x==2)
            {
                if (league1 == null)
                {
                    System.out.println("Buat league dulu!");
                    continue;
                }
                int y = 0;
                while (y!=5)
                {
                    System.out.println("Menu Club");
                    System.out.println("1. Create club");
                    System.out.println("2. Add coach");
                    System.out.println("3. Add player");
                    System.out.println("4. View club");
                    System.out.println("5. Exit");
                    System.out.print("Choose menu club: ");
                    y = s.nextInt();
                    if (y==1)
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
                        System.out.println("Club berhasil ditambahkan ke league!");
                        league1.addClub(club1);
                    }
                    else if (y==2)
                    {
                        System.out.print("Masukkan nama club = ");
                        String temp = s.nextLine();
                        String cek = s.nextLine();
                        club1 = league1.search(cek);
                        if (club1 == null)
                        {
                            System.out.println("Club tidak terdaftar");
                            continue;
                        }
                        System.out.println("Menambah coach");
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
                    else if (y==3)
                    {
                        System.out.print("Masukkan nama club = ");
                        String temp = s.nextLine();
                        String cek = s.nextLine();
                        club1 = league1.search(cek);
                        if (club1 == null)
                        {
                            System.out.println("Club tidak terdaftar");
                            continue;
                        }
                        System.out.println("Menambah player");
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
                    else if (y==4)
                    {
                        System.out.print("Masukkan nama club = ");
                        String temp = s.nextLine();
                        String cek = s.nextLine();
                        club1 = league1.search(cek);
                        if (club1 == null)
                        {
                            System.out.println("Club tidak terdaftar");
                            continue;
                        }
                        club1.viewClub();
                    }
                    else
                    break;
                }
            }
            else if (x==3)
            {
                if (league1 == null)
                {
                    System.out.println("Buat league dulu!");
                    continue;
                }
                league1.viewLeague();
            }
            else if (x==4)
            {
                if (league1 == null)
                {
                    System.out.println("Buat league dulu!");
                    continue;
                }
                System.out.println("Hasil scheduling");
                league1.scheduling();
            }
            else if (x==5)
            {
                if (league1 == null)
                {
                    System.out.println("Buat league dulu!");
                    continue;
                }
                if (league1.getClub(4)==null)
                {
                    System.out.println("Daftarkan 4 club ke league dulu!");
                    continue;
                }
                System.out.println("Hasil pertandingan");
                league1.matchscore();
            }
            else if (x==6)
            {
                if (league1 == null)
                {
                    System.out.println("Buat league dulu!");
                    continue;
                }
                if (league1.getClub(4)==null)
                {
                    System.out.println("Daftarkan 4 club ke league dulu!");
                    continue;
                }
                System.out.println("League Classement");
                league1.leaguetable();
            }
            else
            break;
        }
        s.close();
    }
}