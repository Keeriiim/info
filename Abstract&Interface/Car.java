public class Car extends Vehicle implements Interface {

    @Override 
    void startEngine() {
        // TODO Auto-generated method stub bcz its a child class for Vehicle.
        System.out.println("Brrrrrm Brrrm says the car");
    }

    @Override
    public void honkSound() {
        // TODO Auto-generated method stub
        System.out.println("Tuut tuuut");
    }
    
    
}
