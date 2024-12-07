public class DecorateurFleurFeu extends MarioDecorator {

    public DecorateurFleurFeu(Mario mario) {
        super(mario);
    }

    @Override
    public void sauter() {
        System.out.println("Mario avec Fleur de Feu saute avec puissance !");
    }

    @Override
    public void courir() {
        System.out.println("Mario avec Fleur de Feu court et tire des boules de feu !");
    }
}