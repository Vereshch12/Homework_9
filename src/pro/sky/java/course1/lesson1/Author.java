package pro.sky.java.course1.lesson1;

import java.util.Objects;

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

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return (name.equals(c2.name) && surname.equals(c2.surname));
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}
