package backtracking;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Marcelo
 */
public class UI extends javax.swing.JFrame {

    public int k;
    public int dif;
    public int delay = 0;
    public int[][] initalBoard;

    public UI(BackTracking bt) {
        initComponents();
        BT = bt;
        k = 0;
        dif = 0;
        jEditorPane1.setVisible(false);
    }

    public UI(BackTracking bt, int delay) {
        initComponents();
        BT = bt;
        k = 0;
        dif = 0;

        this.delay = delay;
        jEditorPane1.setVisible(false);
    }

    BackTracking BT;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        JBbotao = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        JTASudoku = new java.awt.TextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        JBbotao.setText("Solve");
        JBbotao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBbotaoMouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("0");
        jRadioButton1.setActionCommand("0");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("100");
        jRadioButton2.setActionCommand("100");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("500");
        jRadioButton3.setActionCommand("500");

        jLayeredPane1.setLayer(JBbotao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRadioButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBbotao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(121, 121, 121))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBbotao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTASudoku.setBackground(new java.awt.Color(255, 255, 255));
        JTASudoku.setEditable(false);
        JTASudoku.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        JTASudoku.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(JTASudoku, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 700, 612));

        jEditorPane1.setEditable(false);
        jEditorPane1.setContentType("text/html"); // NOI18N
        jScrollPane1.setViewportView(jEditorPane1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 690, 610));

        jButton1.setText("ABRIR CSV");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBbotaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBbotaoMouseClicked

        jEditorPane1.setVisible(false);
        JTASudoku.setVisible(true);
        int N = BT.n;
        int[][] board = BT.board;
        k = 0;
        print(board, N);
        BT.solutions = new ArrayList();
        initalBoard = BT.copyArray(BT.board);

        System.out.println(buttonGroup1.getSelection().getActionCommand());
        delay = (Integer.parseInt(buttonGroup1.getSelection().getActionCommand()));
        long tempoInicial = System.currentTimeMillis();
        BT.solveSudoku(board, N);
        if (BT.solutions.size() > 0) {
            printResult(BT.solutions, N, (float) (System.currentTimeMillis() - tempoInicial) / 1000);
        } else {
            System.out.println("No solution");
        }

    }//GEN-LAST:event_JBbotaoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setFileFilter(new FileNameExtensionFilter("csv", "csv"));
        int returnValue = jfc.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            montarTabuleiro(selectedFile.getAbsolutePath());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public void print(int[][] board, int N) {
        StringBuilder st = new StringBuilder();
        for (int r = 0; r < N; r++) {
            if (r % 3 == 0) {
                st.append("\n");
            }
            for (int d = 0; d < N; d++) {
                if (d % 3 == 0) {
                    st.append("  ");
                }
                st.append(Integer.toString(board[r][d]) + "   ");

            }
            st.append("\n");

        }
        JTASudoku.setText(st.toString());
        try {
            Thread.sleep(delay);
        } catch (InterruptedException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbotao;
    private java.awt.TextArea JTASudoku;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void montarTabuleiro(String absolutePath) {
        try {
            int[][] board = readData(absolutePath);
            int N = board.length;

            BT.n = N;
            BT.board = board;

        } catch (IOException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int[][] readData(String file) throws IOException {
        ArrayList<int[]> content = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                ArrayList<Integer> row = new ArrayList<>();
                for (String s : line.split(",", -1)) {
                    row.add(Integer.parseInt(s.trim().isEmpty() ? "0" : s));
                }
                content.add(row.stream().mapToInt(i -> i).toArray());
            }
        } catch (FileNotFoundException e) {

        }
        return content.stream().map(u -> u).toArray(int[][]::new);
    }

    private void printResult(List<int[][]> solutions, int N, Float tempo) {
        jEditorPane1.setText("");
        JTASudoku.setVisible(false);
        jEditorPane1.setVisible(true);
        StringBuilder st = new StringBuilder("<div style=\"text-align: center;font-size: 12px;\"> Tempo: " + tempo);
        int index = 0;
        for (int[][] board : solutions) {
            index++;
            st.append("<br>Solução: " + index + "<br>");
            for (int r = 0; r < N; r++) {
                if (r % 3 == 0) {
                    st.append("<br>");
                }
                for (int d = 0; d < N; d++) {
                    if (d % 3 == 0) {
                        st.append("&nbsp;&nbsp;");
                    }
                    st.append(((initalBoard[r][d] == 0) ? "<a style=\"color: red\">" : "<a style=\"color: blue\">") + Integer.toString(board[r][d]) + "</a>&nbsp;&nbsp;");

                }
                st.append("<br>");
            }
        }
        st.append("<br><br></div>");
        jEditorPane1.setText(st.toString());
        try {
            Thread.sleep(delay);
        } catch (InterruptedException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
