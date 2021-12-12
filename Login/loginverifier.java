package Login;
import javax.swing.*;
import java.util.*;
public class loginverifier {
    String[] x = {"lo","admin","technician","f20200113","f20200167","f20200085","f20200035"};
    String[] y = {"abc","admin1964@bits","techie@123","lukeiamyourfather","khuljasimsimkatayi","wherenomanhasgonebefore","jesuswasvirgin@69babyooahh"};
    Integer[] tokens = {15,0,0,40,40,40};
    ArrayList<Integer> tokuns = new ArrayList<Integer>(List.<Integer>of(tokens));
    ArrayList<String> username = new ArrayList<String>(List.of(x));
    ArrayList<String> password = new ArrayList<String>(List.of(y));
    public boolean verify(String user, String pass){
        boolean findout = false;
        String ue = user.toLowerCase();
        for(String i : this.username){
            for(String j: this.password){
                if(pass.equals(j) && ue.equals(i)){
                    findout = true;
                }
            }
        }

        System.out.println("Debug only: Credentials are "+ findout);
        return findout;
    }
    public String gettokens(String user){
        int p = this.username.indexOf(user);
        String dss = String.valueOf(this.tokuns.get(p));
        return dss;
    }
    public void addtoken(String user, int token){
        int p = this.username.indexOf(user);
        int l = this.tokuns.get(p);
        l = l + token;
        this.tokuns.set(p,l);

    }
    public void minustoken(String user, int token){
        int p = this.username.indexOf(user);
        int l  = this.tokuns.get(p);
        l = token - 1;
        this.tokuns.set(p,l);
    }
    public static void main (String[] args){
        System.out.println("Hello");
    }
}
