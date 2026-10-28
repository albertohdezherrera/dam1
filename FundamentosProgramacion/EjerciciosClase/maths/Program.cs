Console.Write("Primer número: ");
bool aIsNumber = int.TryParse(Console.ReadLine()!, out int a);

Console.Write("Segundo número: ");
bool bIsNumber = int.TryParse(Console.ReadLine()!, out int b);

if (!aIsNumber || !bIsNumber)
{
  Console.WriteLine("Entrada no válida");
  return;
}

Console.WriteLine($"Suma: {a + b}");
Console.WriteLine($"Resta: {a - b}");
Console.WriteLine($"Producto: {a * b}");
Console.WriteLine($"División entera: {a / b}");
Console.WriteLine($"Resto: {a % b}");
