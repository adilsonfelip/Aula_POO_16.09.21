package sextoprojeto;

public class Revolver extends Arma implements Disparavel {

    private int cartucho;

    public Revolver() {
        this.cartucho = 6;
        this.destruicao = 5;
    }

    @Override
    public void recarregar() {
        this.cartucho = 6;

    }

    @Override
    public void disparar() {
        this.cartucho -= 1;
        if (this.cartucho <= 0) {
            this.cartucho = 0;
        }
    }

    @Override

    public String toString() {

        return "Cartuchos: " + this.cartucho + " Destruicao: " + this.destruicao;
    }
}
