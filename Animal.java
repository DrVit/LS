package DrV.company.lesson6;

public class Animal {
    String name;
    int run;
    int swim;
    float jump;

    public Animal() {
    }

    public Animal(String name,int run, int swim, float jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump= jump;
    }
    protected void animalInfo(){
        System.out.println("Animal: " + name);
    }
}
