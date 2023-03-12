public class NoAbstract {
    String name;
    int age;

    NoAbstract(){
    }

    NoAbstract(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){ // skickar tillbaka värdena som sedan kan stout
        return this.name + "\n" + this.age;
    }

    public void makeSounds(){
        System.out.println("Ducks says quack");
    }

    public void eat(){
        System.out.println("NoM NoM");
    }
}
