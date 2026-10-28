Console.Write("Nombre: ");
string nombre = Console.ReadLine()!;
Console.Write("Edad: ");
int edad = int.Parse(Console.ReadLine()!);
Console.Write("Altura en metros: ");
double altura = double.Parse(Console.ReadLine()!);

Console.WriteLine($"{nombre} tiene {edad} años y mide {altura} m.");
