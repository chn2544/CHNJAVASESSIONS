package chnjavasessions;

public class ChnDataTypes {

	public static void main(String[] args) {
		
		// Data Types in Java   - Comment
		
		//data types in java:
		
				//two data types:
				//1. primitive data types: No need of using Object
					//a. Boolean type: boolean : true/false
					//b. Numeric Types: 
						//b.1: Character Type: char
						//b.2: Integral Value Type:
							//b2.1: Integer: byte, short, int, long
							//b2.2: floating-point: float, double
				
				//2. non primitive data types: Objects, String, Arrays, Classes, Interface
				
				//1. byte:
				//size: 1 byte = 8 bits
				//range: -128 to 127 
				//default value : 0
				byte b = 10;
				b = 20;
				b = 30;
				byte b1 = -90;
				byte b2 = 0;
				byte b3 = 127;
				System.out.println(b);
				System.out.println(b1+b);
				b3++;        // byte value overflows here as it can store till 127 only
				System.out.println(b3);  
				
				//2. short:
				//size: 2 bytes = 2x8 = 16 bits
				//range: -32768 to 32767
				//default value : 0
				short s1 = 100;
				short s2 = 1000;
				short s3 = 1;
				System.out.println(s2+s3);
				System.out.println(b3+s2);
				
				//3. int:
				//size: 4 bytes = 4x8 = 32 bits
				//range: -2147483648 to 2147483647
				//default value : 0
				int i = 1000;
				int j = 2500;
				int amount = 3400;
				System.out.println(amount);
				int l = 1;
				
				//4. long:
				//size: 8 bytes = 8x8 = 64 bits
				//range:  -9, 223, 372, 036, 854, 775, 808  to  9, 223, 372, 036, 854, 775, 807
				//default value : 0
				long distance = 1212121219898L;
				long lg = 1;
				System.out.println(distance);
				//CC, SSN, Phone --> 
				long ph = 9898989898L;
				
				//5. float:
				//size: 4 bytes = 4x8 = 32 bits
				//range: after . upto 7 digits
				//default value : 0.0
				float f = 12.33f;            // we need to write f at the end  otherwise it will save as double
				float f1 = (float)23.33;       // or you can cast value in float with (float)
				System.out.println(f);
				System.out.println(f1);
				float f3 = 9;
				System.out.println(f3);//9.0
				
				//6. double: 
				//size: 8 bytes = 64 bits
				//range: after . upto 16 digits
				//default value : 0.0
				double d1 = 12.3333;
				double d2 = 34.5555669;
				double d3 = 100;
				System.out.println(d3);
				System.out.println(d1+100+200+d2);
				
				//7. char:
				//size: 2 bytes = 16 bits
				//unicodes: ASCII + special chars 
				//default value : '\u0000'
				char c1 = 'a';	//97
				char c4 = 'b';	//98
				char c2 = '1';
				char c3 = '$';
				//range:

				//0-9: 48 to 57
				//A-Z: 65 to 90
				//a-z: 97 to 122

				System.out.println(c1);           // if only char is printed, it will print assigned value
				System.out.println(c1+c4);//195       If Arithmetic Operation is done on char, it returns ASCII Value 
				System.out.println(c4-c1);
				System.out.println('A'+'B');    // Arithmetic Operation
				
				char gender = 'm';
				
				System.out.println((int)gender);//97
				
				//8: boolean:
				//range: true/false           
				//size: 1 bit --> ~1 bit
				//default value :false
				boolean flag = true;
				boolean fg = false;
				boolean def;
				System.out.println(flag);
				
				boolean isActive = true;

	}

}






//***********
//Why is the size of char is 2 bytes in java..? 
//In other languages like C/C++ uses only ASCII characters and to represent all ASCII characters 8-bits is enough, 
//But java uses the Unicode system not the ASCII code system and to represent Unicode system 8 bit is not enough to represent all characters so java uses 2 bytes for characters.

//***********
// by default fraction value  is double in java


//*********************
//Unlike class members, local variables of methods must be assigned a value to before they are accessed, or it is a compile error.