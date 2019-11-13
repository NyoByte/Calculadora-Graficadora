package Main;

import java.util.StringTokenizer;

/**
 *
 * @author Nyo
 */
class Conversión {
    Pila signo, resultado;
    Cola expresion, postfija;
    String cad;

    public Conversión() {
        expresion = new Cola();
        postfija = new Cola();
        signo = new Pila();
        resultado = new Pila();
    }

    private void CargarToken() {
        StringTokenizer token = new StringTokenizer(cad, " ^+*-/()", true);
        while (token.hasMoreElements()) {
            String t = token.nextToken();
            expresion.Encolar(t);
        }
    }

    public void setExpresion(String cad) {
        this.cad = cad;
        CargarToken();
    }

    public String getExpresion() {
        return cad;
    }

    public void aPostfija() {
        String token;
        Averiguar();
        while (!expresion.esVacia()) {
            token = (String)expresion.DesEncolar();
            if (esNumero(token)){
                postfija.Encolar(token);
            }else if (token.equals("(")){
                signo.Apilar(token);
            }else if (token.equals(")")) {
                while (!signo.esVacia() && (!signo.Cima().equals("("))) {
                    token = (String)signo.Desapilar();
                    postfija.Encolar(token);
                }
                signo.Desapilar();// Aquí se saca paréntesis
            }else {
                while ((!signo.esVacia()) && (prescedencia(token) <= prescedencia((String)signo.Cima())) & (!token.equals("("))) {
                    String tok1 = (String)signo.Desapilar();
                    postfija.Encolar(tok1);
                }
                signo.Apilar(token);
            }
        }
        while (!signo.esVacia()) {
            token = (String)signo.Desapilar();
            postfija.Encolar(token);
        }
    }

    public double Valor() {
        String tok;
        aPostfija();
        while (!postfija.esVacia()) {
            tok = (String)postfija.DesEncolar();
            if (esNumero(tok)){
                resultado.Apilar(tok);
            }else {
                String num2 = (String)resultado.Desapilar();
                String num1 = (String)resultado.Desapilar();
                String r = Operar(Double.parseDouble(num1), Double.parseDouble(num2), tok.charAt(0));
                resultado.Apilar(r);
            }
        }
        return Double.parseDouble((String)resultado.Desapilar());
    }

    public String Operar(double num1, double num2, char o) {
        double valor = num1;
        switch (o) {
            case '+':
                valor += num2;
                break;
            case '-':
                valor -= num2;
                break;
            case '*':
                valor *= num2;
                break;
            case '/':
                valor /= num2;
                break;
            case '^':
                valor = Math.pow(num1, num2);
                break;       
        }
        return String.valueOf(valor);
    }

    private boolean esNumero(String num) {
        try {
            Double.parseDouble(num);
            return true;
        }catch (java.lang.NumberFormatException e) {
             return false;
        }
    }

    private void Averiguar() {
        String v[] = new String[expresion.Longitud()];
        for (int i = 0; i < v.length; i++) {
            v[i] = (String)expresion.DesEncolar();
        }
        int i = 0;
        if (v[i].equals("-") && (esNumero(v[i + 1]))) {
            v[i + 1] = "-" + v[i + 1];
            i = 1;
        }
        while (i < v.length - 1) {
            if ((!esNumero(v[i])) && (!v[i].equals(")")) && (v[i + 1].equals("-"))) {
               expresion.Encolar(v[i]);
               v[i + 2] = "-" + v[i + 2];
               i++;
            }else if (esNumero(v[i]) && (v[i + 1].equals("("))) {
               expresion.Encolar(v[i]);
               expresion.Encolar("*");
            }else if (v[i].equals(")") && (v[i + 1].equals("("))) {
               expresion.Encolar(v[i]);
               expresion.Encolar("*");
            }else {
               expresion.Encolar(v[i]);
            }
            i++;
        }
        expresion.Encolar(v[i]);
    }

    private int prescedencia(String op) {
        int valor = 0;
        if (op.equals("+"))
            valor = 1;
        if (op.equals("-"))
            valor = 1;
        if (op.equals("*"))
            valor = 2;
        if (op.equals("/"))
            valor = 2;
        if (op.equals("^"))
            valor = 3;
        return valor;
    }

    //Probar conversión
    /*public static void main(String arg[]) {
        Conversión ref = new Conversión();
        String prueba = "12,(3)"; //Probar 
        ref.setExpresion(prueba);
        System.out.println(ref.Valor());
    }*/
}
