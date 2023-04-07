


public class Person {
    private String name;  // указываем приватномть поля (инкапсуляция)
    private Integer age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String getName() {// правая кнопка мыши - генерэйт
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}
