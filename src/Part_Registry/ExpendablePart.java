package Part_Registry;

import java.util.ArrayList;

public class ExpendablePart extends Part
{
	private int failureRate = 0; //average number of failures per operational hour of the part
	private int leadTime = 0; //number of days it takes to replace the part in the supply system
	ArrayList<ConsumablePart> toolsRequired = new ArrayList<ConsumablePart>();
        
        public ExpendablePart ()
        {
            super();
        }
        
        public ExpendablePart (int failureRate)
        {
            super();
            this.failureRate = failureRate;
        }
        
	public ExpendablePart (int failureRate, int leadTime)
        {
            super();
            this.failureRate = failureRate;
            this.leadTime = leadTime;
        }
        
        public ExpendablePart (String name,int failureRate, int leadTime)
        {
            super(name);
            this.failureRate = failureRate;
            this.leadTime = leadTime;
        }
        
        public ExpendablePart (String name,String number, int failureRate, int leadTime)
        {
            super(name,number);
            this.failureRate = failureRate;
            this.leadTime = leadTime;
        }
        
        public ExpendablePart (String name,String number, String ncage, int failureRate, int leadTime)
        {
            super(name,number,ncage);
            this.failureRate = failureRate;
            this.leadTime = leadTime;
        }
        
        public ExpendablePart (String name,String number, String ncage, String niin, int failureRate, int leadTime)
        {
            super(name,number,ncage,niin);
            this.failureRate = failureRate;
            this.leadTime = leadTime;
        }
        
        public ExpendablePart (String name)
        {
            super(name);
        }
        
        public ExpendablePart (String name,String number)
        {
            super(name,number);
        }
        
        public ExpendablePart (String name,String number, String ncage)
        {
            super(name,number,ncage);
        }
        
        public ExpendablePart (String name,String number, String ncage, String niin)
        {
            super(name,number,ncage,niin);
        }
        
	public void fail(Part failedPart)
   {
	for(int i = 0; i <= toolsRequired.size()-1; i++)
        {
            toolsRequired.get(i).fail(toolsRequired.get(i));
        }
       System.err.println("There goes another one... \n \n" + failedPart + "\n" + "Expedable \n" + "Replacement time: " + leadTime);
   }
        public void addTool(ConsumablePart tool)
        {
            toolsRequired.add(tool);
        }
}