package day50.tasks.task2;

public class Kebab implements Food {

    @Override
    public String taste() {
        return "spicy";
    }

    public String marinade() {
        return "oil, salt";
    }

    public void grill() {
    }
}
