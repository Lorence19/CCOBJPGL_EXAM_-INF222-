import Locations.*;
import Tourists.*;



public class App {
    public static void main(String[] args) throws Exception {

        Locations Bohol = new Bohol();
        Locations Boracay = new Boracay();
        Locations Cebu = new Cebu();
        Locations Palawan = new Palawan();
        Locations Siargao = new Siargao();
        Locations Vigan = new Vigan();

        Tourist Lorence = new Lorence();

        Boracay.accept(Lorence);
        Bohol.accept(Lorence);
        Cebu.accept(Lorence);
        Palawan.accept(Lorence);
        Siargao.accept(Lorence);
        Vigan.accept(Lorence);



    }
}
