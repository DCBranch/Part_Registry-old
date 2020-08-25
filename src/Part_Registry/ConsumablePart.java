package Part_Registry;

/**
 * ConsumablePart - A Part object that is only usable a certain number of times
 * 
 * @author Dawson C. Branch
 * @version 0.0.0
 * @since 0.0.0
 */
public class ConsumablePart extends Part
{
	private double replacementCost = 0; //the cost to replace this item when it's used up
	private int usesLeft = 1; //number of times the ConsumablePart can be used before it must be replaced
	private int usesCap;
        
        /**
         * ConsumablePart - Default constructor for an Consumable Part.
         */
	public ConsumablePart ()
        {
        super();
        this.usesCap = 1;
        this.usesLeft = this.usesCap;
        }
        
        /**
         * ConsumablePart - Constructs an Consumable Part.
         * 
         * @param USES - Max number of uses left for the part
         */
        public ConsumablePart (int USES)
        {
        super();
        this.usesCap = USES;
        this.usesLeft = this.usesCap;
        }
        
        /**
         * ConsumablePart - Constructs an Consumable Part.
         * 
         * @param USES - Max number of uses left for the part
         * @param replacementCost - How much it'll cost to replace the part
         */
        public ConsumablePart (int USES,double replacementCost)
        {
        super();
        this.replacementCost = replacementCost;
        this.usesCap = USES;
        this.usesLeft = this.usesCap;
        }
        
        /**
         * ConsumablePart - Constructs an Consumable Part.
         * 
         * @param name - The description of the Part
         * @param USES - Max number of uses left for the part
         * @param replacementCost - How much it'll cost to replace the part
         */
        public ConsumablePart (String name,int USES,double replacementCost)
        {
        super(name);
        this.replacementCost = replacementCost;
        this.usesCap = USES;
        this.usesLeft = this.usesCap;
        }
        
        /**
         * ConsumablePart - Constructs an Consumable Part.
         * 
         * @param name - The description of the Part
         * @param number - The Part number
         * @param USES - Max number of uses left for the part
         * @param replacementCost - How much it'll cost to replace the part
         */
        public ConsumablePart (String name,String number,int USES,double replacementCost)
        {
        super(name,number);
        this.replacementCost = replacementCost;
        this.usesCap = USES;
        this.usesLeft = this.usesCap;
        }
        
        /**
         * ConsumablePart - Constructs an Consumable Part.
         * 
         * @param name - The description of the Part
         * @param number - The Part number
         * @param ncage - NCAGE code ( 5 characters )
         * @param USES - Max number of uses left for the part
         * @param replacementCost - How much it'll cost to replace the part
         */
        public ConsumablePart (String name,String number,String ncage,int USES,double replacementCost)
        {
        super(name,number,ncage);
        this.replacementCost = replacementCost;
        this.usesCap = USES;
        this.usesLeft = this.usesCap;
        }
        
        /**
         * ConsumablePart - Constructs an Consumable Part.
         * 
         * @param name - The description of the Part
         * @param number - The Part number
         * @param ncage - NCAGE code ( 5 characters )
         * @param niin - ID ( 9 characters )
         * @param USES - Max number of uses left for the part
         * @param replacementCost - How much it'll cost to replace the part
         */
        public ConsumablePart (String name,String number,String ncage,String niin,int USES,double replacementCost)
        {
        super(name,number,ncage,niin);
        this.replacementCost = replacementCost;
        this.usesCap = USES;
        this.usesLeft = this.usesCap;
        }
        
        /**
         * ConsumablePart - Constructs an Consumable Part.
         * 
         * @param name - The description of the Part
         */
        public ConsumablePart (String name)
        {
        super(name);
        this.usesCap = 1;
        this.usesLeft = this.usesCap;
        }
        
        /**
         * ConsumablePart - Constructs an Consumable Part.
         * 
         * @param name - The description of the Part
         * @param number - The Part number
         */
        public ConsumablePart (String name,String number)
        {
        super(name,number);
        this.usesCap = 1;
        this.usesLeft = this.usesCap;
        }
        
        /**
         * ConsumablePart - Constructs an Consumable Part.
         * 
         * @param name - The description of the Part
         * @param number - The Part number
         * @param ncage - NCAGE code ( 5 characters )
         */
        public ConsumablePart (String name,String number,String ncage)
        {
        super(name,number,ncage);
        this.usesCap = 1;
        this.usesLeft = this.usesCap;
        }
        
        /**
         * ConsumablePart - Constructs an Consumable Part.
         * 
         * @param name - The description of the Part
         * @param number - The Part number
         * @param ncage - NCAGE code ( 5 characters )
         * @param niin - ID ( 9 characters )
         */
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