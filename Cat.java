package DrV.company.lesson6;

public class Cat extends Animal {

    public Cat(String name, int run, int swim, float jump) {
        super(name, run, swim, jump);
    }
//Метод вывода информации по кошкам
    protected void catInfo () {
        System.out.println("Cat: " + name + "; run: " + run +" m; swim: " + swim + " m; jump: " + jump + " m." );
    }
//    Метод проверки на валидность
    protected boolean run(){
        if (run <= 200) {
            return true;
        }
        return false;
    }
    protected boolean swim(){
        if (swim > 0) {
            return false;
        }
        return true;
    }
    protected boolean jump(){
        if (jump <= 2F){
            return true;
        }
        return false;
    }
}
