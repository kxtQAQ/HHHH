package entity;

public class Eat {
    /*id	varchar	255	0	-1	0	0	0							utf8	utf8_general_ci	0	0	0	0	0	0	0
    name	varchar	255	0	-1	0	0	0							utf8	utf8_general_ci	0	0	0	0	0	0	0
    price	int	255	0	-1	0	0	0							utf8	utf8_general_ci	0	0	0	0	0	0	0
    sort	varchar	255	0	-1	0	0	0							utf8	utf8_general_ci	0	0	0	0	0	0	0*/
    private String id;
    private String name;
    private Integer price;
    private String sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Eat{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sort='" + sort + '\'' +
                '}';
    }
}
