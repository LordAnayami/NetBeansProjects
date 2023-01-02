using System;
using System.Collections.Generic;
using System.Text;


namespace ZadanieKalkulator
{
    class Mains
    {
        public static void Main(string[] args)
        {
            double A, B;
            int make = 0;
            int oper = 0;
            double res = 0;
            while (make <1)
            {
                Console.WriteLine("Podaj wartość A:");
                A = Convert.ToDouble(Console.ReadLine());

                Console.WriteLine("Podaj wartość B:");
                B = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine("Wybierz operację:");
                Console.WriteLine("1 - Suma");
                Console.WriteLine("2 - Różnica");
                Console.WriteLine("3 - Mnożenie");
                Console.WriteLine("4 - Dzielenie");
                oper = Convert.ToInt32(Console.ReadLine());
                switch (oper)
                {
                    case 1:
                        res = Add(A,B);
                        Console.WriteLine($"Wynik: {res}");
                        Console.WriteLine("Koniec działań Tak=1/Nie=0");
                        make = int.Parse(Console.ReadLine());
                        break;
                    case 2:
                        res = Sub(A,B);
                        Console.WriteLine($"Wynik: {res}");
                        Console.WriteLine("Koniec działań Tak=1/Nie=0");
                        make = int.Parse(Console.ReadLine());
                        break;
                    case 3:
                        res = Mul(A,B);
                        Console.WriteLine($"Wynik: {res}");
                        Console.WriteLine("Koniec działań Tak=1/Nie=0");
                        make = int.Parse(Console.ReadLine());
                        break;
                    case 4:
                        res = Div(A,B);
                        Console.WriteLine($"Wynik: {res}");
                        Console.WriteLine("Koniec działań Tak=1/Nie=0");
                        make = int.Parse(Console.ReadLine());
                        break;
                   

                }

            }


        }

        public static double Add(double a, double b)
        {
            return a + b;
        }

        public static double Sub(double a, double b)
        {
            return a - b;
        }

        public static double Mul(double a, double b)
        {
            return a * b;
        }

        public static double Div(double a, double b)
        {

            return a / b;

        }
    }


}
