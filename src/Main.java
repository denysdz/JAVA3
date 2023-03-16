
interface Vessel1 {
    void PrepareToMovement();
    void Move();
}

class SailingVessel1 implements Vessel1 {
    @Override
    public void PrepareToMovement() {
        System.out.println("Підготовка вітрильника до руху");
    }

    @Override
    public void Move() {
        System.out.println("Вітрильник рухається");
    }
}

class Submarine1 implements Vessel1 {
    @Override
    public void PrepareToMovement() {
        System.out.println("Підготовка підводного човна до руху");
    }

    @Override
    public void Move() {
        System.out.println("Підводний човен рухається");
    }
}

abstract class Vessel2 {
    public abstract void PrepareToMovement();
    public abstract void Move();
}

class SailingVessel2 extends Vessel2 {
    @Override
    public void PrepareToMovement() {
        System.out.println("Підготовка вітрильника до руху");
    }

    @Override
    public void Move() {
        System.out.println("Вітрильник рухається");
    }
}

class Submarine2 extends Vessel2 {
    @Override
    public void PrepareToMovement() {
        System.out.println("Підготовка підводного човна до руху");
    }

    @Override
    public void Move() {
        System.out.println("Підводний човен рухається");
    }
}

public class Main {
    public static void main(String[] args) {
        //За допомогою інтерфейсу
        Vessel1 v1 = new SailingVessel1();
        Vessel1 v2 = new Submarine1();

        v1.PrepareToMovement();
        v1.Move();

        v2.PrepareToMovement();
        v2.Move();

        //За допомогою абстрактного класу
        SailingVessel2 v3 = new SailingVessel2();
        Submarine2 v4 = new Submarine2();

        v3.PrepareToMovement();
        v3.Move();

        v4.PrepareToMovement();
        v4.Move();
    }
}