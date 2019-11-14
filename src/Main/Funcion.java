package Main;

import com.bestcode.mathparser.IMathParser;
import com.bestcode.mathparser.MathParserFactory;

public class Funcion {
    private String definicion;
    private IMathParser Parser = MathParserFactory.create();

    public Funcion(String definicion){
        this.definicion = definicion;
        this.Parser.setExpression(definicion);
    }

    public double Eval(double x) throws Exception {
        double r = Double.NaN;
        Parser.setX(x);
        r = Parser.getValue();
        return r;
    }

    public double[] Eval(double[] x) throws Exception {
        int n = x.length;
        double[] r = new double[n];
        for (int i=0; i<n; i++) {
            r[i] = Funcion.this.Eval(x[i]);
        }
        return r;
    }

    public double[] Rango(double x0, double xn, double d) {
        int n = (int) (Math.abs(xn - x0) / d);
        double[] r = new double[n];
        for (int i=0; i<n; i++) {
            r[i] = x0;
            x0 += d;
        }
        return r;
    }
}
