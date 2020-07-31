/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Project;

public class ConsumablePart extends Part
{
	private double replacementCost = 0; //the cost to replace this item when it's used up
	private int usesLeft = 1; //number of times the ConsumablePart can be used before it must be replaced
	private final int USES;
        
	public ConsumablePart ()
        {
        super();
        this.USES = 1;
        this.usesLeft = this.USES;
        }
        
        public ConsumablePart (int USES)
        {
        super();
        this.USES = USES;
        this.usesLeft = this.USES;
        }
        
        public ConsumablePart (int USES,double replacementCost)
        {
        super();
        this.replacementCost = replacementCost;
        this.USES = USES;
        this.usesLeft = this.USES;
        }
        
        public ConsumablePart (String name,int USES,double replacementCost)
        {
        super(name);
        this.replacementCost = replacementCost;
        this.USES = USES;
        this.usesLeft = this.USES;
        }
        
        public ConsumablePart (String name,String number,int USES,double replacementCost)
        {
        super(name,number);
        this.replacementCost = replacementCost;
        this.USES = USES;
        this.usesLeft = this.USES;
        }
        
        public ConsumablePart (String name,String number,String ncage,int USES,double replacementCost)
        {
        super(name,number,ncage);
        this.replacementCost = replacementCost;
        this.USES = USES;
        this.usesLeft = this.USES;
        }
        
        public ConsumablePart (String name,String number,String ncage,String niin,int USES,double replacementCost)
        {
        super(name,number,ncage,niin);
        this.replacementCost = replacementCost;
        this.USES = USES;
        this.usesLeft = this.USES;
        }
        
        public ConsumablePart (String name)
        {
        super(name);
        this.USES = 1;
        this.usesLeft = this.USES;
        }
        
        public ConsumablePart (String name,String number)
        {
        super(name,number);
        this.USES = 1;
        this.usesLeft = this.USES;
        }
        
        public ConsumablePart (String name,String number,String ncage)
        {
        super(name,number,ncage);
        this.USES = 1;
        this.usesLeft = this.USES;
        }
        
        public ConsumablePart (String name,String number,String ncage,String niin)
        {
        super(name,number,ncage,niin);
        this.USES = 1;
        this.usesLeft = this.USES;
        }
        
	public void fail(Part failedPart)
   {
	usesLeft--;
        if (usesLeft > 0)
            System.err.println("You broked it. \n \n" + failedPart.getName() + "\n" + "Consumable \n");
        else
        {
            System.err.println("You broked it. \n \n" + failedPart.getName() + "\n" + "Consumable \n" + "Replacement Cost: $" + replacementCost);
            usesLeft = USES;
        }
   }
}