/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package postoffice;

/**
 *
 * @author User
 */
public enum PackageType {
    KENES,
    LE,
    LE_A_350,
    LE_A_500,
    LE_A_1000,
    LE_B_350,
    LE_B_500,
    LE_B_1000,
    LE_B_2000,
    LP,
    LP_A_350,
    LP_A_500,
    LP_A_1000,
    LP_B_350,
    LP_B_500,
    LP_B_1000,
    P48_XS,
    P48_S,
    P48_M,
    P48_L,
    P48_XL,
    P48_XXL,
    P48P_XS,
    P48P_S,
    P48P_M,
    P48P_L,
    P48P_XL,
    P48P_XXL,
    P48_ODBIOR_XS,   
    P48_ODBIOR_S,
    P48_ODBIOR_M,
    P48_ODBIOR_L,
    P48_ODBIOR_XL,
    P48_ODBIOR_XXL,
    P48P_ODBIOR_XS,
    P48P_ODBIOR_S,
    P48P_ODBIOR_M,
    P48P_ODBIOR_L,
    P48P_ODBIOR_XL,
    P48P_ODBIOR_XXL,
    ODBIOR_OSOBISTY;

    
    
    public static String getPackageCost(PackageType packageType) {
        String cost = "0.0";
        switch(packageType) {
            //LIST EKONOMICZNY
            case LE_A_350: cost = "4.2"; break;
            //case LE_A_500: cost = "8.3"; break;
            //case LE_A_1000: cost = "7.3"; break;
            case LE_B_350: cost = "7.5"; break;
            case LE_B_500: cost = "8.3"; break;                
            case LE_B_1000: cost = "8.3"; break;
            case LE_B_2000: cost = "9.5"; break;  
                
            //LIST POLECONY    
            case LP_A_350: cost = "5.5"; break;
            case LP_A_500: cost = "7.2"; break;    
            //case LP_A_1000: cost = "8.3"; break;    
            case LP_B_350: cost = "8.3"; break;
            case LP_B_500: cost = "11.0"; break;
            case LP_B_1000: cost = "11.0"; break;
                
            //PACZKI        
            case P48_XS: cost = "11.50"; break;    
            case P48_S: cost = "12.25"; break;
            case P48_M: cost = "12.99"; break;
            case P48_L: cost = "14.48"; break;
            case P48_XL: cost = "15.97"; break;
            case P48_XXL: cost = "18.20"; break;
                
            case P48_ODBIOR_XS: cost = "9.29"; break;    
            case P48_ODBIOR_S: cost = "10.04"; break;
            case P48_ODBIOR_M: cost = "10.78"; break;
            case P48_ODBIOR_L: cost = "12.27"; break;
            case P48_ODBIOR_XL: cost = "13.76"; break;
            case P48_ODBIOR_XXL: cost = "15.97"; break;    
                
            case P48P_XS: cost = "14.88"; break;
            case P48P_S: cost = "15.62"; break;
            case P48P_M: cost = "16.37"; break;
            case P48P_L: cost = "17.86"; break;
            case P48P_XL: cost = "19.34"; break;
            case P48P_XXL: cost = "21.59"; break;
                 
            //case P48P_ODBIOR_XS: cost = "14.88"; break;
            //case P48P_ODBIOR_S: cost = "15.62"; break;
            //case P48P_ODBIOR_M: cost = "16.37"; break;
            //case P48P_ODBIOR_L: cost = "17.86"; break;
            //case P48P_ODBIOR_XL: cost = "19.34"; break;
            //case P48P_ODBIOR_XXL: cost = "21.59"; break;    
                                                
            default: break;                    
        }
        
        return cost;
    }
    
    public static String getPackageNameAsString(PackageType packageType) {
        String cost = "0.0";
        switch(packageType) {
            //LIST EKONOMICZNY
            case LE_A_350: cost = "4.2"; break;
            //case LE_A_500: cost = "8.3"; break;
            //case LE_A_1000: cost = "7.3"; break;
            case LE_B_350: cost = "7.5"; break;
            //case LE_B_500: cost = "7.3"; break;                
            case LE_B_1000: cost = "8.3"; break;
            case LE_B_2000: cost = "9.5"; break;        
            //LIST POLECONY    
            case LP_A_350: cost = "5.5"; break;
            case LP_A_500: cost = "7.2"; break;    
            //case LP_A_1000: cost = "8.3"; break;    
            case LP_B_350: cost = "8.3"; break;
            //case LP_B_500: cost = "5.5"; break;
            case LP_B_1000: cost = "11.0"; break;
                
            //PACZKI    
                
            //case P48_XS: cost = "12.99"; break;    
            //case P48_S: cost = "12.99"; break;
            case P48_M: cost = "12.99"; break;
            case P48_L: cost = "14,48"; break;
            //case P48_XL: cost = "14,48"; break;
            //case P48_XXL: cost = "14,48"; break;
            //case P48P_XS: cost = "14,48"; break;
            case P48P_S: cost = "15.62"; break;
            case P48P_M: cost = "16.37"; break;
            //case P48P_L: cost = "146,48"; break;
            //case P48P_XL: cost = "14,48"; break;
            //case P48P_XXL: cost = "14,48"; break;
                 
                                                
            default: break;                    
        }
        
        return cost;
    }

    public static PackageType getPackageByName(Object name) {
        PackageType type;
        switch((String)name) {
            //LIST EKONOMICZNY
            case "KENES": type = PackageType.KENES; break;      
            case "LE": type = PackageType.LE; break;      
            case "LE_A_350": type = PackageType.LE_A_350; break;           
            case "LE_A_500": type = PackageType.LE_A_500; break;
            case "LE_A_1000": type = PackageType.LE_A_1000; break;
            case "LE_B_350": type = PackageType.LE_B_350; break;
            case "LE_B_500": type = PackageType.LE_B_500; break;                
            case "LE_B_1000": type = PackageType.LE_B_1000; break;
            case "LE_B_2000": type = PackageType.LE_B_2000; break;        
            //LIST POLECONY    
            case "LP_A_350": type = PackageType.LP_A_350; break;
            case "LP_A_500": type = PackageType.LP_A_500; break;    
            case "LP_A_1000": type = PackageType.LP_A_1000; break;    
            case "LP_B_350": type = PackageType.LP_B_350; break;
            case "LP_B_500": type = PackageType.LP_B_500; break;
            case "LP_B_1000": type = PackageType.LP_B_1000; break;                
            //PACZKI                    
            case "P48_XS": type = PackageType.P48_XS; break;    
            case "P48_S": type = PackageType.P48_S; break;
            case "P48_M": type = PackageType.P48_M; break;
            case "P48_L": type = PackageType.P48_L; break;
            case "P48_XL": type = PackageType.P48_XL; break;
            case "P48_XXL": type = PackageType.P48_XXL; break;
            case "P48P_XS": type = PackageType.P48P_XS; break;
            case "P48P_S": type = PackageType.P48P_S; break;
            case "P48P_M": type = PackageType.P48P_M; break;
            case "P48P_L": type = PackageType.P48P_L; break;
            case "P48P_XL": type = PackageType.P48P_XL; break;
            case "P48P_XXL": type = PackageType.P48P_XXL; break;
            case "ODBIOR_OSOBISTY": type = PackageType.ODBIOR_OSOBISTY; break;
            default: 
                throw new UnsupportedOperationException("PackageType getPackageByName: unsuported value: " + name); //To change body of generated methods, choose Tools | Templates.
        }
        return type;
    }
}
