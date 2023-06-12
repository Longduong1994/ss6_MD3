package ra;

public class Main {
    public static void main(String[] args) {
        // khoi tao doi tuong: <class_name> <object_name> = new <class_name>();
        Student student = new Student("hung",25,"sv001");
        System.out.println("student" + student);
        ClassName class1 = new ClassName();
        // thay doi thuoc tinh name thong qua phuong thuc setter
        student.setName("Nam");

        // goi phuong thuc
        System.out.println(student.getName());
    }
}
