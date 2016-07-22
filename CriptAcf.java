import java.util.HashMap;
import java.util.Random;

public class CriptAcf {

	
    private static String palavras = "";
    private static String cript = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
 
    private static HashMap<String,String> _cripts = new HashMap<>();
    private static HashMap<String, String> descripts = new HashMap<>();
    
  public static void main(String[] main)
  {
   // CriarCodigo("texto");
  //  LerCodigo("e5wMJBa","chave");
  }
  	 
	
  
  private static void GerarCodigos()
  {  	  
	for (int i=0; i<palavras.length(); i++)
	{
		String letra = "" + palavras.charAt(i);
		if (!CriptAcf._cripts.containsKey(letra)) {
		String cript = AddCript(letra);
		if (cript.equals("Erro"))
			i--;
		}
		//System.out.print(" Palavra: " + letra + " Cript: " + cript + "");
	}
  }
  
  public static void LerCodigo(String codigo, String chave)
  {
	  CriptAcf otp = new CriptAcf();
	  String cod = otp.decriptografa(chave);
	  CriptAcf.descripts = map(cod);
	  System.out.print(desCript(codigo));
  }
  
  public static void CriarCodigo(String codigo)
  {
	  String palavra = codigo;
	  palavras = palavra;
	  GerarCodigos();
	  System.out.println(Cript(palavra));
	  Rest("" + descripts);
	  
  }
  
  
  private static String Cript(String texto)
  {
	  String retorno = "";
	  for (int i=0; i<texto.length(); i++)
		{
			String letra = "" + texto.charAt(i);
		    retorno += _cripts.get(letra);
		}
	  return retorno;
  }
  
  private static String desCript(String texto)
  {
	 
	  String retorno = "";
	  String cript = "";
	  Random r = new Random();
	  for (int i=0; i<texto.length(); i++)
		{
		  try {
			cript = "" + texto.charAt(i) + texto.charAt(i+1);
		    retorno += descripts.get(cript);
		    cript = "";
		  }
		  catch (Exception ex)
		  {
			  retorno += CriptAcf.cript.charAt(r.nextInt(CriptAcf.cript.length()));
		  }
		    retorno.replace("null", retorno += CriptAcf.cript.charAt(r.nextInt(CriptAcf.cript.length())));
		    i += 1; 
		   
		}
	  retorno.replace("null", retorno += CriptAcf.cript.charAt(r.nextInt(CriptAcf.cript.length())));
	  return retorno;
  }
  
  private static String AddCript(String palavra)
  {
		Random r = new Random();
		
		int cripts = cript.length();
		int tamanho = 2;
		
		String cript = "";
		
		descripts.put(""+CriptAcf.cript.charAt(r.nextInt(cripts)), palavra);
		descripts.put(""+CriptAcf.cript.charAt(r.nextInt(cripts)), CriptAcf.cript.charAt(r.nextInt(cripts))+palavra);
		descripts.put(""+CriptAcf.cript.charAt(r.nextInt(cripts)), palavra+CriptAcf.cript.charAt(r.nextInt(cripts)));
		for (int i=0; i < tamanho; i++)
		{
			cript += CriptAcf.cript.charAt(r.nextInt(cripts));
		}
		
		if (descripts.containsKey(cript))
			return "Erro";
		else {
			_cripts.put(palavra, cript);
		    descripts.put(cript, palavra);	
		}
		
		return cript;
  }
  
	
  
  private String criptografa(String mensagem) {
      int[] im = charArrayToInt(mensagem.toCharArray());
      int[] data = new int[mensagem.length()];
      for (int i=0;i<mensagem.length();i++) {	      
              data[i] = im[i] + 1;
      }
     
      return new String(intArrayToChar(data));
}

private String decriptografa(String mensagem) {
      int[] im = charArrayToInt(mensagem.toCharArray());
      int[] data = new int[mensagem.length()];
      for (int i=0;i<mensagem.length();i++) 
              data[i] = im[i] - 
              1;
      
     
      return new String(intArrayToChar(data));
}


private static void Rest(String args){
      CriptAcf otp = new CriptAcf();
      String menssagem = args;
      String msgCriptografada = otp.criptografa(menssagem);
   
      System.out.println("Chave: "+msgCriptografada);
     
}

private int chartoInt(char c) {
      return (int) c;
}

private char intToChar(int i) {
      return (char) i;
}

private int[] charArrayToInt(char[] cc) {
      int[] ii = new int[cc.length];
      for(int i=0;i<cc.length;i++){
              ii[i] = chartoInt(cc[i]);
      }
      return ii;
}

private char[] intArrayToChar(int[] ii) {
      char[] cc = new char[ii.length];
      for(int i=0;i<ii.length;i++){
              cc[i] = intToChar(ii[i]);
      }
      return cc;
}

private static HashMap<String, String> map(String in) {
	String value = in;
	value = value.substring(1, value.length()-1);          
	String[] keyValuePairs = value.split(",");             
	HashMap<String,String> map = new HashMap<>();               

	for(String pair : keyValuePairs)                       
	{
	    String[] entry = pair.split("=");                  
	    map.put(entry[0].trim(), entry[1].trim());       
	}
    return map;
   }

private void error(String msg) {
      System.out.println(msg);
      System.exit(-1);
}
	
 
}
