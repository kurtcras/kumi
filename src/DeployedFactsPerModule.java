import java.io.*;

public class DeployedFactsPerModule {

	public static String vorig;
	
	    public static void main(String[] args) 
	    {
	        try
	        {
	            String ext = ".deployed";
	            DeployedFactsPerModule list = new DeployedFactsPerModule( );
	            headers();
	            aci(list, ext);
	            bft(list, ext);
	            cf2(list, ext);
	            dbt(list, ext);
	            fbs(list, ext);
	            pf2(list, ext);
	            uf2(list, ext);
	            wascol(list, ext);
	            zft(list, ext);
	            
	            
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }

	    public static String padRight(String s, int n) {
	        return String.format("%1$-" + n + "s", s);  
	   }

	    public void getFiles(String directory, String ext)
	    {
	        try
	        {
	            File f = new File(directory);
	            boolean flag =  f.isDirectory();
	            if(flag)
	            {
	                File fs[] = f.listFiles();
	                for(int i=0;i<fs.length;i++)
	                {
	                    if(!fs[i].isDirectory())
	                    {
	                        String filename = fs[i].getName();
	                        if(filename.endsWith(ext.trim())){
	                        	if (!vorig.equals("") && !vorig.equals(filename)){
	                        		System.out.print("*");
	                        	}
	                        	vorig = filename;
	                        	int extensionIndex = filename.lastIndexOf(".");     
	                        	if (extensionIndex == -1){
	                        		System.out.print(padRight(filename, 21));
	                        	} else{
	                        		System.out.print(padRight(filename.substring(0, extensionIndex), 21));
	                        	}
	                        }

	                    }
	                }   
	            }
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	    
	    private static void headers() {
	    	streep();
	    	System.out.print(padRight(" DEV", 22));
	    	System.out.print(padRight("TEST INSIDE", 21));
	    	System.out.print(padRight("TEST OUTSIDE", 21));
	    	System.out.print(padRight("ACCEPT INSIDE", 21));
	    	System.out.print(padRight("ACCEPT OUTSIDE", 21));
	    	System.out.print(padRight("PROD INSIDE", 21));
	    	System.out.println("PROD OUTSIDE");
	    	streep();
	    }
	    
	    private static void streep() {
	    	System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
	    }
	    
	    
	    private static void aci(DeployedFactsPerModule list, String ext) {
	    	vorig = "";
	    	System.out.print(" ");
	    	String directory = "//amber1/AutoDeployer/inside/WebLogicJ7/aci";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogicJ7/aci";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//maroon/AutoDeployer/inside/WebLogicJ7/aci";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//indigo/AutoDeployer/inside/WebLogicJ7/aci";
            list.getFiles(directory,ext);
            System.out.println();
            streep();
	    }
	    
	    private static void bft(DeployedFactsPerModule list, String ext) {
	    	vorig = "";
	    	System.out.print(" ");
	    	String directory = "//amber1/AutoDeployer/inside/WebLogicJ7/bft";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogicJ7/bft";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//maroon/AutoDeployer/inside/WebLogicJ7/bft";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//indigo/AutoDeployer/inside/WebLogicJ7/bft";
            list.getFiles(directory,ext);
            System.out.println();
            
            System.out.print(" ");
            vorig = "";
            directory = "//amber1/AutoDeployer/inside/WebLogicJ7/bft-outside";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogicJ7/bft-outside";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/outside/WebLogicJ7/bft-outside";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/inside/WebLogicJ7/bft-outside";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/outside/WebLogicJ7/bft-outside";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/inside/WebLogicJ7/bft-outside";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/outside/WebLogicJ7/bft-outside";
            list.getFiles(directory,ext);
            
            System.out.println();
            streep();
	    }
	    
	    private static void cf2(DeployedFactsPerModule list, String ext) {
	    	vorig = "";
	    	System.out.print(" ");
	    	String directory = "//amber1/AutoDeployer/inside/WebLogicJ7/cf2";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogicJ7/cf2";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//maroon/AutoDeployer/inside/WebLogicJ7/cf2";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//indigo/AutoDeployer/inside/WebLogicJ7/cf2";
            list.getFiles(directory,ext);
            System.out.println();
            streep();
	    }
	    
	    private static void dbt(DeployedFactsPerModule list, String ext) {
	    	vorig = "";
	    	System.out.print(" ");
	    	String directory = "//amber1/AutoDeployer/inside/WebLogicJ7/debtor";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogicJ7/debtor";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//maroon/AutoDeployer/inside/WebLogicJ7/debtor";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//indigo/AutoDeployer/inside/WebLogicJ7/debtor";
            list.getFiles(directory,ext);
            System.out.println();
            streep();
	    }
	    
	    private static void fbs(DeployedFactsPerModule list, String ext) {
	    	vorig = "";
	    	System.out.print(" ");
	    	String directory = "//amber1/AutoDeployer/inside/WebLogicJ7/fbs";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogicJ7/fbs";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//maroon/AutoDeployer/inside/WebLogicJ7/fbs";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//indigo/AutoDeployer/inside/WebLogicJ7/fbs";
            list.getFiles(directory,ext);
            System.out.println();
            streep();
	    }
	    
	    private static void pf2(DeployedFactsPerModule list, String ext) {
	    	vorig = "";
	    	System.out.print(" ");
	    	String directory = "//amber1/AutoDeployer/inside/WebLogicJ7/pf2";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogicJ7/pf2";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//maroon/AutoDeployer/inside/WebLogicJ7/pf2";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//indigo/AutoDeployer/inside/WebLogicJ7/pf2";
            list.getFiles(directory,ext);
            System.out.println();
            streep();
	    }
	    
	    private static void uf2(DeployedFactsPerModule list, String ext) {
	    	vorig = "";
	    	System.out.print(" ");
	    	String directory = "//amber1/AutoDeployer/inside/WebLogicJ7/uf2";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogicJ7/uf2";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//maroon/AutoDeployer/inside/WebLogicJ7/uf2";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//indigo/AutoDeployer/inside/WebLogicJ7/uf2";
            list.getFiles(directory,ext);
            System.out.println();
            
            System.out.print(" ");
            vorig = "";
            directory = "//amber1/AutoDeployer/inside/WebLogicJ7/uf2-outside";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogicJ7/uf2-outside";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/outside/WebLogicJ7/uf2-outside";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/inside/WebLogicJ7/uf2-outside";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/outside/WebLogicJ7/uf2-outside";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/inside/WebLogicJ7/uf2-outside";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/outside/WebLogicJ7/uf2-outside";
            list.getFiles(directory,ext);
            
            System.out.println();
            streep();
	    }
	    
	    private static void wascol(DeployedFactsPerModule list, String ext) {
	    	vorig = "";
	    	System.out.print(" ");
	    	String directory = "//amber1/AutoDeployer/inside/WebLogicJ7/wascol";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogicJ7/wascol";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/outside/WebLogicJ7/wascol";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/inside/WebLogicJ7/wascol";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/outside/WebLogicJ7/wascol";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/inside/WebLogicJ7/wascol";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/outside/WebLogicJ7/wascol";
            list.getFiles(directory,ext);
            System.out.println();
            streep();
	    }
	    
	    private static void zft(DeployedFactsPerModule list, String ext) {
	    	vorig = "";
	    	System.out.print(" ");
	    	String directory = "//amber1/AutoDeployer/inside/WebLogicJ7/zft";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogicJ7/zft";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//maroon/AutoDeployer/inside/WebLogicJ7/zft";
            list.getFiles(directory,ext);
            System.out.print(padRight("", 21));
            directory = "//indigo/AutoDeployer/inside/WebLogicJ7/zft";
            list.getFiles(directory,ext);
            System.out.println();
            
            System.out.print(" ");
            vorig = "";
            directory = "//amber1/AutoDeployer/inside/WebLogicJ7/zft-outside";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogicJ7/zft-outside";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/outside/WebLogicJ7/zft-outside";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/inside/WebLogicJ7/zft-outside";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/outside/WebLogicJ7/zft-outside";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/inside/WebLogicJ7/zft-outside";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/outside/WebLogicJ7/zft-outside";
            list.getFiles(directory,ext);
            
            System.out.println();
            streep();
	    }
	    
}

