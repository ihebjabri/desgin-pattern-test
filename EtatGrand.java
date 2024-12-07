public class EtatGrand implements MarioState {
    private Mario mario;

    public EtatGrand(Mario mario) {
        this.mario = mario;
    }

    @Override
    public void seDeplacer() {
        System.out.println("Mario grand se déplace rapidement.");
    }

    @Override
    public void interagirAvecEnnemi() {
        System.out.println("Mario grand rétrécit après un contact avec l'ennemi !");
        mario.changerEtat(new EtatNormal(mario));
    }
}