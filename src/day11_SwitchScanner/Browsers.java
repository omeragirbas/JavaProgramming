package day11_SwitchScanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName= "chrome";
        String result="";
        boolean validBrowser = browserName=="chrome" || browserName=="firefox" ||
                browserName=="safari"|| browserName=="edge"|| browserName=="opera";

            if(validBrowser){
                result= (browserName=="chrome")?"Chrome broser is selected": (browserName=="firefox")?"Firexfox broser is selected":
                        (browserName=="safari")? "Safari broser is selected": (browserName=="edge")?"Edge broser is selected": "opera is selected";



            }else {
                result="Invalid browser name";

            }
        System.out.println(result);

    }
}
