public class Humanv
{
    private String name;
    private int height;
    private String nationality;
    private String status;
    private boolean haveWeapon;
    public Humanv()
    {
        name = "unknown";
        height = 0;
        nationality = "unknown";
        status = "mati";
        haveWeapon = false;
    }
    public Humanv(String name, int height, String nationality)
    {
        this.name = name;
        this.height = height;
        this.nationality = nationality;
        this.status = "mati";
        this.haveWeapon = false;
    }
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setHeight(int height) {this.height = height;}
    public int getHeight() {return height;}
    public void setNationality(String nationality) {this.nationality = nationality;}
    public String getNationality() {return nationality;}
    public void setStatus(String status) {this.status = status;}
    public String getStatus() {return status;}
    public void sethaveWeapon(boolean bool) {this.haveWeapon = bool;}
    public boolean gethaveWeapon() {return haveWeapon;}
    public class Heart
    {
        private int lebar;
        private int tinggi;
        private int detak;
        public void setLebar(int lebar) {this.lebar = lebar;}
        public int getLebar() {return lebar;}
        public void setTinggi(int tinggi) {this.tinggi = tinggi;}
        public int getTinggi() {return tinggi;}
        public void setDetak(int detak) {this.detak = detak;}
        public int getDetak() {return detak;}
        public Heart()
        {
            this.lebar = 0;
            this.tinggi = 0;
            this.detak = 0;
        }
        public Heart(int lebar, int tinggi, int detak)
        {
            this.lebar = lebar;
            this.tinggi = tinggi;
            this.detak = detak;
        }
        public void Start()
        {

        }
        public void Stop()
        {

        }
    }
    public class Hands
    {
        private int panjang;
        private int pukulan;
        public void setPanjang(int panjang) {this.panjang = panjang;}
        public int getPanjang() {return panjang;}
        public void setPukulan(int pukulan) {this.pukulan = pukulan;}
        public int getPukulan() {return pukulan;}
        public Hands()
        {
            panjang = 0;
            pukulan = 0;
        }
        public Hands(int panjang, int pukulan)
        {
            this.panjang = panjang;
            this.pukulan = pukulan;
        }
    }
    public class Feet
    {
        private int panjang;
        private int tendangan;
        public void setPanjang(int panjang) {this.panjang = panjang;}
        public int getPanjang() {return panjang;}
        public void setTendangan(int tendangan) {this.tendangan = tendangan;}
        public int getTendangan() {return tendangan;}
        public Feet()
        {
            panjang = 0;
            tendangan = 0;
        }
        public Feet(int panjang, int tendangan)
        {
            this.panjang = panjang;
            this.tendangan = tendangan;
        }
    }
    public class Weapon
    {
        private int peluru;
        private int tinggi;
        private int lebar;
        private String brand;
        public void setPeluru(int peluru) {this.peluru = peluru;}
        public int getPeluru() {return peluru;}
        public void setLebar(int lebar) {this.lebar = lebar;}
        public int getLebar() {return lebar;}
        public void setTinggi(int tinggi) {this.tinggi = tinggi;}
        public int getTinggi() {return tinggi;}
        public void setBrand(String brand) {this.brand = brand;}
        public String getBrand() {return brand;}
        public Weapon()
        {
            peluru = 0;
            tinggi = 0;
            lebar = 0;
            brand = "unknown";
        }
        public Weapon(int peluru, int tinggi, int lebar, String brand)
        {
            this.peluru = peluru;
            this.tinggi = tinggi;
            this.lebar = lebar;
            this.brand = brand;
        }
    }
    public void humanInfo()
    {
        System.out.println("Name = "+name);
        System.out.println("Height = "+height);
        System.out.println("Nationality = "+nationality);
        System.out.println("Status = "+status);
    }
}