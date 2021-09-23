public class PiggybankMain{
    
    public static void main(String[] arg) {
        Piggybank piggybank = new Piggybank();

        // piggybank.save(200);
        // System.out.println(piggybank.money);     //test용
    }
}

class Piggybank{
    int money;

    void save(int money){
        this.money += money;
    }

   int getMoney(){
        return money;
    }
}

class MoneyCopier extends Thread{

    Piggybank piggy;
    public MoneyCopier(Piggybank piggy) {
        this.piggy = piggy;
    }
}