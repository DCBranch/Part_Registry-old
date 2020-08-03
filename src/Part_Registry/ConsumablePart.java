/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_Registry;

public class ConsumablePart extends Part
{
	private double replacementCost = 0; //the cost to replace this item when it's used up
	private int usesLeft = 1; //number of times the ConsumablePart can be used before it must be replaced
	private int usesCap;
        
	public ConsumablePart ()
        {
        super();
        this.usesCap = 1;
        this.usesLeft = this.usesCap;
        }
        
        public ConsumablePart (int USES)
        {
        super();
        this.usesCap = USES;
        this.usesLeft = this.usesCap;
        }
        
        public ConsumablePart (int USES,double replacementCost)
        {
        super();
        this.replacementCost = replacementCost;
        this.usesCap = USES;
        this.usesLeft = this.usesCap;
        }
        
        public ConsumablePart (String name,int USES,double replacementCost)
        {
        super(name);
        this.replacementCost = replacementCost;
        this.usesCap = USES;
        this.usesLeft = this.usesCap;
        }
        
        public ConsumablePart (String name,String number,int USES,double replacementCost)
        {
        super(name,number);
        this.replacementCost = replacementCost;
        this.usesCap = USES;
        this.usesLeft = this.usesCap;
        }
        
        public ConsumablePart (String name,String number,String ncage,int USES,double replacementCost)
        {
        super(name,number,ncage);
        this.replacementCost = replacementCost;
        this.usesCap = USES;
        this.usesLeft = this.usesCap;
        }
        
        public ConsumablePart (String name,String number,String ncage,String niin,int USES,double replacementCost)
        {
        super(name,number,ncage,niin);
        this.replacementCost = replacementCost;
        this.usesCap = USES;
        this.usesLeft = this.usesCap;
        }
        
        public ConsumablePart (String name)
        {
        super(name);
        this.usesCap = 1;
        this.usesLeft = this.usesCap;
        }
        
        public ConsumablePart (String name,String number)
        {
        super(name,number);
        this.usesCap = 1;
        this.usesLeft = this.usesCap;
        }
        
        public ConsumablePart (String name,String number,String ncage)
        {
        super(name,number,ncage);
        this.usesCap = 1;
        this.usesLeft = this.usesCap;
        }
        
        public ConsumablePart (String name,String number,String ncage,String niin)
        {
        super(name,number,ncage,niin);
        this.usesCap = 1;
        this.usesLeft = this.usesCap;
        }
        
	public void fail(Part failedPart)
   {
	usesLeft--;
        if (usesLeft > 0)
            System.err.println("You broked it. \n \n" + failedPart.getName() + "\n" + "Consumable \n");
        else
        {
            System.err.println("You broked it. \n \n" + failedPart.getName() + "\n" + "Consumable \n" + "Replacement Cost: $" + replacementCost);
            usesLeft = usesCap;
        }
   }
}