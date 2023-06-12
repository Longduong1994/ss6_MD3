package EX2;

public class Student {
    int studentId;
    String studentName;
    boolean sex;
    String className;
    int age;
    String address;

    public Student() {
    }

    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Ma HS:" + studentId + "\n"
                + "Ten HS:" + studentName + "\n"
                + "Tuoi:" + age + "\n"
                + "Gioi Tinh:" + sex + "\n"
                + "Lop:" + className + "\n"
                + "Dia Chi:" + address);
    }


}

