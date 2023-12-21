
package ec.espe.edu.model;

/**
 *
 * @author Frederick - DCCO ESPE
 */
public class Sibling {
    
    private String name;
    private String favoriteColor;
    private int age;
    private float height;
    private float weight;

    @Override
    public String toString() {
        return "Sibling{" + "name=" + name + ", favoriteColor=" + favoriteColor + ", age=" + age + ", height=" + height + ", weight=" + weight + '}';
    }
    
    

    public Sibling(String name, String favoriteColor, int age, float height, float weight) {
        this.name = name;
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the favoriteColor
     */
    public String getFavoriteColor() {
        return favoriteColor;
    }

    /**
     * @param favoriteColor the favoriteColor to set
     */
    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
    
}
