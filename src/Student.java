public class Student {

    private String name;

    private Integer age;


    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }



    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student() {
    }

    public static void main(String[] args) {
        Student student = new Student();
    }


}



