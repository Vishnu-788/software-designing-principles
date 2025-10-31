package patterns.creational_pattern;
interface Transport {
    public void delivery();
}

class Truck implements Transport{
    public void delivery() {
        System.out.println("Delivery by truck.");
    }
}

class Ship implements Transport{
    public void delivery(){
        System.out.println("Delivery by ship.");
    }
}

class TransportFactory{
    private Transport transport;
    public TransportFactory(int choice){
        if(choice == 1){
            this.transport = new Truck();
        } else {
            this.transport = new Ship();
        }
    }

    public Transport getTransport(){
        return this.transport;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        TransportFactory vechicle = new TransportFactory(1);
        Transport truck = vechicle.getTransport();
        truck.delivery();
    }
}
