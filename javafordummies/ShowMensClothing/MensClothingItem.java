package showmensclothing;

//Base class for clothing items
public class MensClothingItem {
    private ClothingType item;
    private String kind;
    
    //Constructor
    public MensClothingItem(ClothingType item, String kind) {
	this.item = item;
	this.kind = kind;
    }
    
    //Getters
    public String getItem() {
	return item.toString();
    }
    
    public String getKind() {
	return kind;
    }
}
