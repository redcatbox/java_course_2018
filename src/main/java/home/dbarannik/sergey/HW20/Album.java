package home.dbarannik.sergey.HW20;

public class Album {
    private Integer userId;
    private Integer id;
    private String title;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "userId = " + userId + "\n" +
                "id = " + id + "\n" +
                "title = " + title + "\n" + "\n";
    }
}
