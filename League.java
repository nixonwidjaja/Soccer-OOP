import java.util.*; 
public class League 
{
    private String name;
    private int year;
    private Club [] club = new Club[5];
    public League()
    {
        name = "unknown";
        year = 0;
    }
    public League(String name, int year)
    {
        this.name = name;
        this.year = year;
    }
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setYear(int year) {this.year = year;}
    public int getYear() {return year;}
    int index = 1;
    public void addClub(Club club) 
    {
        this.club[index] = club;
        index++;
    }
    public Club getClub(int index) {return club[index];}
    public void viewLeague()
    {
        System.out.println("View league");
        System.out.println("Nama league = "+name);
        System.out.println("Tahun = "+year);
        if (club[1]!=null)
        {
            System.out.println("Daftar club:");
            for (int j=1;j<=4;j++)
            {
                if (club[j]!=null)
                System.out.println(j+". "+club[j].getName()+" "+club[j].getStadium()+" "+club[j].getCapacity()+" "+club[j].getCoach());
            }
        }
    }
    public Club search(String name)
    {
        for (int j=1;j<=4;j++)
        {
            if (club[j]!=null)
            {
                if (club[j].getName().equals(name))
                return club[j];
            }
        }
        return null;
    }
    public void scheduling()
    {
        Club mu = new Club("Manchester United", "Old Trafford", 80000);
        Player pogba = new Player ("Paul Pogba", 23,"France", 9,9,8,7,8, "Midfielder");
        mu.addPlayer(pogba);
        club[1] = mu;
        club[1].setSkill(8);
        Club lv = new Club("Liverpool", "Anfield", 50000);
        Player salah = new Player ("Mohamed Salah", 25,"Egypt", 9,9,8,7,8, "Midfielder");
        lv.addPlayer(salah);
        club[2] = lv;
        club[2].setSkill(5);
        Club ar = new Club("Arsenal", "Emirates", 60000);
        Player pepe = new Player ("Nicolas Pepe", 23,"France", 9,9,8,7,8, "Forward");
        ar.addPlayer(pepe);
        club[3] = ar;
        club[3].setSkill(2);
        Club ch = new Club("Chelsea", "Stamford", 40000);
        Player cp = new Player ("Christian Pulisic", 23,"USA", 9,9,8,7,8, "Midfielder");
        ch.addPlayer(cp);
        club[4] = ch;
        club[4].setSkill(6);
        int current = 1;
        int enemy = current + 1;
        int week = 1;
        while (true)
        {
            if (club[current].getEnemy(week) == null)
            {
                if (club[enemy].getEnemy(week)==null)
                {
                    club[current].setEnemy(week, club[enemy]);
                    club[enemy].setEnemy(week, club[current]);
                    week ++;
                    if ( week > 3)
                    {
                        week = 1;
                        current ++;
                    }
                    enemy ++;
                    if ( enemy > 4)
                    enemy = current + 1;
                }
                else
                {
                    enemy ++;
                    if ( enemy > 4)
                    enemy = current + 1;
                }
            }
            else
            {
                week ++;
                if ( week > 3)
                {
                    week = 1;
                    current ++;
                }
            }
            if (current==3 && week==3)
            break;
        }
        for (int i=1;i<=3;i++)
        {
            System.out.println("Week "+i+":");
            for (int j=1;j<=4;j++)
            {
                if (club[j].getVisited(i)==false)
                {
                    System.out.println(club[j].getName()+" vs "+club[j].getEnemy(i).getName());
                    club[j].setVisited(i, true);
                    club[j].getEnemy(i).setVisited(i, true);
                }
            }
        }
    }
    public void matchscore()
    {
        Random rand = new Random();
        for (int i=1;i<=3;i++)
        {
            for (int j=1;j<=4;j++)
            {
                    club[j].setVisited(i, false);
                    club[j].getEnemy(i).setVisited(i, false);
            }
        }
        for (int j=1;j<=4;j++)
        {
            club[j].setWin(0);
            club[j].setDraw(0);
            club[j].setLose(0);
            club[j].setAttack(0);
            club[j].setDefense(0);
        }
        for (int i=1;i<=3;i++)
        {
            System.out.println("Week "+i+":");
            for (int j=1;j<=4;j++)
            {
                if (club[j].getVisited(i)==false)
                {
                    int skill1 = club[j].getSkill(); 
                    int skill2 = club[j].getEnemy(i).getSkill();
                    int [] tes = new int[skill1+skill2+2];
                    for (int k=1;k<=skill1;k++)
                    tes[k] = rand.nextInt(4)+2;
                    for (int k=skill1+1;k<=skill1+skill2;k++)
                    tes[k] = rand.nextInt(2);
                    int hasil1 = tes[rand.nextInt(skill1+skill2)+1];
                    for (int k=1;k<=skill1;k++)
                    tes[k] = rand.nextInt(2);
                    for (int k=skill1+1;k<=skill1+skill2;k++)
                    tes[k] = rand.nextInt(4)+2;
                    int hasil2 = tes[rand.nextInt(skill1+skill2)+1];
                    System.out.println(club[j].getName()+" ("+hasil1+") vs ("+hasil2+") "+club[j].getEnemy(i).getName());
                    club[j].setVisited(i, true);
                    club[j].getEnemy(i).setVisited(i, true);
                    club[j].setAttack(club[j].getAttack()+hasil1);
                    club[j].getEnemy(i).setDefense(club[j].getEnemy(i).getDefense()+hasil1);
                    club[j].setDefense(club[j].getDefense()+hasil2);
                    club[j].getEnemy(i).setAttack(club[j].getEnemy(i).getAttack()+hasil2);
                    if (hasil1>hasil2)
                    {
                        club[j].setWin(club[j].getWin()+1);
                        club[j].getEnemy(i).setLose(club[j].getEnemy(i).getLose()+1);
                    }
                    else if (hasil1==hasil2)
                    {
                        club[j].setDraw(club[j].getDraw()+1);
                        club[j].getEnemy(i).setDraw(club[j].getEnemy(i).getDraw()+1);
                    }
                    else
                    {
                        club[j].setLose(club[j].getLose()+1);
                        club[j].getEnemy(i).setWin(club[j].getEnemy(i).getWin()+1);
                    }
                }
            }
        }
    }
    public void leaguetable()
    {
        System.out.println("Rank  Club              Play Win Draw Lose GoalAttack GoalDefense Point");
        int [] temp = new int[4];
        boolean [] visited = new boolean[5];
        for (int i=1;i<=4;i++)
        {
            club[i].setPoint(3*club[i].getWin()+club[i].getDraw());
            temp[i-1] = club[i].getPoint();
            visited[i] = false;
        }
        for (int i=0;i<=3;i++)
        {
            for (int j=0;j<=2;j++)
            {
                if (temp[j]>temp[j+1])
                {
                    int q = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = q;
                }
            }
        }
        for (int j=3;j>=0;j--)
        {
            for (int i=1;i<=4;i++)
            {
                if (club[i].getPoint()==temp[j] && visited[i]==false)
                {
                    System.out.print((4-j)+".    ");
                    System.out.print(club[i].getName());
                    if (i==2)
                    System.out.print("        ");
                    if (i==3)
                    System.out.print("          ");
                    if (i==4)
                    System.out.print("          ");
                    System.out.print(" 3     "+club[i].getWin()+"    "+club[i].getDraw()+"    ");
                    System.out.print(club[i].getLose()+"      "+club[i].getAttack()+"          "+club[i].getDefense()+"         "+club[i].getPoint());
                    System.out.println();
                    visited[i] = true;
                    break;
                }
            }
        }
    }
}
