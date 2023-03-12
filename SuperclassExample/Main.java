public class Main {
    public static void main(String[] args) {
        

    Shoe myShoe = new Shoe("Adidas", 42); // No need to call this because its child classes inherits it
    System.out.println(myShoe); // Prints the adress of the stored values
    System.out.println(myShoe.brand); // Prints the brand
    System.out.println(myShoe.size); // Prints the size
    System.out.println("\n");

    Walking w = new Walking("Commerz", 44, true); // Overrides the values put in Shoe class!
    System.out.println(w.brand);
    System.out.println(w.size);
    System.out.println(w.goreTex);
    System.out.println("\n");

    Running r = new Running("Nike", 45, 3.567); // Overrides the values put in Shoe class!
    System.out.println(r.brand);
    System.out.println(r.size);
    System.out.println(r.weight);



    }
}
