
public abstract class MarioDecorator extends Mario {
    protected Mario mario;

    public MarioDecorator(Mario mario) {
        super(mario.taille, mario.vies, mario.state);
        this.mario = mario;
    }

    @Override
    public void sauter() {
        mario.sauter();
    }

    @Override
    public void courir() {
        mario.courir();
    }
}

