package Practice.VarArgs;

class addition{
    void add(int... n){
        int sum = 0;
        for(int i:n){
            sum = sum + i;
        }
        System.out.println("The sum of these are : "+sum);
    }
    void add(String... s){
        String sum = "";
        for(String i:s){
            sum = sum + i;
        }
        System.out.println("The sum of these are : "+sum);
    }
    void add(String s, int... n){

        int sum = 0;

        for(int i:n){
            sum = sum + i;
        }
        System.out.println(s+"'s sum of these are : "+sum);
    }
}


public class sum {
    public static void main(String[] args){
        addition obj = new addition();
        obj.add(1,2,3,4,5);
        obj.add("Jayanta",1,2,3,4,5);
    }
}
