import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class winnerPanel extends JPanel{
	JPanel panel;
	JTextField winningText;
	TitledBorder border;
	Border imprint;
	GridBagConstraints constraints;
	// Constructor to specify the attributes of the given panel to proclaim winner algorithm.
	public winnerPanel()
	{
		panel = new JPanel(new GridBagLayout());
		panel.setBackground(Color.darkGray);
		constraints = new GridBagConstraints();
		
		winningText = new JTextField(20);
		
		constraints.gridx =0;
		constraints.gridy = 0;
    	constraints.insets = new Insets(3,3,3,3);
    	constraints.anchor = GridBagConstraints.CENTER;
    	
    	
    	panel.add(winningText,constraints);
    	
    	
    	imprint = BorderFactory.createEtchedBorder();
    	border = BorderFactory.createTitledBorder(imprint, "Winning Algorithm");
    	border.setTitleColor(Color.lightGray);
    	border.setTitleJustification(TitledBorder.CENTER);
    	panel.setBorder(border);
    	
    	add(panel);
		
	}
	//Getter method to retrieve the winner textfield.
	public JTextField getwinningText() {
		return winningText;
	}

}
