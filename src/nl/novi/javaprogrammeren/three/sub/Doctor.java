package nl.novi.javaprogrammeren.three.sub;


public class Doctor extends Human {

    private String name;

    public Doctor(String sofiNumber, String name) {
        super(sofiNumber);
        this.name = name;
    }

    @Override
    public String getSofiNumber() {
        return super.getSofiNumber();
    }
}
