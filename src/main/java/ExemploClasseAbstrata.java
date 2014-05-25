
import utfpr.ct.dainf.if62c.exemplos.Quadrado;
import utfpr.ct.dainf.if62c.exemplos.Retangulo;
import utfpr.ct.dainf.if62c.exemplos.TrianguloEquilatero;

/**
 * IF62C Fundamentos de Programação 2
 * Exercício de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */public class ExemploClasseAbstrata 
{
    public static void main( String[] args )
    {
        Retangulo r = new Retangulo(4, 2);
        Quadrado q = new Quadrado(4);
        TrianguloEquilatero te = new TrianguloEquilatero(4);
        
        System.out.println("Area de " + r + " = " + r.getArea());
        System.out.println("Perímetro de " + r + " = " + r.getPerimetro());
        System.out.println("Area de " + q + " = " + q.getArea());
        System.out.println("Perímetro de " + q + " = " + q.getPerimetro());
        System.out.println("Area de " + te + " = " + te.getArea());
        System.out.println("Perímetro de " + te + " = " + te.getPerimetro());
    }
}
