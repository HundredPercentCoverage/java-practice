package showmensclothing;

import java.awt.Color;
import java.text.DecimalFormat;

//Subclass of MensClothingItem that includes static stuff
public class DesignerItem extends MensClothingItem {
    
    //Static items that apply to whole class
    private static String designer = "Dummies House of Fashion";
    private static double wardrobeCost = 0.0;
    private static DecimalFormat decFormat = new DecimalFormat();
    
    //Non-static vars specific to each item
    private Color itemColor;
    private double itemCost;
    
    //Static initialiser
    static {
	decFormat.setMaximumFractionDigits(2);
	decFormat.setMinimumFractionDigits(2);
    }
    
    //Constructor
    public DesignerItem(ClothingType item, String kind, Color color, double cost) {
	super(item, kind); //Always call super
	itemCost = cost;
	itemColor = color;
	
	wardrobeCost += cost; //Cumulative static cost variable
    }
    
    public String getColor() {
	return itemColor.toString(); //Doesn't return just name of colour?
    }
    
    //Static methods to return static info
    public static String findWardrobeCost() {
	return decFormat.format(wardrobeCost);
    }
    
    public static String getDesigner() {
	return designer;
    }

}
