package pk.edu.pucit.mcproject;

public class CategoryModel {
    private String imageUrl,title;
    public CategoryModel (String imageUrl,String title)
    {
        this.imageUrl=imageUrl;
        this.title=title;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getImageUrl()
    {
        return imageUrl;
    }
}