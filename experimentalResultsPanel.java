import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class experimentalResultsPanel extends JPanel {
	JTextField n;
	JTextField datatype;
	JTextField sort;
	JTextField comparisons;
	JTextField movements;
	JTextField totaltime;
	JLabel nlabel, datatypeLabel,sortLabel,comparisonsLabel, movementsLabel, totaltimeLabel;
	JPanel panel;
	GridBagConstraints constraints;
	TitledBorder border;
	Border etched;
	
	public experimentalResultsPanel()
	{
		panel = new JPanel(new GridBagLayout());
		panel.setBackground(Color.darkGray);
    	constraints = new GridBagConstraints();
    	
		n = new JTextField(10);
		datatype = new JTextField(10);
		sort = new JTextField(10);
		comparisons = new JTextField(10);
		movements =new JTextField(10);
		totaltime = new JTextField(10);
		
		nlabel = new JLabel("N: ");
		nlabel.setForeground(Color.lightGray);
		nlabel.setBackground(Color.darkGray);
		datatypeLabel = new JLabel("Datatype: ");
		datatypeLabel.setForeground(Color.lightGray);
		datatypeLabel.setBackground(Color.darkGray);
		comparisonsLabel = new JLabel("Comparisons: ");
		comparisonsLabel.setForeground(Color.lightGray);
		comparisonsLabel.setBackground(Color.darkGray);
		sortLabel = new JLabel("Sort: ");
		sortLabel.setForeground(Color.lightGray);
		sortLabel.setBackground(Color.darkGray);
		movementsLabel = new JLabel("Movements: ");
		totaltimeLabel = new JLabel("Total Time Taken: ");
		totaltimeLabel.setForeground(Color.lightGray);
		totaltimeLabel.setBackground(Color.darkGray);
		// Coordinates for the following provided with x and y.
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.insets = new Insets(10,0,0,21);
		panel.add(n, constraints);
	
		constraints.insets = new Insets(0,0,0,21);
		constraints.gridx = 1;
		constraints.gridy = 1;
		panel.add(datatype, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		panel.add(sort, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 3;
		panel.add(comparisons, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 4;
		panel.add(movements, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 5;
		constraints.insets = new Insets(0,0,10,21);
		panel.add(totaltime, constraints);
		
		constraints.anchor = GridBagConstraints.LINE_END;
		constraints.gridx = 0;
		constraints.gridy = 0;	
		constraints.insets = new Insets(10,5,0,0);
		panel.add(nlabel, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.insets = new Insets(0,10,0,0);

		panel.add(datatypeLabel, constraints);
		constraints.insets = new Insets(0,10,0,0);
		constraints.gridx = 0;
		constraints.gridy = 2;
		panel.add(sortLabel, constraints);
		constraints.gridx = 0;
		constraints.gridy = 3;
		panel.add(comparisonsLabel, constraints);
		constraints.gridx = 0;
		constraints.gridy = 4;
		panel.add(movementsLabel, constraints);
		constraints.gridx = 0;
		constraints.gridy = 5;
		constraints.insets = new Insets(0,10,10,0);
		panel.add(totaltimeLabel, constraints);
	
	etched = BorderFactory.createEtchedBorder();
	border = BorderFactory.createTitledBorder(etched, "Results");
	border.setTitleJustification(TitledBorder.CENTER);
	panel.setBorder(border);
	
	add(panel);
	}
	
	// Setters and getters for the textfields and the labels
	 public JTextField getNField() {
	    	return n;
	    }
	    public JTextField getDataField() {
	    	return datatype;
	    }
	    public JTextField getSortField() {
	    	return sort;
	    }
	    public JTextField getComparisonField() {
	    	return comparisons;
	    }
	    public JTextField getMovementField() {
	    	return movements;
	    }
	    public JTextField getTimeField() {
	    	return totaltime;
	    }

}
