import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        // test array class here
        System.out.println("Hello World, this is an array");
        
        // og arraylist for comparison
        ArrayList<Integer> ogArray = new ArrayList<Integer>();
        
        
        myArray<String> arr = new myArray<String>();

        // size

        // isEmpty

        // set
        arr.set(2, "Hello");
        
        // get
        System.out.println(arr.get(2));

        // clear
        arr.clear();
        System.out.println(arr);

        // add
        arr.add("Adding a value");

        // remove At
        arr.removeAt(1);

        // indexOf
        arr.indexOf("Hello");

        // contains
        arr.contains("Hello");

        // toString
        arr.toString();

    } 

}
