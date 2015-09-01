/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.reports;

/**
 *
 * @author User
 */
public enum SaleSummaryTableStruct {
    ROK,
    STYCZEÑ,
    LUTY,
    MARZEC,
    KWIECIEÑ,
    MAJ,
    CZERWIEC,
    LIPIEC,
    SIERPNIEÑ,
    WRZESIEÑ,
    PADZIERNIK,
    LISTOPAD,
    GRUDZIEÑ;
    
    public static String getSaleSummaryColumnName(int i) {
        return SaleSummaryTableStruct.values()[i].toString();
    }
}
