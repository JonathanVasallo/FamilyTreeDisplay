
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Jonathan Vasallo Project 4 OOP
 */
public final class Frame extends javax.swing.JFrame {

    
    private static HashMap<String, HashMap<String, Person>> clientsPeopleList = new HashMap(); // stores the arrayList of people
    private static HashMap<String,Tree> tree = new HashMap();
    private static ArrayList<String> clientNamesEntered = new ArrayList();
    private static ArrayList<String> GPList = new ArrayList();
    private static ArrayList<String> PAList = new ArrayList();
    private static ArrayList<String> CHList = new ArrayList();
    private static HashMap<String,Integer> hashx = new HashMap();
    private static HashMap<String,Integer> hashy = new HashMap();
    private static ArrayList<Integer> yTrack= new ArrayList();
    private static ArrayList<Integer> xTrack= new ArrayList();
    private static JOptionPane Pane1 = new JOptionPane();
    private static HashMap<String,ArrayList<String>> fileDupe = new HashMap();
    // associated with a certain clients family information 
    
    
    public Frame() {
        initComponents();
        

    }

    /**
     * This is my JFrame form method of obtaining my GUI for my project 4.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        choice2 = new java.awt.Choice();
        jButton3 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jButton4 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 450));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jButton2.setText("Create a profile for a Client ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Client Below");

        canvas1.setBackground(Color.BLUE);
        canvas1.setSize(580, 400);
        canvas1.setMaximumSize(new java.awt.Dimension(900, 720));
        canvas1.setMinimumSize(new java.awt.Dimension(400, 300));
        canvas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canvas1MouseClicked(evt);
            }
        });
        canvas1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                canvas1ComponentResized(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Family Tree");

        jButton1.setText("Refresh/Draw Family Tree");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Add Family Member's Via Text File Input");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        label1.setText("Click Inside The Name You Want To View / Remove");

        jButton4.setText("Exit Program");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jButton2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addGap(20, 20, 20))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** 
    This is the create a profile button on our GUI which 
    takes a series of user input for name and choices to eventually lead
    to getting a file from the user to do "work" on.
    
    **/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String input = JOptionPane.showInputDialog(null, "Enter the name of the client", "yoooo");
        if (clientNamesEntered.contains(input) || input==null) {
            if(clientNamesEntered.contains(input)){
            JOptionPane.showMessageDialog(null, "The name you have entered already exists in the system or is Empty try entering a different name");
            }
            if(input==null){
            JOptionPane.showMessageDialog(null, "Profile Not Created");    
            }
        } else if (clientNamesEntered.contains(input) == false) {
            clientNamesEntered.add(input);

            //Client client = new Client(input); // creates a client not sure if we need this 
            int choice = JOptionPane.showInternalConfirmDialog(null, "Would you like to add the family tree via text file input?");
            //System.out.println(choice); // no is 1 -  cancel is 2  - yes is 0
            if (choice == 1 || choice == 2) {
                JOptionPane.showMessageDialog(null, input + "'s profile has been created.");
                choice2.add(input);
            } else if (choice == 0) {
                JFileChooser fc = new JFileChooser();
                int value = fc.showOpenDialog(fc);
                if (value == 0) {
                    File file = fc.getSelectedFile(); // finish the scan
                    try {
                        
                           
                            
                        scanFile(file, input);
                        choice2.addItem(input);

                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //System.out.println(clientsPeopleList.get("Jim").get(0));
                //ArrayList<Person> Pcopy = clientsPeopleList.get("Jim");
                // System.out.println(Pcopy.get(0).getName());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
/** 
   * This mouse event is the home to which my viewing 
  *  each persons information relies on. In here I create
  *  invisible bounds or areas based on the x and y axis
  *  of each of the rectangles that are drawn on the canvas.
  *  Each area is sensitive to a users click once the canvas
  *  has printed a clients tree and will trigger a pop up. 
 *   
    **/
    private void canvas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseClicked
        // TODO add your handling code here:
        //System.out.println("Clicked canvas" + evt.getX() + " " + evt.getY());
        
        //   __<-1stx,y__ <-2ndx, same y
        //   |          |
        //   |          |
        //   |          |
        //   |          |
        //   ___________ <-2ndx,2ndy
        //   ^1stx,2ndy
        // startTopLeftxAxis = 1st x 
        // startTopLeftyAxis = 1st y
        //second X is = startTopLeftxAxis + (6*treeWeNeed.getGrandparentArray().get(i).length())+10
        // second Y is = startTopLeftyAxis + 16
        if(GPList.isEmpty()==false){ // if not empty do stuff 
        for(int i=0; i<GPList.size();i++) { // for all parents in order from when they were entered I Believe C > F 
        String Name4XY = GPList.get(i); // returns name we need 
         
        
        // now we need to define the rectangular region based on x-y positions 
        // 1st Top left xTL yTL - Varaiables
        int xTL = hashx.get(Name4XY); // gives up top left x axis point -> need to get 2nd pt and 3rd and 4th
        int yTL = hashy.get(Name4XY); // y 
        //(6*treeWeNeed.getParentArray().get(i).length())+10
        
        //2nd Top Right xTR yTR
        int xTR = hashx.get(Name4XY);
        int lengthName = Name4XY.length();
        xTR+=((6*lengthName) + 10); // gets the other size x Value now need y
        
        int yTR = yTL;
        //3rd Bottom Left
        int xBL = xTL; // check 
        int ySize = (int) canvas1.getSize().getHeight();
        int yBL = (ySize/4); // Check 
        //4th Botton Right
        int xBR = xTR;
        int yBR = yBL;
        
        //all now we have all area stored in these values (x and y) for each corner
        // going to make a conditional statement where the click value return a X and Y value 
        // and if they are inside the rectangles region we define then do something
        if(evt.getX()>=xTL && evt.getX()<=xTR && evt.getY()>=yTR && evt.getY()<=yBR) { // inside Grandparent click   
        getAllInfoNeeded(Name4XY,1);  
        
        
        
        
        }
        }
        }
         // end of GPList 
         // start of PA List 
        if(PAList.isEmpty()==false){ // if not empty do stuff 
        for(int i=0; i<PAList.size();i++) { // for all parents in order from when they were entered I Believe C > F 
        String Name = PAList.get(i); // returns name we need 
         
        
        // now we need to define the rectangular region based on x-y positions 
        // 1st Top left xTL yTL - Varaiables
        int xTL = hashx.get(Name); // gives up top left x axis point -> need to get 2nd pt and 3rd and 4th
        int yTL = hashy.get(Name); // y 
        //(6*treeWeNeed.getParentArray().get(i).length())+10
        
        //2nd Top Right xTR yTR
        int xTR = hashx.get(Name);
        int lengthName = Name.length();
        xTR+=((6*lengthName) + 10); // gets the other size x Value now need y
        
        int yTR = yTL;
        //3rd Bottom Left
        int xBL = xTL; // check 
        int ySize = (int) canvas1.getSize().getHeight();
        int yBL = (2*(ySize/4)); // Check 
        //4th Botton Right
        int xBR = xTR;
        int yBR = yBL;
        
        //all now we have all area stored in these values (x and y) for each corner
        // going to make a conditional statement where the click value return a X and Y value 
        // and if they are inside the rectangles region we define then do something
        if(evt.getX()>=xTL && evt.getX()<=xTR && evt.getY()>=yTR && evt.getY()<=yBR) { // // inside parent click  
        getAllInfoNeeded(Name,2);
        }
        }
        }
        
        
        if(CHList.isEmpty()==false){ // if not empty do stuff 
        for(int i=0; i<CHList.size();i++) { // for all parents in order from when they were entered I Believe C > F 
        String Name = CHList.get(i); // returns name we need 
         
        
        // now we need to define the rectangular region based on x-y positions 
        // 1st Top left xTL yTL - Varaiables
        int xTL = hashx.get(Name); // gives up top left x axis point -> need to get 2nd pt and 3rd and 4th
        int yTL = hashy.get(Name); // y 
        //(6*treeWeNeed.getParentArray().get(i).length())+10
        
        //2nd Top Right xTR yTR
        int xTR = hashx.get(Name);
        int lengthName = Name.length();
        xTR+=((6*lengthName) + 10); // gets the other size x Value now need y
        
        int yTR = yTL;
        //3rd Bottom Left
        int xBL = xTL; // check 
        int ySize = (int) canvas1.getSize().getHeight();
        int yBL = (3*(ySize/4)); // Check 
        //4th Botton Right
        int xBR = xTR;
        int yBR = yBL;
        
        //all now we have all area stored in these values (x and y) for each corner
        // going to make a conditional statement where the click value return a X and Y value 
        // and if they are inside the rectangles region we define then do something
        if(evt.getX()>=xTL && evt.getX()<=xTR && evt.getY()>=yTR && evt.getY()<=yBR) { // inside child click  
       // System.out.println("You Clicked on " + Name);  
           // String auntyUncy = AuntUncle(Name);
            //System.out.println(auntyUncy);
            getAllInfoNeeded(Name,3); // this is for popup
            
        }
        }
        }
        
        

    }//GEN-LAST:event_canvas1MouseClicked
   /** 
    This is the Refresh/Display Tree button on our GUI which essentially
    only works if a client has been created AND that client has entered family
    into their profile. If this condition is met then all of the family
    the client has added so far is printed evenly spaced in the canvas 
    by drawing Strings of the names and lines for their corresponding
    relationships to one another.
    
    **/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // button to GET selected index of item list to display the tree
       // DISPLAY TREE BUTTON
       if(choice2.getItemCount()!=0 && clientsPeopleList.containsKey(choice2.getSelectedItem())){
       
       
        GPList.clear(); // clear the list so no repitiion 
        PAList.clear();
        CHList.clear();
        
        int indx = choice2.getSelectedIndex(); // gets index 
        String nameNeeded = choice2.getItem(indx).toString();
        //System.out.println(nameNeeded);
        //System.out.println(tree.get(nameNeeded).getGrandparentArray().toString());
        //System.out.println(tree.get(nameNeeded).getParentArray().toString());
        //System.out.println(tree.get(nameNeeded).getChildArray().toString());

        //tree.get(nameNeeded).getParentArray().get(0); // gets a name 
        //System.out.println(example + " im expecting  Cynth");
        // what do we neded to do here 
        //we need to display the tree 
        // first we need to create the tree correctly 
        // removal from a lower generation dupe
        for (int i = 0; i < tree.get(nameNeeded).getParentArray().size(); i++) {
            for (int j = 0; j < tree.get(nameNeeded).getChildArray().size(); j++) {
                String removeWS = tree.get(nameNeeded).getChildArray().get(j);
                String removeWS2 = tree.get(nameNeeded).getParentArray().get(i);
                //System.out.println(removeWS + " " + removeWS2);

                if (removeWS.equals(" " + removeWS2)) {

                    tree.get(nameNeeded).getChildArray().remove(tree.get(nameNeeded).getChildArray().get(j));

                    // removes the name that is in both lists only from childs
                    // basically just make sure data is correct with each list 
                }
            }
        }

        HashMap<String, Person> personListRE = new HashMap();
        personListRE = clientsPeopleList.get(nameNeeded);

        for (int q = 0; q < tree.get(nameNeeded).getParentArray().size(); q++) { // for every parent 
            for (int a = 0; a < tree.get(nameNeeded).getParentArray().size(); a++) { // for every parent comp to itself even
                String temp3 = tree.get(nameNeeded).getParentArray().get(q).stripLeading();
                String temp4 = tree.get(nameNeeded).getParentArray().get(a).stripLeading();
                if (personListRE.get(temp3).getChildren().contains(temp4)) { // this is checking the parent array to see if any person in the list
                    //System.out.println(tree.get(nameNeeded).getParentArray().get(j)); // should be sandra Erickson
                    //System.out.println(personListRE.get(i).getName() + " has a child that is in the same list "); // should be sandras

                    tree.get(nameNeeded).getGrandparentArray().add(personListRE.get(temp3).getName()); // mother / father getting bumped up to next gen

                    tree.get(nameNeeded).getParentArray().remove(personListRE.get(temp3).getName()); // removes prev location 
                    //System.out.println(personListRE.get(temp3).getName() + " is the Parent here we are adding to GP list and remove from Parent list");
                    //System.out.println(tree.get(nameNeeded).getParentArray().toString() + " making sure that parent is missing ");
                    // System.out.println(tree.get(nameNeeded).getGrandparentArray().toString() + " making sure that parent is added ");

                    // try and remove children from the children array 
                    //System.out.println(personListRE.get(temp3).getChildren());
                    for (int j = 0; j < tree.get(nameNeeded).getChildArray().size(); j++) { // for all children in children list 
                        if (personListRE.get(temp3).getChildren().contains(tree.get(nameNeeded).getChildArray().get(j))) { // if the one of the parents children are found being in the childs list , remove them and 
                            // add them to parents list 
                            String temporary = tree.get(nameNeeded).getChildArray().get(j);
                            //System.out.println(tree.get(nameNeeded).getChildArray().toString() + " Childs array before removing " + temporary);
                           // System.out.println(temporary + " See whats really being removed here");
                            tree.get(nameNeeded).getChildArray().remove(temporary);
                            //System.out.println(tree.get(nameNeeded).getChildArray().toString() + " Childs array AFTER removing " + temporary);
                            if (tree.get(nameNeeded).getParentArray().contains(temporary) == false) {
                                //System.out.println(tree.get(nameNeeded).getParentArray().toString() + " Parents Array before adding " + temporary);
                                tree.get(nameNeeded).getParentArray().add(temporary);
                            }
                            //tree.get(nameNeeded).getParentArray().add(temporary);
                            //System.out.println(tree.get(nameNeeded).getParentArray().toString() + " Parents Array AFTER adding " + temporary);
                            //System.out.println(tree.get(nameNeeded).getGrandparentArray().toString() + " GrandParents Array");
                        }
                    }

                }    // end of if

            }// end first for 
        } // END SECOND for
        //System.out.println(tree.get(nameNeeded).getParentArray().toString());
        drawTree(personListRE,tree.get(nameNeeded));
        
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formPropertyChange

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
        //System.out.println(evt.getNewState());
    }//GEN-LAST:event_formWindowStateChanged

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        //canvas1.
    }//GEN-LAST:event_formMouseDragged

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formComponentResized

    private void canvas1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_canvas1ComponentResized
        // TODO add your handling code here:
        //System.out.println("Moved");
       
       int xSizer = (int) canvas1.getSize().getWidth();
       int ySizer = (int) canvas1.getSize().getHeight();
       if(xSizer<400||ySizer<300){ 
       canvas1.setSize(400, 300);
       
       }
       
    }//GEN-LAST:event_canvas1ComponentResized
   /* 
    This is the add member to clients profile via text input button.
    It runs the scanFile method but with a twist. It will not take repeating
    files to the same clients profile as it would be redundant, and takes any
    number of files to add to the family members of the specified client that is
    selected at that moment of clicking this button.
    */

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Add member to the living list button 
        
        // error check. this button can only be pressed if a client is selected
        // in the Choice2 box 
        if(choice2.getItemCount()!=0){ // obly happens when choice isnt empty 
        choice2.getSelectedIndex(); // gets which client we need 
        choice2.getSelectedItem(); // returns the nameNeeded for Tree !
         // need to Find out what scan needs 
         int choice = JOptionPane.showInternalConfirmDialog(null, "Would you like to add Family Member(s) via text file input?");
            //System.out.println(choice); // no is 1 -  cancel is 2  - yes is 0
            if (choice == 1 || choice == 2) {
                JOptionPane.showMessageDialog(null,"No Family Members Were Added.");
                
            } else if (choice == 0) {
                JFileChooser fc = new JFileChooser();
                int value = fc.showOpenDialog(fc);
                if (value == 0) {
                    File file = fc.getSelectedFile(); // finish the scan
                    try {
                        scanFile(file, choice2.getSelectedItem());

                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
        
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
    Quit Button
    */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Exit Button 
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

       /**
    This drawTree Method is responsible for drawing the Tree of our selected
    client depending on how many family members have been added.
    **/ 

    public void drawTree(HashMap<String,Person> personLister,Tree treeWeNeed) {
       
       
       Graphics g = canvas1.getGraphics(); // this will draw a line diagonal
       HashMap<String,Integer> posX = new HashMap();
       HashMap<String,Integer> posY = new HashMap();
        g.setColor(Color.WHITE);
        
        int ySize = (int) canvas1.getSize().getHeight();
        int xSize = (int) canvas1.getSize().getWidth();
        if(yTrack.isEmpty()){
        yTrack.add(ySize);
        xTrack.add(xSize);   
        }
        
        
        
        g.clearRect(0,0,xSize,ySize);
        //System.out.println(ySize+ " Y");
        //System.out.println(xSize+ " X");

        //g.drawLine(0,0, 20, 20);
        //g.drawString("Carla", 70, 70); // draws a String 
        
        //grand parents go first
        for(int i = 0; i<treeWeNeed.getGrandparentArray().size();i++) {// for all grand parents in the list
        g.drawString(treeWeNeed.getGrandparentArray().get(i),(i+1)*(xSize/(1+treeWeNeed.getGrandparentArray().size())) , ySize/4);
        int startTopLeftx = ((i+1)*(xSize/(1+treeWeNeed.getGrandparentArray().size()))-4);
        
        int startTopLeftyAxis = ((ySize/4)-13);
        
        
         // if the list is empty 
        g.drawRect(startTopLeftx, startTopLeftyAxis, (6*treeWeNeed.getGrandparentArray().get(i).length())+10, 16);
        
        //need 2 x axises 
        //need 2 y axises 
        //   __<-1stx,y__ <-2ndx, same y
        //   |          |
        //   |          |
        //   |          |
        //   |          |
        //   ___________ <-2ndx,2ndy
        //   ^1stx,2ndy
        // startTopLeftxAxis = 1st x 
        // startTopLeftyAxis = 1st y
        //second X is = startTopLeftxAxis + (6*treeWeNeed.getGrandparentArray().get(i).length())+10
        // second Y is = startTopLeftyAxis + 16
        if(GPList.contains(treeWeNeed.getGrandparentArray().get(i))==false){
        GPList.add(treeWeNeed.getGrandparentArray().get(i)); // should only be doing this 2 times     
        }
        //GPList.add(treeWeNeed.getGrandparentArray().get(i)); // should only be doing this 2 times 
        if(hashx.containsKey(treeWeNeed.getGrandparentArray().get(i))==false){            
        hashx.put(treeWeNeed.getGrandparentArray().get(i),startTopLeftx); // puts the only x axis we need         
        }
        if(hashx.containsKey(treeWeNeed.getGrandparentArray().get(i)) && xTrack.get(0)!=startTopLeftx){            
        hashx.remove(treeWeNeed.getGrandparentArray().get(i)); // puts the only x axis we need   
        hashx.put(treeWeNeed.getGrandparentArray().get(i),startTopLeftx);
        }
        
        if(hashy.containsKey(treeWeNeed.getGrandparentArray().get(i)) && yTrack.get(0)!=startTopLeftyAxis){            
        hashy.remove(treeWeNeed.getGrandparentArray().get(i)); // puts the only x axis we need   
        hashy.put(treeWeNeed.getGrandparentArray().get(i),startTopLeftyAxis);
        }
         // end of GP ERROR CHECK  doesnt happen if it has been done before 
        if(hashy.containsKey(treeWeNeed.getGrandparentArray().get(i))==false){
        hashy.put(treeWeNeed.getGrandparentArray().get(i),startTopLeftyAxis); // puts only y we need we can get all rect value with math 
        }
        
        //g.drawRect(((i+1)*(xSize/(1+treeWeNeed.getGrandparentArray().size()))-7) , ((ySize/4)-11), (6*treeWeNeed.getGrandparentArray().get(i).length())+((i+1)*(xSize/(1+treeWeNeed.getGrandparentArray().size()))) , (2+(ySize/4)));
        posX.put(treeWeNeed.getGrandparentArray().get(i), (i+1)*(xSize/(1+treeWeNeed.getGrandparentArray().size())));
        posY.put(treeWeNeed.getGrandparentArray().get(i), ySize/4);
        } // end for grandparents 
            
        
        //parents go second 
        for(int i = 0; i<treeWeNeed.getParentArray().size();i++) {// for all parents in the list
        g.drawString(treeWeNeed.getParentArray().get(i),((i+1)*(xSize/(1+treeWeNeed.getParentArray().size()))) , 2*(ySize/4));
        
        int startTopLeftx =((i+1)*(xSize/(1+treeWeNeed.getParentArray().size()))-4);
        
        int startTopLeftyAxis = ((2*(ySize/4))-13);
        
        g.drawRect(startTopLeftx, startTopLeftyAxis, (6*treeWeNeed.getParentArray().get(i).length())+10, 16);
        
        if(PAList.contains(treeWeNeed.getParentArray().get(i))==false){
        PAList.add(treeWeNeed.getParentArray().get(i)); // should only be doing this 2 times  
        //System.out.println(" I Should be seeing that addition into PA LIST SiZe: -> :" +  PAList.size());
        }
        
        
        if(hashx.containsKey(treeWeNeed.getParentArray().get(i))==false){
        hashx.put(treeWeNeed.getParentArray().get(i),startTopLeftx); // puts the only x axis we need 
        }
        if(hashx.containsKey(treeWeNeed.getParentArray().get(i)) && xTrack.get(0)!=startTopLeftx){            
        hashx.remove(treeWeNeed.getParentArray().get(i)); // puts the only x axis we need   
        hashx.put(treeWeNeed.getParentArray().get(i),startTopLeftx);
        }
        
        if(hashy.containsKey(treeWeNeed.getParentArray().get(i)) && yTrack.get(0)!=startTopLeftyAxis){            
        hashy.remove(treeWeNeed.getParentArray().get(i)); // puts the only x axis we need   
        hashy.put(treeWeNeed.getParentArray().get(i),startTopLeftyAxis);
        }
        if(hashy.containsKey(treeWeNeed.getParentArray().get(i))==false){
        hashy.put(treeWeNeed.getParentArray().get(i),startTopLeftyAxis); // puts only y we need we can get all rect value with math 
        }
        
        posX.put(treeWeNeed.getParentArray().get(i), (i+1)*(xSize/(1+treeWeNeed.getParentArray().size())));
        posY.put(treeWeNeed.getParentArray().get(i), 2*(ySize/4));
        } // end pf parents 
        
        //children go 3rd 
        for(int i = 0; i<treeWeNeed.getChildArray().size();i++) {// for all grand parents in the list
        g.drawString(treeWeNeed.getChildArray().get(i),(i+1)*(xSize/(1+treeWeNeed.getChildArray().size())) , 3*(ySize/4));
        int startTopLeftx =((i+1)*(xSize/(1+treeWeNeed.getChildArray().size()))-4);
        
        int startTopLeftyAxis = ((3*(ySize/4))-13);
       
        g.drawRect(startTopLeftx, startTopLeftyAxis, (6*treeWeNeed.getChildArray().get(i).length())+10, 16);
        
        
        if(CHList.contains(treeWeNeed.getChildArray().get(i))==false){
        CHList.add(treeWeNeed.getChildArray().get(i)); // should only be doing this 2 times  
        //System.out.println(" I Should be seeing that addition into PA LIST SiZe: -> :" +  PAList.size());
        }
        
        
        if(hashx.containsKey(treeWeNeed.getChildArray().get(i))==false){
        hashx.put(treeWeNeed.getChildArray().get(i),startTopLeftx); // puts the only x axis we need 
        }
        if(hashx.containsKey(treeWeNeed.getChildArray().get(i)) && xTrack.get(0)!=startTopLeftx){            
        hashx.remove(treeWeNeed.getChildArray().get(i)); // puts the only x axis we need   
        hashx.put(treeWeNeed.getChildArray().get(i),startTopLeftx);
        }
        
        if(hashy.containsKey(treeWeNeed.getChildArray().get(i)) && yTrack.get(0)!=startTopLeftyAxis){            
        hashy.remove(treeWeNeed.getChildArray().get(i)); // puts the only x axis we need   
        hashy.put(treeWeNeed.getChildArray().get(i),startTopLeftyAxis);
        }
        if(hashy.containsKey(treeWeNeed.getChildArray().get(i))==false){
        hashy.put(treeWeNeed.getChildArray().get(i),startTopLeftyAxis); // puts only y we need we can get all rect value with math 
        }
        
        
        posX.put(treeWeNeed.getChildArray().get(i), (i+1)*(xSize/(1+treeWeNeed.getChildArray().size())));
        posY.put(treeWeNeed.getChildArray().get(i), 3*(ySize/4));
        }
        
        //now we have to draw a line from each grandparent to parent if they have a child-parent relation
        for(int gp=0; gp<treeWeNeed.getGrandparentArray().size();gp++) {// for all grand parents 
            for(int pa =0; pa<treeWeNeed.getParentArray().size();pa++){
                if(personLister.get(treeWeNeed.getGrandparentArray().get(gp)).getChildren().contains(treeWeNeed.getParentArray().get(pa))){
                    // if any grandparent's children matches anyone in parent array do something
                    // in this conditional statement we want to draw a line from postion of GP and Par
                    String nameGP = treeWeNeed.getGrandparentArray().get(gp); // name of grandparent
                    String namePA = treeWeNeed.getParentArray().get(pa); // name of parent 
                    String ggg = personLister.get(treeWeNeed.getGrandparentArray().get(gp)).getChildren();
                    
                    //System.out.println(ggg + " This is the children of GrandParent: "+ personLister.get(treeWeNeed.getGrandparentArray().get(gp))+" and We are seeing if " + namePA + " Matches");
                    g.drawLine(posX.get(nameGP), posY.get(nameGP), posX.get(namePA), posY.get(namePA)-13);
                } else {                }
            }
        
        }
        // now we have to draw a line from each parent to child if they have a child-parent relation
        for(int pa=0; pa<treeWeNeed.getParentArray().size();pa++) {// for all grand parents 
            for(int ca =0; ca<treeWeNeed.getChildArray().size();ca++){
                
                try{
                if(personLister.get(treeWeNeed.getParentArray().get(pa)).getChildren().contains(treeWeNeed.getChildArray().get(ca))){ // if any grandparent's children matches anyone in parent array do something
                    // in this conditional statement we want to draw a line from postion of GP and Par
                    
                    String namePA = treeWeNeed.getParentArray().get(pa); // name of parent 
                    String nameCA = treeWeNeed.getChildArray().get(ca); // name of grandparent
                    String ggg = personLister.get(treeWeNeed.getParentArray().get(pa)).getChildren();
                    
                    //System.out.println(ggg + " This is the children of GrandParent: "+ personLister.get(treeWeNeed.getParentArray().get(pa))+" and We are seeing if " + nameCA + " Matches");
                    g.drawLine(posX.get(namePA), posY.get(namePA), posX.get(nameCA), posY.get(nameCA)-13);
                }
                }catch(NullPointerException e){
                //System.out.println("ERROR");
                }
            }
        
        }
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }
     /** 
    ScanFile is my method for taking in either brand new client family info
    or for currently existing client info and makes sure that if any file that
    is selected is a ".txt" document for if it is not user will see a message
    dialogue.
    **/

    public void scanFile(File f, String client) throws FileNotFoundException {
        
        if(f.getName().endsWith(".txt")){
            
        
        
        //System.out.println(f.getName()+ " FILEEEEEEEEE NAMEEEEEEEEEEE");
        ArrayList<String> fileCheck = new ArrayList();
        
        if(fileDupe.containsKey(client)==false) {
               fileDupe.put(client, fileCheck);
           } 
        
       
        
        
            if(fileDupe.get(client).contains(f.getName())) { // if a clients arrayList of Files contains this file name we just entered 
        //System.out.println(" Gunna try to break");    
        
        }
        
            
        if(fileDupe.get(client).contains(f.getName())==false) { // do all normally
                
            
        
        
        
         //make an array List inside of string position >?
        //System.out.println(fileDupe.get(client));
        HashMap<String, Person> personList = new HashMap();
        ArrayList<String> grand = new ArrayList(); // grandparent
        ArrayList<String> par = new ArrayList(); // parent init list 
        ArrayList<String> chi = new ArrayList(); // child init list 
        Scanner inf = new Scanner(f);
        while (inf.hasNextLine()) {

            String line = inf.nextLine();
            if (line.isEmpty()) {
                //System.out.println("The While loop broke into second branch");
                break;
            }
            String[] linesplit = line.split(",");
            if (linesplit.length > 3) { // living person 
                //System.out.println(linesplit[3] + "should print state -- living person: " + linesplit[0]);
                LivingPerson lp = new LivingPerson(linesplit[0], linesplit[1], "N/A", "", "", linesplit[2], linesplit[3]);
                personList.put(linesplit[0], lp);
            } else if (linesplit.length == 3) {
                DeadPerson d = new DeadPerson(linesplit[0], linesplit[1], "N/A", "", "", linesplit[2]);
                personList.put(linesplit[0], d);
            }

        } // end while loop 1
        while (inf.hasNextLine()) {
            String line = inf.nextLine();

            String[] linesplit2 = line.split(",");
            if (linesplit2[1].equals(" parentof")) {
                //System.out.println(linesplit2[0] + " is a parent of " + linesplit2[2]);
                //all since the person is a parent we have to update their children 
                //so set it
                if (par.contains(linesplit2[0]) == false) { // parents list
                    par.add(linesplit2[0]); // add parent to parent list 
                }

                //System.out.println(par.toString() + "   parent  ");
                if (chi.contains(linesplit2[2]) == false) { // gets children
                    chi.add(linesplit2[2]);
                    //System.out.println(chi.toString());
                }

                // REMOVES 
                //System.out.println(par.remove(linesplit2[0])); // should print true somewhere
                //System.out.println(par.toString()  +"   After removed ");
                // the goal of this for loop was to see for all people -> if a persons name == the name we come across (PARENTS OF SECTION) 
                if (personList.get(linesplit2[0]).getName().equals(linesplit2[0])) { // then the parent is found  I THINK WE CAN JUST NOT ITERATE AND GET THE NAME EASIERR LOOK HERERERERER
                    // need to set children

                    personList.get(linesplit2[0]).setChildren(linesplit2[2]);
                    String replacement = linesplit2[2].stripLeading();
                    personList.get(replacement).setParents(linesplit2[0]);
                    //below to print children 
                    //System.out.println("Settin childs up casue its workinnnnn");
                    //System.out.println(linesplit2[0]+ " children are: "+ personList.get(linesplit2[0]).getChildren());
                    //System.out.println(linesplit2[0]+ " children are: "+ personList.get(i).getChildren());
                }

            }
            if (linesplit2[1].equals(" marriedto")) {

                // then the parent is found 
                // need to set children 
                personList.get(linesplit2[0]).setMarriedTo(linesplit2[2]);
                //System.out.println(personList.size() + " Expecting 11");
                String temp = linesplit2[2].stripLeading();
                personList.get(temp).setMarriedTo(linesplit2[0]);
                //personList.get(temp).setMarriedTo(linesplit2[2]);
                //System.out.println(temp + "'s married to " + personList.get(temp).getMarriedTo());
                //System.out.println(linesplit2[0] + "'s married to " + personList.get(linesplit2[0]).getMarriedTo());

                // end of 2nd for loop to also set them both married to one another 
            } // end if statement

        } // end of while loop 2
        // after all text file has been read through 
        //add the arrayList into a hashmap just for people 
        
        
        
        
        if(clientsPeopleList.containsKey(client)){ // if true that means we must add on 
        //System.out.println(clientsPeopleList.get(client).size() + " is the List SIZE 1 ");    
        //personList.putAll(clientsPeopleList.get(client));
        clientsPeopleList.get(client).putAll(personList); // this reutrn value personList
        //System.out.println(personList.size() + " is the List SIZE 2 ");
        //clientsPeopleList.remove(client);
        //clientsPeopleList.put(client, personList);
        //System.out.println(clientsPeopleList.get(client).size() + " is the List SIZE 3");
        
        }
        
        if(clientsPeopleList.containsKey(client)==false) {
        clientsPeopleList.put(client, personList); // client is name as key - value is the people associated w client    
        }
        
        
        

        Tree tree1 = new Tree(par, chi); // stores basic info needed to display tree for specific client 
        
        //HashMap<String, Tree> hashTree = new HashMap();
        
        //hashTree.put(client, tree1);
        
        if(tree.containsKey(client)){
            
        int temp = tree1.getChildArray().size();
        int temp2 = tree1.getParentArray().size();
        int temp3 = tree1.getGrandparentArray().size();
        for(int i = 0; i <temp;i++) {
            if(tree.get(client).getChildArray().contains(chi.get(i))==false){
             tree.get(client).getChildArray().add(chi.get(i));   
            }else{
            //System.out.println(chi.get(i)+" is Being repeated ");
            }
         
        
        }
        for(int i = 0; i <temp2;i++) {
            if(tree.get(client).getParentArray().contains(par.get(i))==false ){
             //before adding we need to make sure they arent grandpants   
             tree.get(client).getParentArray().add(par.get(i));  
            }else{
            //System.out.println(par.get(i)+" is Being repeated ");
            }
        }
        //&& tree.get(client).getGrandparentArray().contains(par.get(i))==false
        
        
        
       // System.out.println(tree.get(client).getChildArray().size() + " Size ch after");
        
        //System.out.println(tree.get(client).getParentArray().size() + " Size par after");  
        }
        if(tree.containsKey(client)==false) {
        tree.put(client, tree1); // distinguishes data as eqach client has different data 
        //System.out.println(tree1.getChildArray().size() + "Size of child ary before");
        //System.out.println(tree1.getParentArray().size()+ "Size of parent ary before");
        }
        
        
        //
      fileCheck.add(f.getName());  
      fileDupe.put(client, fileCheck);
    }
        
    }else{
        JOptionPane.showMessageDialog(null, "Only .txt Files Will Work Try Again");
        }
    }
            
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private java.awt.Choice choice2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

       /**
    This is my method of obtaining Aunts and uncles of the name of the 
    person that was clicked by the user from the displaying family tree.
    */

    public String AuntUncle(String name){
        String overallString = "";
    String ClientName = choice2.getSelectedItem(); // client we are focused on 
    //System.out.println(ClientName);
    //System.out.println(clientsPeopleList.toString());
    HashMap<String, Person> personList = new HashMap();
        personList = clientsPeopleList.get(ClientName);
        String name2 = name.stripLeading();
        //System.out.println(personList.get(name2).getName());
    
    String parents = clientsPeopleList.get(ClientName).get(name2).getParents();
    //System.out.println(parents);
    if("".equals(parents)==false){
        for(int i = 0;i<tree.get(ClientName).getParentArray().size(); i++){
          
        if(parents.contains(tree.get(ClientName).getParentArray().get(i))){
         //System.out.println("LOOKING FOR:" + tree.get(ClientName).getParentArray().get(i));   
        String parentFound = tree.get(ClientName).getParentArray().get(i);
        String parentsOfParents = clientsPeopleList.get(ClientName).get(parentFound).getParents();
        
        if("".equals(parentsOfParents)==false){
         for(int k = 0;k<tree.get(ClientName).getGrandparentArray().size(); k++){
          if(parentsOfParents.contains(tree.get(ClientName).getGrandparentArray().get(k))) {
             String GrandParentFound = tree.get(ClientName).getGrandparentArray().get(k); 
             
              // now that we have the grandparent we have to get the children.
              // the children that ARENT the name we originally started with (name)
              // are the people who are going to be set as uncle and aunts
              String children = personList.get(GrandParentFound).getChildren();
              for(int j = 0;j<tree.get(ClientName).getParentArray().size(); j++){
              if(children.contains(tree.get(ClientName).getParentArray().get(j)) && !tree.get(ClientName).getParentArray().get(j).equals(parentFound)){
              overallString+= tree.get(ClientName).getParentArray().get(j);   
              }    
              }
             return overallString;
          }
         }   
        }
        } 
    }
    } 
        return overallString;
    }
    /** 
    This is my method of obtaining the grandparents of the name of the 
    person that was clicked by the user from the displaying family tree.
    */
    public String GrandParents(String name){
       String grandp = "";
    String ClientName = choice2.getSelectedItem(); // client we are focused on 
    
    HashMap<String, Person> personList = new HashMap();
        personList = clientsPeopleList.get(ClientName);
        String name2 = name.stripLeading();
        //System.out.println(personList.get(name2).getName());
    
    String parents = clientsPeopleList.get(ClientName).get(name2).getParents();
    
    if("".equals(parents)==false){
        
        for(int i = 0;i<tree.get(ClientName).getParentArray().size(); i++){
          
        if(parents.contains(tree.get(ClientName).getParentArray().get(i))){
         
        String parentFound = tree.get(ClientName).getParentArray().get(i);
        String parentsOfParents = clientsPeopleList.get(ClientName).get(parentFound).getParents();
        
        //String parent2 = parentFound.stripLeading();
        for(int k = 0; k<tree.get(ClientName).getGrandparentArray().size();k++){
        if(parentsOfParents.contains(tree.get(ClientName).getGrandparentArray().get(k))){
        
        
        grandp+=parentsOfParents;
        return grandp;    
        }    
        }
          
        
        } 
    }
    } 
        return grandp;
    }
    /** 
    This is my method of obtaining the grand children of the name of the 
    person that was clicked by the user from the displaying family tree.
    */
    public String GrandChildren(String name){
        String childrenOfChildren = "";
    String ClientName = choice2.getSelectedItem(); // client we are focused on 
    
    HashMap<String, Person> personList = new HashMap();
        personList = clientsPeopleList.get(ClientName);
        String name2 = name.stripLeading();
        //System.out.println(personList.get(name2).getName());
    
    String children  = clientsPeopleList.get(ClientName).get(name2).getChildren();
    for(int i = 0; i< tree.get(ClientName).getParentArray().size(); i++){ // for all in parents list 
    if(children.contains(tree.get(ClientName).getParentArray().get(i))){ // if a persons name matches and of the children 
    //should be 3 for cynthia 
    String firstChild = tree.get(ClientName).getParentArray().get(i);
    childrenOfChildren  += clientsPeopleList.get(ClientName).get(firstChild).getChildren();
    return childrenOfChildren;
    }    
    }
        return childrenOfChildren;
    }
    /** 
    This is my method of obtaining the Neices/Nephews of the name of the 
    person that was clicked by the user from the displaying family tree.
    */
    public String NeiceNephew(String name){
        String Neiceneph = "";
    String ClientName = choice2.getSelectedItem(); // client we are focused on 
    
    HashMap<String, Person> personList = new HashMap();
        personList = clientsPeopleList.get(ClientName);
        String name2 = name.stripLeading();
        //System.out.println(personList.get(name2).getName());
    
    String parent  = clientsPeopleList.get(ClientName).get(name2).getParents();
    for(int i =0; i <tree.get(ClientName).getGrandparentArray().size();i++){
    if(parent.contains(tree.get(ClientName).getGrandparentArray().get(i))){ // if one of the grandparents is the parent of Name we clicked and it isnt = to name we clicked
    // get their children      && !tree.get(ClientName).getParentArray().get(i).equals(name2)
    String GPName = tree.get(ClientName).getGrandparentArray().get(i);
    
    String GPChildren= clientsPeopleList.get(ClientName).get(GPName).getChildren();
    
    if(GPChildren.contains(tree.get(ClientName).getParentArray().get(i)) && !tree.get(ClientName).getParentArray().get(i).equals(name2)){ // if Grandparents child is located in the parent list 
    Neiceneph+= clientsPeopleList.get(ClientName).get(tree.get(ClientName).getParentArray().get(i)).getChildren();   
    }
    
    }   
    }
        return Neiceneph;
    }
    /** 
    This is my method of obtaining all of the info the user could need of the
    name of the person that was clicked by the user from the displaying family tree.
    */
    public void getAllInfoNeeded(String name, int numLoc){
        Object[] optionButtons = {"Remove "+name, "Exit"};
       
        
        
        
     String accumulated="";
     String ClientName = choice2.getSelectedItem();
     accumulated+= "Name: "+name+"\n"; // puts name at top 
     String name2 = name.stripLeading();
     accumulated+= "D.O.B: "+clientsPeopleList.get(ClientName).get(name2).getDob()+"\n";
     accumulated+= "Married To: "+clientsPeopleList.get(ClientName).get(name2).getMarriedTo()+"\n";
     
     
     accumulated+= "Children: "+clientsPeopleList.get(ClientName).get(name2).getChildren()+"\n";
     accumulated+= "Parents: "+clientsPeopleList.get(ClientName).get(name2).getParents()+"\n";
     accumulated+= "Grandparents: "+ GrandParents(name2) +"\n";
     accumulated+= "Grandchildren: "+ GrandChildren(name2) +"\n";
     accumulated+= "Neices/Nephews: "+ NeiceNephew(name2) +"\n";
     accumulated+= "Aunts/Uncles: "+ AuntUncle(name2) +"\n";
     
     
     
    //JOptionPane.showMessageDialog(null, accumulated);
    
    int l = JOptionPane.showInternalOptionDialog(null, accumulated, "Info", 0, 0, null, optionButtons, optionButtons[1]);
    //System.out.println(l + " IS THE VALUE  WE CHOSE "); // 0 is left 
    if(l==0 && 1==numLoc){ // remove name 
        
    
    tree.get(ClientName).getGrandparentArray().remove(name2); 
    
        
    }
    if(l==0 && 2==numLoc){ // remove name 
     tree.get(ClientName).getParentArray().remove(name);
        
    }
    if(l==0 && 3==numLoc){ // remove name 
     tree.get(ClientName).getChildArray().remove(name);
        
    }

    }
    

}
