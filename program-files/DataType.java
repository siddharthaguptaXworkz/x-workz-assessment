public class DataType{
	// A datatype can also be attacted to the class rather than the object
		static final long POPULATION_CHINA = 1392700000L;
	public static void main(String[] args) {
		// char: Used to hold a certain unicode character 
		char firstLetterOfSiddsName = 'S';
		// boolean: Used to hold either True or False. (1-bit) Usually used to specify a condition.
		boolean isMale = true;
		boolean isEarthFlat = false;
		// Note: Numbers can be expressed in multiple ways. The type we choose depends on the range of expected values, whether the data is signed/unsigneed or includes decimal values
		// byte(8-bit): Used to hold any number between -128 and 127. Usually used for small numbers with 0 decimal palces.
		byte numHoursInDay= 24;
		byte numFingers = 10;
		byte numRoomsInHouse = 3;
		// Short(16-bit): Used to hold values from -32768 to 32767. Numbers with 0 decimal places
		short daysInYear = 365;
		short hoursInMonth = 720;
		// Int(64 bits): Used to hold values from -2147483648 to 2,147,483,6487. Numbers with 0 decimal places.
		int secondsInDay = 86400;
		int termsInEnglishGermanDictionary=800000;
		// Long (64 bits): Used to hold values form -9223372036854775808 to -9223372036854775807. Numbers with 0 decimal places. Specified using L on end.
		long populationIndia = 1352600000L;
		long populationChina = 1392700000L;
		// Float (32 bits): Used to hold values from decimal places 1.23*10^100 to -1.23*10^-100  for upto 7 decimal places. Specifeid with an F on the end. 
		float percentageOfStudentsWithBPlus = 0.32F;
		float decimalZimbabweMortality = 0.027807F;
		// Double(64 bits): Used to hold values from deciaml palces 1.23456*100^300, -1.23456*10^300d for upto 16 decimal places. Specified with a D on the end
		double massOfHydrogen = 1.67e-27d;
		// String: used to hold a certain number of unicode characters. String is an object. The rest of the above data types are primitive; simplest/atomic data types. ie. cannot be broken down any further. String can be broken down into an array of characters.
		String firstName = "Siddhartha";
		// A datatype can also be a constant
		final long POPULATION_INDIA = 1352600000L;
		
		
	}
}