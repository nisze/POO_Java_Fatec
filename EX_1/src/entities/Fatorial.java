package entities;

public class Fatorial {
    private int num;

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int fatorial(){
        int fat = 1;
        for(int i=1; i<=num; i++){
            fat = fat* i;
        }
        return fat;
    }

    public void resultados (){
        System.out.println("Fatorial de " + getNum()  + " é = " + fatorial());

    }

} 