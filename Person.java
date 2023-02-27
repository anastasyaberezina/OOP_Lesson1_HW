package OOP_Lesson1;

public class Person {
    private int age;
    private String name;
    private String status;

    public Person(String name, int age){
        this.name=name;
    }

    public void setStatus(String status){
        this.status=status;
    }

    public String getStatus(){
        return status;
    }

    @Override
    public String toString() {
        return name;
    }
}
