public class Cat {
    String Name;
    String Color;
    int Age;

    public Cat(String name, String color, int age) {
        Name = name;
        Color = color;
        Age = age;
    }


    public String getInfo() {
        return "Cat{" +
                "Name='" + Name + '\'' +
                ", Color='" + Color + '\'' +
                ", Age=" + Age +
                '}';
    }
}
