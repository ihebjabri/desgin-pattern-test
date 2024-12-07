public class DecorateurChampion extends MarioDecorator {

    public DecorateurChampion(Mario mario) {
        super(mario);
    }

    @Override
    public void sauter() {
        System.out.println("Mario Champion saute très haut !");
    }

    @Override
    public void courir() {
        System.out.println("Mario Champion court très vite !");
    }
}
