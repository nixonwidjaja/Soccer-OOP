public class Club 
{
    private String name;
    private String stadium;
    private int capacity;
    private Coach coach;
    private Player [] arr = new Player[26];
    private Club [] enemy = new Club[5];
    private boolean [] visited = new boolean[5];
    private int skill;
    private int win;
    private int draw;
    private int lose;
    private int point;
    private int attack;
    private int defense;
    public Club()
    {
        name = "unknown";
        stadium = "unknown";
        capacity = 0;
    }
    public Club(String name, String stadium, int capacity)
    {
        this.name = name;
        this.stadium = stadium;
        this.capacity = capacity;
    }
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setStadium(String stadium) {this.stadium = stadium;}
    public String getStadium() {return stadium;}
    public void setCapacity(int capacity) {this.capacity = capacity;}
    public int getCapacity() {return capacity;}
    public void setCoach(Coach coach) {this.coach = coach;}
    public Coach getCoach() {return coach;}
    public void setEnemy(int index,Club club)
    {
        this.enemy[index] = club;
    }
    public Club getEnemy(int index) {return enemy[index];}
    public void setVisited(int index,boolean bool)
    {
        this.visited[index] = bool;
    }
    public boolean getVisited(int index) {return visited[index];}
    int index = 1;
    public void addPlayer(Player player) 
    {
        this.arr[index] = player;
        index++;
    }
    public Player getPlayer(int index) {return arr[index];}
    public int getAverage()
    {
        int total = 0;
        for (int i=1;i<=24;i++)
        total += arr[i].getSkill();
        return total/24;
    }
    public void setSkill(int skill){ this.skill = skill; }
    public int getSkill() {return skill;}
    public void setWin(int win){ this.win = win; }
    public int getWin() {return win;}
    public void setDraw(int draw){ this.draw = draw; }
    public int getDraw() {return draw;}
    public void setLose(int lose){ this.lose = lose; }
    public int getLose() {return lose;}
    public void setPoint(int point){ this.point = point; }
    public int getPoint() {return point;}
    public void setAttack(int attack){ this.attack = attack; }
    public int getAttack() {return attack;}
    public void setDefense(int defense){ this.defense = defense; }
    public int getDefense() {return defense;}
    public void viewClub()
    {
        System.out.println("View club");
        System.out.println("Nama club = "+name);
        System.out.println("Nama stadium = "+stadium);
        System.out.println("Kapasitas stadium = "+capacity);
        if (coach!=null)
        System.out.println("Coach = "+coach.getName()+" "+coach.nationality+ coach.getAge()+" tahun");
        if (arr[1]!=null)
        {
            System.out.println("Player:");
            for (int j=1;j<=24;j++)
            {
                if (arr[j]!=null)
                System.out.println(j+". "+arr[j].getName()+" "+arr[j].getPosition()+" "+arr[j].getAge()+" tahun");
            }
        }
    }
}
