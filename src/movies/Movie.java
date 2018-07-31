package movies;

public class Movie {

    private String name;
    private String category;

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

//    set name
    public String setName(String name){
        return this.name = name;
    }

//    set category
    public String setCategory(String category){
        return this.category = category;
    }

    public Movie(String name, String category){
//        System.out.println("A new movie was added!");
        this.name = name;
        this.category = category;
    }
}
