package exercicioStoreList;

public class Store {
    private Integer id;
    private String name;
    private Double price;

    public Store() {
    }

    public Store(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        // Só os dados, formatando o preço bonitinho
        return id + ", " + name + ", " + String.format("%.2f", price);
    }

}
