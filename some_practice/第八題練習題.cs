using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1101_8
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(" === 國文成績試算 ===");
            int count = 0, sum=0;
            string ans = "y";
            int[] data = { };

            while (ans == "y" | ans == "Y")
            {
                count++;
                Array.Resize(ref data, data.Length + 1);
                Console.Write("\n{0}. 請輸入第{1}位同學的成績 : ", count, count);
                int score = int.Parse(Console.ReadLine());
                sum+= score;
                data[count-1] = score;

                string key = string.Format("score{0}", count);
                Console.Write("\n == 是否繼續 ? (Y/N) : ");
                ans = Console.ReadLine();
            }
            if (ans == "n" | ans == "N")
            {
                int j=0;
                Console.WriteLine("\n == 共輸入{0}位同學成績,班上平均成績 : {1}", count, sum/count);
                Array.Sort(data);
                int max = data[count - 1];
                while(max != data[j])
                {
                    j++;
                }
                Console.WriteLine(" == 第{0}位同學最高分", j+1);
            }
            Console.ReadKey(true);
        }
    }
}