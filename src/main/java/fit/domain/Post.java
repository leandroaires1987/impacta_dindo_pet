package fit.domain;

public class Post {
    private int id;
    private String image;
    private String desciption;
    private Boolean type;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getDesciption() {
        return desciption;
    }
    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
    public Boolean getType() {
        return type;
    }
    public void setType(Boolean type) {
        this.type = type;
    }
    
    public Post(int id, String image, String desciption, Boolean type) {
        this.id = id;
        this.image = image;
        this.desciption = desciption;
        this.type = type;
    }
    
}
