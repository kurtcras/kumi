import java.io.*;

public class DeployedFacts {

	    public static void main(String[] args) 
	    {
	        try
	        {
	            String ext = ".deployed";
	            DeployedFacts list = new DeployedFacts( );
	            dev(list, ext);
	            testin(list, ext);
	            testout(list, ext);
	            acceptin(list, ext);
	            acceptout(list, ext);
	            prodin(list, ext);
	            prodout(list, ext);
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
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
	                        	int extensionIndex = filename.lastIndexOf(".");     
	                        	if (extensionIndex == -1){
	                        		System.out.println(filename);
	                        	} else{
	                        		System.out.println(filename.substring(0, extensionIndex));
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
	    
	    private static void dev(DeployedFacts list, String ext) {
	    	System.out.println("DEV");
            String directory = "//amber1/AutoDeployer/inside/WebLogic/aci";
            list.getFiles(directory,ext);
            directory = "//amber1/AutoDeployer/inside/WebLogic/cf2";
            list.getFiles(directory,ext);
            directory = "//amber1/AutoDeployer/inside/WebLogic/fbs";
            list.getFiles(directory,ext);
            directory = "//amber1/AutoDeployer/inside/WebLogic/pf2";
            list.getFiles(directory,ext);
            directory = "//amber1/AutoDeployer/inside/WebLogic/uf2";
            list.getFiles(directory,ext);
            directory = "//amber1/AutoDeployer/inside/WebLogic/uf2-outside";
            list.getFiles(directory,ext);
            directory = "//amber1/AutoDeployer/inside/WebLogic/wascol";
            list.getFiles(directory,ext);
            directory = "//amber1/AutoDeployer/inside/WebLogic/zft";
            list.getFiles(directory,ext);
            directory = "//amber1/AutoDeployer/inside/WebLogic/zft-outside";
            list.getFiles(directory,ext);
            System.out.println();
	    }
	    
	    private static void testin(DeployedFacts list, String ext) {
	    	System.out.println("TEST INSIDE");
            String directory = "//emerald/AutoDeployer/inside/WebLogic/aci";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogic/cf2";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogic/fbs";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogic/pf2";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogic/uf2";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogic/uf2-outside";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogic/wascol";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogic/zft";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/inside/WebLogic/zft-outside";
            list.getFiles(directory,ext);
            System.out.println();
	    }
	    
	    private static void testout(DeployedFacts list, String ext) {
	    	System.out.println("TEST OUTSIDE");
            String directory = "//emerald/AutoDeployer/outside/WebLogic/uf2-outside";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/outside/WebLogic/wascol";
            list.getFiles(directory,ext);
            directory = "//emerald/AutoDeployer/outside/WebLogic/zft-outside";
            list.getFiles(directory,ext);
            System.out.println();
	    }
	    
	    private static void acceptin(DeployedFacts list, String ext) {
	    	System.out.println("ACCEPT INSIDE");
            String directory = "//maroon/AutoDeployer/inside/WebLogic/aci";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/inside/WebLogic/cf2";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/inside/WebLogic/fbs";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/inside/WebLogic/pf2";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/inside/WebLogic/uf2";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/inside/WebLogic/uf2-outside";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/inside/WebLogic/wascol";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/inside/WebLogic/zft";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/inside/WebLogic/zft-outside";
            list.getFiles(directory,ext);
            System.out.println();
	    }
	    
	    private static void acceptout(DeployedFacts list, String ext) {
	    	System.out.println("ACCEPT OUTSIDE");
            String directory = "//maroon/AutoDeployer/outside/WebLogic/uf2-outside";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/outside/WebLogic/wascol";
            list.getFiles(directory,ext);
            directory = "//maroon/AutoDeployer/outside/WebLogic/zft-outside";
            list.getFiles(directory,ext);
            System.out.println();
	    }
	    
	    private static void prodin(DeployedFacts list, String ext) {
	    	System.out.println("PROD INSIDE");
            String directory = "//indigo/AutoDeployer/inside/WebLogic/aci";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/inside/WebLogic/cf2";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/inside/WebLogic/fbs";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/inside/WebLogic/pf2";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/inside/WebLogic/uf2";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/inside/WebLogic/uf2-outside";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/inside/WebLogic/wascol";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/inside/WebLogic/zft";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/inside/WebLogic/zft-outside";
            list.getFiles(directory,ext);
            System.out.println();
	    }
	    
	    private static void prodout(DeployedFacts list, String ext) {
	    	System.out.println("PROD OUTSIDE");
            String directory = "//indigo/AutoDeployer/outside/WebLogic/uf2-outside";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/outside/WebLogic/wascol";
            list.getFiles(directory,ext);
            directory = "//indigo/AutoDeployer/outside/WebLogic/zft-outside";
            list.getFiles(directory,ext);
            System.out.println();
	    }
}

