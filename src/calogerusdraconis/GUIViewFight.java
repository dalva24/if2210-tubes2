/*
 * Copyright (C) 2014 Calogerus Draconis Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package calogerusdraconis;


/**
 *
 * @author Dariel Valdano
 */
public class GUIViewFight extends javax.swing.JFrame {
	
	private boolean selection = false;
	private final Object SelectionNotifier = new Object();
	
	private final UserDragon draco;
	private final Dragon enemy;

	/**
	 * Creates new form GuiVIew
	 * @param _draco
	 * @param _enemy
	 */
	public GUIViewFight(UserDragon _draco, Dragon _enemy) {
		draco = _draco;
		enemy = _enemy;
		initComponents();
		
		enemyDragon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calogerusdraconis/res/enemy" + util.randomInt(1,9) + ".png")));
		enemyDragon.setText(enemy.name);
		userDragon.setIcon(draco.getImage());
        userDragon.setText(draco.name);
		
		UserHealth.setText(Float.toString(draco.health));
		UserStamina.setText(Float.toString(draco.stamina));
		UserLevel.setText(Float.toString(draco.level));
		UserHunger.setText(Float.toString(draco.hunger));
		UserThirst.setText(Float.toString(draco.thirst));
		UserBladder.setText(Float.toString(draco.bladder));
		
		EnemyHealth.setText(Float.toString(enemy.health));
		EnemyStamina.setText(Float.toString(enemy.stamina));
		EnemyLevel.setText(Float.toString(enemy.level));
		EnemyHunger.setText(Float.toString(enemy.hunger));
		EnemyThirst.setText(Float.toString(enemy.thirst));
		EnemyBladder.setText(Float.toString(enemy.bladder));
		
		SlideHealth.setValue(calcSlideVal(enemy.health,draco.health));
		SlideStamina.setValue(calcSlideVal(enemy.stamina,draco.stamina));
		SlideLevel.setValue(calcSlideVal(enemy.level,draco.level));
		SlideHunger.setValue(calcSlideVal(enemy.hunger,draco.hunger));
		SlideThirst.setValue(calcSlideVal(enemy.thirst,draco.thirst));
		SlideBladder.setValue(calcSlideVal(enemy.bladder,draco.bladder));
		
		SlideHealth.setEnabled(false);
		SlideStamina.setEnabled(false);
		SlideLevel.setEnabled(false);
		SlideHunger.setEnabled(false);
		SlideThirst.setEnabled(false);
		SlideBladder.setEnabled(false);
		
	}
	
	private static int calcSlideVal(float a, float b) {
		float x = a+1;
		float y = b+1;
		return (int) ((x-y)/((x+y)/2)*49)+50;
	}
	
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enemyDragon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userDragon = new javax.swing.JLabel();
        ButtFight = new javax.swing.JButton();
        ButtEscape = new javax.swing.JButton();
        SlideHealth = new javax.swing.JSlider();
        UserHealth = new javax.swing.JLabel();
        EnemyHealth = new javax.swing.JLabel();
        UserStamina = new javax.swing.JLabel();
        SlideStamina = new javax.swing.JSlider();
        EnemyStamina = new javax.swing.JLabel();
        UserLevel = new javax.swing.JLabel();
        SlideLevel = new javax.swing.JSlider();
        EnemyLevel = new javax.swing.JLabel();
        SlideHunger = new javax.swing.JSlider();
        UserHunger = new javax.swing.JLabel();
        EnemyHunger = new javax.swing.JLabel();
        UserThirst = new javax.swing.JLabel();
        SlideThirst = new javax.swing.JSlider();
        EnemyThirst = new javax.swing.JLabel();
        UserBladder = new javax.swing.JLabel();
        SlideBladder = new javax.swing.JSlider();
        EnemyBladder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fight Another Dragon");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        enemyDragon.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        enemyDragon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enemyDragon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calogerusdraconis/res/enemy6.png"))); // NOI18N
        enemyDragon.setText("Zaraphys");
        enemyDragon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        enemyDragon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 50)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VS");

        userDragon.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        userDragon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDragon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calogerusdraconis/res/bladder- r.png"))); // NOI18N
        userDragon.setText("Xanareth Viserus");
        userDragon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userDragon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ButtFight.setText("FIGHT");
        ButtFight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtFightMouseClicked(evt);
            }
        });

        ButtEscape.setText("escape");
        ButtEscape.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtEscapeMouseClicked(evt);
            }
        });

        SlideHealth.setToolTipText("Health");
        SlideHealth.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        UserHealth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserHealth.setText("50");

        EnemyHealth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnemyHealth.setText("50");

        UserStamina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserStamina.setText("50");

        SlideStamina.setToolTipText("Stamina");
        SlideStamina.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        EnemyStamina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnemyStamina.setText("50");

        UserLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserLevel.setText("50");

        SlideLevel.setToolTipText("Level");
        SlideLevel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        EnemyLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnemyLevel.setText("50");

        SlideHunger.setToolTipText("HUnger");
        SlideHunger.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        UserHunger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserHunger.setText("50");

        EnemyHunger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnemyHunger.setText("50");

        UserThirst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserThirst.setText("50");

        SlideThirst.setToolTipText("Thirst");
        SlideThirst.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        EnemyThirst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnemyThirst.setText("50");

        UserBladder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserBladder.setText("50");

        SlideBladder.setToolTipText("Bladder");
        SlideBladder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        EnemyBladder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnemyBladder.setText("50");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userDragon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtFight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtEscape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(enemyDragon))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(UserThirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UserLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UserStamina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UserHealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UserHunger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(SlideHunger, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(EnemyHunger, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(SlideHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(EnemyHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(SlideStamina, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(EnemyStamina, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(SlideLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(EnemyLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SlideThirst, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EnemyThirst, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(UserBladder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SlideBladder, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EnemyBladder, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userDragon)
                            .addComponent(enemyDragon)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtFight, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtEscape)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UserHealth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SlideHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(EnemyHealth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UserStamina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SlideStamina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EnemyStamina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UserLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SlideLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EnemyLevel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UserHunger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SlideHunger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EnemyHunger, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UserThirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SlideThirst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EnemyThirst, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UserBladder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SlideBladder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EnemyBladder, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SlideHealth.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtFightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtFightMouseClicked
        synchronized(SelectionNotifier) {
			selection = true;
			SelectionNotifier.notifyAll();
		}
    }//GEN-LAST:event_ButtFightMouseClicked

    private void ButtEscapeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtEscapeMouseClicked
        synchronized(SelectionNotifier) {
			selection = false;
			SelectionNotifier.notifyAll();
		}
    }//GEN-LAST:event_ButtEscapeMouseClicked

	/**
	 * Main GUI
	 */
	public void runGui() {
		Runnable thread = new Runnable() {
			@Override
			public void run() {
				setVisible(true);
			}
		};
		java.awt.EventQueue.invokeLater(thread);
	}

	
	public boolean waitForSelection(){
		try {
			synchronized(SelectionNotifier) {
				SelectionNotifier.wait();
				
			}
		} catch (InterruptedException ex) {
			System.out.println("interrupted");
		}
		dispose();
		return selection;
	}
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtEscape;
    private javax.swing.JButton ButtFight;
    private javax.swing.JLabel EnemyBladder;
    private javax.swing.JLabel EnemyHealth;
    private javax.swing.JLabel EnemyHunger;
    private javax.swing.JLabel EnemyLevel;
    private javax.swing.JLabel EnemyStamina;
    private javax.swing.JLabel EnemyThirst;
    private javax.swing.JSlider SlideBladder;
    private javax.swing.JSlider SlideHealth;
    private javax.swing.JSlider SlideHunger;
    private javax.swing.JSlider SlideLevel;
    private javax.swing.JSlider SlideStamina;
    private javax.swing.JSlider SlideThirst;
    private javax.swing.JLabel UserBladder;
    private javax.swing.JLabel UserHealth;
    private javax.swing.JLabel UserHunger;
    private javax.swing.JLabel UserLevel;
    private javax.swing.JLabel UserStamina;
    private javax.swing.JLabel UserThirst;
    private javax.swing.JLabel enemyDragon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel userDragon;
    // End of variables declaration//GEN-END:variables


}