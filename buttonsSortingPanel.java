import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
public class buttonsSortingPanel extends JPanel {
	JPanel sortingPanel;
	JButton insertionSortButton;
	JButton selectionSortButton;
	JButton quickSortButton;
	JButton mergeSortButton;
	JButton heapSortButton;
	JButton radixSortButton;
	// Constructors for defining the attributes of the panel and the button.
	public buttonsSortingPanel()
	{
		sortingPanel = new JPanel(new GridBagLayout());
		sortingPanel.setBackground(Color.darkGray);
		GridBagConstraints constraints = new GridBagConstraints();
		insertionSortButton = new JButton("Insertion Sort");
		insertionSortButton.setBackground(Color.darkGray);
		insertionSortButton.setForeground(Color.lightGray);
		insertionSortButton.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		selectionSortButton = new JButton("Selection Sort");
		selectionSortButton.setBackground(Color.darkGray);
		selectionSortButton.setForeground(Color.lightGray);
		selectionSortButton.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		quickSortButton = new JButton("Quick Sort");
		quickSortButton.setBackground(Color.darkGray);
		quickSortButton.setForeground(Color.lightGray);
		quickSortButton.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		mergeSortButton = new JButton("Merge Sort");
		mergeSortButton.setBackground(Color.darkGray);
		mergeSortButton.setForeground(Color.lightGray);
		mergeSortButton.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		heapSortButton = new JButton("Heap Sort");
		heapSortButton.setBackground(Color.darkGray);
		heapSortButton.setForeground(Color.lightGray);
		heapSortButton.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		radixSortButton = new JButton("Radix Sort");
		radixSortButton.setBackground(Color.darkGray);
		radixSortButton.setForeground(Color.lightGray);
		radixSortButton.setBorder(BorderFactory.createLineBorder(Color.blue));
		
		constraints.insets = new Insets(10,10,0,7);
		constraints.fill = GridBagConstraints.BOTH;
		constraints.ipady = 32;
		constraints.ipadx = 55;
		constraints.gridy= 0;	
		constraints.gridx= 0;
	
	sortingPanel.add(insertionSortButton, constraints);
		constraints.insets = new Insets(0,10,0,7);
		constraints.gridy= 2;	
		constraints.gridx= 0;
		
	sortingPanel.add(selectionSortButton, constraints);
		
		constraints.insets = new Insets(0,10,0,7);
		constraints.gridy= 4;	
		constraints.gridx= 0;

	sortingPanel.add(quickSortButton, constraints);
		
		constraints.insets = new Insets(0,10,0,7);
		constraints.gridy= 6;	
		constraints.gridx= 0;

	sortingPanel.add(mergeSortButton, constraints);
	
		constraints.insets = new Insets(0,10,0,7);
		constraints.gridy= 8;	
		constraints.gridx= 0;

	sortingPanel.add(heapSortButton, constraints);
	
		constraints.insets = new Insets(0,10,5,7);
		constraints.gridy= 10;	
		constraints.gridx= 0;

	sortingPanel.add(radixSortButton, constraints);
	
	sortingPanel.setBorder(BorderFactory.createEtchedBorder());
	
	add(sortingPanel);
		
	}
	
	// Getter and setters for each of the above listed buttons
	public JButton getInsertButton() {
		return insertionSortButton;
	}
	public JButton getSelectButton() {
		return selectionSortButton;
	}
	public JButton getQuickButton() {
		return quickSortButton;
	}
	public JButton getMergeButton() {
		return mergeSortButton;
	}
	public JButton getHeapButton() {
		return heapSortButton;
	}
	public JButton getRadixButton() {
		return radixSortButton;
	}
	
	
}
