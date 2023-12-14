package JavaPlay.data;

public class AToy {
    protected Integer id;
    protected String name;
    protected Integer quantity;
    protected Integer frequencyofloss;
    public AToy(Integer id,String name,Integer quantity,Integer frequencyofloss){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.frequencyofloss=frequencyofloss;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getFrequencyofloss() {
        return frequencyofloss;
    }

    public void setFrequencyofloss(Integer frequencyofloss) {
        this.frequencyofloss = frequencyofloss;
    }
}
