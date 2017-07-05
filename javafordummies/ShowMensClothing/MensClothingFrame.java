package showmensclothing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

//JFrame to add six clothing items and display them
@SuppressWarnings("serial")
public class MensClothingFrame extends JFrame {
    public MensClothingFrame() {
    
	MensClothingItem item;
    
	//Create new item and add description labels to frame (6 times)
	item = new MensClothingItem(ClothingType.JACKET, "Winter Jacket");
	add(new JLabel(item.getItem()));
	add(new JLabel(item.getKind()));
	
	item = new MensClothingItem(ClothingType.NECKTIE, "Winter Necktie");
	add(new JLabel(item.getItem()));
	add(new JLabel(item.getKind()));
	
	item = new MensClothingItem(ClothingType.OVERCOAT, "Winter Overcoat");
	add(new JLabel(item.getItem()));
	add(new JLabel(item.getKind()));
	
	item = new MensClothingItem(ClothingType.SHIRT, "Winter Shirt");
	add(new JLabel(item.getItem()));
	add(new JLabel(item.getKind()));
	
	item = new MensClothingItem(ClothingType.SHOES, "Winter Shoes");
	add(new JLabel(item.getItem()));
	add(new JLabel(item.getKind()));
	
	item = new MensClothingItem(ClothingType.TROUSERS, "Winter Trousers");
	add(new JLabel(item.getItem()));
	add(new JLabel(item.getKind()));
	
	setTitle("Winter Wardrobe");			//Frame title
	setLayout(new GridLayout(6, 2, 20, 3));		//Rows, columns, gaps
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Stop program on close
	pack();						//Size frame to fit
	setVisible(true);				//Show frame
    }
    
}
