
    //this is demo to show initialization of static variables
    public class StaticBlock{
        static int a =4;
        static int b;

        //will only run once when the first obj is created
        static  {
            System.out.println("I am in static block");
            b=a*5;
        }
        public static void main(String[] args) {
            StaticBlock obj=new StaticBlock();
            System.out.print(StaticBlock.a+ " " + StaticBlock.b);
        }
    }
