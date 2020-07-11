package pk.edu.pucit.mcproject;

public class CategoryModel {
    private String imageUrl,title;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public CategoryModel (String imageUrl, String title, int id)
    {
        this.imageUrl=imageUrl;
        this.title=title;
        this.id=id;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getImageUrl()
    {
        return imageUrl;
    }
}
