package ra;

// cu phap khai bao lop : class + [ten lop] (dat viet hoa chu cai dau)
public class Student {
    // khai bao thuoc tinh
    private String name;
    private int age;
    private String msv;


    // ham khoi tao (constructor )
    public Student(){

    }
    public Student(String name,String msv){
        this.name = name;
        this.msv = msv;
    }
    public Student(String name,int age,String msv){
        this.name = name;
        this.age = age;
        this.msv = msv;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ", msv: "+ msv;
    }
    // phuong thuc getter va setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
}
