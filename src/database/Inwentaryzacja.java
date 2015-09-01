/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import gui.items.ItemsInStruct;
import database.databaseStruct.TableStructInterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import sqlconnector.SqlConnector;

/**
 *
 * @author User
 */
public class Inwentaryzacja {

    public static void getProductAmount() {
        Map<String, Object> map = new HashMap();
        map.put("GFOIL".replaceAll(" ", ""),	1	);
        map.put("G-07-154".replaceAll(" ", ""),	1	);
        map.put("G-07-134".replaceAll(" ", ""),	3	);
        map.put("GFR-BUT-25".replaceAll(" ", ""),	8	);
        map.put("MB01-OLV".replaceAll(" ", ""),	1	);
        map.put("SYS-ZS0701".replaceAll(" ", ""),	5	);
        map.put("MAS-28-DWL".replaceAll(" ", ""),	1	);
        map.put("HLM-27-TAN".replaceAll(" ", ""),	1	);
        map.put("G-07-135".replaceAll(" ", ""),	1	);
        map.put("HDR-SCT-BLK_M".replaceAll(" ", ""),	6	);
        map.put("HDR-SCT-OD_S".replaceAll(" ", ""),	1	);
        map.put("GFR-PLAT-01".replaceAll(" ", ""),	1	);
        map.put("MAS-26-BLK".replaceAll(" ", ""),	1	);
        map.put("POK-10-BLK".replaceAll(" ", ""),	2	);
        map.put("HLM-05-BLK".replaceAll(" ", ""),	1	);
        map.put("G-07-096 ".replaceAll(" ", ""),	2	);
        map.put("LAD-15-COY".replaceAll(" ", ""),	2	);
        map.put("LAD-15-BLK".replaceAll(" ", ""),	1	);
        map.put("HDR-SCT-TAN_L".replaceAll(" ", ""),	3	);
        map.put("LAD-08-OLV".replaceAll(" ", ""),	2	);
        map.put("GRIP-10-TAN".replaceAll(" ", ""),	3	);
        map.put("TB-498".replaceAll(" ", ""),	2	);
        map.put("SLI-07-BLK".replaceAll(" ", ""),	5	);
        map.put("AC-AKC-05".replaceAll(" ", ""),	2	);
        map.put("SLI-03-BLK".replaceAll(" ", ""),	2	);
        map.put("SLI-03-OLV".replaceAll(" ", ""),	5	);
        map.put("AAT232".replaceAll(" ", ""),	21	);
        map.put("AC-AKC-06".replaceAll(" ", ""),	2	);
        map.put("CHWYT-MP5-TAN".replaceAll(" ", ""),	4	);
        map.put("UVEX-11".replaceAll(" ", ""),	1	);
        map.put("LAD-24-OLV".replaceAll(" ", ""),	2	);
        map.put("LAD-26-OLV".replaceAll(" ", ""),	1	);
        map.put("TB-123".replaceAll(" ", ""),	8	);
        map.put("TB-30".replaceAll(" ", ""),	1	);
        map.put("TB-504".replaceAll(" ", ""),	2	);
        map.put("TB-505".replaceAll(" ", ""),	1	);
        map.put("TB-507".replaceAll(" ", ""),	2	);
        map.put("HDR-ACC-TAN_L".replaceAll(" ", ""),	1	);
        map.put("SIL-002".replaceAll(" ", ""),	1	);
        map.put("SIL-030".replaceAll(" ", ""),	1	);
        map.put("SIL-036".replaceAll(" ", ""),	3	);
        map.put("SIL-041".replaceAll(" ", ""),	2	);
        map.put("SIL-046".replaceAll(" ", ""),	2	);
        map.put("TAC-AKC-01-OLV".replaceAll(" ", ""),	7	);
        map.put("TAC-AKC-01-TAN".replaceAll(" ", ""),	5	);
        map.put("AK-MAG-SR25".replaceAll(" ", ""),	1	);
        map.put("HLM-05-TAN".replaceAll(" ", ""),	1	);
        map.put("MAG-SVD-HI".replaceAll(" ", ""),	1	);
        map.put("C95".replaceAll(" ", ""),	1	);
        map.put("LAD-23-OLV".replaceAll(" ", ""),	1	);
        map.put("LAD-23-TAN".replaceAll(" ", ""),	2	);
        map.put("TB-406".replaceAll(" ", ""),	2	);
        map.put("TB-419".replaceAll(" ", ""),	1	);
        map.put("MAG-GFC-013-BLK".replaceAll(" ", ""),	3	);
        map.put("MAG-GFC-016-BLK".replaceAll(" ", ""),	1	);
        map.put("A-X025".replaceAll(" ", ""),	2	);
        map.put("GFT-SPR-M150".replaceAll(" ", ""),	1	);
        map.put("TB-779".replaceAll(" ", ""),	5	);
        map.put("SLI-03-OLV".replaceAll(" ", ""),	2	);
        map.put("SLI-04-OLV".replaceAll(" ", ""),	2	);
        map.put("SLI-04-BLK".replaceAll(" ", ""),	6	);
        map.put("POK-06-OLV".replaceAll(" ", ""),	1	);
        map.put("TB-232".replaceAll(" ", ""),	1	);
        map.put("TB-275".replaceAll(" ", ""),	1	);
        map.put("JG-M-162".replaceAll(" ", ""),	2	);
        map.put("SLI-20-OLV".replaceAll(" ", ""),	1	);
        map.put("TB-776".replaceAll(" ", ""),	1	);
        map.put("TB-777".replaceAll(" ", ""),	2	);
        map.put("SLI-04-OLV".replaceAll(" ", ""),	7	);
        map.put("PAS-11-OLV".replaceAll(" ", ""),	2	);
        map.put("M0150".replaceAll(" ", ""),	2	);
        map.put("MAS-26-DST".replaceAll(" ", ""),	1	);
        map.put("HLM-26-TAN".replaceAll(" ", ""),	4	);
        map.put("WM201420".replaceAll(" ", ""),	2	);
        map.put("TB-779".replaceAll(" ", ""),	1	);
        map.put("TB-781".replaceAll(" ", ""),	1	);
        map.put("ASP-365".replaceAll(" ", ""),	1	);
        map.put("GD-030-1000".replaceAll(" ", ""),	1	);
        map.put("GFR40".replaceAll(" ", ""),	4	);
        map.put("GFR41".replaceAll(" ", ""),	19	);
        map.put("MAG-GFC-012-TAN".replaceAll(" ", ""),	2	);
        map.put("UTL-AKC-16-BLK".replaceAll(" ", ""),	1	);
        map.put("PAR-01-TAN".replaceAll(" ", ""),	2	);
        map.put("SLI-04-KHA".replaceAll(" ", ""),	2	);
        map.put("POK-05-OLV".replaceAll(" ", ""),	1	);
        map.put("MAG-AK-350-BLK".replaceAll(" ", ""),	2	);
        map.put("G-10-061".replaceAll(" ", ""),	1	);
        map.put("SLI-35-BLK".replaceAll(" ", ""),	2	);
        map.put("SLI-35-OLV".replaceAll(" ", ""),	1	);
        map.put("SLI-35-TAN".replaceAll(" ", ""),	2	);
        map.put("SLI-36-BLK".replaceAll(" ", ""),	2	);
        map.put("SLI-36-OLV".replaceAll(" ", ""),	2	);
        map.put("SLI-36-TAN".replaceAll(" ", ""),	1	);
        map.put("SLI-38-BLK".replaceAll(" ", ""),	2	);
        map.put("SLI-38-OLV".replaceAll(" ", ""),	1	);
        map.put("UTL-OCH-01-TAN".replaceAll(" ", ""),	1	);
        map.put("UTL-OCH-02-OLV".replaceAll(" ", ""),	1	);
        map.put("UTL-OCH-02-TAN".replaceAll(" ", ""),	1	);
        map.put("TB-775".replaceAll(" ", ""),	3	);
        map.put("C39".replaceAll(" ", ""),	1	);
        map.put("WM201154".replaceAll(" ", ""),	1	);
        map.put("GlowST-yellow".replaceAll(" ", ""),	18	);
        map.put("GlowST-blue".replaceAll(" ", ""),	10	);
        map.put("R-C111".replaceAll(" ", ""),	1	);
        map.put("LAD-22-TAN".replaceAll(" ", ""),	1	);
        map.put("GFR09".replaceAll(" ", ""),	9	);
        map.put("AC99178".replaceAll(" ", ""),	2	);
        map.put("MAG-GFC-402".replaceAll(" ", ""),	2	);
        map.put("TB-57".replaceAll(" ", ""),	4	);
        map.put("POK-05-BLK".replaceAll(" ", ""),	4	);
        map.put("POK-05-OLV".replaceAll(" ", ""),	1	);
        map.put("GFR-PLAT-04".replaceAll(" ", ""),	2	);
        map.put("TB-861".replaceAll(" ", ""),	1	);
        map.put("GFR03".replaceAll(" ", ""),	12	);
        map.put("GFR01".replaceAll(" ", ""),	1	);
        map.put("TH1006".replaceAll(" ", ""),	2	);
        map.put("TH1021".replaceAll(" ", ""),	2	);
        map.put("TH1008".replaceAll(" ", ""),	2	);
        map.put("TH1009".replaceAll(" ", ""),	2	);
        map.put("T-T0030".replaceAll(" ", ""),	2	);
        map.put("T-T0086".replaceAll(" ", ""),	2	);
        map.put("CAP-102-BLK".replaceAll(" ", ""),	1	);
        map.put("AC99323-BLK".replaceAll(" ", ""),	2	);
        map.put("AC99324-BLK".replaceAll(" ", ""),	2	);
        map.put("AC99325-BLK".replaceAll(" ", ""),	2	);
        map.put("AC99086".replaceAll(" ", ""),	2	);
        map.put("AA90".replaceAll(" ", ""),	2	);
        map.put("AA94".replaceAll(" ", ""),	4	);
        map.put("AA111".replaceAll(" ", ""),	3	);
        map.put("LAD-20-OLV".replaceAll(" ", ""),	3	);
        map.put("QS-GQ2119NBF".replaceAll(" ", ""),	10	);
        map.put("nabojco2-crosman".replaceAll(" ", ""),	50	);
        map.put("WTYK-0".replaceAll(" ", ""),	20	);
        map.put("GFR-PLAT-HG-45".replaceAll(" ", ""),	3	);
        map.put("GFR-PLAT-HG-43".replaceAll(" ", ""),	3	);
        map.put("GFR-PLAT-HG-40".replaceAll(" ", ""),	7	);
        map.put("GFR-PLAT-HG-36".replaceAll(" ", ""),	5	);
        map.put("GFR-PLAT-BUT-30".replaceAll(" ", ""),	6	);
        map.put("GFR-PLAT-BUT-28".replaceAll(" ", ""),	4	);
        map.put("GFR-PLAT-BUT-25".replaceAll(" ", ""),	2	);
        map.put("TH1010".replaceAll(" ", ""),	2	);
        map.put("TB-05".replaceAll(" ", ""),	4	);
        map.put("TB-06".replaceAll(" ", ""),	4	);
        map.put("TB-07".replaceAll(" ", ""),	2	);
        map.put("TB-08".replaceAll(" ", ""),	2	);
        map.put("M-8-BLK".replaceAll(" ", ""),	2	);
        map.put("11832".replaceAll(" ", ""),	2	);
        map.put("10967".replaceAll(" ", ""),	2	);
        map.put("6014".replaceAll(" ", ""),	2	);
        map.put("8076".replaceAll(" ", ""),	1	);
        map.put("8450".replaceAll(" ", ""),	1	);
                        
        for(Entry<String, Object> entry : map.entrySet()) {  
            
            //daj id dla  kazdego keya
            String sql1 = "SELECT ID FROM ewidencja_in WHERE KOD_PRODUKTU = '" + entry.getKey() + "' ORDER BY ID DESC LIMIT 1";
            TableStructInterface[] columnList = { ItemsInStruct.ITEM_ID };
            Object[][] result = SqlConnector.doSelectQueryAsObject(sql1, columnList, 1);
                    
            String sql = "UPDATE ewidencja_in SET INWENTARYZACJA = " + entry.getValue() + " WHERE ID = " + result[0][0];    
            SqlConnector.doUpdateQuery(sql);
        }
    }
}
