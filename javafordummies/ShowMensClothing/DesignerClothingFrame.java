package showmensclothing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Color;

//JFrame to add six clothing items and display them, designer version
@SuppressWarnings("serial")
public class DesignerClothingFrame extends JFrame {
    public DesignerClothingFrame() {
    
	DesignerItem item;
    
	//Set static designer name at top
	add(new JLabel(DesignerItem.getDesigner()));
	add(new JLabel());
	add(new JLabel());
	
	//Create new item and add description labels to frame (6 times)
	item = new DesignerItem(ClothingType.JACKET, "Winter Jacket", Color.BLUE, 100.0);
	add(new JLabel(item.getColor()));
	add(new JLabel(item.getItem()));
	add(new JLabel(item.getKind()));
	
	item = new DesignerItem(ClothingType.NECKTIE, "Winter Tie", Color.BLACK, 50.99);
	add(new JLabel(item.getColor()));
	add(new JLabel(item.getItem()));
	add(new JLabel(item.getKind()));
	
	item = new DesignerItem(ClothingType.OVERCOAT, "Winter Coat", Color.YELLOW, 249.99);
	add(new JLabel(item.getColor()));
	add(new JLabel(item.getItem()));
	add(new JLabel(item.getKind()));
	
	item = new DesignerItem(ClothingType.SHIRT, "Winter Shirt", Color.WHITE, 25.00);
	add(new JLabel(item.getColor()));
	add(new JLabel(item.getItem()));
	add(new JLabel(item.getKind()));
	
	item = new DesignerItem(ClothingType.SHOES, "Winter Shoes", Color.BLACK, 39.99);
	add(new JLabel(item.getColor()));
	add(new JLabel(item.getItem()));
	add(new JLabel(item.getKind()));
	
	item = new DesignerItem(ClothingType.TROUSERS, "Winter Trousers", Color.GREEN, 84.12);
	add(new JLabel(item.getColor()));
	add(new JLabel(item.getItem()));
	add(new JLabel(item.getKind()));
	
	//Put static wardrobe cost at bottom
	add(new JLabel("Total cost: "));
	add(new JLabel(DesignerItem.findWardrobeCost()));
	
	setTitle("Designer Wardrobe");			//Frame title
	setLayout(new GridLayout(8, 3, 20, 3));		//Rows, columns, gaps
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Stop program on close
	pack();						//Size frame to fit
	setVisible(true);				//Show frame
    }
    
}