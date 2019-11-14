package Main;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Grafica {
    private JFreeChart grafica;
    private XYSeriesCollection datos = new XYSeriesCollection();
    private String titulo, etiquetax, etiquetay;

    public Grafica(String t, String x, String y) {
        this.titulo = t;
        this.etiquetax = x;
        this.etiquetay = y;
        this.grafica = ChartFactory.createXYLineChart(titulo, x, y, datos, PlotOrientation.VERTICAL, true, true, true);
    }

    public Grafica() {
        this("sin titulo", "x", "y");
    }

    public void AgregarGrafica(String id, double[] x, double[] y) {
        XYSeries s = new XYSeries(id);
        int n = x.length;
        for (int i = 0; i < n; i++) {
            s.add(x[i], y[i]);
        }
        datos.addSeries(s);
    }

    public void CrearGrafica(String id, double[] x, double[] y) {
        datos.removeAllSeries();
        AgregarGrafica(id, x, y);
    }

    public JPanel obtieneGrafica() {
        return new ChartPanel(grafica);
    }
}
