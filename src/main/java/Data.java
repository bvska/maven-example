/**
 * Класс Data ...
 * @author jjd
 * @version 1.0
 * */
public class Data {
    /** поле Имя */
    private String name;

    /**
     * Конструктор
     * @param name значение поля name
     * */
    public Data(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}
