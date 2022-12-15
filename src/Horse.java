public class Horse {
    String name;
    String color;
    String age;

    public Horse(String name, String color, String age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public String getInfo() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
