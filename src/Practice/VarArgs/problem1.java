//Write a method that takes a String category and varargs double prices and prints :
//The category name
//Total of all prices
//Average price

package Practice.VarArgs;

class val1{
    void print(String name,float... prices){
        float total = 0;
        for(float i:prices){
            total = total + i;
        }
        System.out.println("Category : " + name);
        System.out.println("Total : " + total);
        System.out.println("Average : " + total/prices.length);
    }
}

public class problem1 {
    public static void main(String[] args){
        val1 obj = new val1();
        obj.print("Electronics",500,500,500);
    }
}
