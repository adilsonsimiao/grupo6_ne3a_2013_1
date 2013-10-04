/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorio;

import Dao.DBConnection;
import View.JFrameReport;
import java.net.URL;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author fabio
 */
public class GerarRelatorio {

    public void GerarRelatorio() throws JRException {
        JasperReport pathjrxml = JasperCompileManager.compileReport("relatorioUsuario.jasper");
        JasperPrint printReport = JasperFillManager.fillReport(pathjrxml, null);
        JasperExportManager.exportReportToPdfFile(printReport, "relatorioUsuario.pdf");
    }
     public void relatorioEmJFrame() throws JRException {
        try {
            URL arquivo = getClass().getResource("relatorioUsuarioLivro.jasper");

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap(), DBConnection.getConnection());
            JasperViewer jrviewer = new JasperViewer(jasperPrint, true);
            JFrameReport frame = new JFrameReport();
            frame.getjPanelReport().add(jrviewer.getContentPane());
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e);
        }
    }
}
