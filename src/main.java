//static variable


public class main {
    public static void main(String[] args) {
        human student = new human(14, null, 0, false);
        human employee = new human(45, null, 0, false);
        human teacher = new human(40, null, 0, false);

        System.out.println(human.population);
        System.out.println(student.age);
    }
}
