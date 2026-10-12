// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(s: String, redact: String, character: Char = 'X'): String{
    
    val newS = s.replace(redact,character.toString().repeat(redact.length))
    return newS
    
    
    
}