/*
    Program Description:

The "Typing Speed Test" program is a graphical user interface (GUI) application implemented in Java. It allows users to test and measure their typing speed by typing a given text within a certain time frame. The program provides a user-friendly interface where users can start and end the typing test, and it displays the typing speed in words per minute (WPM) upon completion.

Features:
1. GUI Interface: The program utilizes Swing, a Java GUI toolkit, to create an interactive and visually appealing interface for the typing speed test.

2. Start and End Buttons: The program includes a "Start" button to initiate the typing test and an "End" button to conclude the test and display the results.

3. Text Display: The program displays the given text that users need to type in a text area. The text is randomly selected from a predefined set of options, offering variety for each test.

4. Timer: The program measures the time elapsed from the start of the test until the user finishes typing. It calculates the typing speed based on the time taken and the number of words typed.

5. Typing Speed Calculation: The program calculates the typing speed in words per minute (WPM) by dividing the number of words typed by the time taken and multiplying by 60.

6. Result Display: Upon completing the test, the program presents the user's typing speed as a message dialog, showing the WPM value with two decimal places.

Usage:
1. Launch the "Typing Speed Test" program.
2. Click the "Start" button to begin the typing test.
3. Type the displayed text accurately in the provided text area.
4. Once finished, press the "End" button.
5. A message dialog will appear, showing the user's typing speed in words per minute (WPM).
6. To take another test, click the "Start" button again.

Note: The program verifies if the typed text matches the given text. If they don't match, an error message is displayed, indicating the need to retype the text accurately.

The "Typing Speed Test" program is designed to help users assess and improve their typing skills. It provides a simple and interactive way to measure and track their progress over time.
 */
package typingspeedtest;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Yamkela Macwili
 */
public class TypingSpeedTestUI extends javax.swing.JFrame {

    private Date startTime;  // Store the start time of the test

    /**
     * Creates new form TypingSpeedTestUI
     */
    public TypingSpeedTestUI() {
        initComponents();
        setVisible(true);
        setTitle("Typing Speed Test UI");
        setLocationRelativeTo(null);
        setResizable(false);  // Make the frame non-resizable
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jTextArea2.setLineWrap(true);
        jTextArea2.setWrapStyleWord(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        startButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        endButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startButton.setBackground(new java.awt.Color(125, 160, 202));
        startButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        startButton.setForeground(new java.awt.Color(2, 16, 36));
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(2, 16, 36));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(193, 232, 255));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setOpaque(false);

        jTextArea2.setBackground(new java.awt.Color(5, 38, 89));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(193, 232, 255));
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        endButton.setBackground(new java.awt.Color(125, 160, 202));
        endButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        endButton.setForeground(new java.awt.Color(2, 16, 36));
        endButton.setText("End");
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(startButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(endButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endButton, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGap(0, 0, 0))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startButton)
                            .addComponent(endButton)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        jTextArea2.setEnabled(true);  // Enable the text field for user input
        jTextArea2.requestFocus();  // Set focus on the text field
        startButton.setEnabled(false);  // Disable the start button

        String[] texts = {
            "Code is like humor. When you have to explain it, it’s bad.",
            "Talk is cheap. Show me the code.",
            "The best error message is the one that never shows up.",
            "Simplicity is the soul of efficiency.",
            "The only way to learn a new programming language is by writing programs in it.",
            "Coding is not just code, but it’s an art.",
            "Programs must be written for people to read, and only incidentally for machines to execute.",
            "Perfection is achieved not when there is nothing more to add, but rather when there is nothing more to take away.",
            "The computer was born to solve problems that did not exist before.",
            "Programming is the closest thing we have to a superpower.",
            "Code never lies, comments sometimes do.",
            "If you think math is hard, try web design.",
            "Programmers don’t byte, they nibble a bit.",
            "It’s not a bug – it’s an undocumented feature.",
            "Programming is not about what you know, it’s about what you can figure out."
        };

        int index = (int) (Math.random() * texts.length);  // Select a random index from the texts array
        String selectedText = texts[index];  // Get the randomly selected text
        jTextArea1.setText(selectedText);  // Set the text to type

        startTime = new Date();  // Store the current time as the start time

    }//GEN-LAST:event_startButtonActionPerformed

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
        String typedText = jTextArea2.getText();  // Get the text typed by the user
        String givenText = jTextArea1.getText();  // Get the given text

        if (typedText.equals(givenText)) {
            Date endTime = new Date();  // Get the current time as the end time
            long timeElapsed = endTime.getTime() - startTime.getTime();  // Calculate the time elapsed
            double secondsElapsed = timeElapsed / 1000.0;  // Convert the time elapsed to seconds
            double wordsPerMinute = (typedText.split("\\s+").length / secondsElapsed) * 60;  // Calculate the typing speed

            JOptionPane.showMessageDialog(this, String.format("Your typing speed: %.2f words per minute.", wordsPerMinute));  // Display the typing speed in a message dialog
        } else {
            JOptionPane.showMessageDialog(this, "Typed text does not match the given text. Please try again.");  // Display an error message if the typed text doesn't match
        }

        jTextArea2.setText("");  // Clear the text field
        jTextArea2.setEnabled(false);  // Disable the text field
        startButton.setEnabled(true);  // Enable the start button for a new test

    }//GEN-LAST:event_endButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new TypingSpeedTestUI());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton endButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
