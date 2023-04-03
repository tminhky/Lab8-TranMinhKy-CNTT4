package Lab8;

public interface Car {
void accelerate();
class bmw implements Car{
    public void accelerate(){
        System.out.println("bmw");
    }
    public String toString() {
        return "color:" +
                "speed =";
    }
   }
class civic implements Car{
    public void accelerate(){
        System.out.println("civic");
    }
    public String toString() {
        return "color:" +
                "speed =" ;
    }
   }
public class Main{
    public static void main(String[] args) {
     bmw xebmw = new bmw();
     xebmw.accelerate();
     civic xecivic = new civic();
     xecivic.accelerate();
    }
}
}
