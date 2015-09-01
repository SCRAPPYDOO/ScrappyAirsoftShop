/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author User
 */
public final class FileReader {

    private List<Map<String, String>> dostawy = new ArrayList<>();
    private List<Map<String, String>> ewidencja = new ArrayList<>();
    private List<String> listaKodow = new ArrayList();
    private Map<String, Integer> listaTowarow = new HashMap<>();
    private Map<String, Integer> listaEwidencja = new HashMap<>();
    private Path file = null;
    
    
    public FileReader() {
        loadFiles();
        //System.out.println("loadFiles done");
        generateProductCodeList();
        //System.out.println("generateProductCodeList done");
        sumProductIncomes();
        //System.out.println("sumProductIncomes done");
        sumProductOutcomes();
        //System.out.println("sumProductOutcomes done");
    }

    public FileReader(String fileName) {
        file = Paths.get("C:\\Users\\User\\Dysk Google\\Firma\\Sklep\\Ewidencja\\" + fileName + ".csv");
    }
    
    public void loadFiles() {
        
        //Etykiety Rekordow w kolejnosc w jakiej wystepuja w pliku
        List<String> nazwaRekordu = new ArrayList();
        nazwaRekordu.add("ID");
        nazwaRekordu.add("NUMER_DOSTAWY");
        nazwaRekordu.add("NAZWA");
        nazwaRekordu.add("KOD");
        nazwaRekordu.add("ILOSC");
        nazwaRekordu.add("CENA");
        nazwaRekordu.add("RAZEM");
        
        List<String> nazwaRekorduSprzedaz = new ArrayList();
        nazwaRekorduSprzedaz.add("INDEX");
        nazwaRekorduSprzedaz.add("DATA");
        nazwaRekorduSprzedaz.add("SPOSOB_PLATNOSCI");
        nazwaRekorduSprzedaz.add("NUMER_PLATNOSCI");
        nazwaRekorduSprzedaz.add("NICK");
        nazwaRekorduSprzedaz.add("DANE");
        nazwaRekorduSprzedaz.add("KOD");
        nazwaRekorduSprzedaz.add("SPOSOB_KSIEGOWANIA");
        nazwaRekorduSprzedaz.add("STATUS_PLATNOSCI");
        nazwaRekorduSprzedaz.add("CENA_WYSYLKA");
        nazwaRekorduSprzedaz.add("CENA_WYSYLKA_KOSZT");
        nazwaRekorduSprzedaz.add("TYP_WYSYLKI");
        nazwaRekorduSprzedaz.add("ILOSC");
        nazwaRekorduSprzedaz.add("CENA_ZAKUPU");
        nazwaRekorduSprzedaz.add("CENA_SPRZEDAZY");
        nazwaRekorduSprzedaz.add("RABAT");
        nazwaRekorduSprzedaz.add("ALLEGRO");
        //C:\Users\User\Dysk Google\Firma\Sklep\Ewidencja
        
        Path file = Paths.get("C:\\Users\\User\\Dysk Google\\Firma\\Sklep\\Ewidencja\\DOSTAWY.csv");
        try (InputStream in = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if(line.replaceAll(";","").length() > 0) {
                    String[] linePodzielony = line.split(";");

                    Map<String, String> rekord = new HashMap<>();
                    for(int i=0; i<linePodzielony.length; i++) {
                        
                        String klucz = nazwaRekordu.get(i);
                        String wartosc = linePodzielony[i];
                        if(nazwaRekordu.get(i).equals("KOD") || nazwaRekordu.get(i).equals("ILOSC")) {                            
                            klucz = klucz.replaceAll(" ", "");
                            wartosc = wartosc.replaceAll(" ", "");               
                        }
                        rekord.put(klucz, wartosc); 
                    }
                    
                    dostawy.add(rekord);
                }
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        
        //Wczytanie sprzedazy 2015
        Path sprzedazSciezka = Paths.get("C:\\Users\\User\\Dysk Google\\Firma\\Sklep\\Ewidencja\\Ewidencja_2015.csv");
        try (InputStream in = Files.newInputStream(sprzedazSciezka);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if(line.replaceAll(";","").length() > 0) {
                    String[] linePodzielony = line.split(";");
                    //System.out.println(""+linePodzielony[8]); 
                    Map<String, String> rekord = new HashMap<>();
                    for(int i=0; i<linePodzielony.length; i++) {
                        
                        //System.out.println(""+i);        
                        String klucz = nazwaRekorduSprzedaz.get(i);
                        String wartosc = linePodzielony[i];
                        if(klucz.equals("KOD") || klucz.equals("ILOSC")) {                            
                            klucz = klucz.replaceAll(" ", "");
                            wartosc = wartosc.replaceAll(" ", "");
                        }
                        rekord.put(klucz, wartosc);                  
                    }
                    ewidencja.add(rekord);
                    }
                }    
        } catch (IOException x) {
            System.err.println(x);
        }
        
        //Wczytanie sprzedazy 2014
        sprzedazSciezka = Paths.get("C:\\Users\\User\\Dysk Google\\Firma\\Sklep\\Ewidencja\\Ewidencja_2014.csv");
        try (InputStream in = Files.newInputStream(sprzedazSciezka);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);  
                if(line.replaceAll(";","").length() > 0) {
                    String[] linePodzielony = line.split(";");
                    //System.out.println(""+linePodzielony[8]); 
                    Map<String, String> rekord = new HashMap<>();
                    for(int i=0; i<linePodzielony.length; i++) {
                        
                              
                        String klucz = nazwaRekorduSprzedaz.get(i);
                        String wartosc = linePodzielony[i];
                        if(klucz.equals("KOD") || klucz.equals("ILOSC")) {                            
                            klucz = klucz.replaceAll(" ", "");
                            wartosc = wartosc.replaceAll(" ", "");
                        }
                        rekord.put(klucz, wartosc);                  
                    }
                    ewidencja.add(rekord);
                    }
                }    
        } catch (IOException x) {
            System.err.println(x);
        }
    }
    
    public void generateProductCodeList() {
        //MIELENIE
        
        //Generujemy Liste Kodow

        for(int i=0; i<dostawy.size(); i++) {
           
            String kod = dostawy.get(i).get("KOD").toString();

            if(!listaKodow.contains(kod)) {
                listaKodow.add(kod.replaceAll(" ", ""));
                //System.out.println(kod+",");        
            } 
        }  
    }
     
    public void sumProductIncomes() {
        //LICZYMY DOSTAWY
        for(int k=0; k<listaKodow.size(); k++) {
            Map<String, Integer> towar = new HashMap();
            String kod = listaKodow.get(k);
            Integer ilosc = 0;
            for(int d=0; d<dostawy.size(); d++) {
                Map rekordDostawy = dostawy.get(d);
                
                if(kod.equalsIgnoreCase(rekordDostawy.get("KOD").toString())) {
                    ilosc += Integer.parseInt(rekordDostawy.get("ILOSC").toString());                    
                }
            }
           
            listaTowarow.put(kod, ilosc);
        }
    }
        //LICZYMY SPRZEDAZ
    public void sumProductOutcomes() {
        
        for(int k=0; k<listaKodow.size(); k++) {
            String kod = listaKodow.get(k);
            Integer ilosc = 0;
            for(int d=0; d<ewidencja.size(); d++) {
                Map rekordDostawy = ewidencja.get(d);
 
                if(kod.equalsIgnoreCase(rekordDostawy.get("KOD").toString())) {
                    ilosc += Integer.parseInt(rekordDostawy.get("ILOSC").toString());                    
                }
            }
            
            listaEwidencja.put(kod, ilosc);
        }
    }
    
    public String sumProductsActualCounts() {
        String result = "";
        for(int k=0; k<listaKodow.size(); k++) {
            String kod = listaKodow.get(k);
            int ilosc = listaTowarow.get(kod);
            int iloscEwidencja = listaEwidencja.get(kod);
            result += kod + " : " + ilosc + " : " + iloscEwidencja;        
        }
        return result;
    }
        
    public String searchProductIncomesByCode(String productCode) {
        String result = "";
        for(int i=0; i<dostawy.size(); i++) {
            if(dostawy.get(i).get("KOD").toString().toLowerCase().contains(productCode.toLowerCase())) {
                result += dostawy.get(i) + "\n";
            }                
        }
        if(result.compareTo("") != 0) return result; else return "no result";
    }
        
    public String searchProductOutcomesByCode(String productCode) {
        String result = "";
        for(int i=0; i<ewidencja.size(); i++) {
            if(ewidencja.get(i).get("KOD").toString().toLowerCase().contains(productCode.toLowerCase())) {
                result += ewidencja.get(i).get("DATA") + " | " + 
                        ewidencja.get(i).get("DANE") + " | " +
                        ewidencja.get(i).get("SPOSOB_PLATNOSCI") + " | " +
                        ewidencja.get(i).get("KOD") + " | " +
                        ewidencja.get(i).get("NAZWA") + " | " +
                        ewidencja.get(i).get("ILOSC") + " | " +
                        ewidencja.get(i).get("CENA_ZAKUPU") + " | " +
                        ewidencja.get(i).get("CENA_SPRZEDAZY") + " | \n";
            }   
        }
        
        if(result.compareTo("") != 0) return result; else return "no result";
    }   

    public String searchProductOutcomesByName(String surname) {
        String result = "";
        Map<String, String> params = new HashMap<>();
        params.put("TYPE", "DANE");
        params.put("FILTER", surname);
        result += searchProductOutcomesByType(params);
        
        return result;
    }

    /*
        params.put("TYPE", "DANE");
        params.put("FILTER", string);
    */  
    public String searchProductOutcomesByType(Map<String, String> params) {
        String result = "";
        for(int i=0; i<ewidencja.size(); i++) {
            if(ewidencja.get(i).get(params.get("TYPE")).toString().toLowerCase().contains(params.get("FILTER").toLowerCase())) {
                result += ewidencja.get(i).get("DATA") + " | " + 
                        ewidencja.get(i).get("DANE") + " | " +
                        ewidencja.get(i).get("SPOSOB_PLATNOSCI") + " | " +
                        ewidencja.get(i).get("KOD") + " | " +
                        ewidencja.get(i).get("NAZWA") + " | " +
                        ewidencja.get(i).get("ILOSC") + " | " +
                        ewidencja.get(i).get("CENA_ZAKUPU") + " | " +
                        ewidencja.get(i).get("CENA_SPRZEDAZY") + " | \n";
            }   
        }
        
        if(result.compareTo("") != 0) 
            return result; 
        else 
            return "no result";
    }

    public Object[][] getItemData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object[][] getItemDataAsObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void updateDataBaseTable() {
        for(int i=0; i<ewidencja.size(); i++){
            
            String rabat = "" + ewidencja.get(i).get("RABAT").replaceAll(",", ".");
            if(rabat.equals("")) {
                rabat = "0";
            }
            
            String kosztDostawy = "" + ewidencja.get(i).get("CENA_WYSYLKA").replaceAll(",", ".").replaceAll(" ", "");
            if(kosztDostawy.equals("")) {
                kosztDostawy = "0";
            }
            
            String naszKosztWysylki = "" + ewidencja.get(i).get("CENA_WYSYLKA_KOSZT").replaceAll(",", ".").replaceAll(" ", "");
            if(naszKosztWysylki.equals("")) {
                naszKosztWysylki = "0";
            }
               
            String data = ewidencja.get(i).get("DATA").replaceAll("\\.", "-");
            String[] dataTemp = data.split("-");
            System.out.println(dataTemp);
            data = "'" + dataTemp[2] + "-" + dataTemp[1] + "-" + dataTemp[0] + "'";
      
            String sql = "REPLACE INTO `scrappy_shop`.`ewidencja_out`"+
                "(`ID`,"+
                "`DATA_SPRZEDAZY`,"+
                "`TYP_PLATNOSCI`,"+
                "`ID_PLATNOSCI`,"+
                "`ID_KUPUJACY`,"+
                "`KOD_PRODUKTU`,"+
                "`TYP_EWIDENCJI`,"+
                "`STATUS_PLATNOSCI`,"+
                "`KOSZT_DOSTAWY`,"+
                "`TYP_DOSTAWY`,"+
                "`NASZ_KOSZT_DOSTAWY`,"+
                "`ILOSC`,"+
                "`CENA_HURTOWA`,"+
                "`CENA_DETALICZNA`,"+
                "`RABAT`,"+
                "`ALLEGRO`,"+
                "`NICK_KUPUJACY`,"+
                "`DANE_KUPUJACY`"        
                        + ")"+
                "VALUES" +
                "(" +  
                ewidencja.get(i).get("INDEX").replaceAll(" ", "") +","+
                data +","+
                "'" + ewidencja.get(i).get("SPOSOB_PLATNOSCI").replaceAll(" ", "") +"',"+
                "'" + ewidencja.get(i).get("NUMER_PLATNOSCI").replaceAll(" ", "") +"',"+
                ewidencja.get(i).get("") +","+
                "'" + ewidencja.get(i).get("KOD").replaceAll(" ", "") +"',"+
                "'" + ewidencja.get(i).get("SPOSOB_KSIEGOWANIA").replaceAll(" ", "") +"',"+
                "'" + ewidencja.get(i).get("STATUS_PLATNOSCI").replaceAll(" ", "") +"',"+
                kosztDostawy +","+
                "'" + ewidencja.get(i).get("TYP_WYSYLKI").replaceAll(" ", "") +"',"+
                naszKosztWysylki +","+
                ewidencja.get(i).get("ILOSC").replaceAll(" ", "") +","+
                ewidencja.get(i).get("CENA_ZAKUPU").replaceAll(",", ".").replaceAll(" ", "") +","+
                ewidencja.get(i).get("CENA_SPRZEDAZY").replaceAll(",", ".").replaceAll(" ", "") +","+
                rabat +","+
                "'" + ewidencja.get(i).get("ALLEGRO").replaceAll(" ", "") +"',"+
                "'" + ewidencja.get(i).get("NICK").replaceAll(" ", "") +"',"+
                "'" + ewidencja.get(i).get("DANE")+ "'" +
                ");";
            
            System.out.println(sql);
            //SqlConnector.doQuery(sql);
        }
    }
    
    private void updateIncomesTable() {
        for(int i=0; i<dostawy.size(); i++){
            String sql = "REPLACE INTO `scrappy_shop`.`ewidencja_in`\n" +
            "(`ID`," +
            "`ID_ZAMOWIENIA`," +
            "`KOD_PRODUKTU`," +
            "`ILOSC`," +
            "`CENA`," +
            "`RAZEM`)" +
            "VALUES" +  
            "(" +
            dostawy.get(i).get("ID").replaceAll(" ", "") + "," +
            dostawy.get(i).get("NUMER_DOSTAWY").replaceAll(" ", "") + "," +
            "'" + dostawy.get(i).get("KOD").replaceAll(" ", "") + "'," +
            dostawy.get(i).get("ILOSC").replaceAll(" ", "") + "," +
            dostawy.get(i).get("CENA").replaceAll(",", ".").replaceAll(" ", "") + "," +
            dostawy.get(i).get("RAZEM").replaceAll(",", ".").replaceAll(" ", "") + ");";
            
            System.out.println(sql);
            //SqlConnector.doQuery(sql);     
        }
          
    }

    public List<List<String>> getData() {
        List<List<String>> data = new ArrayList();
        try (InputStream in = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            String line;

            while ((line = reader.readLine()) != null) {
                List<String> lineList = new ArrayList();
                if(line.replaceAll(";","").length() > 0) {
                    String[] linePodzielony = line.split(";");
                    lineList.addAll(Arrays.asList(linePodzielony));
                }
                
                data.add(lineList);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        
        return data;
    }
}

