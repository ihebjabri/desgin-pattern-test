public class EtatInvincible implements MarioState {
    private Mario mario;

    public EtatInvincible(Mario mario) {
        this.mario = mario;
    }

    @Override
    public void seDeplacer() {
        System.out.println("Mario invincible se déplace à toute allure !");
    }

    @Override
    public void interagirAvecEnnemi() {
        System.out.println("Mario invincible détruit l'ennemi !");
    }
}