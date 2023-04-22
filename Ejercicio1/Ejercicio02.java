class Ejercicio02 {
    public static void main(String[] args) {
        // Tipo de dato entero de 32 bits de longitud
        int entero = 10;
        System.out.println("Variable tipo int ,  muestra datos enteros de 32 bits. Por ejemplo:" + entero);
        // Tipo de dato flotante de 64 bits de longitud
        double decimal = 52.7;
        System.out.println("Variable tipo double , muestra datos decimales de 64 bits. Por ejemplo: " + decimal);
        // Tipo de dato lógico o booleano
        boolean booleano = false;
        System.out.println("Variable tipo boolean , muestra datos lógicos. Por ejemplo: " + booleano);
        // Tipo de dato carácter de 16 bits de longitud
        char caracter = 'G';
        System.out.println("Variable tipo char , muestra un carácter de 16 bits. Por ejemplo: " + caracter);
        // Tipo de dato cadena de caracteres
        String cadena = "Juan Rodriguez";
        System.out.println("Variable tipo String , muestra una cadena de caracteres. Por ejemplo: " + cadena);

        int a = 8;
        int b = 2;

        // Operadores aritméticos
        System.out.println("Operador suma: " + (a + b)); // 10
        System.out.println("Operador resta: " + (a - b)); // 6
        System.out.println("Operador multiplicación: " + (a * b)); // 16
        System.out.println("Operador división: " + (a / b)); // 4
        System.out.println("Operador módulo: " + (a % b)); // 0

        // Operadores relacionales
        System.out.println("Operador mayor que: " + (a > b)); // true
        System.out.println("Operador menor que: " + (a < b)); // false
        System.out.println("Operador mayor o igual que: " + (a >= b)); // true
        System.out.println("Operador menor o igual que: " + (a <= b)); // false
        System.out.println("Operador igual a: " + (a == b)); // false
        System.out.println("Operador diferente a: " + (a != b)); // true

        // Operadores lógicos
        System.out.println("Operador AND lógico: " + (a > 0 && b > 0)); // true
        System.out.println("Operador OR lógico: " + (a > 0 || b > 0)); // true
        System.out.println("Operador NOT lógico: " + !(a > 0)); // false

        // Operadores unitarios
        a++;
        System.out.println("Operador de incremento: " + a); // 9
        b--;
        System.out.println("Operador de decremento: " + b); // 1

        // Operadores de asignación
        a += b;
        System.out.println("Operador de asignación suma: " + a); // equivale a "a = a + b" (10)
        a -= b;
        System.out.println("Operador de asignación resta: " + a); // ahora a = 10 y equivale a "a = a - b", a = 10 - 2
                                                                  // (8)
        a *= b;
        System.out.println("Operador de asignación multiplicación: " + a); // ahora a = 8 y equivale a "a = a * b", a =
                                                                           // 8 * 2 (16)
        a /= b;
        System.out.println("Operador de asignación división: " + a); // ahora a = 16 y equivale a "a = a / b", a = 16 /
                                                                     // 2 (8)
    }
}
