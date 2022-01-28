//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Sachel Jetly
//Date -


public class FirstLastVowel
{
 

public static String go( String a )
{
	
	char front = a.charAt(0);
    char back = a.charAt(a.length()-1);
    
   
    if (front == 'a' || front == 'e' || front == 'i' || front == 'o' || front == 'u'||front == 'A' || front == 'E' || front == 'I' || front == 'O' || front == 'U'|| back == 'a' || back == 'e' || back == 'i' || back == 'o' || back == 'u' || back == 'A' || back == 'E' || back == 'I' || back == 'O' || back == 'U')
    {
    	return ("yes");
    }
    return ("no");
    }
   
}

