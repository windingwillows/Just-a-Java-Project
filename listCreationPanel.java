import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


public class listCreationPanel extends JPanel {
	JRadioButton inOrder;
	JRadioButton almostOrder;
	JRadioButton reverseOrder;
	JRadioButton randomOrder;
	JSlider size;
	JButton createList;
	JTextField numberDisplay;
	ButtonGroup group;
	JPanel listCreationPanel;
	int n;
	TitledBorder border;
	Border etched;
	// Constructor to provide the attributes to the given listCreationPanel
	public listCreationPanel()
	{
		listCreationPanel = new JPanel(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		listCreationPanel.setBackground(Color.darkGray);
		
		inOrder = new JRadioButton("inOrder");
		inOrder.setBackground(Color.darkGray);
		inOrder.setForeground(Color.lightGray);
		almostOrder = new JRadioButton("almostOrder");
		almostOrder.setBackground(Color.darkGray);
		almostOrder.setForeground(Color.lightGray);
		reverseOrder = new JRadioButton("ReverseOrder");
		reverseOrder.setBackground(Color.darkGray);
		reverseOrder.setForeground(Color.lightGray);
		randomOrder = new JRadioButton("RandomOrder");
		randomOrder.setBackground(Color.darkGray);
		randomOrder.setForeground(Color.lightGray);
		
		group = new ButtonGroup();
		group.add(almostOrder);
		group.add(reverseOrder);
		group.add(inOrder);
		group.add(randomOrder);
		
		numberDisplay = new JTextField(4);
		
		createList = new JButton("Create the list");
		size = new JSlider(JSlider.HORIZONTAL,0,25000,0);
		size.setBackground(Color.darkGray);
		constraint.anchor = GridBagConstraints.LINE_START;
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.insets = new Insets(5,5,0,0);
			listCreationPanel.add(inOrder, constraint);
			
		constraint.gridx = 0;
		constraint.gridy = 1;	
		
			listCreationPanel.add(almostOrder, constraint);
		
		constraint.gridx = 1;
		constraint.gridy = 0;
		constraint.insets = new Insets(5,0,0,5);
			listCreationPanel.add(reverseOrder, constraint);
		
		constraint.gridx = 1;
		constraint.gridy = 1;

			listCreationPanel.add(randomOrder, constraint);
		

		constraint.gridx = 0;
		constraint.gridy = 3;		
		constraint.gridwidth = 3;
		constraint.insets = new Insets(10,5,5,5);
		constraint.fill = GridBagConstraints.HORIZONTAL;
			listCreationPanel.add(createList, constraint);
	
		constraint.fill = GridBagConstraints.NONE;
		constraint.insets = new Insets(0,0,0,0);

		constraint.gridx = 0;
		constraint.gridy = 2;
		constraint.gridwidth = 2;	
			listCreationPanel.add(size, constraint);
	
		constraint.gridwidth = 1;
		constraint.gridx = 2;			
		constraint.gridy = 2;		
		constraint.insets = new Insets(0,0,0,2);
			listCreationPanel.add(numberDisplay, constraint);

			
	   	etched = BorderFactory.createEtchedBorder();
	   	border = BorderFactory.createTitledBorder(etched, "List Properties");
	   	border.setTitleColor(Color.lightGray);
	   	border.setTitleJustification(TitledBorder.CENTER);
	   	listCreationPanel.setBorder(border);	
		
		add(listCreationPanel);

		
	}
	
	// Getters and setters for the given buttons and the textfields.
	public JButton getcreateList() {
		
		return createList;
	}
	
	public JTextField getnumberDisplay() {
		
		return numberDisplay;
	}
	
	public JRadioButton getInOrder() {
		
		return inOrder;
	}
	public JRadioButton getReverseOrder() {
		return reverseOrder;
	}
	public JRadioButton getAlmostOrder() {
		return almostOrder;
	}
	public JRadioButton getRandomOrder() {
		return randomOrder;
		
	}
	public JSlider getNumSlider() {
		return size;
	}

}
