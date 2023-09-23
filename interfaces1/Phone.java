package interfaces1;

public class Phone {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        // sp.videocall();
        // sp.call();
        // sp.click();
        // sp.sms();
        mobile ph = sp;
        ph.call();
        ph.sms();
        camera c = sp;
        c.click();
        c.record();
        musicplayer mp = sp;
        mp.play();
        mp.pause();
        mp.stop();

    }
}

class mobile {
    void call() {
        System.out.println("He is busy don't call");
    }

    void sms() {
        System.out.println("Can't talk now . Call me later?");
    }
}

interface camera {
    void click();

    void record();
}

interface musicplayer {
    void play();

    void pause();

    void stop();
}

class SmartPhone extends mobile implements camera, musicplayer {

    void videocall() {
        System.out.println("Face to face");
    }

    @Override
    public void click() {
        System.out.println("Touch on camera button to take picture");
    }

    @Override
    public void record() {
        System.out.println("Touch on record button to video");
    }

    @Override
    public void play() {
        System.out.println("Touch on play button to play music");
    }

    @Override
    public void pause() {
        System.out.println("Touch on pause button to pause");
    }

    @Override
    public void stop() {
        System.out.println("Touch on stop button to stop music");
    }
}
