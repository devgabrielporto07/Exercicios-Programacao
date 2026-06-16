a, b, c, d = map(int, input().split())
# Quando um número é par o resto da divisão dele é 0 e quando é ímpar a o resto da divisão é 1
if b > c and d > a and c + d > a + b and c > 0 and d > 0 and a % 2 == 0:
    print("Valores aceitos")
else:
    print ("Valores nao aceitos")