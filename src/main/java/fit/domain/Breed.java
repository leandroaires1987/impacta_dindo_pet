package fit.domain;

public class Breed {
    private int id;
    private String specie;
    private String description;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSpecie() {
        return specie;
    }
    public void setSpecie(String specie) {
        this.specie = specie;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Breed(int id, String specie, String description) {
        this.id = id;
        this.specie = specie;
        this.description = description;
    }    
}
