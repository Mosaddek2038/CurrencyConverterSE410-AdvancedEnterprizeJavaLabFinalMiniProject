package currencyconverter;

public class CurrencyData {
    static final String currName[] = {
        "US Dollar", 
        "Euro", 
        "Taka", 
        "Saudi Riyal", 
        "Ruble", 
        "GB Pound", 
        "CN Yuan", 
        "JP Yen", 
        "IN Rupee", 
        "Aus Dollar", 
        "UAE Dirham"
    };
    double USD_rate=1, Euro_rate=1.0263, BDT_rate=103.58;
    double SaudiRiyal_rate=3.759, Ruble_rate=62.5125, Pound_rate=0.8986;
    double Yuan_rate=7.116, Yen_rate=145.16, INR_rate=82.4505;
    double AusDollar_rate=1.5668, UAEDirham_rate=3.6731;
    
    double USDConv(String CurrIn, double CurrInAmount) {
        double DConv=0.0;
        if(CurrIn == "US Dollar")
            DConv = CurrInAmount/USD_rate;
        else if(CurrIn == "Euro")
            DConv = CurrInAmount/Euro_rate;
        else if(CurrIn == "Taka")
            DConv = CurrInAmount/BDT_rate;
        else if(CurrIn == "Saudi Riyal")
            DConv = CurrInAmount/SaudiRiyal_rate;
        else if(CurrIn == "Ruble")
            DConv = CurrInAmount/Ruble_rate;
        else if(CurrIn == "GB Pound")
            DConv = CurrInAmount/Pound_rate;
        else if(CurrIn == "CN Yuan")
            DConv = CurrInAmount/Yuan_rate;
        else if(CurrIn == "JP Yen")
            DConv = CurrInAmount/Yen_rate;
        else if(CurrIn == "IN Rupee")
            DConv = CurrInAmount/INR_rate;
        else if(CurrIn == "Aus Dollar")
            DConv = CurrInAmount/AusDollar_rate;
        else if(CurrIn == "UAE Dirham")
            DConv = CurrInAmount/UAEDirham_rate;
        return DConv;
    }
    
    public double getConvAmount(String CurrOut, double DConv) {
        double CurrOutAmount = 0.0;
        if(CurrOut == "US Dollar")
            CurrOutAmount = DConv*USD_rate;
        else if(CurrOut == "Euro")
            CurrOutAmount = DConv*Euro_rate;
        else if(CurrOut == "Taka")
            CurrOutAmount = DConv*BDT_rate;
        else if(CurrOut == "Saudi Riyal")
            CurrOutAmount = DConv*SaudiRiyal_rate;
        else if(CurrOut == "Ruble")
            CurrOutAmount = DConv*Ruble_rate;
        else if(CurrOut == "GB Pound")
            CurrOutAmount = DConv*Pound_rate;
        else if(CurrOut == "CN Yuan")
            CurrOutAmount = DConv*Yuan_rate;
        else if(CurrOut == "JP Yen")
            CurrOutAmount = DConv*Yen_rate;
        else if(CurrOut == "IN Rupee")
            CurrOutAmount = DConv*INR_rate;
        else if(CurrOut == "Aus Dollar")
            CurrOutAmount = DConv*AusDollar_rate;
        else if(CurrOut == "UAE Dirham")
            CurrOutAmount = DConv*UAEDirham_rate;
        return CurrOutAmount;
    }
    
    public double Conversion(String CurrIn, String CurrOut, double CurrInAmount) {
        return getConvAmount(CurrOut, USDConv(CurrIn, CurrInAmount));
    }
}
