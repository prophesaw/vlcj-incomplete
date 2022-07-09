import uk.co.caprica.vlcj.player.base.MediaPlayer;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class function extends components  {


    function(){
        label.setBounds(0,0,500,20);
        label.setBackground(Color.GREEN);
        label.setHorizontalTextPosition(10);

        prev.setBounds(80,21,80,40);
        prev.addActionListener(this);
        play.setBounds(180,21,80,40);
        play.addActionListener(this);
        next.setBounds(280,21,80,40);
        next.addActionListener(this);

        scroll.setBounds(0,80,485,350);
        list.addSelectionInterval(10,10);
        list.setBackground(Color.GRAY);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
        scroll.setVerticalScrollBar(verticalScrollBar);





        mypanel.add(prev);
        mypanel.add(scroll);
        mypanel.add(play);
        mypanel.add(next);
        mypanel.add(label);
        mypanel.setLayout(null);
        mypanel.setSize(500,500);
        mypanel.setBackground(Color.gray);


        myframe.add(mypanel);
        myframe.setLocationRelativeTo(null);
        myframe.setSize(500,500);
        myframe.setResizable(false);
        myframe.setLayout(null);
        myframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myframe.setVisible(true);
    }



}
