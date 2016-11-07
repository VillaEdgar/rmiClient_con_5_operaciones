



public class RMIClientMain 
{
     public static void main(String[] args) 
    {
        try {
            RmiCommunicationClient wsc = new RmiCommunicationClient();

            int suma = wsc.getSuma(2, 2);
            int resta=wsc.getResta(2, 2);
            int div=wsc.getDiv(2, 2);
            int multi=wsc.getMulti(2, 2);
            double po=wsc.getPo(2.00,2.00);
            
             System.out.println(" resultado de la suma por el servidor: " + suma);
             System.out.println(" resultado de la resta por el servidor: " + resta);
             System.out.println(" resultado de la divicion por el servidor: " + div);
             System.out.println(" resultado de la multiplicacion por el servidor: " + multi);
             System.out.println(" resultado de la putencia por el servidor: " + po);
     
        } catch (Exception ex) {
            ex.printStackTrace();
             System.err.println("Connection error the server is not responding.");
        }
    }
}
