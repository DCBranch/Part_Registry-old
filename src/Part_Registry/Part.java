package Part_Registry;

/**
 * Part - Describes a part for a maintenance system
 * 
 * @author Dawson Branch
 * @version 0.4.0
 * @since 0.0.0
 */
 public abstract class Part {
   
   private String name;    // The description of the Part
   private String number;  // The Part number
   private String ncage;   // NCAGE ( 5 characters )
   private String niin;    // ID ( 9 characters )
   
   
   // ========= Object Class Overrides ========= //
   
   @Override
   public String toString() {
      return ( this.name + ", P/N: " + this.number + ", CAGE: " + this.ncage + ", NIIN: " + this.niin );
   }
   
   @Override
   public boolean equals( Object otherPart ) {
      boolean result = false;

      if (otherPart instanceof Part) {

         Part other = (Part)otherPart;

         if (
            this.number.equals(other.number) &&
            this.ncage.equals(other.ncage) &&
            this.niin.equals(other.niin)
            )
            result = true;
      }
      
      return ( result );
   }
   
   /**
    * No-argument constructor calls Full Argument Constructor (FAC) with default values
    */
   public Part () {
      this( "Unknown Part Name", "", "00000", "0000-00-000-0000" );
   }
   
   public Part (String name) throws IllegalArgumentException {
       this( name, "", "00000", "0000-00-000-0000" );
   }
   
   /**
    * One Argument constructor calls FAC with Part number and default values
    * @param number an alphanumeric string for the Part number
    */
   public Part(String name, String number ) throws IllegalArgumentException {
      this( name, number, "00000", "0000-00-000-0000" );
   }
   
   /**
    * Two argument constructor calls FAC with Part number, ncage, and default values
    * @param number an alphanumeric string for the Part number
    * @param ncage A five-character string for the CAGE code
    */
   public Part(String name, String number, String ncage ) throws IllegalArgumentException {
      this(name, number, ncage, "0000-00-000-0000");
   }
   
   /**
    * Three argument constructor calls FAC with Part number, ncage, niin and defaults
    * @param number an alphanumeric string for the Part number
    * @param ncage A five-character string for the CAGE code
    * @param niin A 13-character string for the NIIN of the form XXXX-XX-XXX-XXXX
    */
   public Part( String name, String number, String ncage, String niin )  throws IllegalArgumentException {
      this.name = name;
      
      this.number = number;
      
      if(ncage.matches("[A-Z0-9]{5}"))
          this.ncage = ncage.toUpperCase();
      else
          System.err.println("Invalid Ncage input");
      
      if(niin.matches("\\d{4}-\\d{2}-\\d{3}-\\d{4}"))
          this.niin = niin;
      else
          System.err.println("Invalid Niin input");
   }
   
   /**
    * This is the Full Argument Constructor (FAC).  All other constructors call this.
    * @param name an alphanumeric string for the Part name
    * @param number an alphanumeric string for the Part number
    * @param ncage A five-character string for the CAGE code
    * @param niin A 13-character string for the NIIN of the form XXXX-XX-XXX-XXXX
    */
   
   // ========= ACCESSORS AND MUTATORS ========= //
   
   /**
    * Takes a string to set the name for the Part
    * @param name an alphanumeric string for the Part name
    */
   public void setName( String name ) throws IllegalArgumentException {
      this.name=name;
   }
   
   /**
    * Takes a string to set the number for the Part
    * @param number an alphanumeric string for the Part number
    */
   public void setNumber( String number ) throws IllegalArgumentException {
      try{
          this.number = number;
      }
      catch(IllegalArgumentException illegalArgumentException){
          System.out.printf("%nInput must be a string.%n%n");
      }
       
   }
   
   /**
    * Takes a string to set the CAGE Code for the Part
    * @param ncage A five-character string for the CAGE code
    */
   public void setNcage( String ncage ) throws IllegalArgumentException {
      
      if(ncage.matches("[A-Za-z0-9]{5}"))
          this.ncage = ncage.toUpperCase();
      else
          System.err.println("Invalid Ncage input");
   }
   /**
    * Takes a string to set the NIIN for the Part
    * @param niin A 13-character string for the NIIN of the form XXXX-XX-XXX-XXXX
    */
   public void setNiin( String niin )  throws IllegalArgumentException  {
      if(niin.matches("\\d{4}-\\d{2}-\\d{3}-\\d{4}"))
          this.niin = niin;
      else
          System.err.println("Invalid Niin input");
   }
   
   /**
    * Returns the String name of the part
    * @return the name of the part
    */
   public String getName( )  {
      return this.name;
   }
   
   /**
    * Returns the String number of the part
    * @return the number of the part
    */
   public String getNumber( ) {
      return this.number;
   }
   
   /**
    * Returns the String ncage of the part
    * @return the ncage of the part
    */
   public String getNcage( ) {
      return this.ncage;
   }
   
   /**
    * Returns the String niin of the part
    * @return the niin of the part
    */
   public String getNiin( ) {
      return this.niin;
   }
   
   
} // end Class Part