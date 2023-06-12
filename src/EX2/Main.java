package EX2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Giang",true,"JAVV03",26,"Thai Nguyen");
        Student student2 = new Student(2,"Hong Anh",true,"JVC04",24,"Thai Binh");
        Student student3 = new Student(3,"Hoa",false,"QGk64",21,"Nam Dinh");
        System.out.println("----------------thong tin sv1-----------------------");
        student1.display();
        System.out.println("----------------thong tin sv2-----------------------");
        student2.display();
        System.out.println("----------------thong tin sv3-----------------------");
        student3.display();
    }
}
