import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class SudokuGame extends JFrame {
    private final JTextField[][] grid;

    public SudokuGame() {
        super("Sudoku Game");
        grid = new JTextField[9][9];
        initializeGrid();
        initializeUI();
    }

    private void initializeGrid() {
        // Initializing the 9x9 grid of text fields
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                grid[row][col] = new JTextField(1);
                grid[row][col].setHorizontalAlignment(JTextField.CENTER);
            }
        }
    }

    private void initializeUI() {
        // Setting layout manager
        setLayout(new GridLayout(9, 9, 2, 2));



        // Add text fields to the JFrame
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                add(grid[row][col]);
            }
        }

        // Create a solve button
        JButton solveButton = new JButton("Solve");
        solveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solveSudoku();
            }
        });

        // Create a clear button
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearGrid();
            }
        });

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(solveButton);
        buttonPanel.add(clearButton);

        // Add the button panel to the JFrame
        add(buttonPanel);

        // Set JFrame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void solveSudoku() {
        // Add your Sudoku solving logic here
        // This is a placeholder method
        JOptionPane.showMessageDialog(this, "Sudoku solving logic goes here!");
    }

    private void clearGrid() {
        // Clear all text fields in the grid
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                grid[row][col].setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SudokuGame::new
        );
    }
}

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(SudokuGame::new);
    }
}
