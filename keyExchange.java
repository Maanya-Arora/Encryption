import java.util.Random;
public class keyExchange {
    //this code models the diffie-hellman rsa key exchange

    //this section of the code returns the equations of the form x^y %z
    private static int equation(int x, int y, int z){
        if(y==1){
            return 1;
        }
        else{
            return (int) (Math.pow(x, y))%z;
        }
    }


    public static void main(String[] args) {
        //need to generate client 1: public x1, y1 and private z1
        //client 2 will have public x1, y1 (SAME AS CLIENT 1) and private z2
        Random rn = new Random();
        int pubx = rn.nextInt();
        int puby = rn.nextInt();
        System.out.println("This is the public key x: "+pubx);
        System.out.println("This is the public key y: "+puby);

        int client1priv = rn.nextInt();
        int client2priv = rn.nextInt();
        int eq1 = equation(pubx, client1priv, puby);
        int eq2 = equation(pubx, client2priv, puby);

        int key1 = equation(eq2, client1priv, pubx);
        int key2 = equation(eq1, client2priv, pubx);

        
        System.out.println("This is the client 1 private key: "+key1);
        System.out.println("This is the client 2 private key: "+key2);
        
        
        
    }

}
