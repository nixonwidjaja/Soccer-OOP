public class Human 
{
    String name;
    int age;
    String nationality;
    public Human()
    {
        name = "unknown";
        age = 0;
        nationality = "unknown";
    }
    public Human(String name,int age, String nationality)
    {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age; 
    }
    public String getNationality()
    {
        return nationality;
    }
    public void greetings()
    {
        System.out.println("Halo nama saya adalah "+name);
    }
}
