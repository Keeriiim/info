public class Ssuperclass extends NoAbstract{
    
    /*
     * Super can only call your parent class
     * Super can only access public data types and methods, not private
     * 
     */
    String name2;
    Ssuperclass(){}

Ssuperclass(String name, int age, String name2){
    // Since it inherits you can write this. even if you have not declared String name in this class.
    // this.name = name
    // this.age = age;
    super(name, age); // You don't have to write the code above, this is easier. BUT THIS HAS TO BE THE FIRST CODE ELSE IT WILL ERROR!
    this.name2 = name2;
}
public String toString(){ // skickar hit super stout + klassens enga som kan printas tillsammans genom detta objekt.
    return super.toString() + "\n" + this.name2;
}

    @Override
    public void makeSounds(){
         super.makeSounds(); // You can call your superclass, i.e the one your inhereting from with super.
         eat();              // OR you can just call it with the method name
         // makeSounds();  will call this very method, you will be stuck in a forever loop.
        
         System.out.println("No the duck says Mjau");
         super.makeSounds(); // Override does not delete the super class
       
    }

    public void jump(){
        System.out.println("");
       super.makeSounds(); // You can call super. anywhere in this class but it is only logical to use it where it is overidden.
       makeSounds();     // This will recall the method above but will not get stuck in a ForEver-loop!
}
}
