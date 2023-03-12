public class Main {
    public static void main(String[] args) {
        Constructor c0 = new Constructor("Hej"); // Metoden har en String input & return namn.
        System.out.println(c0.namn);

        Constructor c1 = new Constructor(100);
        System.out.println(c1.age);

        Constructor c2 = new Constructor("Hej",5);
        System.out.println(c2.namn +" " + c2.age);

        Constructor c4 = new Constructor(); // Constructor without arguments
        System.out.println(c4.namn +" " +  c4.age);

       // StaticNoObject c5 = new StaticNoObject(); - Error - The constructor is not visisble!
       System.out.println(StaticNoObject.number_Of_days_in_the_Week); // But i have to call the class!

       // ** this. ** - The point is to point towards the values in the object so you cant use it in static mathods.
        
        
        
        Metoder test0 = new Metoder();

       
       
       
       
       
        Extend test2 = new Extend();



        Inheritance test3 = new Inheritance();


        System.out.println("");
    }
}
