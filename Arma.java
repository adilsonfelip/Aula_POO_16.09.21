package sextoprojeto;

public abstract class Arma implements Comparable<Arma> {

    protected double destruicao;

    public void golpear() {
        this.destruicao -= 0.5;
    }

    public double getDestruicao() {
        return destruicao;
    }

    @Override
    public int compareTo(Arma arma) {
        return (int) (arma.getDestruicao() - this.destruicao);
    }

}
