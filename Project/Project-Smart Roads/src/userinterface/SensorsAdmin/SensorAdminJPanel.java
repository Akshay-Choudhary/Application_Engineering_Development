/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SensorsAdmin;

import business.Enterprise.Enterprise;
import business.Organisation.Organisation;
import business.Sensor.CollisionSensor;
import business.Sensor.CracksSensor;
import business.Sensor.Sensor;
import business.Sensor.TrafficSensor;
import business.Sensor.WeatherSensor;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author aksha
 */
public class SensorAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organisation organisation;
    private static final String COMMA_DELIMITER = ",";

    /**
     * Creates new form SensorAdminJPanel
     */
    public SensorAdminJPanel(JPanel userProcessContainer, UserAccount userAccount, Organisation organisation, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.organisation = organisation;
        
        populateWeatherSensor();
        populateTrafficSensor();
        populateCracksSensor();
        populateCollisionSensor();

    }
    

    public void populateCollisionTable(CollisionSensor collision) {
        DefaultTableModel model = (DefaultTableModel) collisionSensorjTable4.getModel();
        model.setRowCount(0);

        Object[] row = new Object[2];
        row[0] = collision;
        row[1] = collision.getCollisionSensorMessage();

        model.addRow(row);
    }

    public void populateCracksTable(CracksSensor cs) {
        DefaultTableModel model = (DefaultTableModel) cracksSensorjTable6.getModel();
        model.setRowCount(0);

        Object[] row = new Object[2];
        row[0] = cs;
        row[1] = cs.getCsmessage();

        model.addRow(row);
    }

    public void populateTrafficTable(TrafficSensor ts) {

        DefaultTableModel model = (DefaultTableModel) TrafficSensorjTable5.getModel();
        model.setRowCount(0);

        Object[] row = new Object[2];
        row[0] = ts;
        row[1] = ts.getTsMessage();

        model.addRow(row);
    }

    public void populateWeatherTable(WeatherSensor ws) {
        DefaultTableModel model = (DefaultTableModel) weatherSensorjTable3.getModel();
        model.setRowCount(0);

        Object[] row = new Object[2];
        row[0] = ws;
        row[1] = ws.getWsMessage();

        model.addRow(row);

    }

    public void populateWeatherSensor() {

        DefaultTableModel model = (DefaultTableModel) weatherSensorjTable3.getModel();
        model.setRowCount(0);
        WeatherSensor ws = null;
     
        for (Sensor s : organisation.getSensorDir().getSensorList()) {
            if (s instanceof WeatherSensor) {
                   ws = (WeatherSensor)s;
                   
                
                
                ws = (WeatherSensor) s;
                ws.setWsName("Sensor1");

            }
        }
        Object[] row = new Object[3];
        row[0] = ws;
        System.out.println(ws.getWsHealth());
        String str = wshealth(ws);

        row[1] = str;
        

        model.addRow(row);

    }

    public void populateCollisionSensor() {

        DefaultTableModel model = (DefaultTableModel) collisionSensorjTable4.getModel();
        model.setRowCount(0);
        CollisionSensor collisionS = null;
        for (Sensor s : organisation.getSensorDir().getSensorList()) {
            if (s instanceof CollisionSensor) {
                collisionS = (CollisionSensor) s;
                collisionS.setCollisionSensorName("Sensor1");
            }
        }
        Object[] row = new Object[2];
        row[0] = collisionS;
        String str = collisionShealth(collisionS);
        row[1] = str;

        model.addRow(row);

    }

    public void populateTrafficSensor() {
        
        DefaultTableModel model = (DefaultTableModel) TrafficSensorjTable5.getModel();
        model.setRowCount(0);
        TrafficSensor ts = null;
        for (Sensor s : organisation.getSensorDir().getSensorList()) {
            if (s instanceof TrafficSensor) {
                ts = (TrafficSensor) s;
                ts.setTsName("Sensor1");
            }
        }
        Object[] row = new Object[2];
        row[0] = ts;
        row[1] = tshealth(ts);
        
        

        model.addRow(row);
    }

    public void populateCracksSensor() {

        DefaultTableModel model = (DefaultTableModel) cracksSensorjTable6.getModel();
        model.setRowCount(0);

        CracksSensor cs = null;
        for (Sensor s : organisation.getSensorDir().getSensorList()) {
            if (s instanceof CracksSensor) {
                cs = (CracksSensor) s;
                cs.setCrackSensorName("Sensor1");
            }
        }
        Object[] row = new Object[2];
        row[0] = cs;
        row[1] = cshealth(cs);

        model.addRow(row);

    }

    public String wshealth(WeatherSensor ws) {

        if (ws.getWsHealth() > 45) {

            ws.setWsMessage("ACTIVE");

        } else {
            ws.setWsMessage("INACTIVE");
        }

        return ws.getWsMessage();
    }

    public String collisionShealth(CollisionSensor collisionS) {

        if (collisionS.getCollisionSensorHealth() < 9) {
            collisionS.setCollisionSensorMessage("ACTIVE");

        } else {
            collisionS.setCollisionSensorMessage("INACTIVE");
        }

        return collisionS.getCollisionSensorMessage();
    }

    public String tshealth(TrafficSensor ts) {

        if (ts.getTshealth() > 20) {
            ts.setTsMessage("ACTIVE");

        } else {
            ts.setTsMessage("INACTIVE");
        }

        return ts.getTsMessage();
    }

    public String cshealth(CracksSensor cs) {

        if (cs.getCsHealth() > 20) {
            cs.setCsmessage("ACTIVE");

        } else {
            cs.setCsmessage("INACTIVE");
        }

        return cs.getCsmessage();
    }

   /*class CustomRenderer extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            JButton btn = new JButton();
            btn.setBackground(Color.red);
            return c;
        }
    }*/

    /*populateSensor1Table();
     populateSensor2Table();
     populateSensor3Table();*/
    /*String filename = "weather.csv";
     File file = new File(filename);
     try {
     Scanner inputStream = new Scanner(file);
     DefaultTableModel model = (DefaultTableModel)LiquidAndIceSensorjTable3.getModel();
     model.setRowCount(0);
     while(inputStream.hasNext()){
     String data = inputStream.next();
     String[] tokens = data.split(COMMA_DELIMITER);
                  
     Object[] row = new Object[3];
                  
     row[0] = tokens[0];
     row[1] = health(row,tokens);
                  
     model.addRow(row);
                  
     }
            
            
     /*BufferedReader text;
     text = new BufferedReader(new FileReader("weather.csv"));
     String s = text.readLine();
     while ((s = text.readLine()) != null)
     {
     String[] tokens = s.split(COMMA_DELIMITER);
     if (tokens.length > 0) {
     DefaultTableModel model = (DefaultTableModel)LiquidAndIceSensorjTable3.getModel();
     model.setRowCount(0);
     for(Sensor sense :enterprise.getSensorDir().getSensorList())
     {
     Object[] row = new Object[2];
     if(sense instanceof LiquidAndIcyRoadSensor)
     {
     LiquidAndIcyRoadSensor sensor = (LiquidAndIcyRoadSensor)sense;
            
     row[0]=sensor.setName(s);
     row[1]=
     model.addRow(row);
            
     }
     }
     }
            
     }*/
    /* } catch (FileNotFoundException ex) {
     Logger.getLogger(SensorAdminJPanel.class.getName()).log(Level.SEVERE, null, ex);
     }
     }
     public Object health(Object[] row,String[] tokens)
     {
     if((Integer.parseInt(tokens[1]))<30)
     row[2] = "Danger!!!";
     else{
          
     }
     return tokens[1];
      
      
     }*/
    /*public void populateSensor1Table()
     {
     DefaultTableModel model = (DefaultTableModel)LiquidAndIceSensorjTable3.getModel();
     model.setRowCount(0);
     for(Sensor s :enterprise.getSensorDir().getSensorList())
     {
     Object[] row = new Object[2];
     if(s instanceof LiquidAndIcyRoadSensor)
     {
     LiquidAndIcyRoadSensor sensor = (LiquidAndIcyRoadSensor)s;
     sensor.setHealth("active");
     row[0]=LiquidAndIcyRoadSensor.LAISensorType.LiquidSensor1.getValue();
     row[1]=sensor.getHealth();
     model.addRow(row);
                
     }
     }
        
     }
     public void populateSensor2Table()
     {
     DefaultTableModel model = (DefaultTableModel)TrafficSensorjTable5.getModel();
     model.setRowCount(0);
     for(Sensor s :enterprise.getSensorDir().getSensorList())
     {
     Object[] row = new Object[2];
     if(s instanceof TrafficSensor)
     {
     TrafficSensor sensor = (TrafficSensor)s;
     sensor.setHealth("inactive");
     row[0]=TrafficSensor.TrafficSensorType.TrafficSensor1.getValue();
     row[1]=sensor.getHealth();
               
                
                
     }
     } 
     }
     public void populateSensor3Table()
     {
     DefaultTableModel model = (DefaultTableModel)cracksSensorjTable6.getModel();
     model.setRowCount(0);
     for(Sensor s :enterprise.getSensorDir().getSensorList())
     {
     Object[] row = new Object[2];
     if(s instanceof CracksSensor)
     {
     CracksSensor sensor = (CracksSensor)s;
     sensor.setHealth("inactive");
     row[0]=CracksSensor.CracksSensorType.CracksSensor1.getValue();
     row[1]=sensor.getHealth();
                
     model.addRow(row);
                
     }
     } 
     }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        viewActionsjButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        weatherSensorjTable3 = new javax.swing.JTable();
        weatherSensorFixjButton10 = new javax.swing.JButton();
        weatherSensorActionjButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TrafficSensorjTable5 = new javax.swing.JTable();
        trafficSensorFixItjButton5 = new javax.swing.JButton();
        speedSensorActionjButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        cracksSensorjTable6 = new javax.swing.JTable();
        cracksSensorFixItjButton3 = new javax.swing.JButton();
        cracksSensorActionjButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        collisionSensorjTable4 = new javax.swing.JTable();
        collisionSensorFixItjButton11 = new javax.swing.JButton();
        collisionSensorActionjButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        viewActionsjButton7.setText("View Actions");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Sensor Admin Work Area");

        weatherSensorjTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sensors", "Health"
            }
        ));
        jScrollPane3.setViewportView(weatherSensorjTable3);

        weatherSensorFixjButton10.setText("Fix It");
        weatherSensorFixjButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weatherSensorFixjButton10ActionPerformed(evt);
            }
        });

        weatherSensorActionjButton7.setText("Action");
        weatherSensorActionjButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weatherSensorActionjButton7ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Weather Sensor Status ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(weatherSensorFixjButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(weatherSensorActionjButton7))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel3)))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weatherSensorFixjButton10)
                    .addComponent(weatherSensorActionjButton7))
                .addGap(102, 102, 102))
        );

        jTabbedPane1.addTab("Weather Sensor", jPanel1);

        TrafficSensorjTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sensors", "Health"
            }
        ));
        jScrollPane5.setViewportView(TrafficSensorjTable5);

        trafficSensorFixItjButton5.setText("Fix It");
        trafficSensorFixItjButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trafficSensorFixItjButton5ActionPerformed(evt);
            }
        });

        speedSensorActionjButton6.setText("Action");
        speedSensorActionjButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedSensorActionjButton6ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Traffic Sensor Status");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(trafficSensorFixItjButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(speedSensorActionjButton6))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trafficSensorFixItjButton5)
                    .addComponent(speedSensorActionjButton6))
                .addGap(137, 137, 137))
        );

        jTabbedPane1.addTab("Speed Sensor", jPanel2);

        cracksSensorjTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sensors", "Health"
            }
        ));
        jScrollPane6.setViewportView(cracksSensorjTable6);

        cracksSensorFixItjButton3.setText("Fix It");
        cracksSensorFixItjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cracksSensorFixItjButton3ActionPerformed(evt);
            }
        });

        cracksSensorActionjButton4.setText("Action");
        cracksSensorActionjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cracksSensorActionjButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Cracks Sensor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cracksSensorFixItjButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cracksSensorActionjButton4))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cracksSensorFixItjButton3)
                    .addComponent(cracksSensorActionjButton4))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cracks Sensor", jPanel3);

        collisionSensorjTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sensors", "Health"
            }
        ));
        jScrollPane4.setViewportView(collisionSensorjTable4);

        collisionSensorFixItjButton11.setText("Fix It");
        collisionSensorFixItjButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collisionSensorFixItjButton11ActionPerformed(evt);
            }
        });

        collisionSensorActionjButton8.setText("Action");
        collisionSensorActionjButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collisionSensorActionjButton8ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Collision Sensor");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(collisionSensorFixItjButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(collisionSensorActionjButton8))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(collisionSensorActionjButton8)
                    .addComponent(collisionSensorFixItjButton11))
                .addGap(163, 163, 163))
        );

        jTabbedPane1.addTab("Collision Sensor", jPanel4);

        jButton1.setText("Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGap(206, 206, 206))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void speedSensorActionjButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedSensorActionjButton6ActionPerformed
        int selectedRow = TrafficSensorjTable5.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, " Please Select traffic Sensor frist");
        } else {
            TrafficSensor trafficSensor = (TrafficSensor) TrafficSensorjTable5.getValueAt(selectedRow, 0);
            if (trafficSensor.getTsMessage() == "INACTIVE") {
                JOptionPane.showMessageDialog(null, "Sensor is not Active");

            } else {
                TrafficSensorParamJPanel tspjp = new TrafficSensorParamJPanel(userProcessContainer, userAccount, organisation, enterprise, trafficSensor);
                userProcessContainer.add("TrafficSensorParam", tspjp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_speedSensorActionjButton6ActionPerformed

    private void weatherSensorActionjButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weatherSensorActionjButton7ActionPerformed
     
        
        
        int selectedRow = weatherSensorjTable3.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, " Please Select Weather Sensor frist");

        } else {
            WeatherSensor wsSensor = (WeatherSensor) weatherSensorjTable3.getValueAt(selectedRow, 0);
            if (wsSensor.getWsMessage() == "INACTIVE") {
                JOptionPane.showMessageDialog(null, "Sensor is not Active");

            } else {
                WeatherSensorParamJPanel wsjp = new WeatherSensorParamJPanel(userProcessContainer, userAccount, organisation, enterprise, wsSensor);
                userProcessContainer.add("WeatherSensorParam", wsjp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_weatherSensorActionjButton7ActionPerformed

    private void weatherSensorFixjButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weatherSensorFixjButton10ActionPerformed
        /*TableColumn col = weatherSensorjTable3.getColumnModel().getColumn(1);
         DefaultTableModel model3 = (DefaultTableModel)weatherSensorjTable3.getModel();
         col.setCellRenderer(new CustomRenderer()); */
        
       
        int selectedRow = weatherSensorjTable3.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, " Please Select Weather Sensor frist");
        } else {
            WeatherSensor sensor1 = (WeatherSensor) weatherSensorjTable3.getValueAt(selectedRow, 0);
            if (sensor1.getWsMessage() == "INACTIVE") {
                sensor1.setWsMessage("ACTIVE");
                populateWeatherTable(sensor1);

            } else {
                JOptionPane.showMessageDialog(null, "Sensor 1 is already active", "PROCEED", JOptionPane.WARNING_MESSAGE);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_weatherSensorFixjButton10ActionPerformed

    private void collisionSensorFixItjButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collisionSensorFixItjButton11ActionPerformed
        int selectedRow = collisionSensorjTable4.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, " Please Select Collision Sensor frist");
        } else {

            CollisionSensor collision = (CollisionSensor) collisionSensorjTable4.getValueAt(selectedRow, 0);
            if (collision.getCollisionSensorMessage() == "INACTIVE") {
                collision.setCollisionSensorMessage("ACTIVE");
                populateCollisionTable(collision);

            } else {
                JOptionPane.showMessageDialog(null, "Sensor 1 is already active", "PROCEED", JOptionPane.WARNING_MESSAGE);
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_collisionSensorFixItjButton11ActionPerformed

    private void collisionSensorActionjButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collisionSensorActionjButton8ActionPerformed
        int selectedRow = collisionSensorjTable4.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, " Please Select traffic Sensor frist");
        } else {
            CollisionSensor collisionSensor = (CollisionSensor) collisionSensorjTable4.getValueAt(selectedRow, 0);
            if (collisionSensor.getCollisionSensorMessage() == "INACTIVE") {
                JOptionPane.showMessageDialog(null, "Sensor is not Active");

            } else {
                CollisionSensorParamJPanel cspjp = new CollisionSensorParamJPanel(userProcessContainer, userAccount, organisation, enterprise, collisionSensor);

                userProcessContainer.add("WeatherSensorParam", cspjp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_collisionSensorActionjButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SensorAdminWorkRequestJPanel sawjp = new SensorAdminWorkRequestJPanel(userProcessContainer, userAccount, organisation, enterprise);
        userProcessContainer.add("SensorDetails", sawjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cracksSensorActionjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cracksSensorActionjButton4ActionPerformed
        int selectedRow = cracksSensorjTable6.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, " Please Select Cracks Sensor frist");
        } else {

            CracksSensor cs = (CracksSensor) cracksSensorjTable6.getValueAt(selectedRow, 0);
            if (cs.getCsmessage() == "INACTIVE") {
                JOptionPane.showMessageDialog(null, "Sensor is not Active");

            } else {
                CrackSensorParamJPanel cspjp = new CrackSensorParamJPanel(userProcessContainer, userAccount, organisation, enterprise, cs);
                userProcessContainer.add("SensorDetails", cspjp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_cracksSensorActionjButton4ActionPerformed

    private void trafficSensorFixItjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trafficSensorFixItjButton5ActionPerformed
        int selectedRow = TrafficSensorjTable5.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, " Please Select Speed Sensor frist");
        } else {
            TrafficSensor traffic = (TrafficSensor) TrafficSensorjTable5.getValueAt(selectedRow, 0);
            if (traffic.getTsMessage() == "INACTIVE") {
                traffic.setTsMessage("ACTIVE");
                populateTrafficTable(traffic);

            } else {
                JOptionPane.showMessageDialog(null, "Sensor 1 is already active", "PROCEED", JOptionPane.WARNING_MESSAGE);
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_trafficSensorFixItjButton5ActionPerformed

    private void cracksSensorFixItjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cracksSensorFixItjButton3ActionPerformed
        int selectedRow = cracksSensorjTable6.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, " Please Select Cracks Sensor frist");
        } else {
            CracksSensor cracks = (CracksSensor) cracksSensorjTable6.getValueAt(selectedRow, 0);
            if (cracks.getCsmessage() == "INACTIVE") {
                cracks.setCsmessage("ACTIVE");
                populateCracksTable(cracks);

            } else {
                JOptionPane.showMessageDialog(null, "Sensor 1 is already active", "PROCEED", JOptionPane.WARNING_MESSAGE);
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_cracksSensorFixItjButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TrafficSensorjTable5;
    private javax.swing.JButton collisionSensorActionjButton8;
    private javax.swing.JButton collisionSensorFixItjButton11;
    private javax.swing.JTable collisionSensorjTable4;
    private javax.swing.JButton cracksSensorActionjButton4;
    private javax.swing.JButton cracksSensorFixItjButton3;
    private javax.swing.JTable cracksSensorjTable6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton speedSensorActionjButton6;
    private javax.swing.JButton trafficSensorFixItjButton5;
    private javax.swing.JButton viewActionsjButton7;
    private javax.swing.JButton weatherSensorActionjButton7;
    private javax.swing.JButton weatherSensorFixjButton10;
    private javax.swing.JTable weatherSensorjTable3;
    // End of variables declaration//GEN-END:variables
}
