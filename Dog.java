package DrV.company.lesson6;

public class Dog extends Animal {
    public Dog(String name, int run, int swim, float jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }
//Метод вывода информации по собакам
    protected void dogInfo()  {
        System.out.println("Dog: " + name + "; run: " + run + " m; swim: " + swim + " m; jump: " + jump + " m." );
    }
//Методы проверки на валидность
    protected boolean run(){
        if (run <= 500) {
            return true;
        }
        return false;
    }
    protected boolean swim(){
        if (swim <= 10) {
            return true;
        }
        return false;
    }
    protected boolean jump(){
        if (jump <= 0.5F){
            return true;
        }
        return false;
    }
}
