public class innerclasses {
    static class test{
        String name;
        public test(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        test a=new test("kunal");
         test b=new test("rahul");

         System.out.println(a.name);
         System.out.println(b.name);
    }
    
}
