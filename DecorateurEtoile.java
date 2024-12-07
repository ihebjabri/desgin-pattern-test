
public class DecorateurEtoile extends MarioDecorator {

    public DecorateurEtoile(Mario mario) {
        super(mario);
    }

    @Override
    public void sauter() {
        System.out.println("Mario avec l'Étoile saute et brille !");
    }

    @Override
    public void courir() {
        System.out.println("Mario avec l'Étoile est invincible en courant !");
    }
}
