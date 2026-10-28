// int points = 10;
// bool isActive = true;
char grade = 'A';
double height = 1.75;
string userName = "Alberto";
decimal salary = 1000.50m;


Console.WriteLine($"Hola, {userName}, tu calificación es {grade}. Tu altura es {height} y tu salario es {salary}. ");
Console.WriteLine($"Introduce un número: ");

// int input = int.Parse(Console.ReadLine()!);

// Crea un boolean de la comprobacion de que el usuario a introducido un número entero correctamente.
// Ese número se almacenará en la variable 'years' si la conversión es correcta.
bool correct = int.TryParse(Console.ReadLine()!, out int years);


if (correct)
{
  Console.WriteLine($"Has introducido {years} años.");
}
else
{
  Console.WriteLine("Introduce un número entero.");
}