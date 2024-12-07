public class EtatNormal implements MarioState {
    private Mario mario;

    public EtatNormal(Mario mario) {
        this.mario = mario;
    }

    @Override
    public void seDeplacer() {
        System.out.println("Mario normal se déplace à une vitesse moyenne.");
    }

    @Override
    public void interagirAvecEnnemi() {
        System.out.println("Mario normal réagit normalement à l'ennemi.");
    }
}