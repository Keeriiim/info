public class Main {
    public static void main(String[] args) {
        
        // abstract = can not be instatiated i.e made as an object
        // Vehicle vehicle = new Vehicle();
        // You can only extend one class but implement as many interfaces as u want

        Car car = new Car();
        Boat boat = new Boat();

        car.startEngine();
        car.honkSound();

        System.out.println("\n\n");

        /* SUPER KEYWOARD */
        Ssuperclass newSuper = new Ssuperclass("Hello", 500, "End");
        newSuper.makeSounds();
        newSuper.jump();
        System.out.println(newSuper.toString()); // Printar return value av toString i NoAbstract & Ssuperclass.



        System.out.println("\n\n");
        /*************************/


        /* POLYMORPHISM */

        // Car[] racers = {car,boat}; Will only store car not boat
        // Boat[] racers = {car,boat}; Will only store boat
        Vehicle[] racers = {car,boat}; // Storing different objects in something they have in common - Polymorphism

        // You could call them like this
        car.startEngine();
        boat.startEngine();

        // or 
        for(Vehicle x : racers){
            x.startEngine();
        }

    }
    
}
