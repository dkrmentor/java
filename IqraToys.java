

public interface IqraToys {
    public void movingforward();

    public void movingbackward();

    public void turningRight();

    public void turningLeft();

    public void makingNoise();

    public void ssize();

    public void cl();

    public void other();
}

class CarToy implements IqraToys {
    public void movingforward() {
        System.out.println("moving forward");

    }

    public void movingbackward() {
        System.out.println("moving backward");
    }

    public void turningRight() {
        System.out.println("turning right");
    }

    public void turningLeft() {
        System.out.println("turning left");
    }

    public void makingNoise() {
        System.out.println("car noise");
    }

    public void ssize() {
        System.out.println("Car size");
    }

    public void cl() {
        System.out.println("call out their names");
    }

    public void other() {
        System.out.println("some other functions may be implemented");
    }

}

class Dinosaour implements IqraToys {
    public void movingforward() {
        System.out.println("moving forward");

    }

    public void movingbackward() {
        System.out.println("moving backward");
    }

    public void turningRight() {
        System.out.println("turning right");
    }

    public void turningLeft() {
        System.out.println("turning left");
    }

    public void makingNoise() {
        System.out.println("Dinosaour noise");
    }

    public void ssize() {
        System.out.println("Dinosaour size");
    }

    public void cl() {
        System.out.println("call out their names");
    }

    public void other() {
        System.out.println("some other functions may be implemented");
    }

}

class TruckToy implements IqraToys {
    public void movingforward() {
        System.out.println("moving forward");
    }

    public void movingbackward() {
        System.out.println("moving backward");
    }

    public void turningRight() {
        System.out.println("turning right");
    }

    public void turningLeft() {
        System.out.println("turning left");
    }

    public void makingNoise() {
        System.out.println("Truck noise");
    }

    public void ssize() {
        System.out.println("Truck size");
    }

    public void cl() {
        System.out.println("call out their names");
    }

    public void other() {
        System.out.println("some other functions may be implemented");
    }

}

class CraneToy implements IqraToys {
    public void movingforward() {
        System.out.println("moving forward");
    }

    public void movingbackward() {
        System.out.println("moving backward");
    }

    public void turningRight() {
        System.out.println("turning right");
    }

    public void turningLeft() {
        System.out.println("turning left");
    }

    public void makingNoise() {
        System.out.println("Crane noise");
    }

    public void ssize() {
        System.out.println("Crane size");
    }

    public void cl() {
        System.out.println("call out their names");
    }

    public void other() {
        System.out.println("some other functions may be implemented");
    }

}

class RemoteClass {
    public static void main(String[] args) {
        CarToy cr = new CarToy();
        cr.movingforward();
        cr.movingbackward();
        cr.turningRight();
        cr.turningLeft();
        cr.makingNoise();
        cr.ssize();
        cr.cl();
        cr.other();

        System.out.println("");

        Dinosaour d = new Dinosaour();
        d.movingforward();
        d.movingbackward();
        d.turningRight();
        d.turningLeft();
        d.makingNoise();
        d.ssize();
        d.cl();
        d.other();

        System.out.println("");

        TruckToy t = new TruckToy();
        t.movingforward();
        t.movingbackward();
        t.turningRight();
        t.turningLeft();
        t.makingNoise();
        t.ssize();
        t.cl();
        t.other();

        System.out.println("");

        CraneToy c = new CraneToy();
        c.movingforward();
        c.movingbackward();
        c.turningRight();
        c.turningLeft();
        c.makingNoise();
        c.ssize();
        c.cl();
        c.other();

        System.out.println("");

    }

}
