package Midi;

import javax.sound.midi.*;

public class MiniMusicApp {
    public static void main(String[] args) {
        MiniMusicApp min = new MiniMusicApp();
        min.play();
    }

    public void play() {
        try {
            //Получаем синтезатор и открываем его пото му - что по умолчанию он закрыт
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            //ХЗ Последовательность?
            Sequence seq = new Sequence(Sequence.PPQ, 4);

            //Запрашивае трек у последовательности
            Track track = seq.createTrack();

            //Midi события
            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,44,127);
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,44,127);
            MidiEvent noteOff = new MidiEvent(b,32);
            track.add(noteOff);

            //передаем последовательность синтезатору
            player.setSequence(seq);

            //Запуск проигрывания
            player.start();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
