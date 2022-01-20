public class Player extends Human
{
    private int shooting;
    private int dribbling;
    private int heading;
    private int running; 
    private int passing;
    private int skill;
    private String position;
    public Player()
    {
        super();
    }
    public Player(String name,int age,String nationality,int shoot,int dribble,int head,int run,int pass,String position)
    {
        super(name, age, nationality);
        this.shooting = shoot;
        this.dribbling = dribble;
        this.heading = head;
        this.running = run;
        this.passing = pass;
        this.position = position;
    }
    public void setShooting(int shoot){ this.shooting = shoot; }
    public int getShooting() {return shooting;}
    public void setDribbling(int dribble){ this.dribbling = dribble; }
    public int getDribbling() {return shooting;}
    public void setHeading(int head){ this.heading = head;}
    public int getHeading() {return shooting;}
    public void setRunning(int run){ this.running = run; }
    public int getRunning() {return shooting;}
    public void setPassing(int pass){ this.passing = pass; }
    public int getPassing() {return shooting;}
    public void setSkill(int skill){ this.skill = skill; }
    public int getSkill() {return skill;}
    public void setPosition(String position) {this.position = position;}
    public String getPosition() {return position;}
    public void greetings()
    {
        System.out.println("Halo nama saya adalah "+name);
        System.out.println("Saya umur "+age+" dari "+nationality);
        System.out.println(shooting);
        System.out.println(dribbling);
        System.out.println(heading);
        System.out.println(running);
        System.out.println(passing);
        System.out.println(position);
    }
}
