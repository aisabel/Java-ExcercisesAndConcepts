package Concepts;

public class StaticVariables {

    //Instance variables are tight up to the object
    String name; //Instance variable
    String address; //Instance variable

    //All static variables are class variables
    static String city ="Mexico";

    //static variable (class variable), if remove keyword 'static'
    //static are not dependent on objects
    // then the result printed will be only = 1 (because of the increment i++ in the constructor
    static int i=0;

    /*Static blocks
    Static {
        city="Mexico";
        i=0;
    }
     */

    StaticVariables(String name, String address){
        //Local variables are the one called in constructor
        this.name=name;
        this.address=address;
        //this.city=city;

        i++;

        System.out.println(i);
    }

    public void getAddress(){
        System.out.println(address+" "+city);
    }

    //class method/static method will only accept static variables
    public static void getCity(){
        System.out.println(city);
    }

    public static void main(String [] args) {
        //Activate/introduce variables in class from object to constructor
        StaticVariables obj = new StaticVariables("Ana","JanAartestraat");
        StaticVariables obj1 = new StaticVariables("Isabel","BosquesDelParaiso");
        //Retrieve the variable using the information defined in object
        obj.getAddress();
        obj1.getAddress();

        StaticVariables.getCity();//Access and print static variable in static method
        //StaticVariables.i=4; //assign value to the static variable i

    }
}
