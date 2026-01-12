class Tirumala {
    String name;
    String ticket;
}
public class TirumalaDharshan {
    public static void main(String[] args) {
        Tirumala t1 = new Tirumala();
        t1.name = "Kyathi";
        t1.ticket = "VIP";
        Tirumala t2 = new Tirumala();
        t2.name = "Neeraja";
        t2.ticket = "VIP";
        System.out.println(t1.name);
        System.out.println(t1.ticket);
        System.out.println(t2.name);
        System.out.println(t2.ticket);
    }
}