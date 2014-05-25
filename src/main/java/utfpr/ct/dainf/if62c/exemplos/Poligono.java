package utfpr.ct.dainf.if62c.exemplos;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de classe abstrata em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public abstract class Poligono {
    
    /**
     * Retorna o nome da figura.
     * Este método retorno o nome não qualificado da classe.
     * @return O nome da figura.
     */
    public String getNome() {
        return this.getClass().getSimpleName();
    }
    
    public abstract double getPerimetro();
    public abstract double getArea();

    @Override
    public String toString() {
        return getNome();
    }
    
}
