package movies;

public class Movie {
// CREATING FIELDS
    private String name;
    private String category;

// CONSTRUCTOR
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

// METHODS
    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setName(String userName) {
        this.name = userName;
    }

    public void setCategory (String userCategory) {
        this.category = userCategory;
    }


}
