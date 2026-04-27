package Tuition;

class val1{
    public void print(int... n){
        for(int i : n){
            System.out.println(i);
        }
    }
}

public class varargs {
    public void main(String[] args){
        val1 obj = new val1();
        obj.print(1,2,3,4,5);
    }
}
