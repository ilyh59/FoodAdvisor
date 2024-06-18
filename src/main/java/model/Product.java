package model;

public class Product {

    private int food_id ;
    private int restaurant_id;
    private String name ;
    private String description;
    private String category ;
    private Long price ;
    private String image_url ;

    public Product(int food_id, int restaurant_id, String name, String description, Long price, String category, String image_url) {
        this.food_id = food_id;
        this.restaurant_id = restaurant_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "Product{" +
                "food_id=" + food_id +
                ", restaurant_id=" + restaurant_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getFood_id() {
        return food_id;
    }

    public int getRestaurant_id() {
        return restaurant_id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }


}
