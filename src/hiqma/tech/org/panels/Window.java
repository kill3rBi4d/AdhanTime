//BISMILLAHI-RRAHMANI-RRAHIM
package hiqma.tech.org.panels;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Timer;

public class Window {
    public Home home = new Home();
    JFrame infoWindow;
    JPanel infoTop, infoContents;
    JLabel iTopBar, iTitle, iClose, iRibbon;
    JFrame window, editWindow;
    JPanel topHeader, contents, title, settingsBtn, exitBtn, leftDisplay, rightTimeDisplay;
    JPanel card1, card2, card3, card4, card5, card6, card7;
    JPanel editTop, editContents;
    JLabel edit1, edit2, edit3, edit4, edit5, edit6, edit7;
    JPanel setTop, setContents;
    JLabel namaz1, namaz2, namaz3, namaz4, namaz5, namaz6, namaz7;
    JLabel time1, time2, time3, time4, time5, time6, time7;
    JLabel mainWatch, dateGre, nextTime, minuteRemaining;
    ImageIcon logo;
    JLabel titlePic, settingsPic, exitPic, backgroundPic, ribon, cp, clocon, stopAudio, resumeAudio, indicateBG, topHBar;
    JLabel eTopBar, eTopTitle, eTopNamaz, eTopClose, eWarn, hourText, minutesText, saveBtn, editRibbon;
    JFormattedTextField hourInput, minutesInput;
    JRadioButton am, pm;
    Date watch, date;
    SimpleDateFormat formatTime, formatDate;

    private int mouseX, mouseY, mouseX2, mouseY2, $MOUSE_X, $MOUSE_Y;
    private int scrollY;
    public boolean __IS_SAVED = false;
    public  String $_DATA_SAVED = "true";

    //ADHAN
    String[] adhans = new String[]{
            "resources/media/fajr.wav", "resources/media/adhan_minshary.wav"
    };

    public Window() throws IOException, ClassNotFoundException, UnsupportedAudioFileException, LineUnavailableException, UnsupportedOperationException, AWTException {
        Timer timer = new Timer();
        FileInputStream $DATA_1 = new FileInputStream("data/DATA_1.text");
        ObjectInputStream $GET_DATA_1 = new ObjectInputStream($DATA_1);
        String data_1 = $GET_DATA_1.readObject().toString();
        FileInputStream $DATA_2 = new FileInputStream("data/DATA_2.text");
        ObjectInputStream $GET_DATA_2 = new ObjectInputStream($DATA_2);
        String data_2 = $GET_DATA_2.readObject().toString();
        FileInputStream $DATA_3 = new FileInputStream("data/DATA_3.text");
        ObjectInputStream $GET_DATA_3 = new ObjectInputStream($DATA_3);
        String data_3 = $GET_DATA_3.readObject().toString();
        FileInputStream $DATA_4 = new FileInputStream("data/DATA_4.text");
        ObjectInputStream $GET_DATA_4 = new ObjectInputStream($DATA_4);
        String data_4 = $GET_DATA_4.readObject().toString();
        FileInputStream $DATA_5 = new FileInputStream("data/DATA_5.text");
        ObjectInputStream $GET_DATA_5 = new ObjectInputStream($DATA_5);
        String data_5 = $GET_DATA_5.readObject().toString();
        FileInputStream $DATA_6 = new FileInputStream("data/DATA_6.text");
        ObjectInputStream $GET_DATA_6 = new ObjectInputStream($DATA_6);
        String data_6 = $GET_DATA_6.readObject().toString();
        FileInputStream $DATA_7 = new FileInputStream("data/DATA_7.text");
        ObjectInputStream $GET_DATA_7 = new ObjectInputStream($DATA_7);
        String data_7 = $GET_DATA_7.readObject().toString();

        String[] namazTime = new String[]{data_1, data_2, data_3, data_4, data_5, data_6, data_7};

        String[] bgImages = {
                "resources/images/bg/mosq1.png", "resources/images/bg/mosq2.png",
                "resources/images/bg/mosq3.png","resources/images/bg/mosq4.png",
                "resources/images/bg/mosq5.png", "resources/images/bg/mosq6.png",
                "resources/images/bg/mosq7.png",
        };
        String[] namaz = {
              "Imsak", "Fajr", "Sunrise", "Dhuhr", "Asr", "Maghrib", "Ishaa"
        };
        window = new JFrame();
        editWindow = new JFrame();
        topHeader = new JPanel();
        contents = new JPanel();
        title = new JPanel();
        settingsBtn = new JPanel();
        exitBtn = new JPanel();
        leftDisplay = new JPanel();
        rightTimeDisplay = new JPanel();
        editTop = new JPanel();
        editContents = new JPanel();
        setTop = new JPanel();
        setContents = new JPanel();
        hourInput = new JFormattedTextField();
        minutesInput = new JFormattedTextField();

        ///INFO

        infoWindow = new JFrame();
        infoTop = new JPanel();
        infoContents = new JPanel();

        JLabel infoLogo = new JLabel(new ImageIcon("resources/images/infoLogo.png"));
        JLabel version = new JLabel("0.001.10");
        JPanel selectTray = new JPanel();
        JLabel trayBG = new JLabel(new ImageIcon("resources/images/bacTray.png"));
        JLabel aboutText = new JLabel("About");JLabel creditText = new JLabel("Credits");JLabel licenseText = new JLabel("License");
        JPanel aboutPanel = new JPanel();JPanel creditPanel = new JPanel();JPanel licencePanel = new JPanel();
        JLabel creditInfo = new JLabel("Created by ");JLabel artWorkAndCoding = new JLabel("Art Work and Programming");
        JLabel nameBold = new JLabel("Hikma Tech Groups (HTG)");JLabel nameBold2 = new JLabel("Yasin Ali (Vandry)");
        JLabel facebook = new JLabel(new ImageIcon("resources/images/facebook.png"));JLabel instagram = new JLabel(new ImageIcon("resources/images/instagram.png"));JLabel twitter = new JLabel(new ImageIcon("resources/images/linkedin.png"));JLabel github = new JLabel(new ImageIcon("resources/images/github.png"));
        JTextArea licenseInfo = new JTextArea(16, 45);
        JLabel aboutInfo = new JLabel(new ImageIcon("resources/images/aboutCP.png"));

        iTopBar = new JLabel(new ImageIcon("resources/images/topBar.png"));iTitle = new JLabel("Info");
        iClose = new JLabel(new ImageIcon("resources/images/close.png"));iRibbon = new JLabel();


        infoLogo.setBounds(160, 30, 105, 138);
        version.setBounds(infoLogo.getX()+30, infoLogo.getY()+infoLogo.getHeight()+5, 60, 20);
        version.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
        version.setForeground(new Color(0x5A5A5A));
        trayBG.setBounds(0, 0, 262, 28);
        trayBG.setVerticalAlignment(JLabel.CENTER);
        aboutText.setBounds(0, 0, 88, 28);
        aboutText.setHorizontalAlignment(JLabel.CENTER);
        aboutText.setForeground(new Color(0xFEFEFE));
        aboutText.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        aboutText.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        aboutText.setBackground(new Color(0x006C81));
        aboutText.setBorder(BorderFactory.createLineBorder(new Color(0, 108, 129, 90), 1));
        aboutText.setOpaque(true);
        aboutText.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                aboutText.setVisible(false);
                creditText.setVisible(false);
                licenseText.setVisible(false);

                try {
                    creditText.setVisible(true);
                    aboutText.setVisible(true);
                    licenseText.setVisible(true);
                    creditText.setOpaque(true);

                    aboutText.setBackground(new Color(0x006C81));
                    aboutText.setOpaque(true);
                    creditText.setBackground(new Color(0, 0, 0, 0));
                    creditText.setOpaque(false);
                    licenseText.setBackground(new Color(0, 0, 0, 0));
                    licenseText.setOpaque(false);

                    aboutPanel.setVisible(true);
                    creditPanel.setVisible(false);
                    licencePanel.setVisible(false);
                }catch (Exception op){
                    op.printStackTrace();
                }
            }
        });
        creditText.setBounds(87, 0, 88, 28);
        creditText.setHorizontalAlignment(JLabel.CENTER);
        creditText.setForeground(new Color(0xFEFEFE));
        creditText.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        creditText.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        creditText.setBorder(BorderFactory.createLineBorder(new Color(0, 108, 129, 90), 1));
        creditText.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                creditText.setVisible(false);
                aboutText.setVisible(false);
                licenseText.setVisible(false);
                try {
                    creditText.setVisible(true);
                    aboutText.setVisible(true);
                    licenseText.setVisible(true);

                    creditText.setBackground(new Color(0x006C81));
                    creditText.setOpaque(true);
                    aboutText.setBackground(new Color(0, 0, 0, 0));
                    aboutText.setOpaque(false);
                    licenseText.setBackground(new Color(0, 0, 0, 0));
                    licenseText.setOpaque(false);

                    creditPanel.setVisible(true);
                    aboutPanel.setVisible(false);
                    licencePanel.setVisible(false);
                }catch (Exception op){
                    op.printStackTrace();
                }
            }
        });
        licenseText.setBounds(174, 0, 88, 28);
        licenseText.setHorizontalAlignment(JLabel.CENTER);
        licenseText.setForeground(new Color(0xFEFEFE));
        licenseText.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        licenseText.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        licenseText.setBorder(BorderFactory.createLineBorder(new Color(0, 108, 129, 90), 1));
        licenseText.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                creditText.setVisible(false);
                aboutText.setVisible(false);
                licenseText.setVisible(false);
                try {
                    creditText.setVisible(true);
                    aboutText.setVisible(true);
                    licenseText.setVisible(true);

                    licenseText.setBackground(new Color(0x006C81));
                    licenseText.setOpaque(true);
                    creditText.setBackground(new Color(0, 0, 0, 0));
                    creditText.setOpaque(false);
                    aboutText.setBackground(new Color(0, 0, 0, 0));
                    aboutText.setOpaque(false);

                    licencePanel.setVisible(true);
                    aboutPanel.setVisible(false);
                    creditPanel.setVisible(false);
                }catch (Exception op){
                    op.printStackTrace();
                }
            }
        });
        selectTray.setBounds(80, 200, 262, 28);
        selectTray.setLayout(null);
        selectTray.add(aboutText);
        selectTray.add(creditText);
        selectTray.add(licenseText);
        selectTray.add(trayBG);

        aboutInfo.setBounds(0, 0, 380, 150);

        creditInfo.setBounds(0, 5, 380, 20);
        creditInfo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
        creditInfo.setHorizontalAlignment(JLabel.CENTER);
        creditInfo.setForeground(new Color(0x5A5A5A));
        nameBold.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 13));
        nameBold.setBounds(0, 25, 380, 20);
        nameBold.setHorizontalAlignment(JLabel.CENTER);
        artWorkAndCoding.setBounds(0, 50, 380, 20);
        artWorkAndCoding.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
        artWorkAndCoding.setHorizontalAlignment(JLabel.CENTER);
        artWorkAndCoding.setForeground(new Color(0x5A5A5A));
        nameBold2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 13));
        nameBold2.setBounds(0, 70, 380, 20);
        nameBold2.setHorizontalAlignment(JLabel.CENTER);

        facebook.setBounds(130, 110, 24, 24);
        facebook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        facebook.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                facebook.setVisible(false);
                try{
                    facebook.setVisible(true);
                    facebook.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 50), 1, true));
                    facebook.setToolTipText("Facebook");
                }catch (Exception lo){
                    lo.printStackTrace();
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                facebook.setVisible(false);
                try{
                    facebook.setVisible(true);
                    facebook.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 1, true));
                }catch (Exception lo){
                    lo.printStackTrace();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                try{
                    Desktop.getDesktop().browse(new URI("https://www.facebook.com/yasin.vandry.5/"));
                }catch (Exception kl){
                    kl.printStackTrace();
                }
            }
        });
        instagram.setBounds(facebook.getX()+30, facebook.getY(), 24,24);
        instagram.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        instagram.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                instagram.setVisible(false);
                try{
                    instagram.setVisible(true);
                    instagram.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 50), 1, true));
                    instagram.setToolTipText("Instagram");
                }catch (Exception lo){
                    lo.printStackTrace();
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                instagram.setVisible(false);
                try{
                    instagram.setVisible(true);
                    instagram.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 1, true));
                }catch (Exception lo){
                    lo.printStackTrace();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                try{
                    Desktop.getDesktop().browse(new URI("https://www.instagram.com/_yasvan/"));
                }catch (Exception jk){
                    jk.printStackTrace();
                }
            }
        });
        twitter.setBounds(instagram.getX()+30, instagram.getY(), 24, 24);
        twitter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        twitter.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                twitter.setVisible(false);
                try{
                    twitter.setVisible(true);
                    twitter.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 50), 1, true));
                    twitter.setToolTipText("Linkedin");
                }catch (Exception lo){
                    lo.printStackTrace();
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                twitter.setVisible(false);
                try{
                    twitter.setVisible(true);
                    twitter.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 1, true));
                }catch (Exception lo){
                    lo.printStackTrace();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                try{
                    Desktop.getDesktop().browse(new URI("https://au.linkedin.com/in/yasin-vandry"));
                }catch (Exception ll){
                    ll.printStackTrace();
                }
            }
        });
        github.setBounds(twitter.getX()+30, twitter.getY(), 24, 24);
        github.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        github.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                github.setVisible(false);
                try{
                    github.setVisible(true);
                    github.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 50), 1, true));
                    github.setToolTipText("Github");
                }catch (Exception lo){
                    lo.printStackTrace();
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                github.setVisible(false);
                try{
                    github.setVisible(true);
                    github.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 1, true));
                }catch (Exception lo){
                    lo.printStackTrace();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                try {
                    Desktop.getDesktop().browse(new URI("https://github.com/kill3rBi4d/"));
                }catch (Exception oi){
                    oi.printStackTrace();
                }
            }
        });

        licenseInfo.setBounds(0, 0, 370, 380);
        licenseInfo.setText("This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version. " +
                "\n" +
                "\n" +
                "This program is distributed in the hope that it will be useful,\n" +
                "but WITHOUT ANY WARRANTY; without even the implied warranty of\n" +
                "MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  " +
                "See the GNU General Public License for more details.\n" +
                "\n"
                );
        licenseInfo.setEditable(false);
        licenseInfo.setLineWrap(true);
        licenseInfo.setWrapStyleWord(true);
        licenseInfo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));

        aboutPanel.setBounds(24, 238, 380, 150);
        aboutPanel.setBackground(new Color(0xFFFFFF));
        aboutPanel.setLayout(null);
        aboutPanel.add(aboutInfo);
        aboutPanel.setVisible(true);
        creditPanel.setBounds(24, 238, 380, 150);
        creditPanel.setBackground(new Color(0xFFFFFF));
        creditPanel.setLayout(null);
        creditPanel.add(creditInfo);
        creditPanel.add(nameBold);
        creditPanel.add(artWorkAndCoding);
        creditPanel.add(nameBold2);
        creditPanel.add(facebook);
        creditPanel.add(instagram);
        creditPanel.add(twitter);
        creditPanel.add(github);
        creditPanel.setVisible(false);
        licencePanel.setBounds(24, 238, 380, 150);
        licencePanel.setBackground(new Color(0xFFFFFF));
        licencePanel.setLayout(null);
        licencePanel.add(licenseInfo);
        licencePanel.setVisible(false);



        iTopBar.setBounds(0, 0, 424, 37);

        iTitle.setBounds(-40, 0, 150, 37);
        iTitle.setHorizontalAlignment(JLabel.CENTER);
        iTitle.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        iTitle.setForeground(new Color(0xFFFFFF));

        iClose.setBounds(385, 0, 20, 37);
        iClose.setVerticalAlignment(JLabel.CENTER);
        iClose.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                infoWindow.dispose();
            }
        });
        iClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        infoTop.setPreferredSize(new Dimension(10, 37));
        infoTop.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 90), 1));
        infoTop.setBackground(new Color(0x0095B2));
        infoTop.setLayout(null);
        infoTop.add(iTitle);
        infoTop.add(iClose);
        infoTop.add(iTopBar);
        infoTop.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                $MOUSE_X = e.getX();
                $MOUSE_Y = e.getY();
            }
        });
        infoTop.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                infoWindow.setLocation(infoWindow.getX()+e.getX()-$MOUSE_X, infoWindow.getY()+e.getY()-$MOUSE_Y);
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        iRibbon.setBounds(-3, 405, 428, 20);
        iRibbon.setBorder(BorderFactory.createLineBorder(new Color(0x828282), 1));
        iRibbon.setOpaque(true);
        iRibbon.setBackground(new Color(0x0095B2));

        infoContents.setPreferredSize(new Dimension(10, 10));
        infoContents.setBackground(new Color(0xFFFFFF));
        infoContents.setBorder(BorderFactory.createLineBorder(new Color(0x046679), 1, false));
        infoContents.setLayout(null);
        infoContents.add(iRibbon);
        infoContents.add(infoLogo);
        infoContents.add(version);
        infoContents.add(selectTray);
        infoContents.add(aboutPanel);
        infoContents.add(creditPanel);
        infoContents.add(licencePanel);

        infoWindow.setSize(424, 450);
        infoWindow.setLocationRelativeTo(null);
        infoWindow.setUndecorated(true);
        infoWindow.setLayout(new BorderLayout());
        infoWindow.add(infoTop, BorderLayout.NORTH);
        infoWindow.add(infoContents, BorderLayout.CENTER);
        infoWindow.setVisible(false);
        ///INFO

        //BACKGROUND IMAGE MANAGER
        backgroundPic = new JLabel(new ImageIcon(bgImages[(int) Math.floor(Math.random()*bgImages.length)]));
        backgroundPic.setBounds(0, 0, 430, 430);
        backgroundPic.setHorizontalAlignment(JLabel.CENTER);
        backgroundPic.setVerticalAlignment(JLabel.BOTTOM);

        card1 = new JPanel();card2 = new JPanel();card3 = new JPanel();card4 = new JPanel();card5 = new JPanel();card5 = new JPanel();card6 = new JPanel();card7 = new JPanel();
        edit1 = new JLabel(new ImageIcon("resources/images/edit001.png"));edit2 = new JLabel(new ImageIcon("resources/images/edit001.png"));edit3 = new JLabel(new ImageIcon("resources/images/edit001.png"));edit4 = new JLabel(new ImageIcon("resources/images/edit001.png"));edit5 = new JLabel(new ImageIcon("resources/images/edit001.png"));edit6 = new JLabel(new ImageIcon("resources/images/edit001.png"));edit7 = new JLabel(new ImageIcon("resources/images/edit001.png"));
        namaz1 = new JLabel(""+namaz[0]);namaz2 = new JLabel(""+namaz[1]);namaz3 = new JLabel(""+namaz[2]);namaz4 = new JLabel(""+namaz[3]);namaz5 = new JLabel(""+namaz[4]);namaz6 = new JLabel(""+namaz[5]);namaz7 = new JLabel(""+namaz[6]);
        time1 = new JLabel(""+namazTime[0]);time2 = new JLabel(""+namazTime[1]);time3 = new JLabel(""+namazTime[2]);time4 = new JLabel(""+namazTime[3]);time5 = new JLabel(""+namazTime[4]);time6 = new JLabel(""+namazTime[5]);time7 = new JLabel(""+namazTime[6]);
        eTopBar = new JLabel(new ImageIcon("resources/images/topBar.png"));eTopTitle = new JLabel("Set custom time   - ");eTopClose = new JLabel(new ImageIcon("resources/images/close.png"));eWarn = new JLabel("You can't leave any field blank!");editRibbon = new JLabel();
        eTopNamaz = new JLabel(""+namaz[0]);
        am = new JRadioButton("AM");pm = new JRadioButton("PM");

        mainWatch = new JLabel();
        dateGre = new JLabel("Sun 12/10/2021");
        nextTime = new JLabel("");
        minuteRemaining = new JLabel("");
        hourText = new JLabel("Hour");
        minutesText = new JLabel("Minutes");
        saveBtn = new JLabel("Save and Close");

        logo = new ImageIcon("resources/images/logo0.png");
        ribon = new JLabel(new ImageIcon("resources/images/leftRibbon.png"));
        cp = new JLabel(new ImageIcon("resources/images/cp001.png"));
        clocon = new JLabel(new ImageIcon("resources/images/clocon001.png"));
        stopAudio = new JLabel(new ImageIcon("resources/images/mute.png"));
        resumeAudio = new JLabel(new ImageIcon("resources/images/resume.png"));
        indicateBG = new JLabel(new ImageIcon("resources/images/indicateBG.png"));
        topHBar = new JLabel(new ImageIcon("resources/images/topHbar.png"));

        topHBar.setBounds(-10, -20, 820, 70);

        titlePic = new JLabel(new ImageIcon("resources/images/title.png"));
        titlePic.setVerticalAlignment(JLabel.CENTER);
        titlePic.setBounds(0, 0, 150, 50);
        settingsPic = new JLabel(new ImageIcon("resources/images/info.png"));
        settingsPic.setBounds(0, 0, 30, 50);
        settingsPic.setVerticalAlignment(JLabel.CENTER);
        settingsPic.setToolTipText("Info");
        settingsPic.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        settingsPic.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                infoWindow.setVisible(true);
            }
        });
        exitPic = new JLabel(new ImageIcon("resources/images/exit3.png"));
        exitPic.setVerticalAlignment(JLabel.CENTER);
        exitPic.setBounds(0, 0, 70, 50);

        title.setBackground(new Color(0,0, 0, 0));
        title.setBounds(0, 0, 150, 50);
        title.setLayout(null);
        title.add(titlePic);
        settingsBtn.setBounds(680, 0, 30, 50 );
        settingsBtn.setBackground(new Color(0, 0, 0, 0));
        settingsBtn.add(settingsPic);
        settingsBtn.setLayout(null);

        exitBtn.setBounds(720, 0, 70, 50);
        exitBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exitBtn.setLayout(null);
        exitBtn.add(exitPic);
        exitBtn.setToolTipText("Close");
        exitBtn.setBackground(new Color(0, 0, 0,0));

        topHeader.setBackground(new Color(0,0, 0, 0));
        topHeader.setPreferredSize(new Dimension(10, 50));
        topHeader.setLayout(null);
        topHeader.add(title);
        topHeader.add(settingsBtn);
        topHeader.add(exitBtn);
        topHeader.add(topHBar);
        topHeader.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });
        topHeader.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                window.setLocation(window.getX() + e.getX() - mouseX, window.getY() + e.getY() - mouseY);
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        mainWatch.setBounds(5, 70, 360, 70);
        mainWatch.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
        mainWatch.setHorizontalAlignment(JLabel.CENTER);
        mainWatch.setForeground(new Color(0xE1F8FF));
        mainWatch.setOpaque(true);
        mainWatch.setBackground(new Color(0x0095B2));
        dateGre.setBounds(85, mainWatch.getY()+mainWatch.getHeight()+10, 200, 20 );
        dateGre.setHorizontalAlignment(JLabel.CENTER);
        dateGre.setHorizontalAlignment(JLabel.CENTER);
        dateGre.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        dateGre.setForeground(new Color(0xE5E6FF));
        dateGre.setOpaque(true);
        dateGre.setBackground(new Color(0x0095B2));
        nextTime.setBounds(5, dateGre.getY()+mainWatch.getHeight()-25, 360, 27);
        nextTime.setHorizontalAlignment(JLabel.CENTER);
        nextTime.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        nextTime.setForeground(new Color(255, 255, 255, 180));
        nextTime.setOpaque(false);
        nextTime.setBackground(new Color(0x0095B2));
        minuteRemaining.setBounds(0, nextTime.getY()+40, 370, 20);
        minuteRemaining.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        minuteRemaining.setForeground(new Color(0x9EFF00));
        minuteRemaining.setHorizontalAlignment(JLabel.CENTER);
        minuteRemaining.setOpaque(false);
        cp.setBounds(0, minuteRemaining.getY()+ 100, 370, 100);
        cp.setOpaque(false);
        clocon.setBounds(-35, -20, 404, 404);
        clocon.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 40)));
        clocon.setBackground(new Color(0x0095B2));
        clocon.setOpaque(true);
        stopAudio.setBounds(140, 245, 90, 90);
        stopAudio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        stopAudio.setOpaque(false);
        stopAudio.setVisible(false);
        resumeAudio.setBounds(143, 243, 90, 90);
        resumeAudio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        resumeAudio.setVisible(false);
        indicateBG.setBounds(75, nextTime.getY()-10, 214, 55);
        indicateBG.setHorizontalAlignment(JLabel.CENTER);
        indicateBG.setVerticalAlignment(JLabel.CENTER);
        indicateBG.setVisible(false);

        leftDisplay.setPreferredSize(new Dimension(370, 10));
        leftDisplay.setBackground(new Color(255, 255,255, 0));
        leftDisplay.setLayout(null);
        leftDisplay.add(stopAudio);
        leftDisplay.add(resumeAudio);
        leftDisplay.add(mainWatch);
        leftDisplay.add(dateGre);
        leftDisplay.add(nextTime);
        leftDisplay.add(indicateBG);
        leftDisplay.add(minuteRemaining);
        leftDisplay.add(cp);
        leftDisplay.add(clocon);

        ribon.setBounds(0, 0, 5, 40);

        namaz1.setBounds(10, 0, 70, 40);
        namaz1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        namaz1.setForeground(new Color(0xE5E6FF));
        namaz1.setBounds(10, 0, 70, 40);
        namaz1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        namaz1.setForeground(new Color(0xE5E6FF));
        namaz2.setBounds(10, 0, 70, 40);
        namaz2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        namaz2.setForeground(new Color(0xE5E6FF));
        namaz3.setBounds(10, 0, 70, 40);
        namaz3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        namaz3.setForeground(new Color(0xE5E6FF));
        namaz4.setBounds(10, 0, 70, 40);
        namaz4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        namaz4.setForeground(new Color(0xE5E6FF));
        namaz5.setBounds(10, 0, 70, 40);
        namaz5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        namaz5.setForeground(new Color(0xE5E6FF));
        namaz6.setBounds(10, 0, 70, 40);
        namaz6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        namaz6.setForeground(new Color(0xE5E6FF));
        namaz7.setBounds(10, 0, 70, 40);
        namaz7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        namaz7.setForeground(new Color(0xE5E6FF));

        time1.setBounds(280, 0, 100, 40);
        time1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        time1.setForeground(new Color(0xE5E6FF));
        time2.setBounds(280, 0, 100, 40);
        time2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        time2.setForeground(new Color(0xE5E6FF));
        time3.setBounds(280, 0, 100, 40);
        time3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        time3.setForeground(new Color(0xE5E6FF));
        time4.setBounds(280, 0, 100, 40);
        time4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        time4.setForeground(new Color(0xE5E6FF));
        time5.setBounds(280, 0, 100, 40);
        time5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        time5.setForeground(new Color(0xE5E6FF));
        time6.setBounds(280, 0, 100, 40);
        time6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        time6.setForeground(new Color(0xE5E6FF));
        time7.setBounds(280, 0, 100, 40);
        time7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        time7.setForeground(new Color(0xE5E6FF));

        edit1.setBounds(347, 0, 38,40);
        edit1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        edit1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (editWindow.isVisible()) {
                    eTopNamaz.setText(namaz[0]);
                }
                editWindow.setVisible(true);
                eTopNamaz.setText(namaz[0]);
                hourInput.setText("");
                minutesInput.setText("");
            }
        });
        edit2.setBounds(347, 0, 38,40);
        edit2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        edit2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (editWindow.isVisible()) {
                    eTopNamaz.setText(namaz[1]);
                }
                editWindow.setVisible(true);
                eTopNamaz.setText(namaz[1]);
                hourInput.setText("");
                minutesInput.setText("");
            }
        });
        edit3.setBounds(347, 0, 38,40);
        edit3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        edit3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (editWindow.isVisible()) {
                    eTopNamaz.setText(namaz[2]);
                }
                editWindow.setVisible(true);
                eTopNamaz.setText(namaz[2]);
                hourInput.setText("");
                minutesInput.setText("");
            }
        });
        edit4.setBounds(347, 0, 38,40);
        edit4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        edit4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (editWindow.isVisible()) {
                    eTopNamaz.setText(namaz[3]);
                }
                editWindow.setVisible(true);
                eTopNamaz.setText(namaz[3]);
                hourInput.setText("");
                minutesInput.setText("");
            }
        });
        edit5.setBounds(347, 0, 38,40);
        edit5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        edit5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (editWindow.isVisible()) {
                    eTopNamaz.setText(namaz[4]);
                }
                editWindow.setVisible(true);
                eTopNamaz.setText(namaz[4]);
                hourInput.setText("");
                minutesInput.setText("");
            }
        });
        edit6.setBounds(347, 0, 38,40);
        edit6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        edit6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (editWindow.isVisible()) {
                    eTopNamaz.setText(namaz[5]);
                }
                editWindow.setVisible(true);
                eTopNamaz.setText(namaz[5]);
                hourInput.setText("");
                minutesInput.setText("");
            }
        });
        edit7.setBounds(347, 0, 38,40);
        edit7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        edit7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (editWindow.isVisible()) {
                    eTopNamaz.setText(namaz[6]);
                }
                editWindow.setVisible(true);
                eTopNamaz.setText(namaz[6]);
                hourInput.setText("");
                minutesInput.setText("");
            }
        });

        card1.setBackground(new Color(0, 0, 0, 130));
        card1.setBounds(20, 50, 385, 40);
        card1.setLayout(null);
        card1.add(edit1);
        card1.add(namaz1);
        card1.add(time1);
        card2.setBackground(new Color(0, 0, 0, 130));
        card2.setBounds(20, card1.getHeight()+60, 385, 40);
        card2.setLayout(null);
        card2.add(edit2);
        card2.add(namaz2);
        card2.add(time2);
        card3.setBackground(new Color(0, 0, 0, 130));
        card3.setBounds(20, card2.getY()+50, 385, 40);
        card3.setLayout(null);
        card3.add(edit3);
        card3.add(namaz3);
        card3.add(time3);
        card4.setBackground(new Color(0, 0, 0, 130));
        card4.setBounds(20, card3.getY()+50, 385, 40);
        card4.setLayout(null);
        card4.add(edit4);
        card4.add(namaz4);
        card4.add(time4);
        card5.setBackground(new Color(0, 0, 0, 130));
        card5.setBounds(20, card4.getY()+50, 385, 40);
        card5.setLayout(null);
        card5.add(edit5);
        card5.add(namaz5);
        card5.add(time5);
        card6.setBackground(new Color(0, 0, 0, 130));
        card6.setBounds(20, card5.getY()+50, 385, 40);
        card6.setLayout(null);
        card6.add(edit6);
        card6.add(namaz6);
        card6.add(time6);
        card7.setBackground(new Color(0, 0, 0, 130));
        card7.setBounds(20, card6.getY()+50, 385, 40);
        card7.setLayout(null);
        card7.add(edit7);
        card7.add(namaz7);
        card7.add(time7);

        rightTimeDisplay.setPreferredSize(new Dimension(430, 10));
        rightTimeDisplay.setBackground(new Color(0, 0, 0, 0));
        rightTimeDisplay.setLayout(null);
        rightTimeDisplay.add(card1);
        rightTimeDisplay.add(card2);
        rightTimeDisplay.add(card3);
        rightTimeDisplay.add(card4);
        rightTimeDisplay.add(card5);
        rightTimeDisplay.add(card6);
        rightTimeDisplay.add(card7);
        rightTimeDisplay.add(backgroundPic);

        contents.setBackground(new Color(0x0095B2));
        contents.setLayout(new BorderLayout());
        contents.add(leftDisplay, BorderLayout.WEST);
        contents.add(rightTimeDisplay, BorderLayout.EAST);

        home.add(topHeader, BorderLayout.NORTH);
        home.add(contents, BorderLayout.CENTER);

        //EDIT WINDOW
        eTopBar.setBounds(0, 0, 424, 37);

        eTopTitle.setBounds(10, 0, 150, 37);
        eTopTitle.setHorizontalAlignment(JLabel.CENTER);
        eTopTitle.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        eTopTitle.setForeground(new Color(0xFFFFFF));

        eTopNamaz.setBounds(eTopTitle.getWidth()-35, 0, 150, 37);
        eTopNamaz.setHorizontalAlignment(JLabel.CENTER);
        eTopNamaz.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 16));
        eTopNamaz.setForeground(new Color(0xF3F3F3));

        eTopClose.setBounds(385, 0, 20, 37);
        eTopClose.setVerticalAlignment(JLabel.CENTER);
        eTopClose.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                editWindow.dispose();
                eWarn.setVisible(false);
                if (am.isSelected() || pm.isSelected()){
                    am.setSelected(false);
                    pm.setSelected(false);
                    hourInput.setText("");
                    minutesInput.setText("");
                }
            }
        });
        eTopClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        editTop.setPreferredSize(new Dimension(10, 37));
        editTop.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 90), 1));
        editTop.setBackground(new Color(0x0095B2));
        editTop.setLayout(null);
        editTop.add(eTopTitle);
        editTop.add(eTopNamaz);
        editTop.add(eTopClose);
        editTop.add(eTopBar);
        editTop.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                mouseX2 = e.getX();
                mouseY2 = e.getY();
            }
        });
        editTop.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                editWindow.setLocation(editWindow.getX()+e.getX() - mouseX2, editWindow.getY()+e.getY() - mouseY2);
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        eWarn.setBounds(0, 5, 417, 20);
        eWarn.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 14));
        eWarn.setForeground(new Color(0xB80000));
        eWarn.setHorizontalAlignment(JLabel.CENTER);
        eWarn.setVisible(false);

        am.setBounds(250, 55, 50, 20);
        am.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        am.setBackground(new Color(0xFFFFFF));
        am.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        am.setOpaque(true);
        am.setFocusable(false);
        am.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                am.isSelected();
                pm.setSelected(false);
            }
        });
        pm.setBounds(am.getX(), am.getY()+am.getHeight(), 50, 20);
        pm.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        pm.setOpaque(true);
        pm.setBackground(new Color(0xFFFFFF));
        pm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        pm.setFocusable(false);
        pm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                pm.isSelected();
                am.setSelected(false);
            }
        });

        hourText.setBounds(125, 30, 45, 20);
        hourText.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
        hourText.setForeground(new Color(0x616161));
        minutesText.setBounds(hourText.getX()+62, 30, 50, 20);
        minutesText.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
        minutesText.setForeground(new Color(0x616161));

        hourInput.setBounds(120, 60, 45, 32);
        hourInput.setBackground(new Color(0xF4F4FF));
        hourInput.setBorder(BorderFactory.createLineBorder(new Color(0x0095B2), 1, true));
        hourInput.setHorizontalAlignment(JTextField.CENTER);
        minutesInput.setBounds(hourInput.getX()+70, hourInput.getY(), 45, 32);
        minutesInput.setBackground(new Color(0xF4F4FF));
        minutesInput.setBorder(BorderFactory.createLineBorder(new Color(0x0095B2), 1, true));
        minutesInput.setHorizontalAlignment(JTextField.CENTER);

        saveBtn.setBounds(120, minutesInput.getY()+70, 172, 29);
        saveBtn.setOpaque(true);
        saveBtn.setBackground(new Color(0x006E84));
        saveBtn.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 60), 1));
        saveBtn.setHorizontalAlignment(JLabel.CENTER);
        saveBtn.setVerticalAlignment(JLabel.CENTER);
        saveBtn.setForeground(new Color(0xF3F3F3));
        saveBtn.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        saveBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        saveBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (hourInput.getText().matches("[a-zA-Z]+") || minutesInput.getText().matches("[a-zA-Z]+")){
                    if (!eWarn.isVisible()){
                        eWarn.setVisible(true);
                        eWarn.setText("Only digits are allowed!");
                    }
                    eWarn.setText("Only digits are allowed!");
                }
                else if (hourInput.getText().equals("") || minutesInput.getText().equals("") || !am.isSelected() && !pm.isSelected()){
                    if (!eWarn.isVisible()) {
                        eWarn.setVisible(true);
                    }
                    eWarn.setText("You can't leave any field blank or unselected!");
                }
                else {
                    eWarn.setVisible(false);
                    if (eTopNamaz.getText().equals(namaz[0])){
                        window.setVisible(false);
                        try {
                            window.setVisible(true);
                            editWindow.setVisible(false);
                            if (am.isSelected()){
                                namazTime[0] = (""+hourInput.getText()+":"+minutesInput.getText()+" "+am.getText());
                                if ($_DATA_SAVED.equals("true")){
                                    time1.setText(namazTime[0]);
                                }
                            }else if (pm.isSelected()){
                                namazTime[0] = (""+hourInput.getText()+":"+minutesInput.getText()+" "+pm.getText());
                                time1.setText(namazTime[0]);
                            }
                            Thread.sleep(100);
                        }catch (Exception a){
                            a.printStackTrace();
                        }
                    }else if (eTopNamaz.getText().equals(namaz[1])){
                        window.setVisible(false);
                        try {
                            window.setVisible(true);
                            editWindow.setVisible(false);
                            if (am.isSelected()){
                                namazTime[1] = (""+hourInput.getText()+":"+minutesInput.getText()+" "+am.getText());
                                time2.setText(namazTime[1]);
                            }else if (pm.isSelected()){
                                namazTime[1] = (""+hourInput.getText()+":"+minutesInput.getText()+" "+pm.getText());
                                time2.setText(namazTime[1]);
                            }
                            Thread.sleep(100);
                        }catch (Exception a){
                           a.printStackTrace();
                        }
                    }else if (eTopNamaz.getText().equals(namaz[2])){
                        window.setVisible(false);
                        try {
                            window.setVisible(true);
                            editWindow.setVisible(false);
                            if (am.isSelected()){
                                namazTime[2] = (""+hourInput.getText()+":"+minutesInput.getText()+" "+am.getText());
                                time3.setText(namazTime[2]);
                            }else if (pm.isSelected()){
                                namazTime[2] = (""+hourInput.getText()+":"+minutesInput.getText()+" "+pm.getText());
                                time3.setText(namazTime[2]);
                            }
                            Thread.sleep(100);
                        }catch (Exception a){
                            a.printStackTrace();
                        }
                    }
                    else if (eTopNamaz.getText().equals(namaz[3])){
                        window.setVisible(false);
                        try {
                            window.setVisible(true);
                            editWindow.setVisible(false);
                            if (am.isSelected()){
                                namazTime[3] = (""+hourInput.getText()+":"+minutesInput.getText()+" "+am.getText());
                                time4.setText(namazTime[3]);
                            }else if (pm.isSelected()){
                                namazTime[3] = (""+hourInput.getText()+":"+minutesInput.getText()+" "+pm.getText());
                                time4.setText(namazTime[3]);
                            }
                            Thread.sleep(100);
                        }catch (Exception a){
                            a.printStackTrace();
                        }
                    }else if (eTopNamaz.getText().equals(namaz[4])){
                        window.setVisible(false);
                        try {
                            window.setVisible(true);
                            editWindow.setVisible(false);
                            if (am.isSelected()){
                                namazTime[4] = (""+hourInput.getText()+":"+minutesInput.getText()+" "+am.getText());
                                time5.setText(namazTime[4]);
                            }else if (pm.isSelected()){
                                namazTime[4] = (""+hourInput.getText()+":"+minutesInput.getText()+" "+pm.getText());
                                time5.setText(namazTime[4]);
                            }
                            Thread.sleep(100);
                        }catch (Exception a){
                            a.printStackTrace();
                        }
                    }else if (eTopNamaz.getText().equals(namaz[5])){
                        window.setVisible(false);
                        try {
                            window.setVisible(true);
                            editWindow.setVisible(false);
                            if (am.isSelected()){
                                namazTime[5] = (""+hourInput.getText()+":"+minutesInput.getText()+" "+am.getText());
                                time6.setText(namazTime[5]);
                            }else if (pm.isSelected()){
                                namazTime[5] = (""+hourInput.getText()+":"+minutesInput.getText()+" "+pm.getText());
                                time6.setText(namazTime[5]);
                            }
                            Thread.sleep(100);
                        }catch (Exception a){
                            a.printStackTrace();
                        }
                    }else if (eTopNamaz.getText().equals(namaz[6])){
                        window.setVisible(false);
                        try {
                            window.setVisible(true);
                            editWindow.setVisible(false);
                            if (am.isSelected()){
                                namazTime[6] = (""+hourInput.getText()+":"+minutesInput.getText()+" "+am.getText());
                                time7.setText(namazTime[6]);
                            }else if (pm.isSelected()){
                                namazTime[6] = (""+hourInput.getText()+":"+minutesInput.getText()+" "+pm.getText());
                                time7.setText(namazTime[6]);
                            }
                            Thread.sleep(100);
                        }catch (Exception a){
                           a.printStackTrace();
                        }
                    }

                    am.setSelected(false);
                    pm.setSelected(false);
                }
            }
        });

        //REFRESH AND SAVE DATA
        exitBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                try {
                    FileOutputStream $DATA_1 = new FileOutputStream("data/DATA_1.text");
                    ObjectOutputStream $SAVE_DATA_1 = new ObjectOutputStream($DATA_1);
                    $SAVE_DATA_1.writeObject(namazTime[0]);
                    $SAVE_DATA_1.close();
                    $DATA_1.close();
                    FileOutputStream $DATA_2 = new FileOutputStream("data/DATA_2.text");
                    ObjectOutputStream $SAVE_DATA_2 = new ObjectOutputStream($DATA_2);
                    $SAVE_DATA_2.writeObject(namazTime[1]);
                    $SAVE_DATA_2.close();
                    $DATA_2.close();
                    FileOutputStream $DATA_3 = new FileOutputStream("data/DATA_3.text");
                    ObjectOutputStream $SAVE_DATA_3 = new ObjectOutputStream($DATA_3);
                    $SAVE_DATA_3.writeObject(namazTime[2]);
                    $SAVE_DATA_3.close();
                    $DATA_3.close();
                    FileOutputStream $DATA_4 = new FileOutputStream("data/DATA_4.text");
                    ObjectOutputStream $SAVE_DATA_4 = new ObjectOutputStream($DATA_4);
                    $SAVE_DATA_4.writeObject(namazTime[3]);
                    $SAVE_DATA_4.close();
                    $DATA_1.close();
                    FileOutputStream $DATA_5 = new FileOutputStream("data/DATA_5.text");
                    ObjectOutputStream $SAVE_DATA_5 = new ObjectOutputStream($DATA_5);
                    $SAVE_DATA_5.writeObject(namazTime[4]);
                    $SAVE_DATA_5.close();
                    $DATA_5.close();
                    FileOutputStream $DATA_6 = new FileOutputStream("data/DATA_6.text");
                    ObjectOutputStream $SAVE_DATA_6 = new ObjectOutputStream($DATA_6);
                    $SAVE_DATA_6.writeObject(namazTime[5]);
                    $SAVE_DATA_6.close();
                    $DATA_6.close();
                    FileOutputStream $DATA_7 = new FileOutputStream("data/DATA_7.text");
                    ObjectOutputStream $SAVE_DATA_7 = new ObjectOutputStream($DATA_7);
                    $SAVE_DATA_7.writeObject(namazTime[6]);
                    $SAVE_DATA_7.close();
                    $DATA_7.close();
                    __IS_SAVED = true;
                    FileOutputStream $_DATA_CONDITION = new FileOutputStream("data/AW-Condition.text");
                    ObjectOutputStream $_SAVE_CONDITION = new ObjectOutputStream($_DATA_CONDITION);
                    $_SAVE_CONDITION.writeObject($_DATA_SAVED);

                    //--< DISPLAY SAVED
//                    System.out.println("DATA SAVED SUCCESSFULLY!");

                }catch (Exception l){
                    l.printStackTrace();
                }
                window.setExtendedState(JFrame.HIDE_ON_CLOSE);
//                System.exit(0);
            }
        });
        editRibbon.setBounds(-3, 176, 428, 20);
        editRibbon.setBorder(BorderFactory.createLineBorder(new Color(0x828282), 1));
        editRibbon.setOpaque(true);
        editRibbon.setBackground(new Color(0x0095B2));


        editContents.setPreferredSize(new Dimension(10, 10));
        editContents.setBackground(new Color(0xFFFFFF));
        editContents.setBorder(BorderFactory.createLineBorder(new Color(0x046679), 1, false));
        editContents.setLayout(null);
        editContents.add(hourInput);
        editContents.add(minutesInput);
        editContents.add(eWarn);
        editContents.add(saveBtn);
        editContents.add(hourText);
        editContents.add(minutesText);
        editContents.add(am);
        editContents.add(pm);
        editContents.add(editRibbon);

        editWindow.setSize(417, 220);
        editWindow.setLocationRelativeTo(null);
        editWindow.setUndecorated(true);
        editWindow.setLayout(new BorderLayout());
        editWindow.add(editTop, BorderLayout.NORTH);
        editWindow.add(editContents, BorderLayout.CENTER);
        editWindow.setVisible(false);

        window.setTitle("Al-Waqt");
        window.setIconImage(logo.getImage());
        window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        window.setResizable(false);
        window.setSize(800, 450);
        window.add(home);
        window.setLocationRelativeTo(null);
        window.setUndecorated(true);
        window.setVisible(true);
        window.pack();

        //-><Morning>
        //-->Noon
        //-->Evening
        File file2 = new File(adhans[1]);
        AudioInputStream audioInputStream2 = AudioSystem.getAudioInputStream(file2);
        Clip clip2 = AudioSystem.getClip();
        clip2.open(audioInputStream2);
//        clip2.start();

        //BRAIN
       Thread clock = new Thread(() -> {
           Timer timer1 = new Timer();
           TimerTask timerTask0 = new TimerTask() {
               @Override
               public void run() {
                   watch = new Date();
                   formatTime = new SimpleDateFormat("hh:mm a");
                   mainWatch.setText(""+formatTime.format(watch));

                   date = new Date();
                   formatDate = new SimpleDateFormat("E dd/MM/yyyy");
                   dateGre.setText(""+formatDate.format(date));
               }
           };
           timer1.scheduleAtFixedRate(timerTask0, 0, 5);
           TimerTask timerTask = new TimerTask() {
               @Override
               public void run() {
                   if (time1.getText().equals(mainWatch.getText())){ //=> IMSAK
                       clip2.setMicrosecondPosition(0);
                       try{
                           clip2.start();
                           Thread.sleep(1);
                       }catch (Exception e){
                           e.printStackTrace();
                       }
                       nextTime.setVisible(false);
                       stopAudio.setVisible(false);
                       card1.setVisible(false);
                       card2.setVisible(false);card3.setVisible(false);card4.setVisible(false);
                       card5.setVisible(false);card6.setVisible(false);card7.setVisible(false);
                       try {
                           indicateBG.setVisible(true);
                           nextTime.setVisible(true);
                           stopAudio.setVisible(true);
                           nextTime.setText("It is "+namaz[0]+" time.");
                           card1.add(ribon);
                           card1.setVisible(true);card2.setVisible(true);
                           card3.setVisible(true);card4.setVisible(true);
                           card5.setVisible(true);card6.setVisible(true);
                           card7.setVisible(true);
                           card2.remove(ribon);card3.remove(ribon);
                           card4.remove(ribon);card5.remove(ribon);
                           card6.remove(ribon);card7.remove(ribon);
                           Thread.sleep(5);
                       }catch (Exception m){
                           m.printStackTrace();
                       }
                       window.setVisible(true);
                       if (!stopAudio.isVisible()){
                           stopAudio.setVisible(true);
                       }
                       try {
                           showMesg(window, nextTime.getText());
                       } catch (AWTException | LineUnavailableException | UnsupportedAudioFileException | IOException e) {
                           e.printStackTrace();
                       }
                       for (int minutesToStop = 253; minutesToStop >= 1; minutesToStop--){
                           try{
                               Thread.sleep(1000);
                               if (minutesToStop == 1){
                                   stopAudio.setVisible(false);
                                   resumeAudio.setVisible(false);
                                   nextTime.setVisible(false);
                                   try {
                                       nextTime.setVisible(true);
                                       nextTime.setText("Next is "+namaz[1]+" time");
                                       nextTime.setForeground(new Color(0x001753));
                                       showMesgTwo(window, nextTime.getText());
                                       Thread.sleep(5);
                                   }catch (Exception m){
                                       m.printStackTrace();
                                   }
                               }
                           }catch (Exception o){
                               o.printStackTrace();
                           }
                       }
                   }
                   if (time2.getText().equals(mainWatch.getText())){ //=> FAJR
                       clip2.setMicrosecondPosition(0);
                       try{
                           clip2.start();
                           Thread.sleep(1);
                       }catch (Exception e){
                           e.printStackTrace();
                       }
                       nextTime.setVisible(false);
                       stopAudio.setVisible(false);
                       card2.setVisible(false);
                       card1.setVisible(false);card3.setVisible(false);card4.setVisible(false);
                       card5.setVisible(false);card6.setVisible(false);card7.setVisible(false);
                       try {
                           indicateBG.setVisible(true);
                           nextTime.setVisible(true);
                           stopAudio.setVisible(true);
                           nextTime.setText("It is "+namaz[1]+" time.");
                           nextTime.setForeground(new Color(0xFFFFFF));
                           card2.add(ribon);
                           card2.setVisible(true);card1.setVisible(true);
                           card3.setVisible(true);card4.setVisible(true);
                           card5.setVisible(true);card6.setVisible(true);
                           card7.setVisible(true);
                           card1.remove(ribon);card3.remove(ribon);
                           card4.remove(ribon);card5.remove(ribon);
                           card6.remove(ribon);card7.remove(ribon);
                           Thread.sleep(5);
                       }catch (Exception m){
                           m.printStackTrace();
                       }
                       window.setVisible(true);
                       if (!stopAudio.isVisible()){
                           stopAudio.setVisible(true);
                       }
                       try {
                           showMesg(window, nextTime.getText());
                       } catch (AWTException | LineUnavailableException | UnsupportedAudioFileException | IOException e) {
                           e.printStackTrace();
                       }
                       for (int minutesToStop = 253; minutesToStop >= 1; minutesToStop--){
                           try{
                               Thread.sleep(1000);
                               if (minutesToStop == 1){
                                   resumeAudio.setVisible(false);
                                   stopAudio.setVisible(false);
                                   nextTime.setVisible(false);
                                   try {
                                       nextTime.setVisible(true);
                                       nextTime.setText("Next is "+namaz[2]+" time");
                                       nextTime.setForeground(new Color(0x001753));
                                       showMesgTwo(window, nextTime.getText());
                                       Thread.sleep(5);
                                   }catch (Exception m){
                                       m.printStackTrace();
                                   }
                               }
                           }catch (Exception o){
                               o.printStackTrace();
                           }
                       }
                   }
                   if (time3.getText().equals(mainWatch.getText())){ //=> SUNRISE
                       clip2.setMicrosecondPosition(0);
                       try{
                           clip2.start();
                           Thread.sleep(1);
                       }catch (Exception e){
                           e.printStackTrace();
                       }
                       nextTime.setVisible(false);
                       stopAudio.setVisible(false);
                       card3.setVisible(false);
                       card1.setVisible(false);card2.setVisible(false);
                       card4.setVisible(false);card5.setVisible(false);
                       card6.setVisible(false);card7.setVisible(false);
                       try {
                           indicateBG.setVisible(true);
                           nextTime.setVisible(true);
                           stopAudio.setVisible(true);
                           nextTime.setText("It is "+namaz[2]+" time.");
                           nextTime.setForeground(new Color(0xFFFFFF));
                           card3.add(ribon);
                           card3.setVisible(true);card2.setVisible(true);
                           card1.setVisible(true);card4.setVisible(true);
                           card5.setVisible(true);card6.setVisible(true);
                           card7.setVisible(true);
                           card1.remove(ribon);card2.remove(ribon);
                           card4.remove(ribon);card5.remove(ribon);
                           card6.remove(ribon);card7.remove(ribon);
                           Thread.sleep(5);
                       }catch (Exception m){
                           m.printStackTrace();
                       }
                       window.setVisible(true);
                       if (!stopAudio.isVisible()){
                           stopAudio.setVisible(true);
                       }
                       try {
                           showMesg(window, nextTime.getText());
                       } catch (AWTException | LineUnavailableException | UnsupportedAudioFileException | IOException  e) {
                           e.printStackTrace();
                       }
                       for (int minutesToStop = 253; minutesToStop >= 1; minutesToStop--){
                           try{
                               Thread.sleep(1000);
                               if (minutesToStop == 1){
                                   resumeAudio.setVisible(false);
                                   stopAudio.setVisible(false);
                                   nextTime.setVisible(false);
                                   try {
                                       nextTime.setVisible(true);
                                       nextTime.setText("Next is "+namaz[3]+" time");
                                       nextTime.setForeground(new Color(0x001753));
                                       showMesgTwo(window, nextTime.getText());
                                       Thread.sleep(5);
                                   }catch (Exception m){
                                       m.printStackTrace();
                                   }
                               }
                           }catch (Exception o){
                               o.printStackTrace();
                           }
                       }
                   }
                   if (time4.getText().equals(mainWatch.getText())){ //=> DHUHR
                       clip2.setMicrosecondPosition(0);
                       try{
                           clip2.start();
                           Thread.sleep(1);
                       }catch (Exception e){
                           e.printStackTrace();
                       }
                       nextTime.setVisible(false);
                       stopAudio.setVisible(false);
                       card4.setVisible(false);
                       card1.setVisible(false);card2.setVisible(false);
                       card3.setVisible(false);card5.setVisible(false);
                       card6.setVisible(false);card7.setVisible(false);
                       try {
                           indicateBG.setVisible(true);
                           nextTime.setVisible(true);
                           stopAudio.setVisible(true);
                           nextTime.setText("It is "+namaz[3]+" time.");
                           nextTime.setForeground(new Color(0xFFFFFF));
                           card4.add(ribon);
                           card4.setVisible(true);card2.setVisible(true);
                           card3.setVisible(true);card1.setVisible(true);
                           card5.setVisible(true);card6.setVisible(true);
                           card7.setVisible(true);
                           card1.remove(ribon);card2.remove(ribon);
                           card3.remove(ribon);card5.remove(ribon);
                           card6.remove(ribon);card7.remove(ribon);
                           Thread.sleep(5);
                       }catch (Exception m){
                           m.printStackTrace();
                       }
                       window.setVisible(true);
                       if (!stopAudio.isVisible()){
                           stopAudio.setVisible(true);
                       }
                       try {
                           showMesg(window, nextTime.getText());
                       } catch (AWTException | LineUnavailableException | UnsupportedAudioFileException | IOException e) {
                           e.printStackTrace();
                       }
                       for (int minutesToStop = 253; minutesToStop >= 1; minutesToStop--){
                           try{
                               Thread.sleep(1000);
                               if (minutesToStop == 1){
                                   resumeAudio.setVisible(false);
                                   nextTime.setVisible(false);
                                   stopAudio.setVisible(false);
                                   try {
                                       nextTime.setVisible(true);
                                       nextTime.setText("Next is "+namaz[4]+" time");
                                       nextTime.setForeground(new Color(0x001753));
                                       showMesgTwo(window, nextTime.getText());
                                       Thread.sleep(5);
                                   }catch (Exception m){
                                       m.printStackTrace();
                                   }
                               }
                           }catch (Exception o){
                               o.printStackTrace();
                           }
                       }
                   }
                   if (time5.getText().equals(mainWatch.getText())){ //=> ASR
                       clip2.setMicrosecondPosition(0);
                       try{
                           clip2.start();
                           Thread.sleep(1);
                       }catch (Exception e){
                           e.printStackTrace();
                       }
                       nextTime.setVisible(false);
                       stopAudio.setVisible(false);
                       card5.setVisible(false);
                       card1.setVisible(false);card2.setVisible(false);
                       card3.setVisible(false);card4.setVisible(false);
                       card6.setVisible(false);card7.setVisible(false);
                       try {
                           indicateBG.setVisible(true);
                           nextTime.setVisible(true);
                           stopAudio.setVisible(true);
                           nextTime.setText("It is "+namaz[4]+" time.");
                           nextTime.setForeground(new Color(0xFFFFFF));
                           card5.add(ribon);
                           card5.setVisible(true);card2.setVisible(true);
                           card3.setVisible(true);card4.setVisible(true);
                           card1.setVisible(true);card6.setVisible(true);
                           card7.setVisible(true);
                           card1.remove(ribon);card2.remove(ribon);
                           card3.remove(ribon);card4.remove(ribon);
                           card6.remove(ribon);card7.remove(ribon);
                           Thread.sleep(5);
                       }catch (Exception m){
                           m.printStackTrace();
                       }
                       window.setVisible(true);
                       if (!stopAudio.isVisible()){
                           stopAudio.setVisible(true);
                       }
                       try {
                           showMesg(window, nextTime.getText());
                       } catch (AWTException | LineUnavailableException | UnsupportedAudioFileException | IOException e) {
                           e.printStackTrace();
                       }
                       for (int minutesToStop = 253; minutesToStop >= 1; minutesToStop--){
                           try{
                               Thread.sleep(1000);
                               if (minutesToStop == 1){
                                   resumeAudio.setVisible(false);
                                   stopAudio.setVisible(false);
                                   nextTime.setVisible(false);
                                   try {
                                       nextTime.setVisible(true);
                                       nextTime.setText("Next is "+namaz[5]+" time");
                                       nextTime.setForeground(new Color(0x001753));
                                       showMesgTwo(window, nextTime.getText());
                                       Thread.sleep(5);
                                   }catch (Exception m){
                                       m.printStackTrace();
                                   }
                               }
                           }catch (Exception o){
                               o.printStackTrace();
                           }
                       }
                   }
                   if (time6.getText().equals(mainWatch.getText())){ //=> MAGHRIB
                       clip2.setMicrosecondPosition(0);
                       try{
                           clip2.start();
                           Thread.sleep(1);
                       }catch (Exception e){
                           e.printStackTrace();
                       }
                       nextTime.setVisible(false);
                       stopAudio.setVisible(false);
                       card6.setVisible(false);
                       card1.setVisible(false);card2.setVisible(false);
                       card3.setVisible(false);card4.setVisible(false);
                       card5.setVisible(false);card7.setVisible(false);
                       try {
                           indicateBG.setVisible(true);
                           nextTime.setVisible(true);
                           stopAudio.setVisible(true);
                           nextTime.setText("It is "+namaz[5]+" time.");
                           nextTime.setForeground(new Color(0xFFFFFF));
                           card6.add(ribon);
                           card6.setVisible(true);card2.setVisible(true);
                           card3.setVisible(true);card4.setVisible(true);
                           card5.setVisible(true);card1.setVisible(true);
                           card7.setVisible(true);
                           card1.remove(ribon);card2.remove(ribon);
                           card3.remove(ribon);card4.remove(ribon);
                           card5.remove(ribon);card7.remove(ribon);
                           Thread.sleep(5);
                       }catch (Exception m){
                           m.printStackTrace();
                       }
                       window.setVisible(true);
                       if (!stopAudio.isVisible()){
                           stopAudio.setVisible(true);
                       }
                       try {
                           showMesg(window, nextTime.getText());
                       } catch (AWTException | LineUnavailableException | UnsupportedAudioFileException | IOException e) {
                           e.printStackTrace();
                       }
                       for (int minutesToStop = 253; minutesToStop >= 1; minutesToStop--){
                           try{
                               Thread.sleep(1000);
                               if (minutesToStop == 1){
                                   resumeAudio.setVisible(false);
                                   stopAudio.setVisible(false);
                                   nextTime.setVisible(false);
                                   try {
                                       nextTime.setVisible(true);
                                       nextTime.setText("Next is "+namaz[6]+" time");
                                       nextTime.setForeground(new Color(0x001753));
                                       showMesgTwo(window, nextTime.getText());
                                       Thread.sleep(5);
                                   }catch (Exception m){
                                       m.printStackTrace();
                                   }
                               }
                           }catch (Exception o){
                               o.printStackTrace();
                           }
                       }
                   }
                   if (time7.getText().equals(mainWatch.getText())){ //=> ISHAA
                       clip2.setMicrosecondPosition(0);
                       try{
                           clip2.start();
                           Thread.sleep(1);
                       }catch (Exception e){
                           e.printStackTrace();
                       }
                       nextTime.setVisible(false);
                       stopAudio.setVisible(false);
                       card7.setVisible(false);
                       card1.setVisible(false);card2.setVisible(false);
                       card3.setVisible(false);card4.setVisible(false);
                       card5.setVisible(false);card6.setVisible(false);
                       try {
                           indicateBG.setVisible(true);
                           nextTime.setVisible(true);
                           stopAudio.setVisible(true);
                           nextTime.setText("It is "+namaz[6]+" time.");
                           nextTime.setForeground(new Color(0xFFFFFF));
                           card7.add(ribon);
                           card7.setVisible(true);card2.setVisible(true);
                           card3.setVisible(true);card4.setVisible(true);
                           card5.setVisible(true);card6.setVisible(true);
                           card1.setVisible(true);
                           card1.remove(ribon);card2.remove(ribon);
                           card3.remove(ribon);card4.remove(ribon);
                           card5.remove(ribon);card6.remove(ribon);
                           Thread.sleep(5);
                       }catch (Exception m){
                           m.printStackTrace();
                       }
                       window.setVisible(true);
                       if (!stopAudio.isVisible()){
                           stopAudio.setVisible(true);
                       }
                       try {
                           showMesg(window, nextTime.getText());
                       } catch (AWTException | LineUnavailableException | UnsupportedAudioFileException | IOException e) {
                           e.printStackTrace();
                       }
                       for (int minutesToStop = 253; minutesToStop >= 1; minutesToStop--){
                           try{
                               Thread.sleep(1000);
                               if (minutesToStop == 1){
                                   resumeAudio.setVisible(false);
                                   nextTime.setVisible(false);
                                   stopAudio.setVisible(false);
                                   try {
                                       nextTime.setVisible(true);
                                       nextTime.setText("Next is "+namaz[0]+" time");
                                       nextTime.setForeground(new Color(0x001753));
                                       showMesgTwo(window, nextTime.getText());
                                       Thread.sleep(5);
                                   }catch (Exception m){
                                       m.printStackTrace();
                                   }
                               }
                           }catch (Exception o){
                               o.printStackTrace();
                           }
                       }
                   }

               }
           };
           timer.scheduleAtFixedRate(timerTask, 0, 50);
       });
       clock.start();

        //CONTROL MEDIA
        stopAudio.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (clip2.isRunning()){
                    clip2.stop();
                    stopAudio.setVisible(false);
                    resumeAudio.setVisible(true);
                }else {
                    clip2.start();
                }
            }
        });
        resumeAudio.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (!clip2.isRunning()){
                    clip2.start();
                }
                resumeAudio.setVisible(false);
                stopAudio.setVisible(true);

            }
        });
//        showMesgTwo(window, nextTime.getText());
    }
    public static void showMesg(JFrame window, String msg) throws AWTException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        ImageIcon logo;
        logo = new ImageIcon("resources/images/logo0.png");
        JFrame notification = new JFrame();
        notification.setAlwaysOnTop(true);
        playNotification();
        disposeNotification(notification);
        displayTray(msg, window);
        JPanel content = new JPanel();
        JLabel notIcon = new JLabel(new ImageIcon("resources/images/noticon.png"));
        notIcon.setBounds(0, 0, 80, 70);
        JLabel messages = new JLabel(msg);
        messages.setBounds(80, 10, 300, 30);
        messages.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        messages.setForeground(new Color(255, 255, 255, 180));
        JLabel exp = new JLabel("Please do not forget to pray!");
        exp.setBounds(80, 30, 300, 30);
        exp.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
        exp.setForeground(new Color(255, 255, 255, 120));
        JLabel closeBtn = new JLabel(new ImageIcon("resources/images/closeBtn01.png"));
        closeBtn.setBounds(250, 5, 20, 20);
        closeBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        closeBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                notification.dispose();
            }
        });

        content.setBounds(5, 5, 280, 70);
        content.setBorder(BorderFactory.createLineBorder(new Color(0, 173, 207, 100), 1));
        content.setBackground(new Color(0x007086));
        content.setLayout(null);
        content.add(notIcon);
        content.add(messages);
        content.add(exp);
        content.add(closeBtn);
        content.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        content.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                window.setVisible(true);
                window.setAutoRequestFocus(true);
                notification.dispose();
            }
        });

        notification.setSize(290, 80);
        notification.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1.0f;
        constraints.weighty = 1.0f;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.fill = GridBagConstraints.BOTH;
        notification.add(content, constraints);
        constraints.gridx++;
        constraints.weightx = 0f;
        constraints.weighty = 0f;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.gridx = 0;
        constraints.gridy++;
        constraints.weightx = 1.0f;
        constraints.weighty = 1.0f;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.fill = GridBagConstraints.BOTH;
        notification.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        notification.setUndecorated(true);
        Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();// size of the screen
        Insets toolHeight = Toolkit.getDefaultToolkit().getScreenInsets(notification.getGraphicsConfiguration());// height of the task bar
        notification.setLocation(scrSize.width - notification.getWidth(), scrSize.height - toolHeight.bottom - notification.getHeight());
        notification.setAlwaysOnTop(true);
        notification.setIconImage(logo.getImage());
        notification.setBackground(new Color(0, 0, 0, 0));
        notification.setVisible(true);

    }
    public static void showMesgTwo(JFrame window, String msg) throws AWTException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        ImageIcon logo;
        logo = new ImageIcon("resources/images/logo0.png");

        JFrame notification = new JFrame();
        notification.setAlwaysOnTop(true);
        playNotificationTwo();
        disposeNotification(notification);
        displayTray(msg, window);
        JPanel content = new JPanel();
        JLabel notIcon = new JLabel(new ImageIcon("resources/images/noticon.png"));
        notIcon.setBounds(0, 0, 80, 70);
        JLabel messages = new JLabel(msg);
        messages.setBounds(80, 10, 300, 30);
        messages.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        messages.setForeground(new Color(255, 255, 255, 180));
        JLabel exp = new JLabel("Please do not forget to pray!");
        exp.setBounds(80, 30, 300, 30);
        exp.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
        exp.setForeground(new Color(255, 255, 255, 120));
        JLabel closeBtn = new JLabel(new ImageIcon("resources/images/closeBtn01.png"));
        closeBtn.setBounds(250, 5, 20, 20);
        closeBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        closeBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                notification.dispose();
            }
        });

        content.setBounds(5, 5, 280, 70);
        content.setBorder(BorderFactory.createLineBorder(new Color(0, 173, 207, 100), 1));
        content.setBackground(new Color(0x007086));
        content.setLayout(null);
        content.add(notIcon);
        content.add(messages);
        content.add(exp);
        content.add(closeBtn);
        content.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        content.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                window.setVisible(true);
                window.setAutoRequestFocus(true);
                notification.dispose();
            }
        });

        notification.setSize(290, 80);
        notification.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1.0f;
        constraints.weighty = 1.0f;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.fill = GridBagConstraints.BOTH;
        notification.add(content, constraints);
        constraints.gridx++;
        constraints.weightx = 0f;
        constraints.weighty = 0f;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.gridx = 0;
        constraints.gridy++;
        constraints.weightx = 1.0f;
        constraints.weighty = 1.0f;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.fill = GridBagConstraints.BOTH;
        notification.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        notification.setUndecorated(true);
        Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();// size of the screen
        Insets toolHeight = Toolkit.getDefaultToolkit().getScreenInsets(notification.getGraphicsConfiguration());// height of the task bar
        notification.setLocation(scrSize.width - notification.getWidth(), scrSize.height - toolHeight.bottom - notification.getHeight());
        notification.setAlwaysOnTop(true);
        notification.setIconImage(logo.getImage());
        notification.setBackground(new Color(0, 0, 0, 0));
        notification.setVisible(true);

    }
    public static void disposeNotification(JFrame notificationWindow){
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                notificationWindow.dispose();
            }
        };
        timer.scheduleAtFixedRate(timerTask, 10000, 100);
    }
    public static void displayTray(String message, JFrame window) throws AWTException {
        if (SystemTray.isSupported()){
            SystemTray systemTray = SystemTray.getSystemTray();
            Image imageIcon = Toolkit.getDefaultToolkit().createImage("resources/images/noti1.png");
            TrayIcon trayIcon = new TrayIcon(imageIcon, "Al-Waqt Reminder");
            trayIcon.setImageAutoSize(true);
            trayIcon.setToolTip("Al-Waqt Reminder");
            trayIcon.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    super.mousePressed(e);
                    window.setVisible(true);
                    window.setAutoRequestFocus(true);
                }
            });
            systemTray.remove(trayIcon);
            try{
                systemTray.add(trayIcon);
            }catch (Exception oi){
                oi.printStackTrace();
            }
        }else {
            System.out.print("Reminder : " + message);
        }
    }
    public static void playNotification() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        Clip clip = AudioSystem.getClip();
        File file = new File("resources/media/notification/interface.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        clip.open(audioInputStream);
        clip.setMicrosecondPosition(0);
        clip.start();
    }
    public static void playNotificationTwo() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        Clip clip = AudioSystem.getClip();
        File file = new File("resources/media/notification/interface_reverse.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        clip.open(audioInputStream);
        clip.setMicrosecondPosition(0);
        clip.start();
    }
    public static void goToInfo(int _MOUSE_X, int _MOUSE_Y){
        JFrame infoWindow;
        JPanel infoTop, infoContents;
        JLabel iTopBar, iTitle, iClose, iRibbon;

        infoWindow = new JFrame();
        infoTop = new JPanel();
        infoContents = new JPanel();

        iTopBar = new JLabel(new ImageIcon("resources/images/topBar.png"));iTitle = new JLabel("Set custom time   - ");
        iClose = new JLabel(new ImageIcon("resources/images/close.png"));iRibbon = new JLabel();


        iTopBar.setBounds(0, 0, 424, 37);

        iTitle.setBounds(10, 0, 150, 37);
        iTitle.setHorizontalAlignment(JLabel.CENTER);
        iTitle.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        iTitle.setForeground(new Color(0xFFFFFF));

        iClose.setBounds(385, 0, 20, 37);
        iClose.setVerticalAlignment(JLabel.CENTER);
        iClose.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                infoWindow.dispose();
            }
        });
        iClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        infoTop.setPreferredSize(new Dimension(10, 37));
        infoTop.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255, 90), 1));
        infoTop.setBackground(new Color(0x0095B2));
        infoTop.setLayout(null);
        infoTop.add(iTitle);
        infoTop.add(iClose);
        infoTop.add(iTopBar);
        infoTop.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);

            }
        });
        infoTop.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        iRibbon.setBounds(-3, 176, 428, 20);
        iRibbon.setBorder(BorderFactory.createLineBorder(new Color(0x828282), 1));
        iRibbon.setOpaque(true);
        iRibbon.setBackground(new Color(0x0095B2));

        infoContents.setPreferredSize(new Dimension(10, 10));
        infoContents.setBackground(new Color(0xFFFFFF));
        infoContents.setBorder(BorderFactory.createLineBorder(new Color(0x046679), 1, false));
        infoContents.setLayout(null);
        infoContents.add(iRibbon);

        infoWindow.setSize(417, 220);
        infoWindow.setLocationRelativeTo(null);
        infoWindow.setUndecorated(true);
        infoWindow.setLayout(new BorderLayout());
        infoWindow.add(infoTop, BorderLayout.NORTH);
        infoWindow.add(infoContents, BorderLayout.CENTER);
        infoWindow.setVisible(true);

    }
}
