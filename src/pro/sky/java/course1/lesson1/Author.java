package pro.sky.java.course1.lesson1;

public class Author {
    private final String name;
    private final String surname;

    public Author(String nameAndSurname){
        this.name = nameAndSurname.substring(0, nameAndSurname.indexOf(' '));
        this.surname = nameAndSurname.substring((nameAndSurname.indexOf(' ') + 1));
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
