public class Constructor {
    String namn;
    int age;

    public Constructor(){
        // Default no args constructor
        // You can even have 
        // this("Kerim,50") can work as default value. But it has to be the first thing in this method. Else it will error.
        // and it can only work in a constructor method.
    }
    
    public Constructor(String name){
        this.namn = name; // To make it clear. "This" calls the field "namn" on the object, = name is set to the in parameter String name.
    }

    public Constructor(int ag){ // You can have multiple methods / constructors but they can not be identical
        this.age = ag; // Sets the field object age to value of ag.
    }

    public Constructor(String name, int ag){
        this.namn = name; 
        this.age = ag;
    }
}
