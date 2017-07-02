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
    public ClothingType getItem() {
	return item;
    }
    
    public String getKind() {
	return kind;
    }
}
