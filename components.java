
import uk.co.caprica.vlcj.player.base.MediaPlayer;
import uk.co.caprica.vlcj.player.component.AudioPlayerComponent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


abstract class components implements ActionListener {
    File myfile = new File ("C:\\Users\\prophesaw\\Music");
    String[] newfile = myfile.list();
    File[] filepath = myfile.listFiles();
    JLabel label = new JLabel("playing music");
    JFrame myframe = new JFrame("Prophesaw's Music Player");
    JPanel mypanel = new JPanel();
    JButton play = new JButton("play");
    JButton next = new JButton("next");
    JButton prev = new JButton("prev");
    JList list = new JList(newfile);
    JScrollPane scroll = new JScrollPane(list);
    JScrollBar  verticalScrollBar = new JScrollBar();
    AudioPlayerComponent audioPlayerComponent = new AudioPlayerComponent(){
        @Override
        public void finished(MediaPlayer mediaPlayer){
            System.out.println("music end");
            //count+=1;

        }
    };
    int count = 0;
    boolean state = false;

    public void audioload(int scount) {
        String path = filepath[scount].getPath();
        audioPlayerComponent.mediaPlayer().media().startPaused(path);
        audioPlayerComponent.mediaPlayer().controls().
        play();
        scount++;
    }


  public void play(){
        audioPlayerComponent.mediaPlayer().controls().play();
    }


    public void next(){
        do{
            String path = filepath[count].getPath();
            audioPlayerComponent.mediaPlayer().media().startPaused(path);
            play();
            count+=1;
        }while (count== filepath.length);

    }

    public void prev(){
        do{
            String path = filepath[count].getPath();
            audioPlayerComponent.mediaPlayer().media().startPaused(path);
            play();
            count-=2;
        }while (count>1);
    }
    public  void pause(){
        audioPlayerComponent.mediaPlayer().controls().pause();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==play){
            if(state==false){
              state=true;
             audioload(count);


            }else{
                state=false;
                pause();
            }


        }

    }

}


