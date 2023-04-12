import java.util.HashMap;

public class IdandPassword {
    HashMap<String, String> logininfo = new HashMap<String, String>();
    IdandPassword(){
        logininfo.put("Bipin","cellphone");
        logininfo.put("Nisha","PASSWORD");
        logininfo.put("Binisha","cellPASSWORD");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
