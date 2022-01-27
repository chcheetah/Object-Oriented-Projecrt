package Login;
import javax.swing.*;
import java.util.*;
public class loginverifier {
    static String[] x = {"lo","admin","technician","f20200113","f20200167","f20200085","f20200035"};
    static String[] y = {"abc","admin1964@bits","techie@123","lukeiamyourfather","khuljasimsimkatayi","wherenomanhasgonebefore","bro"};
    static Integer[] tokens = {15,0,0,40,40,40,40};
    static ArrayList<Integer> tokuns = new ArrayList<Integer>(List.<Integer>of(tokens));
    static ArrayList<String> username = new ArrayList<String>(List.of(x));
    static ArrayList<String> password = new ArrayList<String>(List.of(y));
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

        System.out.println("Debug message: Credentials are "+ findout);
        return findout;
    }
    public String gettokens(String user){
        int p = username.indexOf(user);
        String dss = String.valueOf(tokuns.get(p));
        return dss;
    }
    public void addtoken(String user, int token){
        int p = this.username.indexOf(user);
        int l = this.tokuns.get(p);
        l = l + token;
        this.tokuns.set(p,l);

    }
    public static void minustoken(String user){
        int p = username.indexOf(user);
        int lx = tokuns.get(p);
        System.out.println("Debug message: Previous Token Count : " + lx);
        lx = lx - 1;
        System.out.println("Debug message: Next Token Count : "+ lx);
        tokuns.set(p,lx);
    }
    public static void main(String[] args){
        minustoken("f20200085");

    }
}
