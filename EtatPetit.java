public class EtatPetit implements MarioState {
    private Mario mario;

    public EtatPetit(Mario mario) {
        this.mario = mario;
    }

    @Override
    public void seDeplacer() {
        System.out.println("Mario petit se déplace lentement.");
    }

    @Override
    public void interagirAvecEnnemi() {
        System.out.println("Mario petit est touché et perd une vie !");
        mario.perdreVie();
    }
}