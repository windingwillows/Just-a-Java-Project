import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class sortingImplement extends JFrame implements ActionListener, ChangeListener {
	JPanel outlinePanel;
	listCreationPanel lcp;
	inputOrders list;
	JFrame sortingImplement;
	buttonsSortingPanel buttons;
	experimentalResultsPanel results;
	winnerPanel winner;
	int array[];
	int copy[];
	GridBagConstraints constraints;
	int winnerNumber;
	String finalWinner;
	
	// Constructor to specify the attributes of the frame and the various objects implemented
	public sortingImplement()
	{
		outlinePanel = new JPanel(new GridBagLayout());
		outlinePanel.setBackground(Color.darkGray);
		sortingImplement = new JFrame();
		sortingImplement.setBackground(Color.darkGray);
		buttons = new buttonsSortingPanel();
		lcp = new listCreationPanel();
		results = new experimentalResultsPanel();
		winner = new winnerPanel();
		list = new inputOrders();
		winnerNumber = 0;
		
		lcp.getNumSlider().addChangeListener(this);
		lcp.getcreateList().addActionListener(this);
		
		// All the getters for the insert, select, quick, merge, heap and radix buttons from buttonsSortingPanel class
		buttons.getInsertButton().addActionListener(this);
		buttons.getSelectButton().addActionListener(this);
		buttons.getQuickButton().addActionListener(this);
		buttons.getMergeButton().addActionListener(this);
		buttons.getHeapButton().addActionListener(this);
		buttons.getRadixButton().addActionListener(this);
		// All the getters for n, datatype, sort, comparison, movement and total time from experimentalResultsPanel class
		results.getNField().addActionListener(this);		
		results.getDataField().addActionListener(this);
		results.getSortField().addActionListener(this);
		results.getComparisonField().addActionListener(this);
		results.getMovementField().addActionListener(this);
		results.getTimeField().addActionListener(this);
		// getter for the winner from the winnerPanel class
		winner.getwinningText().addActionListener(this);
		
		constraints = new GridBagConstraints();
		// X and Y coordinate positioning for the buttons panel
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridheight = 3;
		constraints.insets = new Insets(0,0,0,0);
		outlinePanel.add(buttons, constraints);
		// X and Y coordinates for the winning algorithm panel
		constraints.gridheight = 1;
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.FIRST_LINE_START;
		outlinePanel.add(winner, constraints);
		// X and Y coordinates for the list panel
		constraints.gridx = 1;
		constraints.gridy = 1;
		
		outlinePanel.add(lcp, constraints);
		// X and Y coordinates for the results panel
		constraints.gridx = 1;
		constraints.gridy = 2;
		outlinePanel.add(results, constraints);
			
		sortingImplement.add(outlinePanel);
		sortingImplement.setTitle("Sorting Project in Dark Mode. Light Mode arriving!");
		sortingImplement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sortingImplement.setResizable(false);
		sortingImplement.pack();
		sortingImplement.setVisible(true);

		
	}
	@Override
	public void stateChanged(ChangeEvent e)
	{
		int value = lcp.getNumSlider().getValue();
		String numberonTF = String.valueOf(value);
		lcp.getnumberDisplay().setText(numberonTF);
	}
	// This is where all the button action is recorded and sent to other classes where the computations are done.
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() ==lcp.getcreateList())
		{
			int n = Integer.parseInt(lcp.getnumberDisplay().getText());
			allSorts.setnumOfComparisons(0);
			allSorts.setnumOfMovements(0);
			if (lcp.getInOrder().isSelected()) {
				array =	list.inOrder(n);
				copy = array.clone();
				}
				else if (lcp.getReverseOrder().isSelected()) {
					array =	list.reverseOrder(n);
					copy = array.clone();
				}
				else if (lcp.getAlmostOrder().isSelected()) {
					array =	list.inOrder(n);
					list.almostOrder(array);
					copy = array.clone();
					
				}
				else if (lcp.getRandomOrder().isSelected()) {
					array =	list.inOrder(n);
					list.randominputSort(array);
					copy = array.clone();
				}
		}
		else if (e.getSource() == buttons.getInsertButton()) {
			
			allSorts.setnumOfComparisons(0);
			allSorts.setnumOfMovements(0);
			allSorts.insertionSort(copy);
			results.getSortField().setText("Insertion");
			int insertNum = lcp.getNumSlider().getValue();
			results.getNField().setText(String.valueOf(insertNum));
			
			int insertComparisons= allSorts.getnumOfComparisons(copy);
			results.getComparisonField().setText(String.valueOf(insertComparisons));
			
			int insertMovements = allSorts.getnumOfMovements(copy);
			results.getMovementField().setText(String.valueOf(insertMovements));
			long insertTime = allSorts.getEndTime();
			results.getTimeField().setText(String.valueOf(insertTime));
			if (lcp.getInOrder().isSelected()) {
				results.getDataField().setText("InOrder");
			}
			else if (lcp.getAlmostOrder().isSelected()) {
				results.getDataField().setText("AlmostOrder");
			}
			else if (lcp.getReverseOrder().isSelected()) {
				results.getDataField().setText("ReverseOrder");
			}
			else if (lcp.getRandomOrder().isSelected()) {
				results.getDataField().setText("Random");
			}
		}
		else if (e.getSource() == buttons.getSelectButton()) {
			
			allSorts.setnumOfComparisons(0);
			allSorts.setnumOfMovements(0);
			allSorts.selectionSort(copy);
			results.getSortField().setText("Selection");
			int selectNum = lcp.getNumSlider().getValue();
			results.getNField().setText(String.valueOf(selectNum));
			
			int insertComparisons= allSorts.getnumOfComparisons(copy);
			results.getComparisonField().setText(String.valueOf(insertComparisons));
			
			int insertMovements = allSorts.getnumOfMovements(copy);
			results.getMovementField().setText(String.valueOf(insertMovements));
			
			long insertTime = allSorts.getEndTime();
			results.getTimeField().setText(String.valueOf(insertTime));
			
			if (lcp.getInOrder().isSelected()) {
				results.getDataField().setText("InOrder");
			}
			else if (lcp.getAlmostOrder().isSelected()) {
				results.getDataField().setText("AlmostOrder");
			}
			else if (lcp.getReverseOrder().isSelected()) {
				results.getDataField().setText("ReverseOrder");
			}
			else if (lcp.getRandomOrder().isSelected()) {
				results.getDataField().setText("Random");
			}
		
	}
		else if (e.getSource() == buttons.getQuickButton()) {
			
			allSorts.setnumOfComparisons(0);
			allSorts.setnumOfMovements(0);
			allSorts.generateQuickSort(copy);
			results.getSortField().setText("Quick Sort");
			int insertNum = lcp.getNumSlider().getValue();
			results.getNField().setText(String.valueOf(insertNum));
			
			int insertComparisons= allSorts.getnumOfComparisons(copy);
			results.getComparisonField().setText(String.valueOf(insertComparisons));
			
			int insertMovements = allSorts.getnumOfMovements(copy);
			results.getMovementField().setText(String.valueOf(insertMovements));
			long insertTime = allSorts.getEndTime();
			results.getTimeField().setText(String.valueOf(insertTime));
			if (lcp.getInOrder().isSelected()) {
				results.getDataField().setText("InOrder");
			}
			else if (lcp.getAlmostOrder().isSelected()) {
				results.getDataField().setText("AlmostOrder");
			}
			else if (lcp.getReverseOrder().isSelected()) {
				results.getDataField().setText("ReverseOrder");
			}
			else if (lcp.getRandomOrder().isSelected()) {
				results.getDataField().setText("Random");
			}
	}
		else if (e.getSource() == buttons.getMergeButton()) {
			
			allSorts.setnumOfComparisons(0);
			allSorts.setnumOfMovements(0);
			allSorts.mergeSort(copy);
			results.getSortField().setText("Merge Sort");
			int insertNum = lcp.getNumSlider().getValue();
			results.getNField().setText(String.valueOf(insertNum));
			
			int insertComparisons= allSorts.getnumOfComparisons(copy);
			results.getComparisonField().setText(String.valueOf(insertComparisons));
			
			int insertMovements = allSorts.getnumOfMovements(copy);
			results.getMovementField().setText(String.valueOf(insertMovements));
			long insertTime = allSorts.getEndTime();
			results.getTimeField().setText(String.valueOf(insertTime));
			if (lcp.getInOrder().isSelected()) {
				results.getDataField().setText("InOrder");
			}
			else if (lcp.getAlmostOrder().isSelected()) {
				results.getDataField().setText("AlmostOrder");
			}
			else if (lcp.getReverseOrder().isSelected()) {
				results.getDataField().setText("ReverseOrder");
			}
			else if (lcp.getRandomOrder().isSelected()) {
				results.getDataField().setText("Random");
			}
	}
		else if (e.getSource() == buttons.getHeapButton()) {
			
			allSorts.setnumOfComparisons(0);
			allSorts.setnumOfMovements(0);
			allSorts.heapSort(copy);
			results.getSortField().setText("Heap Sort");
			int insertNum = lcp.getNumSlider().getValue();
			results.getNField().setText(String.valueOf(insertNum));
			
			int insertComparisons= allSorts.getnumOfComparisons(copy);
			results.getComparisonField().setText(String.valueOf(insertComparisons));
			
			int insertMovements = allSorts.getnumOfMovements(copy);
			results.getMovementField().setText(String.valueOf(insertMovements));
			long insertTime = allSorts.getEndTime();
			results.getTimeField().setText(String.valueOf(insertTime));
			if (lcp.getInOrder().isSelected()) {
				results.getDataField().setText("InOrder");
			}
			else if (lcp.getAlmostOrder().isSelected()) {
				results.getDataField().setText("AlmostOrder");
			}
			else if (lcp.getReverseOrder().isSelected()) {
				results.getDataField().setText("ReverseOrder");
			}
			else if (lcp.getRandomOrder().isSelected()) {
				results.getDataField().setText("Random");
			}
	}
		else if (e.getSource() == buttons.getRadixButton()) {
			
			allSorts.setnumOfComparisons(0);
			allSorts.setnumOfMovements(0);
			allSorts.RadixSort(copy);
			results.getSortField().setText("Radix Sort");
			int insertNum = lcp.getNumSlider().getValue();
			results.getNField().setText(String.valueOf(insertNum));
			
			int insertComparisons= allSorts.getnumOfComparisons(copy);
			results.getComparisonField().setText(String.valueOf(insertComparisons));
			
			int insertMovements = allSorts.getnumOfMovements(copy);
			results.getMovementField().setText(String.valueOf(insertMovements));
			long insertTime = allSorts.getEndTime();
			results.getTimeField().setText(String.valueOf(insertTime));
			if (lcp.getInOrder().isSelected()) {
				results.getDataField().setText("InOrder");
			}
			else if (lcp.getAlmostOrder().isSelected()) {
				results.getDataField().setText("AlmostOrder");
			}
			else if (lcp.getReverseOrder().isSelected()) {
				results.getDataField().setText("ReverseOrder");
			}
			else if (lcp.getRandomOrder().isSelected()) {
				results.getDataField().setText("Random");
			}
	}
		if (winnerNumber == 0) {
			finalWinner = results.getSortField().getText();
			winner.getwinningText().setText(finalWinner);
			winnerNumber = allSorts.getnumOfMovements(copy);
			
		}
		else if (winnerNumber > allSorts.getnumOfMovements(copy)) {
			winnerNumber = allSorts.getnumOfMovements(copy);
			finalWinner = results.getSortField().getText();
			winner.getwinningText().setText(finalWinner);
		}
}
	
}
