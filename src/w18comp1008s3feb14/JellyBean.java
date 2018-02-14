package w18comp1008s3feb14;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author JWright
 */
public class JellyBean
{
    private String color, flavour, brand;

    public JellyBean(String color, String flavour, String brand)
    {
        this.color = color;
        this.flavour = flavour;
        this.brand = brand;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        String[] validColors = {"red", "white", "blue", "orange"};
        List<String> colors = Arrays.asList(validColors);
        
        if (colors.contains(color.toLowerCase()))
            this.color = color;
        else
            throw new IllegalArgumentException("color must be red, white, blue or orange");
    }

    public String getFlavour()
    {
        return flavour;
    }

    public void setFlavour(String flavour)
    {
        this.flavour = flavour;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    
    
}
