class pen{
//     String color;
//     String type;

//     public void write(){
//         System.out.println("Writing something");
//     }
//      public void printcolor(){
//         System.out.println(this.color);
//     }

}

class Student{
    String name;
    int roll_no;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.roll_no);
    }
}

public class oops {
    public static void main(String[] args) {
        // pen pen1=new pen();
        // pen1.color="blue";
        // pen1.type="gel";

        // pen pen2=new pen();
        // pen2.color="red";
        // pen2.type="ball";

        //  pen1.printcolor();
        //   pen2.printcolor();

        Student s1=new Student();
            s1.name="sakshi";
            s1.roll_no=12;

            s1.printInfo();
        
    }



}
