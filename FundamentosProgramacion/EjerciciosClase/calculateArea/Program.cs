Console.Write("Base: ");
double baseRect = double.Parse(Console.ReadLine()!);

Console.Write("Altura: ");
double altura = double.Parse(Console.ReadLine()!);

double area = baseRect * altura;
double perimetro = 2 * (baseRect + altura);

Console.WriteLine($"Área: {area}");
Console.WriteLine($"Perímetro: {perimetro}");
